package com.solution.p2p.core.common.entity;

import java.util.Date;

public class EnterpriseRegInfo {
    private Long id;

    private Long mId;

    private String enterpriseName;

    private String enterpriseRegNo;

    private String enterpriseRegAddr;

    private Date enterpriseDuration;

    private String enterpriseAddr;

    private String enterpriseTel;

    private String enterpriseRegPic;

    private String enterpriseOrgCode;

    private String enterpriseBizScope;

    private String enterpriseRegAmount;

    private String enterpriseFax;

    private String enterpriseLegalRealName;

    private String enterpriseLegalIdCard;

    private String enterpriseIdPicFront;

    private String enterpriseIdPicBack;

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

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    public String getEnterpriseRegNo() {
        return enterpriseRegNo;
    }

    public void setEnterpriseRegNo(String enterpriseRegNo) {
        this.enterpriseRegNo = enterpriseRegNo == null ? null : enterpriseRegNo.trim();
    }

    public String getEnterpriseRegAddr() {
        return enterpriseRegAddr;
    }

    public void setEnterpriseRegAddr(String enterpriseRegAddr) {
        this.enterpriseRegAddr = enterpriseRegAddr == null ? null : enterpriseRegAddr.trim();
    }

    public Date getEnterpriseDuration() {
        return enterpriseDuration;
    }

    public void setEnterpriseDuration(Date enterpriseDuration) {
        this.enterpriseDuration = enterpriseDuration;
    }

    public String getEnterpriseAddr() {
        return enterpriseAddr;
    }

    public void setEnterpriseAddr(String enterpriseAddr) {
        this.enterpriseAddr = enterpriseAddr == null ? null : enterpriseAddr.trim();
    }

    public String getEnterpriseTel() {
        return enterpriseTel;
    }

    public void setEnterpriseTel(String enterpriseTel) {
        this.enterpriseTel = enterpriseTel == null ? null : enterpriseTel.trim();
    }

    public String getEnterpriseRegPic() {
        return enterpriseRegPic;
    }

    public void setEnterpriseRegPic(String enterpriseRegPic) {
        this.enterpriseRegPic = enterpriseRegPic == null ? null : enterpriseRegPic.trim();
    }

    public String getEnterpriseOrgCode() {
        return enterpriseOrgCode;
    }

    public void setEnterpriseOrgCode(String enterpriseOrgCode) {
        this.enterpriseOrgCode = enterpriseOrgCode == null ? null : enterpriseOrgCode.trim();
    }

    public String getEnterpriseBizScope() {
        return enterpriseBizScope;
    }

    public void setEnterpriseBizScope(String enterpriseBizScope) {
        this.enterpriseBizScope = enterpriseBizScope == null ? null : enterpriseBizScope.trim();
    }

    public String getEnterpriseRegAmount() {
        return enterpriseRegAmount;
    }

    public void setEnterpriseRegAmount(String enterpriseRegAmount) {
        this.enterpriseRegAmount = enterpriseRegAmount == null ? null : enterpriseRegAmount.trim();
    }

    public String getEnterpriseFax() {
        return enterpriseFax;
    }

    public void setEnterpriseFax(String enterpriseFax) {
        this.enterpriseFax = enterpriseFax == null ? null : enterpriseFax.trim();
    }

    public String getEnterpriseLegalRealName() {
        return enterpriseLegalRealName;
    }

    public void setEnterpriseLegalRealName(String enterpriseLegalRealName) {
        this.enterpriseLegalRealName = enterpriseLegalRealName == null ? null : enterpriseLegalRealName.trim();
    }

    public String getEnterpriseLegalIdCard() {
        return enterpriseLegalIdCard;
    }

    public void setEnterpriseLegalIdCard(String enterpriseLegalIdCard) {
        this.enterpriseLegalIdCard = enterpriseLegalIdCard == null ? null : enterpriseLegalIdCard.trim();
    }

    public String getEnterpriseIdPicFront() {
        return enterpriseIdPicFront;
    }

    public void setEnterpriseIdPicFront(String enterpriseIdPicFront) {
        this.enterpriseIdPicFront = enterpriseIdPicFront == null ? null : enterpriseIdPicFront.trim();
    }

    public String getEnterpriseIdPicBack() {
        return enterpriseIdPicBack;
    }

    public void setEnterpriseIdPicBack(String enterpriseIdPicBack) {
        this.enterpriseIdPicBack = enterpriseIdPicBack == null ? null : enterpriseIdPicBack.trim();
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