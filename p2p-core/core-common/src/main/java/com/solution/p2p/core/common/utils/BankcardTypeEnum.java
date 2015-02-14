package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-9
 * Time: 下午4:44
 * To change this template use File | Settings | File Templates.
 */
public enum BankcardTypeEnum {
    DEBIT("",""),
    CREDIT("","");

    private String type;
    private String desc;
    BankcardTypeEnum(String type, String typeDesc) {
        this.type = type;
        this.desc = typeDesc;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
