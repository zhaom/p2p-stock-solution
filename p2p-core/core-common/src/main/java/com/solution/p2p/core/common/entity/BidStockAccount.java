package com.solution.p2p.core.common.entity;

import java.util.Date;

public class BidStockAccount {
    private Long id;

    private Long bId;

    private Long mId;

    private Long mStockAccountId;

    private Date fromTime;

    private Date thruTime;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getbId() {
        return bId;
    }

    public void setbId(Long bId) {
        this.bId = bId;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Long getmStockAccountId() {
        return mStockAccountId;
    }

    public void setmStockAccountId(Long mStockAccountId) {
        this.mStockAccountId = mStockAccountId;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getThruTime() {
        return thruTime;
    }

    public void setThruTime(Date thruTime) {
        this.thruTime = thruTime;
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