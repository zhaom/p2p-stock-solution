package com.solution.p2p.core.common.entity;

import java.util.Date;

public class MemberBidDistribute {
    private Long id;

    private Long mId;

    private Long bId;

    private String issue;

    private Long requestAmount;

    private Date scheduledDistTime;

    private Long scheduledDistPrincipal;

    private Long scheduledDistInterest;

    private Long scheduledDistRevenue;

    private Date realDistTime;

    private Long realDistAmount;

    private Integer distStatus;

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

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public Long getRequestAmount() {
        return requestAmount;
    }

    public void setRequestAmount(Long requestAmount) {
        this.requestAmount = requestAmount;
    }

    public Date getScheduledDistTime() {
        return scheduledDistTime;
    }

    public void setScheduledDistTime(Date scheduledDistTime) {
        this.scheduledDistTime = scheduledDistTime;
    }

    public Long getScheduledDistPrincipal() {
        return scheduledDistPrincipal;
    }

    public void setScheduledDistPrincipal(Long scheduledDistPrincipal) {
        this.scheduledDistPrincipal = scheduledDistPrincipal;
    }

    public Long getScheduledDistInterest() {
        return scheduledDistInterest;
    }

    public void setScheduledDistInterest(Long scheduledDistInterest) {
        this.scheduledDistInterest = scheduledDistInterest;
    }

    public Long getScheduledDistRevenue() {
        return scheduledDistRevenue;
    }

    public void setScheduledDistRevenue(Long scheduledDistRevenue) {
        this.scheduledDistRevenue = scheduledDistRevenue;
    }

    public Date getRealDistTime() {
        return realDistTime;
    }

    public void setRealDistTime(Date realDistTime) {
        this.realDistTime = realDistTime;
    }

    public Long getRealDistAmount() {
        return realDistAmount;
    }

    public void setRealDistAmount(Long realDistAmount) {
        this.realDistAmount = realDistAmount;
    }

    public Integer getDistStatus() {
        return distStatus;
    }

    public void setDistStatus(Integer distStatus) {
        this.distStatus = distStatus;
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