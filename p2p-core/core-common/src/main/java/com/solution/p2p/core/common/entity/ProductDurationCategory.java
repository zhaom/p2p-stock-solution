package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductDurationCategory {
    private Integer id;

    private String name;

    private Integer limitMinDuration;

    private Integer limitMaxDuration;

    private Integer durationUnit;

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

    public Integer getLimitMinDuration() {
        return limitMinDuration;
    }

    public void setLimitMinDuration(Integer limitMinDuration) {
        this.limitMinDuration = limitMinDuration;
    }

    public Integer getLimitMaxDuration() {
        return limitMaxDuration;
    }

    public void setLimitMaxDuration(Integer limitMaxDuration) {
        this.limitMaxDuration = limitMaxDuration;
    }

    public Integer getDurationUnit() {
        return durationUnit;
    }

    public void setDurationUnit(Integer durationUnit) {
        this.durationUnit = durationUnit;
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