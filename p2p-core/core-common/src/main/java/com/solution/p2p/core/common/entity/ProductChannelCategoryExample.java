package com.solution.p2p.core.common.entity;

import java.util.*;

public class ProductChannelCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductChannelCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected ProductChannelCategoryExample(ProductChannelCategoryExample example) {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andWebBidIsNull() {
            addCriterion("web_bid is null");
            return (Criteria) this;
        }

        public Criteria andWebBidIsNotNull() {
            addCriterion("web_bid is not null");
            return (Criteria) this;
        }

        public Criteria andWebBidEqualTo(Integer value) {
            addCriterion("web_bid =", value, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidNotEqualTo(Integer value) {
            addCriterion("web_bid <>", value, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidGreaterThan(Integer value) {
            addCriterion("web_bid >", value, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("web_bid >=", value, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidLessThan(Integer value) {
            addCriterion("web_bid <", value, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidLessThanOrEqualTo(Integer value) {
            addCriterion("web_bid <=", value, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidIn(List<Integer> values) {
            addCriterion("web_bid in", values, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidNotIn(List<Integer> values) {
            addCriterion("web_bid not in", values, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidBetween(Integer value1, Integer value2) {
            addCriterion("web_bid between", value1, value2, "webBid");
            return (Criteria) this;
        }

        public Criteria andWebBidNotBetween(Integer value1, Integer value2) {
            addCriterion("web_bid not between", value1, value2, "webBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidIsNull() {
            addCriterion("mobile_bid is null");
            return (Criteria) this;
        }

        public Criteria andMobileBidIsNotNull() {
            addCriterion("mobile_bid is not null");
            return (Criteria) this;
        }

        public Criteria andMobileBidEqualTo(Integer value) {
            addCriterion("mobile_bid =", value, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidNotEqualTo(Integer value) {
            addCriterion("mobile_bid <>", value, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidGreaterThan(Integer value) {
            addCriterion("mobile_bid >", value, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_bid >=", value, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidLessThan(Integer value) {
            addCriterion("mobile_bid <", value, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_bid <=", value, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidIn(List<Integer> values) {
            addCriterion("mobile_bid in", values, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidNotIn(List<Integer> values) {
            addCriterion("mobile_bid not in", values, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidBetween(Integer value1, Integer value2) {
            addCriterion("mobile_bid between", value1, value2, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andMobileBidNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_bid not between", value1, value2, "mobileBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidIsNull() {
            addCriterion("limit_event_bid is null");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidIsNotNull() {
            addCriterion("limit_event_bid is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidEqualTo(Integer value) {
            addCriterion("limit_event_bid =", value, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidNotEqualTo(Integer value) {
            addCriterion("limit_event_bid <>", value, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidGreaterThan(Integer value) {
            addCriterion("limit_event_bid >", value, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_event_bid >=", value, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidLessThan(Integer value) {
            addCriterion("limit_event_bid <", value, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidLessThanOrEqualTo(Integer value) {
            addCriterion("limit_event_bid <=", value, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidIn(List<Integer> values) {
            addCriterion("limit_event_bid in", values, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidNotIn(List<Integer> values) {
            addCriterion("limit_event_bid not in", values, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidBetween(Integer value1, Integer value2) {
            addCriterion("limit_event_bid between", value1, value2, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andLimitEventBidNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_event_bid not between", value1, value2, "limitEventBid");
            return (Criteria) this;
        }

        public Criteria andEventBidsIsNull() {
            addCriterion("event_bids is null");
            return (Criteria) this;
        }

        public Criteria andEventBidsIsNotNull() {
            addCriterion("event_bids is not null");
            return (Criteria) this;
        }

        public Criteria andEventBidsEqualTo(String value) {
            addCriterion("event_bids =", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsNotEqualTo(String value) {
            addCriterion("event_bids <>", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsGreaterThan(String value) {
            addCriterion("event_bids >", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsGreaterThanOrEqualTo(String value) {
            addCriterion("event_bids >=", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsLessThan(String value) {
            addCriterion("event_bids <", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsLessThanOrEqualTo(String value) {
            addCriterion("event_bids <=", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsLike(String value) {
            addCriterion("event_bids like", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsNotLike(String value) {
            addCriterion("event_bids not like", value, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsIn(List<String> values) {
            addCriterion("event_bids in", values, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsNotIn(List<String> values) {
            addCriterion("event_bids not in", values, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsBetween(String value1, String value2) {
            addCriterion("event_bids between", value1, value2, "eventBids");
            return (Criteria) this;
        }

        public Criteria andEventBidsNotBetween(String value1, String value2) {
            addCriterion("event_bids not between", value1, value2, "eventBids");
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