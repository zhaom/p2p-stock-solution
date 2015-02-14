package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-15
 * Time: 下午4:43
 * To change this template use File | Settings | File Templates.
 */
public enum UserSecurityAuthResultEnum {

    NOT_REG("未认证"),REGED("已认证"),NOT_SET("未设置"),SETTED("已设置"),NOT_OPEN("未开启"),OPENED("已开启");

    private UserSecurityAuthResultEnum(String desc){
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }
}
