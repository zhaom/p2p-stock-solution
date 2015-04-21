package com.solution.p2p.core.common.entity;

import java.util.Date;

public class MemberStockAccount {
    private Long id;

    private Long mId;

    private Integer type;

    private Date fromDate;

    private Date thruDate;

    private String accountName;

    private String stockCode;

    private Long usableAmount;

    private Long cashAmount;

    private Long cashFundAmount;

    private Long financedAmount;

    private Long interestAmount;

    private Long interestPayed;

    private Long stockMarketValue;

    private Long alarmAmount;

    private Long forcedLiquidationAmount;

    private Date lastValueTime;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public Long getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(Long usableAmount) {
        this.usableAmount = usableAmount;
    }

    public Long getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public Long getCashFundAmount() {
        return cashFundAmount;
    }

    public void setCashFundAmount(Long cashFundAmount) {
        this.cashFundAmount = cashFundAmount;
    }

    public Long getFinancedAmount() {
        return financedAmount;
    }

    public void setFinancedAmount(Long financedAmount) {
        this.financedAmount = financedAmount;
    }

    public Long getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
    }

    public Long getInterestPayed() {
        return interestPayed;
    }

    public void setInterestPayed(Long interestPayed) {
        this.interestPayed = interestPayed;
    }

    public Long getStockMarketValue() {
        return stockMarketValue;
    }

    public void setStockMarketValue(Long stockMarketValue) {
        this.stockMarketValue = stockMarketValue;
    }

    public Long getAlarmAmount() {
        return alarmAmount;
    }

    public void setAlarmAmount(Long alarmAmount) {
        this.alarmAmount = alarmAmount;
    }

    public Long getForcedLiquidationAmount() {
        return forcedLiquidationAmount;
    }

    public void setForcedLiquidationAmount(Long forcedLiquidationAmount) {
        this.forcedLiquidationAmount = forcedLiquidationAmount;
    }

    public Date getLastValueTime() {
        return lastValueTime;
    }

    public void setLastValueTime(Date lastValueTime) {
        this.lastValueTime = lastValueTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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