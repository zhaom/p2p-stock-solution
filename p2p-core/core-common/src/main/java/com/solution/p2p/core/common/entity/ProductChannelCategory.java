package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductChannelCategory {
    private Integer id;

    private String name;

    private Integer webBid;

    private Integer mobileBid;

    private Integer limitEventBid;

    private String eventBids;

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

    public Integer getWebBid() {
        return webBid;
    }

    public void setWebBid(Integer webBid) {
        this.webBid = webBid;
    }

    public Integer getMobileBid() {
        return mobileBid;
    }

    public void setMobileBid(Integer mobileBid) {
        this.mobileBid = mobileBid;
    }

    public Integer getLimitEventBid() {
        return limitEventBid;
    }

    public void setLimitEventBid(Integer limitEventBid) {
        this.limitEventBid = limitEventBid;
    }

    public String getEventBids() {
        return eventBids;
    }

    public void setEventBids(String eventBids) {
        this.eventBids = eventBids == null ? null : eventBids.trim();
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