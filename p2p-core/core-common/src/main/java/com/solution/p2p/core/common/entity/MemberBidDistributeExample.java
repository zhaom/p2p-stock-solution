package com.solution.p2p.core.common.entity;

import java.util.*;

public class MemberBidDistributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberBidDistributeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected MemberBidDistributeExample(MemberBidDistributeExample example) {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Long value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Long value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Long value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Long value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Long value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Long value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Long> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Long> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Long value1, Long value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Long value1, Long value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNull() {
            addCriterion("request_amount is null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNotNull() {
            addCriterion("request_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountEqualTo(Long value) {
            addCriterion("request_amount =", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotEqualTo(Long value) {
            addCriterion("request_amount <>", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThan(Long value) {
            addCriterion("request_amount >", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("request_amount >=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThan(Long value) {
            addCriterion("request_amount <", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThanOrEqualTo(Long value) {
            addCriterion("request_amount <=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIn(List<Long> values) {
            addCriterion("request_amount in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotIn(List<Long> values) {
            addCriterion("request_amount not in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountBetween(Long value1, Long value2) {
            addCriterion("request_amount between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotBetween(Long value1, Long value2) {
            addCriterion("request_amount not between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeIsNull() {
            addCriterion("scheduled_dist_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeIsNotNull() {
            addCriterion("scheduled_dist_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeEqualTo(Date value) {
            addCriterion("scheduled_dist_time =", value, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeNotEqualTo(Date value) {
            addCriterion("scheduled_dist_time <>", value, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeGreaterThan(Date value) {
            addCriterion("scheduled_dist_time >", value, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scheduled_dist_time >=", value, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeLessThan(Date value) {
            addCriterion("scheduled_dist_time <", value, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeLessThanOrEqualTo(Date value) {
            addCriterion("scheduled_dist_time <=", value, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeIn(List<Date> values) {
            addCriterion("scheduled_dist_time in", values, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeNotIn(List<Date> values) {
            addCriterion("scheduled_dist_time not in", values, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeBetween(Date value1, Date value2) {
            addCriterion("scheduled_dist_time between", value1, value2, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistTimeNotBetween(Date value1, Date value2) {
            addCriterion("scheduled_dist_time not between", value1, value2, "scheduledDistTime");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalIsNull() {
            addCriterion("scheduled_dist_principal is null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalIsNotNull() {
            addCriterion("scheduled_dist_principal is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalEqualTo(Long value) {
            addCriterion("scheduled_dist_principal =", value, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalNotEqualTo(Long value) {
            addCriterion("scheduled_dist_principal <>", value, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalGreaterThan(Long value) {
            addCriterion("scheduled_dist_principal >", value, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduled_dist_principal >=", value, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalLessThan(Long value) {
            addCriterion("scheduled_dist_principal <", value, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("scheduled_dist_principal <=", value, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalIn(List<Long> values) {
            addCriterion("scheduled_dist_principal in", values, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalNotIn(List<Long> values) {
            addCriterion("scheduled_dist_principal not in", values, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalBetween(Long value1, Long value2) {
            addCriterion("scheduled_dist_principal between", value1, value2, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("scheduled_dist_principal not between", value1, value2, "scheduledDistPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestIsNull() {
            addCriterion("scheduled_dist_interest is null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestIsNotNull() {
            addCriterion("scheduled_dist_interest is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestEqualTo(Long value) {
            addCriterion("scheduled_dist_interest =", value, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestNotEqualTo(Long value) {
            addCriterion("scheduled_dist_interest <>", value, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestGreaterThan(Long value) {
            addCriterion("scheduled_dist_interest >", value, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduled_dist_interest >=", value, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestLessThan(Long value) {
            addCriterion("scheduled_dist_interest <", value, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestLessThanOrEqualTo(Long value) {
            addCriterion("scheduled_dist_interest <=", value, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestIn(List<Long> values) {
            addCriterion("scheduled_dist_interest in", values, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestNotIn(List<Long> values) {
            addCriterion("scheduled_dist_interest not in", values, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestBetween(Long value1, Long value2) {
            addCriterion("scheduled_dist_interest between", value1, value2, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistInterestNotBetween(Long value1, Long value2) {
            addCriterion("scheduled_dist_interest not between", value1, value2, "scheduledDistInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueIsNull() {
            addCriterion("scheduled_dist_revenue is null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueIsNotNull() {
            addCriterion("scheduled_dist_revenue is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueEqualTo(Long value) {
            addCriterion("scheduled_dist_revenue =", value, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueNotEqualTo(Long value) {
            addCriterion("scheduled_dist_revenue <>", value, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueGreaterThan(Long value) {
            addCriterion("scheduled_dist_revenue >", value, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduled_dist_revenue >=", value, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueLessThan(Long value) {
            addCriterion("scheduled_dist_revenue <", value, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueLessThanOrEqualTo(Long value) {
            addCriterion("scheduled_dist_revenue <=", value, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueIn(List<Long> values) {
            addCriterion("scheduled_dist_revenue in", values, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueNotIn(List<Long> values) {
            addCriterion("scheduled_dist_revenue not in", values, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueBetween(Long value1, Long value2) {
            addCriterion("scheduled_dist_revenue between", value1, value2, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andScheduledDistRevenueNotBetween(Long value1, Long value2) {
            addCriterion("scheduled_dist_revenue not between", value1, value2, "scheduledDistRevenue");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeIsNull() {
            addCriterion("real_dist_time is null");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeIsNotNull() {
            addCriterion("real_dist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeEqualTo(Date value) {
            addCriterion("real_dist_time =", value, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeNotEqualTo(Date value) {
            addCriterion("real_dist_time <>", value, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeGreaterThan(Date value) {
            addCriterion("real_dist_time >", value, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_dist_time >=", value, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeLessThan(Date value) {
            addCriterion("real_dist_time <", value, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_dist_time <=", value, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeIn(List<Date> values) {
            addCriterion("real_dist_time in", values, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeNotIn(List<Date> values) {
            addCriterion("real_dist_time not in", values, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeBetween(Date value1, Date value2) {
            addCriterion("real_dist_time between", value1, value2, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_dist_time not between", value1, value2, "realDistTime");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountIsNull() {
            addCriterion("real_dist_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountIsNotNull() {
            addCriterion("real_dist_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountEqualTo(Long value) {
            addCriterion("real_dist_amount =", value, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountNotEqualTo(Long value) {
            addCriterion("real_dist_amount <>", value, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountGreaterThan(Long value) {
            addCriterion("real_dist_amount >", value, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("real_dist_amount >=", value, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountLessThan(Long value) {
            addCriterion("real_dist_amount <", value, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountLessThanOrEqualTo(Long value) {
            addCriterion("real_dist_amount <=", value, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountIn(List<Long> values) {
            addCriterion("real_dist_amount in", values, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountNotIn(List<Long> values) {
            addCriterion("real_dist_amount not in", values, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountBetween(Long value1, Long value2) {
            addCriterion("real_dist_amount between", value1, value2, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andRealDistAmountNotBetween(Long value1, Long value2) {
            addCriterion("real_dist_amount not between", value1, value2, "realDistAmount");
            return (Criteria) this;
        }

        public Criteria andDistStatusIsNull() {
            addCriterion("dist_status is null");
            return (Criteria) this;
        }

        public Criteria andDistStatusIsNotNull() {
            addCriterion("dist_status is not null");
            return (Criteria) this;
        }

        public Criteria andDistStatusEqualTo(Integer value) {
            addCriterion("dist_status =", value, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusNotEqualTo(Integer value) {
            addCriterion("dist_status <>", value, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusGreaterThan(Integer value) {
            addCriterion("dist_status >", value, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dist_status >=", value, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusLessThan(Integer value) {
            addCriterion("dist_status <", value, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dist_status <=", value, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusIn(List<Integer> values) {
            addCriterion("dist_status in", values, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusNotIn(List<Integer> values) {
            addCriterion("dist_status not in", values, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusBetween(Integer value1, Integer value2) {
            addCriterion("dist_status between", value1, value2, "distStatus");
            return (Criteria) this;
        }

        public Criteria andDistStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dist_status not between", value1, value2, "distStatus");
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