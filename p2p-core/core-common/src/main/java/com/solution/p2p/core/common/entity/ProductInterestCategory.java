package com.solution.p2p.core.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ProductInterestCategory {
    private Long id;

    private String name;

    private BigDecimal limitMinInterestRate;

    private BigDecimal limitMaxInterestRate;

    private BigDecimal preferInterestRate;

    private Integer interestRateUnit;

    private Integer intDiffTime;

    private Integer diffUnit;

    private Integer refundIntDiffTimeLimit;

    private Integer refundIntFirst;

    private Integer refundCycleDuration;

    private Integer refundCycleDurationUnit;

    private Integer refundIntTimes;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getLimitMinInterestRate() {
        return limitMinInterestRate;
    }

    public void setLimitMinInterestRate(BigDecimal limitMinInterestRate) {
        this.limitMinInterestRate = limitMinInterestRate;
    }

    public BigDecimal getLimitMaxInterestRate() {
        return limitMaxInterestRate;
    }

    public void setLimitMaxInterestRate(BigDecimal limitMaxInterestRate) {
        this.limitMaxInterestRate = limitMaxInterestRate;
    }

    public BigDecimal getPreferInterestRate() {
        return preferInterestRate;
    }

    public void setPreferInterestRate(BigDecimal preferInterestRate) {
        this.preferInterestRate = preferInterestRate;
    }

    public Integer getInterestRateUnit() {
        return interestRateUnit;
    }

    public void setInterestRateUnit(Integer interestRateUnit) {
        this.interestRateUnit = interestRateUnit;
    }

    public Integer getIntDiffTime() {
        return intDiffTime;
    }

    public void setIntDiffTime(Integer intDiffTime) {
        this.intDiffTime = intDiffTime;
    }

    public Integer getDiffUnit() {
        return diffUnit;
    }

    public void setDiffUnit(Integer diffUnit) {
        this.diffUnit = diffUnit;
    }

    public Integer getRefundIntDiffTimeLimit() {
        return refundIntDiffTimeLimit;
    }

    public void setRefundIntDiffTimeLimit(Integer refundIntDiffTimeLimit) {
        this.refundIntDiffTimeLimit = refundIntDiffTimeLimit;
    }

    public Integer getRefundIntFirst() {
        return refundIntFirst;
    }

    public void setRefundIntFirst(Integer refundIntFirst) {
        this.refundIntFirst = refundIntFirst;
    }

    public Integer getRefundCycleDuration() {
        return refundCycleDuration;
    }

    public void setRefundCycleDuration(Integer refundCycleDuration) {
        this.refundCycleDuration = refundCycleDuration;
    }

    public Integer getRefundCycleDurationUnit() {
        return refundCycleDurationUnit;
    }

    public void setRefundCycleDurationUnit(Integer refundCycleDurationUnit) {
        this.refundCycleDurationUnit = refundCycleDurationUnit;
    }

    public Integer getRefundIntTimes() {
        return refundIntTimes;
    }

    public void setRefundIntTimes(Integer refundIntTimes) {
        this.refundIntTimes = refundIntTimes;
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