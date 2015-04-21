package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductAmountCategory {
    private Integer id;

    private String name;

    private Long limitMinAmount;

    private Long limitMaxAmount;

    private Long limitStepAmount;

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

    public Long getLimitMinAmount() {
        return limitMinAmount;
    }

    public void setLimitMinAmount(Long limitMinAmount) {
        this.limitMinAmount = limitMinAmount;
    }

    public Long getLimitMaxAmount() {
        return limitMaxAmount;
    }

    public void setLimitMaxAmount(Long limitMaxAmount) {
        this.limitMaxAmount = limitMaxAmount;
    }

    public Long getLimitStepAmount() {
        return limitStepAmount;
    }

    public void setLimitStepAmount(Long limitStepAmount) {
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