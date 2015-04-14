package com.solution.p2p.core.common.entity;

import java.util.Date;

public class MemberAccountFlow {
    private Long id;

    private Long memberAccountId;

    private Long mId;

    private Long memberAccountItemId;

    private Long matId;

    private Date matDate;

    private Integer matServiceCode;

    private Integer financeOpType;

    private Long amount;

    private Long thawedAmount;

    private Integer unit;

    private String matSummary;

    private Integer tradeType;

    private Long tradeSeqNo;

    private Long paySeqNo;

    private Long thruFrozenAmount;

    private Long thruAmount;

    private String bizMemberId;

    private String bizAppDate;

    private String bizOrderNo;

    private Integer payMethod;

    private String bankCode;

    private String bankBizCode;

    private String bankAcceptDate;

    private String bankAcceptSeqNo;

    private String bankRepSeqNo;

    private Integer balanceType;

    private Integer upBalanceFlag;

    private Integer downBalanceFlag;

    private String memberAccountFlowExt;

    private String remark;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Long memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Long getMemberAccountItemId() {
        return memberAccountItemId;
    }

    public void setMemberAccountItemId(Long memberAccountItemId) {
        this.memberAccountItemId = memberAccountItemId;
    }

    public Long getMatId() {
        return matId;
    }

    public void setMatId(Long matId) {
        this.matId = matId;
    }

    public Date getMatDate() {
        return matDate;
    }

    public void setMatDate(Date matDate) {
        this.matDate = matDate;
    }

    public Integer getMatServiceCode() {
        return matServiceCode;
    }

    public void setMatServiceCode(Integer matServiceCode) {
        this.matServiceCode = matServiceCode;
    }

    public Integer getFinanceOpType() {
        return financeOpType;
    }

    public void setFinanceOpType(Integer financeOpType) {
        this.financeOpType = financeOpType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getThawedAmount() {
        return thawedAmount;
    }

    public void setThawedAmount(Long thawedAmount) {
        this.thawedAmount = thawedAmount;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getMatSummary() {
        return matSummary;
    }

    public void setMatSummary(String matSummary) {
        this.matSummary = matSummary == null ? null : matSummary.trim();
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
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

    public Long getThruFrozenAmount() {
        return thruFrozenAmount;
    }

    public void setThruFrozenAmount(Long thruFrozenAmount) {
        this.thruFrozenAmount = thruFrozenAmount;
    }

    public Long getThruAmount() {
        return thruAmount;
    }

    public void setThruAmount(Long thruAmount) {
        this.thruAmount = thruAmount;
    }

    public String getBizMemberId() {
        return bizMemberId;
    }

    public void setBizMemberId(String bizMemberId) {
        this.bizMemberId = bizMemberId == null ? null : bizMemberId.trim();
    }

    public String getBizAppDate() {
        return bizAppDate;
    }

    public void setBizAppDate(String bizAppDate) {
        this.bizAppDate = bizAppDate == null ? null : bizAppDate.trim();
    }

    public String getBizOrderNo() {
        return bizOrderNo;
    }

    public void setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo == null ? null : bizOrderNo.trim();
    }

    public Integer getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Integer payMethod) {
        this.payMethod = payMethod;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode == null ? null : bankCode.trim();
    }

    public String getBankBizCode() {
        return bankBizCode;
    }

    public void setBankBizCode(String bankBizCode) {
        this.bankBizCode = bankBizCode == null ? null : bankBizCode.trim();
    }

    public String getBankAcceptDate() {
        return bankAcceptDate;
    }

    public void setBankAcceptDate(String bankAcceptDate) {
        this.bankAcceptDate = bankAcceptDate == null ? null : bankAcceptDate.trim();
    }

    public String getBankAcceptSeqNo() {
        return bankAcceptSeqNo;
    }

    public void setBankAcceptSeqNo(String bankAcceptSeqNo) {
        this.bankAcceptSeqNo = bankAcceptSeqNo == null ? null : bankAcceptSeqNo.trim();
    }

    public String getBankRepSeqNo() {
        return bankRepSeqNo;
    }

    public void setBankRepSeqNo(String bankRepSeqNo) {
        this.bankRepSeqNo = bankRepSeqNo == null ? null : bankRepSeqNo.trim();
    }

    public Integer getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(Integer balanceType) {
        this.balanceType = balanceType;
    }

    public Integer getUpBalanceFlag() {
        return upBalanceFlag;
    }

    public void setUpBalanceFlag(Integer upBalanceFlag) {
        this.upBalanceFlag = upBalanceFlag;
    }

    public Integer getDownBalanceFlag() {
        return downBalanceFlag;
    }

    public void setDownBalanceFlag(Integer downBalanceFlag) {
        this.downBalanceFlag = downBalanceFlag;
    }

    public String getMemberAccountFlowExt() {
        return memberAccountFlowExt;
    }

    public void setMemberAccountFlowExt(String memberAccountFlowExt) {
        this.memberAccountFlowExt = memberAccountFlowExt == null ? null : memberAccountFlowExt.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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