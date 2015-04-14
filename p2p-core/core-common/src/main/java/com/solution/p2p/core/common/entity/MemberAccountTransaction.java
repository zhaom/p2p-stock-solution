package com.solution.p2p.core.common.entity;

import java.util.Date;

public class MemberAccountTransaction {
    private Long id;

    private String reqApp;

    private Date reqTime;

    private Long reqSeqNo;

    private String tranNo;

    private String oldTranNo;

    private Date matDate;

    private Integer matReqMethod;

    private Integer matOpState;

    private Integer tradeType;

    private Date tradeDate;

    private Long tradeSeqNo;

    private Long paySeqNo;

    private String matItemInfo;

    private Integer matRepCode;

    private String matItemResult;

    private String matExt;

    private String matRemark;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReqApp() {
        return reqApp;
    }

    public void setReqApp(String reqApp) {
        this.reqApp = reqApp == null ? null : reqApp.trim();
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public Long getReqSeqNo() {
        return reqSeqNo;
    }

    public void setReqSeqNo(Long reqSeqNo) {
        this.reqSeqNo = reqSeqNo;
    }

    public String getTranNo() {
        return tranNo;
    }

    public void setTranNo(String tranNo) {
        this.tranNo = tranNo == null ? null : tranNo.trim();
    }

    public String getOldTranNo() {
        return oldTranNo;
    }

    public void setOldTranNo(String oldTranNo) {
        this.oldTranNo = oldTranNo == null ? null : oldTranNo.trim();
    }

    public Date getMatDate() {
        return matDate;
    }

    public void setMatDate(Date matDate) {
        this.matDate = matDate;
    }

    public Integer getMatReqMethod() {
        return matReqMethod;
    }

    public void setMatReqMethod(Integer matReqMethod) {
        this.matReqMethod = matReqMethod;
    }

    public Integer getMatOpState() {
        return matOpState;
    }

    public void setMatOpState(Integer matOpState) {
        this.matOpState = matOpState;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Long getTradeSeqNo() {
        return tradeSeqNo;
    }

    public void setTradeSeqNo(Long tradeSeqNo) {
        this.tradeSeqNo = tradeSeqNo;
    }

    public Long getPaySeqNo() {
        return paySeqNo;
    }

    public void setPaySeqNo(Long paySeqNo) {
        this.paySeqNo = paySeqNo;
    }

    public String getMatItemInfo() {
        return matItemInfo;
    }

    public void setMatItemInfo(String matItemInfo) {
        this.matItemInfo = matItemInfo == null ? null : matItemInfo.trim();
    }

    public Integer getMatRepCode() {
        return matRepCode;
    }

    public void setMatRepCode(Integer matRepCode) {
        this.matRepCode = matRepCode;
    }

    public String getMatItemResult() {
        return matItemResult;
    }

    public void setMatItemResult(String matItemResult) {
        this.matItemResult = matItemResult == null ? null : matItemResult.trim();
    }

    public String getMatExt() {
        return matExt;
    }

    public void setMatExt(String matExt) {
        this.matExt = matExt == null ? null : matExt.trim();
    }

    public String getMatRemark() {
        return matRemark;
    }

    public void setMatRemark(String matRemark) {
        this.matRemark = matRemark == null ? null : matRemark.trim();
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