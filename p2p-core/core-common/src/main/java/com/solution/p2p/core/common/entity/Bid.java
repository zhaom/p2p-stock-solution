package com.solution.p2p.core.common.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Bid {
    private Long id;

    private String code;

    private Long prodId;

    private String name;

    private Long mId;

    private Long guarantyAmount;

    private Integer collectTimes;

    private Long collectAmount;

    private Long collectedAmount;

    private Integer lifeDuration;

    private Integer lifeDurationUnit;

    private BigDecimal collectInterestRate;

    private Integer collectInterestRateUnit;

    private BigDecimal requestInterestRate;

    private Integer requestInterestRateUnit;

    private Date collectFromTime;

    private Date collectThruTime;

    private Date bidSuccessTime;

    private Integer bidStatus;

    private Integer collectPayStatus;

    private Long requirementServiceFee;

    private Long requirementManagementFee;

    private Long requirementOtherFee;

    private Integer isSplitProfit;

    private Integer splitRatio;

    private Integer isTransfer;

    private Long transferParentId;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Long getGuarantyAmount() {
        return guarantyAmount;
    }

    public void setGuarantyAmount(Long guarantyAmount) {
        this.guarantyAmount = guarantyAmount;
    }

    public Integer getCollectTimes() {
        return collectTimes;
    }

    public void setCollectTimes(Integer collectTimes) {
        this.collectTimes = collectTimes;
    }

    public Long getCollectAmount() {
        return collectAmount;
    }

    public void setCollectAmount(Long collectAmount) {
        this.collectAmount = collectAmount;
    }

    public Long getCollectedAmount() {
        return collectedAmount;
    }

    public void setCollectedAmount(Long collectedAmount) {
        this.collectedAmount = collectedAmount;
    }

    public Integer getLifeDuration() {
        return lifeDuration;
    }

    public void setLifeDuration(Integer lifeDuration) {
        this.lifeDuration = lifeDuration;
    }

    public Integer getLifeDurationUnit() {
        return lifeDurationUnit;
    }

    public void setLifeDurationUnit(Integer lifeDurationUnit) {
        this.lifeDurationUnit = lifeDurationUnit;
    }

    public BigDecimal getCollectInterestRate() {
        return collectInterestRate;
    }

    public void setCollectInterestRate(BigDecimal collectInterestRate) {
        this.collectInterestRate = collectInterestRate;
    }

    public Integer getCollectInterestRateUnit() {
        return collectInterestRateUnit;
    }

    public void setCollectInterestRateUnit(Integer collectInterestRateUnit) {
        this.collectInterestRateUnit = collectInterestRateUnit;
    }

    public BigDecimal getRequestInterestRate() {
        return requestInterestRate;
    }

    public void setRequestInterestRate(BigDecimal requestInterestRate) {
        this.requestInterestRate = requestInterestRate;
    }

    public Integer getRequestInterestRateUnit() {
        return requestInterestRateUnit;
    }

    public void setRequestInterestRateUnit(Integer requestInterestRateUnit) {
        this.requestInterestRateUnit = requestInterestRateUnit;
    }

    public Date getCollectFromTime() {
        return collectFromTime;
    }

    public void setCollectFromTime(Date collectFromTime) {
        this.collectFromTime = collectFromTime;
    }

    public Date getCollectThruTime() {
        return collectThruTime;
    }

    public void setCollectThruTime(Date collectThruTime) {
        this.collectThruTime = collectThruTime;
    }

    public Date getBidSuccessTime() {
        return bidSuccessTime;
    }

    public void setBidSuccessTime(Date bidSuccessTime) {
        this.bidSuccessTime = bidSuccessTime;
    }

    public Integer getBidStatus() {
        return bidStatus;
    }

    public void setBidStatus(Integer bidStatus) {
        this.bidStatus = bidStatus;
    }

    public Integer getCollectPayStatus() {
        return collectPayStatus;
    }

    public void setCollectPayStatus(Integer collectPayStatus) {
        this.collectPayStatus = collectPayStatus;
    }

    public Long getRequirementServiceFee() {
        return requirementServiceFee;
    }

    public void setRequirementServiceFee(Long requirementServiceFee) {
        this.requirementServiceFee = requirementServiceFee;
    }

    public Long getRequirementManagementFee() {
        return requirementManagementFee;
    }

    public void setRequirementManagementFee(Long requirementManagementFee) {
        this.requirementManagementFee = requirementManagementFee;
    }

    public Long getRequirementOtherFee() {
        return requirementOtherFee;
    }

    public void setRequirementOtherFee(Long requirementOtherFee) {
        this.requirementOtherFee = requirementOtherFee;
    }

    public Integer getIsSplitProfit() {
        return isSplitProfit;
    }

    public void setIsSplitProfit(Integer isSplitProfit) {
        this.isSplitProfit = isSplitProfit;
    }

    public Integer getSplitRatio() {
        return splitRatio;
    }

    public void setSplitRatio(Integer splitRatio) {
        this.splitRatio = splitRatio;
    }

    public Integer getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Integer isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Long getTransferParentId() {
        return transferParentId;
    }

    public void setTransferParentId(Long transferParentId) {
        this.transferParentId = transferParentId;
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