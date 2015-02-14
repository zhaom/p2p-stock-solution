package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-3
 * Time: 下午2:29
 * To change this template use File | Settings | File Templates.
 */
public enum AccountCategaryEnum {

    CASH(100,"现金"),
    V_COIN(101,"虚拟币"),
    JF(102,"积分"),
    INVEST(103,"投资"),
    LOAN(104,"借款");

    AccountCategaryEnum(int i, String s) {
        this.cate = i;
        this.cateDesc = s;
    }

    private int cate;
    private String cateDesc;

    public int getCate() {
        return cate;
    }

    public String getCateDesc() {
        return cateDesc;
    }
}
