package com.fanya.p2p.front.user.realm;

import com.fanya.p2p.front.user.utils.Constants;
import com.solution.p2p.core.common.utils.SignUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserRealm extends AuthorizingRealm {

    private static Logger logger = LoggerFactory.getLogger(UserRealm.class);

    private UserService userService;

    private AuthorizationService authorizationService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setAuthorizationService(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(authorizationService.findRoles(Constants.SERVER_APP_KEY, username,Constants.APP_KEY, SignUtil.signParams(Constants.SERVER_APP_KEY, Constants.APP_KEY, Constants.APP_SECURITY)).getValue());
        authorizationInfo.setStringPermissions(authorizationService.findPermissions(Constants.SERVER_APP_KEY, username,Constants.APP_KEY, SignUtil.signParams(Constants.SERVER_APP_KEY, Constants.APP_KEY, Constants.APP_SECURITY)).getValue());
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        logger.debug("##################do authen");
        String username = (String)token.getPrincipal();

        SysUser user = userService.findByUsername(username,Constants.APP_KEY, SignUtil.signParams(username, Constants.APP_KEY, Constants.APP_SECURITY)).getValue();

        if(user == null) {
            throw new UnknownAccountException();//没找到帐号
        }

        if(Boolean.TRUE.equals(user.getLocked())) {
            throw new LockedAccountException(); //帐号锁定
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(), //用户名
                user.getPassword(), //密码
                ByteSource.Util.bytes(user.getCredentialsSalt()),//salt=username+salt
                getName()  //realm name
        );
        return authenticationInfo;
    }

    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }

}
