package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductGuarantyCategory {
    private Integer id;

    private String name;

    private Integer netValueCycle;

    private Integer netValueCycleUnit;

    private Integer alarmPercent;

    private Integer forcedLiquidationPercent;

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

    public Integer getNetValueCycle() {
        return netValueCycle;
    }

    public void setNetValueCycle(Integer netValueCycle) {
        this.netValueCycle = netValueCycle;
    }

    public Integer getNetValueCycleUnit() {
        return netValueCycleUnit;
    }

    public void setNetValueCycleUnit(Integer netValueCycleUnit) {
        this.netValueCycleUnit = netValueCycleUnit;
    }

    public Integer getAlarmPercent() {
        return alarmPercent;
    }

    public void setAlarmPercent(Integer alarmPercent) {
        this.alarmPercent = alarmPercent;
    }

    public Integer getForcedLiquidationPercent() {
        return forcedLiquidationPercent;
    }

    public void setForcedLiquidationPercent(Integer forcedLiquidationPercent) {
        this.forcedLiquidationPercent = forcedLiquidationPercent;
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