package com.fanya.p2p.front.user.realm;

import com.fanya.p2p.front.user.utils.Constants;
import com.solution.p2p.core.common.entity.Member;
import com.solution.p2p.core.common.service.AuthorizationService;
import com.solution.p2p.core.common.service.MemberService;
import com.solution.p2p.core.common.utils.Encodes;
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

    private MemberService memberService;

    private AuthorizationService authorizationService;


    public void setAuthorizationService(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = (String)principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(authorizationService.findPermissions(Constants.SERVER_APP_KEY, username,Constants.APP_KEY, "changqianmingyuguang").getValue().getRoles());
        authorizationInfo.setStringPermissions(authorizationService.findPermissions(Constants.SERVER_APP_KEY, username,Constants.APP_KEY, "changqianmingyuguang").getValue().getPermissions());
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        logger.debug("##################do authen");
        String username = (String)token.getPrincipal();

        Member member = memberService.findByUsername(username,Constants.APP_KEY, "changqianmingyuguang").getValue();

        if(member == null) {
            throw new UnknownAccountException();//没找到帐号
        }

        if(Boolean.TRUE.equals(member.getLocked())) {
            throw new LockedAccountException(); //帐号锁定
        }

        //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                member.getUname(), //用户名
                member.getPassword().substring(16), //密码
                ByteSource.Util.bytes(Encodes.decodeHex(member.getPassword().substring(0, 16))),//salt
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
