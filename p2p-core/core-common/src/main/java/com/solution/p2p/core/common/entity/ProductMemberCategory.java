package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductMemberCategory {
    private Integer id;

    private String name;

    private Integer limitMamberType;

    private String memberTypes;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLimitMamberType() {
        return limitMamberType;
    }

    public void setLimitMamberType(Integer limitMamberType) {
        this.limitMamberType = limitMamberType;
    }

    public String getMemberTypes() {
        return memberTypes;
    }

    public void setMemberTypes(String memberTypes) {
        this.memberTypes = memberTypes == null ? null : memberTypes.trim();
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