package com.solution.p2p.core.common.entity;

import java.math.BigDecimal;
import java.util.*;

public class ProductInterestCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInterestCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected ProductInterestCategoryExample(ProductInterestCategoryExample example) {
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

        public Criteria andLimitMinInterestRateIsNull() {
            addCriterion("limit_min_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateIsNotNull() {
            addCriterion("limit_min_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateEqualTo(BigDecimal value) {
            addCriterion("limit_min_interest_rate =", value, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("limit_min_interest_rate <>", value, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateGreaterThan(BigDecimal value) {
            addCriterion("limit_min_interest_rate >", value, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_min_interest_rate >=", value, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateLessThan(BigDecimal value) {
            addCriterion("limit_min_interest_rate <", value, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_min_interest_rate <=", value, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateIn(List<BigDecimal> values) {
            addCriterion("limit_min_interest_rate in", values, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("limit_min_interest_rate not in", values, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_min_interest_rate between", value1, value2, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMinInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_min_interest_rate not between", value1, value2, "limitMinInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateIsNull() {
            addCriterion("limit_max_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateIsNotNull() {
            addCriterion("limit_max_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateEqualTo(BigDecimal value) {
            addCriterion("limit_max_interest_rate =", value, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("limit_max_interest_rate <>", value, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateGreaterThan(BigDecimal value) {
            addCriterion("limit_max_interest_rate >", value, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_max_interest_rate >=", value, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateLessThan(BigDecimal value) {
            addCriterion("limit_max_interest_rate <", value, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("limit_max_interest_rate <=", value, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateIn(List<BigDecimal> values) {
            addCriterion("limit_max_interest_rate in", values, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("limit_max_interest_rate not in", values, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_max_interest_rate between", value1, value2, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andLimitMaxInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("limit_max_interest_rate not between", value1, value2, "limitMaxInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateIsNull() {
            addCriterion("prefer_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateIsNotNull() {
            addCriterion("prefer_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateEqualTo(BigDecimal value) {
            addCriterion("prefer_interest_rate =", value, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateNotEqualTo(BigDecimal value) {
            addCriterion("prefer_interest_rate <>", value, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateGreaterThan(BigDecimal value) {
            addCriterion("prefer_interest_rate >", value, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("prefer_interest_rate >=", value, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateLessThan(BigDecimal value) {
            addCriterion("prefer_interest_rate <", value, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("prefer_interest_rate <=", value, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateIn(List<BigDecimal> values) {
            addCriterion("prefer_interest_rate in", values, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateNotIn(List<BigDecimal> values) {
            addCriterion("prefer_interest_rate not in", values, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prefer_interest_rate between", value1, value2, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andPreferInterestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("prefer_interest_rate not between", value1, value2, "preferInterestRate");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitIsNull() {
            addCriterion("interest_rate_unit is null");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitIsNotNull() {
            addCriterion("interest_rate_unit is not null");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitEqualTo(Integer value) {
            addCriterion("interest_rate_unit =", value, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitNotEqualTo(Integer value) {
            addCriterion("interest_rate_unit <>", value, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitGreaterThan(Integer value) {
            addCriterion("interest_rate_unit >", value, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest_rate_unit >=", value, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitLessThan(Integer value) {
            addCriterion("interest_rate_unit <", value, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitLessThanOrEqualTo(Integer value) {
            addCriterion("interest_rate_unit <=", value, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitIn(List<Integer> values) {
            addCriterion("interest_rate_unit in", values, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitNotIn(List<Integer> values) {
            addCriterion("interest_rate_unit not in", values, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitBetween(Integer value1, Integer value2) {
            addCriterion("interest_rate_unit between", value1, value2, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andInterestRateUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("interest_rate_unit not between", value1, value2, "interestRateUnit");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeIsNull() {
            addCriterion("int_diff_time is null");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeIsNotNull() {
            addCriterion("int_diff_time is not null");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeEqualTo(Integer value) {
            addCriterion("int_diff_time =", value, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeNotEqualTo(Integer value) {
            addCriterion("int_diff_time <>", value, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeGreaterThan(Integer value) {
            addCriterion("int_diff_time >", value, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("int_diff_time >=", value, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeLessThan(Integer value) {
            addCriterion("int_diff_time <", value, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeLessThanOrEqualTo(Integer value) {
            addCriterion("int_diff_time <=", value, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeIn(List<Integer> values) {
            addCriterion("int_diff_time in", values, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeNotIn(List<Integer> values) {
            addCriterion("int_diff_time not in", values, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeBetween(Integer value1, Integer value2) {
            addCriterion("int_diff_time between", value1, value2, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andIntDiffTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("int_diff_time not between", value1, value2, "intDiffTime");
            return (Criteria) this;
        }

        public Criteria andDiffUnitIsNull() {
            addCriterion("diff_unit is null");
            return (Criteria) this;
        }

        public Criteria andDiffUnitIsNotNull() {
            addCriterion("diff_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDiffUnitEqualTo(Integer value) {
            addCriterion("diff_unit =", value, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitNotEqualTo(Integer value) {
            addCriterion("diff_unit <>", value, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitGreaterThan(Integer value) {
            addCriterion("diff_unit >", value, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("diff_unit >=", value, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitLessThan(Integer value) {
            addCriterion("diff_unit <", value, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitLessThanOrEqualTo(Integer value) {
            addCriterion("diff_unit <=", value, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitIn(List<Integer> values) {
            addCriterion("diff_unit in", values, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitNotIn(List<Integer> values) {
            addCriterion("diff_unit not in", values, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitBetween(Integer value1, Integer value2) {
            addCriterion("diff_unit between", value1, value2, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andDiffUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("diff_unit not between", value1, value2, "diffUnit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitIsNull() {
            addCriterion("refund_int_diff_time_limit is null");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitIsNotNull() {
            addCriterion("refund_int_diff_time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitEqualTo(Integer value) {
            addCriterion("refund_int_diff_time_limit =", value, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitNotEqualTo(Integer value) {
            addCriterion("refund_int_diff_time_limit <>", value, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitGreaterThan(Integer value) {
            addCriterion("refund_int_diff_time_limit >", value, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_int_diff_time_limit >=", value, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitLessThan(Integer value) {
            addCriterion("refund_int_diff_time_limit <", value, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("refund_int_diff_time_limit <=", value, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitIn(List<Integer> values) {
            addCriterion("refund_int_diff_time_limit in", values, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitNotIn(List<Integer> values) {
            addCriterion("refund_int_diff_time_limit not in", values, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("refund_int_diff_time_limit between", value1, value2, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntDiffTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_int_diff_time_limit not between", value1, value2, "refundIntDiffTimeLimit");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstIsNull() {
            addCriterion("refund_int_first is null");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstIsNotNull() {
            addCriterion("refund_int_first is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstEqualTo(Integer value) {
            addCriterion("refund_int_first =", value, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstNotEqualTo(Integer value) {
            addCriterion("refund_int_first <>", value, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstGreaterThan(Integer value) {
            addCriterion("refund_int_first >", value, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_int_first >=", value, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstLessThan(Integer value) {
            addCriterion("refund_int_first <", value, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstLessThanOrEqualTo(Integer value) {
            addCriterion("refund_int_first <=", value, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstIn(List<Integer> values) {
            addCriterion("refund_int_first in", values, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstNotIn(List<Integer> values) {
            addCriterion("refund_int_first not in", values, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstBetween(Integer value1, Integer value2) {
            addCriterion("refund_int_first between", value1, value2, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundIntFirstNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_int_first not between", value1, value2, "refundIntFirst");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationIsNull() {
            addCriterion("refund_cycle_duration is null");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationIsNotNull() {
            addCriterion("refund_cycle_duration is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationEqualTo(Integer value) {
            addCriterion("refund_cycle_duration =", value, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationNotEqualTo(Integer value) {
            addCriterion("refund_cycle_duration <>", value, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationGreaterThan(Integer value) {
            addCriterion("refund_cycle_duration >", value, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_cycle_duration >=", value, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationLessThan(Integer value) {
            addCriterion("refund_cycle_duration <", value, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationLessThanOrEqualTo(Integer value) {
            addCriterion("refund_cycle_duration <=", value, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationIn(List<Integer> values) {
            addCriterion("refund_cycle_duration in", values, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationNotIn(List<Integer> values) {
            addCriterion("refund_cycle_duration not in", values, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationBetween(Integer value1, Integer value2) {
            addCriterion("refund_cycle_duration between", value1, value2, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_cycle_duration not between", value1, value2, "refundCycleDuration");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitIsNull() {
            addCriterion("refund_cycle_duration_unit is null");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitIsNotNull() {
            addCriterion("refund_cycle_duration_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitEqualTo(Integer value) {
            addCriterion("refund_cycle_duration_unit =", value, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitNotEqualTo(Integer value) {
            addCriterion("refund_cycle_duration_unit <>", value, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitGreaterThan(Integer value) {
            addCriterion("refund_cycle_duration_unit >", value, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_cycle_duration_unit >=", value, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitLessThan(Integer value) {
            addCriterion("refund_cycle_duration_unit <", value, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitLessThanOrEqualTo(Integer value) {
            addCriterion("refund_cycle_duration_unit <=", value, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitIn(List<Integer> values) {
            addCriterion("refund_cycle_duration_unit in", values, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitNotIn(List<Integer> values) {
            addCriterion("refund_cycle_duration_unit not in", values, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitBetween(Integer value1, Integer value2) {
            addCriterion("refund_cycle_duration_unit between", value1, value2, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundCycleDurationUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_cycle_duration_unit not between", value1, value2, "refundCycleDurationUnit");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesIsNull() {
            addCriterion("refund_int_times is null");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesIsNotNull() {
            addCriterion("refund_int_times is not null");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesEqualTo(Integer value) {
            addCriterion("refund_int_times =", value, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesNotEqualTo(Integer value) {
            addCriterion("refund_int_times <>", value, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesGreaterThan(Integer value) {
            addCriterion("refund_int_times >", value, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_int_times >=", value, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesLessThan(Integer value) {
            addCriterion("refund_int_times <", value, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesLessThanOrEqualTo(Integer value) {
            addCriterion("refund_int_times <=", value, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesIn(List<Integer> values) {
            addCriterion("refund_int_times in", values, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesNotIn(List<Integer> values) {
            addCriterion("refund_int_times not in", values, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesBetween(Integer value1, Integer value2) {
            addCriterion("refund_int_times between", value1, value2, "refundIntTimes");
            return (Criteria) this;
        }

        public Criteria andRefundIntTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_int_times not between", value1, value2, "refundIntTimes");
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