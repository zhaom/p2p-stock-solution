package com.solution.p2p.core.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ProductServiceFeeCategory {
    private Integer id;

    private String name;

    private BigDecimal limitMinServiceFeeRate;

    private BigDecimal limitMaxServiceFeeRate;

    private BigDecimal preferServiceFeeRate;

    private Integer serviceFeeRateUnit;

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

    public BigDecimal getLimitMinServiceFeeRate() {
        return limitMinServiceFeeRate;
    }

    public void setLimitMinServiceFeeRate(BigDecimal limitMinServiceFeeRate) {
        this.limitMinServiceFeeRate = limitMinServiceFeeRate;
    }

    public BigDecimal getLimitMaxServiceFeeRate() {
        return limitMaxServiceFeeRate;
    }

    public void setLimitMaxServiceFeeRate(BigDecimal limitMaxServiceFeeRate) {
        this.limitMaxServiceFeeRate = limitMaxServiceFeeRate;
    }

    public BigDecimal getPreferServiceFeeRate() {
        return preferServiceFeeRate;
    }

    public void setPreferServiceFeeRate(BigDecimal preferServiceFeeRate) {
        this.preferServiceFeeRate = preferServiceFeeRate;
    }

    public Integer getServiceFeeRateUnit() {
        return serviceFeeRateUnit;
    }

    public void setServiceFeeRateUnit(Integer serviceFeeRateUnit) {
        this.serviceFeeRateUnit = serviceFeeRateUnit;
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