package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-10-15
 * Time: 下午5:02
 * To change this template use File | Settings | File Templates.
 */
public enum UserIdentificationTypeEnum {

    ID_CARD(100,"身份认证"),
    BASE_INFO(101,"基本信息"),
    CONTACT_INFO(102,"联系信息"),
    JOB(103,"工作证明"),
    INCOME(104,"收入证明"),
    CREDIT_REPORT(105,"信用证明"),
    LIVE(106,"居住地证明"),
    HOUSE(107,"购房证明"),
    CAR(108,"车辆证明"),
    MARRIAGE(109,"婚姻证明"),
    EDU(110,"学历证明"),
    TECH(111,"技术职称证明"),
    MOBILE(112,"手机认证"),
    WEIBO(113,"weibo认证"),
    WEBSITE(114,"网站"),
    WECHAT(115,"微信"),
    MORTGAGE(116,"按揭证明"),
    WARRANT(117,"抵押证明");

    private UserIdentificationTypeEnum(int idType, String idName){
        this.idType = idType;
        this.idName = idName;
    }

    private int idType;
    private String idName;

    public int getIdType() {
        return idType;
    }

    public String getIdName() {
        return idName;
    }
}
