package com.solution.p2p.core.common.entity;

import java.util.Date;

public class MemberAccountFinanceRpt {
    private Long id;

    private Integer financeRptTimeType;

    private String financeTime;

    private Long mId;

    private Long memberAccountId;

    private Long memberAccountName;

    private Integer memberAccountType;

    private Integer setNo;

    private Integer direction;

    private Long fromAmount;

    private Long fromFrozenAmount;

    private Long thruAmount;

    private Long thruFrozenAmount;

    private Integer totalIncomeCount;

    private Long totalIncomeAmount;

    private Integer totalExpendCount;

    private Long totalExpendAmount;

    private Integer totalFrozenCount;

    private Long totalFrozenAmount;

    private Integer totalThawCount;

    private Long totalThawAmount;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFinanceRptTimeType() {
        return financeRptTimeType;
    }

    public void setFinanceRptTimeType(Integer financeRptTimeType) {
        this.financeRptTimeType = financeRptTimeType;
    }

    public String getFinanceTime() {
        return financeTime;
    }

    public void setFinanceTime(String financeTime) {
        this.financeTime = financeTime == null ? null : financeTime.trim();
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Long getMemberAccountId() {
        return memberAccountId;
    }

    public void setMemberAccountId(Long memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    public Long getMemberAccountName() {
        return memberAccountName;
    }

    public void setMemberAccountName(Long memberAccountName) {
        this.memberAccountName = memberAccountName;
    }

    public Integer getMemberAccountType() {
        return memberAccountType;
    }

    public void setMemberAccountType(Integer memberAccountType) {
        this.memberAccountType = memberAccountType;
    }

    public Integer getSetNo() {
        return setNo;
    }

    public void setSetNo(Integer setNo) {
        this.setNo = setNo;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Long getFromAmount() {
        return fromAmount;
    }

    public void setFromAmount(Long fromAmount) {
        this.fromAmount = fromAmount;
    }

    public Long getFromFrozenAmount() {
        return fromFrozenAmount;
    }

    public void setFromFrozenAmount(Long fromFrozenAmount) {
        this.fromFrozenAmount = fromFrozenAmount;
    }

    public Long getThruAmount() {
        return thruAmount;
    }

    public void setThruAmount(Long thruAmount) {
        this.thruAmount = thruAmount;
    }

    public Long getThruFrozenAmount() {
        return thruFrozenAmount;
    }

    public void setThruFrozenAmount(Long thruFrozenAmount) {
        this.thruFrozenAmount = thruFrozenAmount;
    }

    public Integer getTotalIncomeCount() {
        return totalIncomeCount;
    }

    public void setTotalIncomeCount(Integer totalIncomeCount) {
        this.totalIncomeCount = totalIncomeCount;
    }

    public Long getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    public void setTotalIncomeAmount(Long totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }

    public Integer getTotalExpendCount() {
        return totalExpendCount;
    }

    public void setTotalExpendCount(Integer totalExpendCount) {
        this.totalExpendCount = totalExpendCount;
    }

    public Long getTotalExpendAmount() {
        return totalExpendAmount;
    }

    public void setTotalExpendAmount(Long totalExpendAmount) {
        this.totalExpendAmount = totalExpendAmount;
    }

    public Integer getTotalFrozenCount() {
        return totalFrozenCount;
    }

    public void setTotalFrozenCount(Integer totalFrozenCount) {
        this.totalFrozenCount = totalFrozenCount;
    }

    public Long getTotalFrozenAmount() {
        return totalFrozenAmount;
    }

    public void setTotalFrozenAmount(Long totalFrozenAmount) {
        this.totalFrozenAmount = totalFrozenAmount;
    }

    public Integer getTotalThawCount() {
        return totalThawCount;
    }

    public void setTotalThawCount(Integer totalThawCount) {
        this.totalThawCount = totalThawCount;
    }

    public Long getTotalThawAmount() {
        return totalThawAmount;
    }

    public void setTotalThawAmount(Long totalThawAmount) {
        this.totalThawAmount = totalThawAmount;
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