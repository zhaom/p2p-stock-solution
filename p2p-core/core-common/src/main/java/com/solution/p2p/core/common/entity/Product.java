package com.solution.p2p.core.common.entity;

import java.util.Date;

public class Product {
    private Long id;

    private String name;

    private Integer guarantyCategory;

    private Integer lifeDurationCategory;

    private Integer collectDurationCategory;

    private Integer loanAmountCategory;

    private Integer lInterestCategory;

    private Integer lServiceFeeCategory;

    private Integer lPayCategory;

    private Integer lMemberCategory;

    private Integer bInterestCategory;

    private Integer bServiceFeeCategory;

    private Integer bAmountCategory;

    private Integer bPayCategory;

    private Integer bMemberCategory;

    private Integer channelCategory;

    private Integer available;

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

    public Integer getGuarantyCategory() {
        return guarantyCategory;
    }

    public void setGuarantyCategory(Integer guarantyCategory) {
        this.guarantyCategory = guarantyCategory;
    }

    public Integer getLifeDurationCategory() {
        return lifeDurationCategory;
    }

    public void setLifeDurationCategory(Integer lifeDurationCategory) {
        this.lifeDurationCategory = lifeDurationCategory;
    }

    public Integer getCollectDurationCategory() {
        return collectDurationCategory;
    }

    public void setCollectDurationCategory(Integer collectDurationCategory) {
        this.collectDurationCategory = collectDurationCategory;
    }

    public Integer getLoanAmountCategory() {
        return loanAmountCategory;
    }

    public void setLoanAmountCategory(Integer loanAmountCategory) {
        this.loanAmountCategory = loanAmountCategory;
    }

    public Integer getlInterestCategory() {
        return lInterestCategory;
    }

    public void setlInterestCategory(Integer lInterestCategory) {
        this.lInterestCategory = lInterestCategory;
    }

    public Integer getlServiceFeeCategory() {
        return lServiceFeeCategory;
    }

    public void setlServiceFeeCategory(Integer lServiceFeeCategory) {
        this.lServiceFeeCategory = lServiceFeeCategory;
    }

    public Integer getlPayCategory() {
        return lPayCategory;
    }

    public void setlPayCategory(Integer lPayCategory) {
        this.lPayCategory = lPayCategory;
    }

    public Integer getlMemberCategory() {
        return lMemberCategory;
    }

    public void setlMemberCategory(Integer lMemberCategory) {
        this.lMemberCategory = lMemberCategory;
    }

    public Integer getbInterestCategory() {
        return bInterestCategory;
    }

    public void setbInterestCategory(Integer bInterestCategory) {
        this.bInterestCategory = bInterestCategory;
    }

    public Integer getbServiceFeeCategory() {
        return bServiceFeeCategory;
    }

    public void setbServiceFeeCategory(Integer bServiceFeeCategory) {
        this.bServiceFeeCategory = bServiceFeeCategory;
    }

    public Integer getbAmountCategory() {
        return bAmountCategory;
    }

    public void setbAmountCategory(Integer bAmountCategory) {
        this.bAmountCategory = bAmountCategory;
    }

    public Integer getbPayCategory() {
        return bPayCategory;
    }

    public void setbPayCategory(Integer bPayCategory) {
        this.bPayCategory = bPayCategory;
    }

    public Integer getbMemberCategory() {
        return bMemberCategory;
    }

    public void setbMemberCategory(Integer bMemberCategory) {
        this.bMemberCategory = bMemberCategory;
    }

    public Integer getChannelCategory() {
        return channelCategory;
    }

    public void setChannelCategory(Integer channelCategory) {
        this.channelCategory = channelCategory;
    }

    public Integer getAvailable() {
        return available;
    }

    public void setAvailable(Integer available) {
        this.available = available;
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