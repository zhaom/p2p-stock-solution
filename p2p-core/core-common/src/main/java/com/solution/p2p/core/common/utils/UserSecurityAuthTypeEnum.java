package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-15
 * Time: 下午4:25
 * To change this template use File | Settings | File Templates.
 */
public enum UserSecurityAuthTypeEnum {

    REAL_NAME(10,"实名认证","保障账户安全，确认投资身份"),
    BANK_CARD(11,"银行卡认证","保障资金安全，充值、取现资金同卡进出"),
    TRADE_PASSWD(12,"交易密码","保障资金安全，充值、取现、投资等资金相关操作时使用"),
    SECU_PROTECT(13,"安全保护问题","保障个人隐私，修改个人信息等操作时使用"),
    MOBILE_TOKEN(14,"手机令牌","保障资金安全，在手机app获取动态口令，方便快捷（同一账户仅可针对一个设备开启）"),
    MOBILE_REG(15,"手机认证","保障资金安全，是您在陆金所重要的身份凭证，获取账户资金变动通知"),
    LOGIN_PASSWD(16,"登录密码","不可逆加密存储，保障敏感信息安全"),
    EMAIL(17,"电子邮箱","获取账户资金变动通知和投资讯息");

    private UserSecurityAuthTypeEnum(int authType,String authName,String authDesc){
        this.authType = authType;
        this.authName = authName;
        this.authDesc = authDesc;
    }

    private int authType;
    private String authName;
    private String authDesc;

    public int getAuthType() {
        return authType;
    }

    public String getAuthName() {
        return authName;
    }

    public String getAuthDesc() {
        return authDesc;
    }
}
