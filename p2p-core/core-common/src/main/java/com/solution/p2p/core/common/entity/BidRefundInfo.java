package com.solution.p2p.core.common.entity;

import java.util.Date;

public class BidRefundInfo {
    private Long id;

    private Long mId;

    private Long bId;

    private String issue;

    private Date scheduledRefundTime;

    private Date realRefundTime;

    private String refundFlowId;

    private Long scheduledRefundPrincipal;

    private Long scheduledRefundInterest;

    private Long scheduledRefundServiceFee;

    private Long realRefundAmount;

    private Long realRefundFine;

    private Integer refundStatus;

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

    public Date getScheduledRefundTime() {
        return scheduledRefundTime;
    }

    public void setScheduledRefundTime(Date scheduledRefundTime) {
        this.scheduledRefundTime = scheduledRefundTime;
    }

    public Date getRealRefundTime() {
        return realRefundTime;
    }

    public void setRealRefundTime(Date realRefundTime) {
        this.realRefundTime = realRefundTime;
    }

    public String getRefundFlowId() {
        return refundFlowId;
    }

    public void setRefundFlowId(String refundFlowId) {
        this.refundFlowId = refundFlowId == null ? null : refundFlowId.trim();
    }

    public Long getScheduledRefundPrincipal() {
        return scheduledRefundPrincipal;
    }

    public void setScheduledRefundPrincipal(Long scheduledRefundPrincipal) {
        this.scheduledRefundPrincipal = scheduledRefundPrincipal;
    }

    public Long getScheduledRefundInterest() {
        return scheduledRefundInterest;
    }

    public void setScheduledRefundInterest(Long scheduledRefundInterest) {
        this.scheduledRefundInterest = scheduledRefundInterest;
    }

    public Long getScheduledRefundServiceFee() {
        return scheduledRefundServiceFee;
    }

    public void setScheduledRefundServiceFee(Long scheduledRefundServiceFee) {
        this.scheduledRefundServiceFee = scheduledRefundServiceFee;
    }

    public Long getRealRefundAmount() {
        return realRefundAmount;
    }

    public void setRealRefundAmount(Long realRefundAmount) {
        this.realRefundAmount = realRefundAmount;
    }

    public Long getRealRefundFine() {
        return realRefundFine;
    }

    public void setRealRefundFine(Long realRefundFine) {
        this.realRefundFine = realRefundFine;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
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