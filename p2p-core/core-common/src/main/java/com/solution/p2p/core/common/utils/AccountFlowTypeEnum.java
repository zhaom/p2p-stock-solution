package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-3
 * Time: 下午4:17
 * To change this template use File | Settings | File Templates.
 */
public enum AccountFlowTypeEnum {

    INCOME("IN", "收入"),
    PAY("OUT", "支出");

    AccountFlowTypeEnum(String type, String typeDesc) {
        this.type = type;
        this.typeDesc = typeDesc;
    }

    private String type;
    private String typeDesc;

    public String getType() {
        return type;
    }

    public String getTypeDesc() {
        return typeDesc;
    }
}
