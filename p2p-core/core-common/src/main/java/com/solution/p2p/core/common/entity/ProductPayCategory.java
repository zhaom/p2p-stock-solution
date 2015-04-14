package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductPayCategory {
    private Integer id;

    private String name;

    private Integer limitAmountType;

    private String accountTypes;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLimitAmountType() {
        return limitAmountType;
    }

    public void setLimitAmountType(Integer limitAmountType) {
        this.limitAmountType = limitAmountType;
    }

    public String getAccountTypes() {
        return accountTypes;
    }

    public void setAccountTypes(String accountTypes) {
        this.accountTypes = accountTypes == null ? null : accountTypes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}