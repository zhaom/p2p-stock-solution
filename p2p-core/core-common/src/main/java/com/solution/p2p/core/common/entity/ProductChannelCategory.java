package com.solution.p2p.core.common.entity;

import java.util.Date;

public class ProductChannelCategory {
    private Integer id;

    private String name;

    private Integer webBid;

    private Integer mobileBid;

    private Integer wechatBid;

    private Integer eventBidLimitType;

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

    public Integer getWechatBid() {
        return wechatBid;
    }

    public void setWechatBid(Integer wechatBid) {
        this.wechatBid = wechatBid;
    }

    public Integer getEventBidLimitType() {
        return eventBidLimitType;
    }

    public void setEventBidLimitType(Integer eventBidLimitType) {
        this.eventBidLimitType = eventBidLimitType;
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