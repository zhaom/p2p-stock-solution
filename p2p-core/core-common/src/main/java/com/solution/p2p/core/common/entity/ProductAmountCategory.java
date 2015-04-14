package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductAmountCategory {
    private Integer id;

    private String name;

    private Integer limitMinAmount;

    private Integer limitMaxAmount;

    private Integer limitStepAmount;

    private Integer amountUnit;

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

    public Integer getLimitMinAmount() {
        return limitMinAmount;
    }

    public void setLimitMinAmount(Integer limitMinAmount) {
        this.limitMinAmount = limitMinAmount;
    }

    public Integer getLimitMaxAmount() {
        return limitMaxAmount;
    }

    public void setLimitMaxAmount(Integer limitMaxAmount) {
        this.limitMaxAmount = limitMaxAmount;
    }

    public Integer getLimitStepAmount() {
        return limitStepAmount;
    }

    public void setLimitStepAmount(Integer limitStepAmount) {
        this.limitStepAmount = limitStepAmount;
    }

    public Integer getAmountUnit() {
        return amountUnit;
    }

    public void setAmountUnit(Integer amountUnit) {
        this.amountUnit = amountUnit;
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