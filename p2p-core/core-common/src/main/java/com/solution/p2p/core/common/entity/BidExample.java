package com.solution.p2p.core.common.entity;

import java.math.BigDecimal;
import java.util.*;

public class BidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected BidExample(BidExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Long value) {
            addCriterion("prod_id =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Long value) {
            addCriterion("prod_id <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Long value) {
            addCriterion("prod_id >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prod_id >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Long value) {
            addCriterion("prod_id <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Long value) {
            addCriterion("prod_id <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Long> values) {
            addCriterion("prod_id in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Long> values) {
            addCriterion("prod_id not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Long value1, Long value2) {
            addCriterion("prod_id between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Long value1, Long value2) {
            addCriterion("prod_id not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Long value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Long value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Long value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Long value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Long value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Long value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Long> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Long> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Long value1, Long value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Long value1, Long value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountIsNull() {
            addCriterion("guaranty_amount is null");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountIsNotNull() {
            addCriterion("guaranty_amount is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountEqualTo(Long value) {
            addCriterion("guaranty_amount =", value, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountNotEqualTo(Long value) {
            addCriterion("guaranty_amount <>", value, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountGreaterThan(Long value) {
            addCriterion("guaranty_amount >", value, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("guaranty_amount >=", value, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountLessThan(Long value) {
            addCriterion("guaranty_amount <", value, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountLessThanOrEqualTo(Long value) {
            addCriterion("guaranty_amount <=", value, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountIn(List<Long> values) {
            addCriterion("guaranty_amount in", values, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountNotIn(List<Long> values) {
            addCriterion("guaranty_amount not in", values, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountBetween(Long value1, Long value2) {
            addCriterion("guaranty_amount between", value1, value2, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andGuarantyAmountNotBetween(Long value1, Long value2) {
            addCriterion("guaranty_amount not between", value1, value2, "guarantyAmount");
            return (Criteria) this;
        }

        public Criteria andCollectTimesIsNull() {
            addCriterion("collect_times is null");
            return (Criteria) this;
        }

        public Criteria andCollectTimesIsNotNull() {
            addCriterion("collect_times is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTimesEqualTo(Integer value) {
            addCriterion("collect_times =", value, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesNotEqualTo(Integer value) {
            addCriterion("collect_times <>", value, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesGreaterThan(Integer value) {
            addCriterion("collect_times >", value, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_times >=", value, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesLessThan(Integer value) {
            addCriterion("collect_times <", value, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesLessThanOrEqualTo(Integer value) {
            addCriterion("collect_times <=", value, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesIn(List<Integer> values) {
            addCriterion("collect_times in", values, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesNotIn(List<Integer> values) {
            addCriterion("collect_times not in", values, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesBetween(Integer value1, Integer value2) {
            addCriterion("collect_times between", value1, value2, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_times not between", value1, value2, "collectTimes");
            return (Criteria) this;
        }

        public Criteria andCollectAmountIsNull() {
            addCriterion("collect_amount is null");
            return (Criteria) this;
        }

        public Criteria andCollectAmountIsNotNull() {
            addCriterion("collect_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectAmountEqualTo(Long value) {
            addCriterion("collect_amount =", value, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountNotEqualTo(Long value) {
            addCriterion("collect_amount <>", value, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountGreaterThan(Long value) {
            addCriterion("collect_amount >", value, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("collect_amount >=", value, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountLessThan(Long value) {
            addCriterion("collect_amount <", value, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountLessThanOrEqualTo(Long value) {
            addCriterion("collect_amount <=", value, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountIn(List<Long> values) {
            addCriterion("collect_amount in", values, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountNotIn(List<Long> values) {
            addCriterion("collect_amount not in", values, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountBetween(Long value1, Long value2) {
            addCriterion("collect_amount between", value1, value2, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectAmountNotBetween(Long value1, Long value2) {
            addCriterion("collect_amount not between", value1, value2, "collectAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountIsNull() {
            addCriterion("collected_amount is null");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountIsNotNull() {
            addCriterion("collected_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountEqualTo(Long value) {
            addCriterion("collected_amount =", value, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountNotEqualTo(Long value) {
            addCriterion("collected_amount <>", value, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountGreaterThan(Long value) {
            addCriterion("collected_amount >", value, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("collected_amount >=", value, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountLessThan(Long value) {
            addCriterion("collected_amount <", value, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountLessThanOrEqualTo(Long value) {
            addCriterion("collected_amount <=", value, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountIn(List<Long> values) {
            addCriterion("collected_amount in", values, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountNotIn(List<Long> values) {
            addCriterion("collected_amount not in", values, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountBetween(Long value1, Long value2) {
            addCriterion("collected_amount between", value1, value2, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andCollectedAmountNotBetween(Long value1, Long value2) {
            addCriterion("collected_amount not between", value1, value2, "collectedAmount");
            return (Criteria) this;
        }

        public Criteria andLifeDurationIsNull() {
            addCriterion("life_duration is null");
            return (Criteria) this;
        }

        public Criteria andLifeDurationIsNotNull() {
            addCriterion("life_duration is not null");
            return (Criteria) this;
        }

        public Criteria andLifeDurationEqualTo(Integer value) {
            addCriterion("life_duration =", value, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationNotEqualTo(Integer value) {
            addCriterion("life_duration <>", value, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationGreaterThan(Integer value) {
            addCriterion("life_duration >", value, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("life_duration >=", value, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationLessThan(Integer value) {
            addCriterion("life_duration <", value, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationLessThanOrEqualTo(Integer value) {
            addCriterion("life_duration <=", value, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationIn(List<Integer> values) {
            addCriterion("life_duration in", values, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationNotIn(List<Integer> values) {
            addCriterion("life_duration not in", values, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationBetween(Integer value1, Integer value2) {
            addCriterion("life_duration between", value1, value2, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("life_duration not between", value1, value2, "lifeDuration");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitIsNull() {
            addCriterion("life_duration_unit is null");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitIsNotNull() {
            addCriterion("life_duration_unit is not null");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitEqualTo(Integer value) {
            addCriterion("life_duration_unit =", value, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitNotEqualTo(Integer value) {
            addCriterion("life_duration_unit <>", value, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitGreaterThan(Integer value) {
            addCriterion("life_duration_unit >", value, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("life_duration_unit >=", value, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitLessThan(Integer value) {
            addCriterion("life_duration_unit <", value, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitLessThanOrEqualTo(Integer value) {
            addCriterion("life_duration_unit <=", value, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitIn(List<Integer> values) {
            addCriterion("life_duration_unit in", values, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitNotIn(List<Integer> values) {
            addCriterion("life_duration_unit not in", values, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitBetween(Integer value1, Integer value2) {
            addCriterion("life_duration_unit between", value1, value2, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andLifeDurationUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("life_duration_unit not between", value1, value2, "lifeDurationUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateIsNull() {
            addCriterion("collect_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateIsNotNull() {
            addCriterion("collect_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateEqualTo(BigDecimal value) {
            addCriterion("collect_interest_rate =", value, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("collect_interest_rate <>", value, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateGreaterThan(BigDecimal value) {
            addCriterion("collect_interest_rate >", value, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("collect_interest_rate >=", value, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateLessThan(BigDecimal value) {
            addCriterion("collect_interest_rate <", value, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("collect_interest_rate <=", value, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateIn(List<BigDecimal> values) {
            addCriterion("collect_interest_rate in", values, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("collect_interest_rate not in", values, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collect_interest_rate between", value1, value2, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("collect_interest_rate not between", value1, value2, "collectInterestRate");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitIsNull() {
            addCriterion("collect_interest_rate_unit is null");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitIsNotNull() {
            addCriterion("collect_interest_rate_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitEqualTo(Integer value) {
            addCriterion("collect_interest_rate_unit =", value, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitNotEqualTo(Integer value) {
            addCriterion("collect_interest_rate_unit <>", value, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitGreaterThan(Integer value) {
            addCriterion("collect_interest_rate_unit >", value, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_interest_rate_unit >=", value, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitLessThan(Integer value) {
            addCriterion("collect_interest_rate_unit <", value, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitLessThanOrEqualTo(Integer value) {
            addCriterion("collect_interest_rate_unit <=", value, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitIn(List<Integer> values) {
            addCriterion("collect_interest_rate_unit in", values, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitNotIn(List<Integer> values) {
            addCriterion("collect_interest_rate_unit not in", values, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitBetween(Integer value1, Integer value2) {
            addCriterion("collect_interest_rate_unit between", value1, value2, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectInterestRateUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_interest_rate_unit not between", value1, value2, "collectInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateIsNull() {
            addCriterion("request_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateIsNotNull() {
            addCriterion("request_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateEqualTo(BigDecimal value) {
            addCriterion("request_interest_rate =", value, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("request_interest_rate <>", value, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateGreaterThan(BigDecimal value) {
            addCriterion("request_interest_rate >", value, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_interest_rate >=", value, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateLessThan(BigDecimal value) {
            addCriterion("request_interest_rate <", value, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_interest_rate <=", value, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateIn(List<BigDecimal> values) {
            addCriterion("request_interest_rate in", values, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("request_interest_rate not in", values, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_interest_rate between", value1, value2, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_interest_rate not between", value1, value2, "requestInterestRate");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitIsNull() {
            addCriterion("request_interest_rate_unit is null");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitIsNotNull() {
            addCriterion("request_interest_rate_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitEqualTo(Integer value) {
            addCriterion("request_interest_rate_unit =", value, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitNotEqualTo(Integer value) {
            addCriterion("request_interest_rate_unit <>", value, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitGreaterThan(Integer value) {
            addCriterion("request_interest_rate_unit >", value, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_interest_rate_unit >=", value, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitLessThan(Integer value) {
            addCriterion("request_interest_rate_unit <", value, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitLessThanOrEqualTo(Integer value) {
            addCriterion("request_interest_rate_unit <=", value, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitIn(List<Integer> values) {
            addCriterion("request_interest_rate_unit in", values, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitNotIn(List<Integer> values) {
            addCriterion("request_interest_rate_unit not in", values, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitBetween(Integer value1, Integer value2) {
            addCriterion("request_interest_rate_unit between", value1, value2, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andRequestInterestRateUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("request_interest_rate_unit not between", value1, value2, "requestInterestRateUnit");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeIsNull() {
            addCriterion("collect_from_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeIsNotNull() {
            addCriterion("collect_from_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeEqualTo(Date value) {
            addCriterion("collect_from_time =", value, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeNotEqualTo(Date value) {
            addCriterion("collect_from_time <>", value, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeGreaterThan(Date value) {
            addCriterion("collect_from_time >", value, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_from_time >=", value, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeLessThan(Date value) {
            addCriterion("collect_from_time <", value, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_from_time <=", value, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeIn(List<Date> values) {
            addCriterion("collect_from_time in", values, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeNotIn(List<Date> values) {
            addCriterion("collect_from_time not in", values, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeBetween(Date value1, Date value2) {
            addCriterion("collect_from_time between", value1, value2, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectFromTimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_from_time not between", value1, value2, "collectFromTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeIsNull() {
            addCriterion("collect_thru_time is null");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeIsNotNull() {
            addCriterion("collect_thru_time is not null");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeEqualTo(Date value) {
            addCriterion("collect_thru_time =", value, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeNotEqualTo(Date value) {
            addCriterion("collect_thru_time <>", value, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeGreaterThan(Date value) {
            addCriterion("collect_thru_time >", value, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("collect_thru_time >=", value, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeLessThan(Date value) {
            addCriterion("collect_thru_time <", value, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeLessThanOrEqualTo(Date value) {
            addCriterion("collect_thru_time <=", value, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeIn(List<Date> values) {
            addCriterion("collect_thru_time in", values, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeNotIn(List<Date> values) {
            addCriterion("collect_thru_time not in", values, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeBetween(Date value1, Date value2) {
            addCriterion("collect_thru_time between", value1, value2, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andCollectThruTimeNotBetween(Date value1, Date value2) {
            addCriterion("collect_thru_time not between", value1, value2, "collectThruTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeIsNull() {
            addCriterion("bid_success_time is null");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeIsNotNull() {
            addCriterion("bid_success_time is not null");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeEqualTo(Date value) {
            addCriterion("bid_success_time =", value, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeNotEqualTo(Date value) {
            addCriterion("bid_success_time <>", value, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeGreaterThan(Date value) {
            addCriterion("bid_success_time >", value, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bid_success_time >=", value, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeLessThan(Date value) {
            addCriterion("bid_success_time <", value, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeLessThanOrEqualTo(Date value) {
            addCriterion("bid_success_time <=", value, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeIn(List<Date> values) {
            addCriterion("bid_success_time in", values, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeNotIn(List<Date> values) {
            addCriterion("bid_success_time not in", values, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeBetween(Date value1, Date value2) {
            addCriterion("bid_success_time between", value1, value2, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andBidSuccessTimeNotBetween(Date value1, Date value2) {
            addCriterion("bid_success_time not between", value1, value2, "bidSuccessTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}