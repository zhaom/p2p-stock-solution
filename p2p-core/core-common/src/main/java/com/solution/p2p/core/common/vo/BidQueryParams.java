package com.solution.p2p.core.common.vo;

import com.solution.p2p.core.common.entity.BidExample;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 15-4-18
 * Time: 上午7:59
 * To change this template use File | Settings | File Templates.
 */
public class BidQueryParams {

    private String code;

    private Long prodId;

    private String name;

    private Long mId;

    private Integer lifeDuration;

    private Integer lifeDurationUnit;

    private Integer status;

    private String orderBy = "request_interest_rate desc";

    public BidExample buildQuery(){
        BidExample bidExample = new BidExample();
        bidExample.setOrderByClause(orderBy);
        BidExample.Criteria criteria = bidExample.createCriteria();
        if(!StringUtils.isEmpty(code)){
            criteria.andCodeEqualTo(code);
        }
        if(prodId>0){
            criteria.andProdIdEqualTo(prodId);
        }
        if(!StringUtils.isEmpty(name)){
            criteria.andNameEqualTo(name);
        }
        if(mId > 0){
            criteria.andMIdEqualTo(mId);
        }
        if(lifeDuration > 0){
            criteria.andLifeDurationEqualTo(lifeDuration).andLifeDurationUnitEqualTo(lifeDurationUnit);
        }
        if(status>0){
            criteria.andStatusEqualTo(status);
        }

        return bidExample;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Integer getLifeDuration() {
        return lifeDuration;
    }

    public void setLifeDuration(Integer lifeDuration) {
        this.lifeDuration = lifeDuration;
    }

    public Integer getLifeDurationUnit() {
        return lifeDurationUnit;
    }

    public void setLifeDurationUnit(Integer lifeDurationUnit) {
        this.lifeDurationUnit = lifeDurationUnit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
