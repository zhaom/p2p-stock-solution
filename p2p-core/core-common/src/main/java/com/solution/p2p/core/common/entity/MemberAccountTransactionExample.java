package com.solution.p2p.core.common.entity;

import java.util.*;

public class MemberAccountTransactionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberAccountTransactionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected MemberAccountTransactionExample(MemberAccountTransactionExample example) {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andReqAppIsNull() {
            addCriterion("req_app is null");
            return (Criteria) this;
        }

        public Criteria andReqAppIsNotNull() {
            addCriterion("req_app is not null");
            return (Criteria) this;
        }

        public Criteria andReqAppEqualTo(String value) {
            addCriterion("req_app =", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppNotEqualTo(String value) {
            addCriterion("req_app <>", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppGreaterThan(String value) {
            addCriterion("req_app >", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppGreaterThanOrEqualTo(String value) {
            addCriterion("req_app >=", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppLessThan(String value) {
            addCriterion("req_app <", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppLessThanOrEqualTo(String value) {
            addCriterion("req_app <=", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppLike(String value) {
            addCriterion("req_app like", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppNotLike(String value) {
            addCriterion("req_app not like", value, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppIn(List<String> values) {
            addCriterion("req_app in", values, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppNotIn(List<String> values) {
            addCriterion("req_app not in", values, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppBetween(String value1, String value2) {
            addCriterion("req_app between", value1, value2, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqAppNotBetween(String value1, String value2) {
            addCriterion("req_app not between", value1, value2, "reqApp");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNull() {
            addCriterion("req_time is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("req_time is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(Date value) {
            addCriterion("req_time =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(Date value) {
            addCriterion("req_time <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(Date value) {
            addCriterion("req_time >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("req_time >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(Date value) {
            addCriterion("req_time <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("req_time <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<Date> values) {
            addCriterion("req_time in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<Date> values) {
            addCriterion("req_time not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(Date value1, Date value2) {
            addCriterion("req_time between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("req_time not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoIsNull() {
            addCriterion("req_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoIsNotNull() {
            addCriterion("req_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoEqualTo(Long value) {
            addCriterion("req_seq_no =", value, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoNotEqualTo(Long value) {
            addCriterion("req_seq_no <>", value, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoGreaterThan(Long value) {
            addCriterion("req_seq_no >", value, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoGreaterThanOrEqualTo(Long value) {
            addCriterion("req_seq_no >=", value, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoLessThan(Long value) {
            addCriterion("req_seq_no <", value, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoLessThanOrEqualTo(Long value) {
            addCriterion("req_seq_no <=", value, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoIn(List<Long> values) {
            addCriterion("req_seq_no in", values, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoNotIn(List<Long> values) {
            addCriterion("req_seq_no not in", values, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoBetween(Long value1, Long value2) {
            addCriterion("req_seq_no between", value1, value2, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andReqSeqNoNotBetween(Long value1, Long value2) {
            addCriterion("req_seq_no not between", value1, value2, "reqSeqNo");
            return (Criteria) this;
        }

        public Criteria andTranNoIsNull() {
            addCriterion("tran_no is null");
            return (Criteria) this;
        }

        public Criteria andTranNoIsNotNull() {
            addCriterion("tran_no is not null");
            return (Criteria) this;
        }

        public Criteria andTranNoEqualTo(String value) {
            addCriterion("tran_no =", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotEqualTo(String value) {
            addCriterion("tran_no <>", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoGreaterThan(String value) {
            addCriterion("tran_no >", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoGreaterThanOrEqualTo(String value) {
            addCriterion("tran_no >=", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLessThan(String value) {
            addCriterion("tran_no <", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLessThanOrEqualTo(String value) {
            addCriterion("tran_no <=", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoLike(String value) {
            addCriterion("tran_no like", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotLike(String value) {
            addCriterion("tran_no not like", value, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoIn(List<String> values) {
            addCriterion("tran_no in", values, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotIn(List<String> values) {
            addCriterion("tran_no not in", values, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoBetween(String value1, String value2) {
            addCriterion("tran_no between", value1, value2, "tranNo");
            return (Criteria) this;
        }

        public Criteria andTranNoNotBetween(String value1, String value2) {
            addCriterion("tran_no not between", value1, value2, "tranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoIsNull() {
            addCriterion("old_tran_no is null");
            return (Criteria) this;
        }

        public Criteria andOldTranNoIsNotNull() {
            addCriterion("old_tran_no is not null");
            return (Criteria) this;
        }

        public Criteria andOldTranNoEqualTo(String value) {
            addCriterion("old_tran_no =", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoNotEqualTo(String value) {
            addCriterion("old_tran_no <>", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoGreaterThan(String value) {
            addCriterion("old_tran_no >", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoGreaterThanOrEqualTo(String value) {
            addCriterion("old_tran_no >=", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoLessThan(String value) {
            addCriterion("old_tran_no <", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoLessThanOrEqualTo(String value) {
            addCriterion("old_tran_no <=", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoLike(String value) {
            addCriterion("old_tran_no like", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoNotLike(String value) {
            addCriterion("old_tran_no not like", value, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoIn(List<String> values) {
            addCriterion("old_tran_no in", values, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoNotIn(List<String> values) {
            addCriterion("old_tran_no not in", values, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoBetween(String value1, String value2) {
            addCriterion("old_tran_no between", value1, value2, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andOldTranNoNotBetween(String value1, String value2) {
            addCriterion("old_tran_no not between", value1, value2, "oldTranNo");
            return (Criteria) this;
        }

        public Criteria andMatDateIsNull() {
            addCriterion("mat_date is null");
            return (Criteria) this;
        }

        public Criteria andMatDateIsNotNull() {
            addCriterion("mat_date is not null");
            return (Criteria) this;
        }

        public Criteria andMatDateEqualTo(Date value) {
            addCriterionForJDBCDate("mat_date =", value, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("mat_date <>", value, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateGreaterThan(Date value) {
            addCriterionForJDBCDate("mat_date >", value, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mat_date >=", value, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateLessThan(Date value) {
            addCriterionForJDBCDate("mat_date <", value, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mat_date <=", value, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateIn(List<Date> values) {
            addCriterionForJDBCDate("mat_date in", values, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("mat_date not in", values, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mat_date between", value1, value2, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mat_date not between", value1, value2, "matDate");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodIsNull() {
            addCriterion("mat_req_method is null");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodIsNotNull() {
            addCriterion("mat_req_method is not null");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodEqualTo(Integer value) {
            addCriterion("mat_req_method =", value, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodNotEqualTo(Integer value) {
            addCriterion("mat_req_method <>", value, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodGreaterThan(Integer value) {
            addCriterion("mat_req_method >", value, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("mat_req_method >=", value, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodLessThan(Integer value) {
            addCriterion("mat_req_method <", value, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodLessThanOrEqualTo(Integer value) {
            addCriterion("mat_req_method <=", value, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodIn(List<Integer> values) {
            addCriterion("mat_req_method in", values, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodNotIn(List<Integer> values) {
            addCriterion("mat_req_method not in", values, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodBetween(Integer value1, Integer value2) {
            addCriterion("mat_req_method between", value1, value2, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatReqMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("mat_req_method not between", value1, value2, "matReqMethod");
            return (Criteria) this;
        }

        public Criteria andMatOpStateIsNull() {
            addCriterion("mat_op_state is null");
            return (Criteria) this;
        }

        public Criteria andMatOpStateIsNotNull() {
            addCriterion("mat_op_state is not null");
            return (Criteria) this;
        }

        public Criteria andMatOpStateEqualTo(Integer value) {
            addCriterion("mat_op_state =", value, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateNotEqualTo(Integer value) {
            addCriterion("mat_op_state <>", value, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateGreaterThan(Integer value) {
            addCriterion("mat_op_state >", value, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("mat_op_state >=", value, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateLessThan(Integer value) {
            addCriterion("mat_op_state <", value, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateLessThanOrEqualTo(Integer value) {
            addCriterion("mat_op_state <=", value, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateIn(List<Integer> values) {
            addCriterion("mat_op_state in", values, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateNotIn(List<Integer> values) {
            addCriterion("mat_op_state not in", values, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateBetween(Integer value1, Integer value2) {
            addCriterion("mat_op_state between", value1, value2, "matOpState");
            return (Criteria) this;
        }

        public Criteria andMatOpStateNotBetween(Integer value1, Integer value2) {
            addCriterion("mat_op_state not between", value1, value2, "matOpState");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Integer value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Integer value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Integer value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Integer value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Integer> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Integer> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterionForJDBCDate("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoIsNull() {
            addCriterion("trade_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoIsNotNull() {
            addCriterion("trade_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoEqualTo(Long value) {
            addCriterion("trade_seq_no =", value, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoNotEqualTo(Long value) {
            addCriterion("trade_seq_no <>", value, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoGreaterThan(Long value) {
            addCriterion("trade_seq_no >", value, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_seq_no >=", value, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoLessThan(Long value) {
            addCriterion("trade_seq_no <", value, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoLessThanOrEqualTo(Long value) {
            addCriterion("trade_seq_no <=", value, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoIn(List<Long> values) {
            addCriterion("trade_seq_no in", values, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoNotIn(List<Long> values) {
            addCriterion("trade_seq_no not in", values, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoBetween(Long value1, Long value2) {
            addCriterion("trade_seq_no between", value1, value2, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andTradeSeqNoNotBetween(Long value1, Long value2) {
            addCriterion("trade_seq_no not between", value1, value2, "tradeSeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoIsNull() {
            addCriterion("pay_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoIsNotNull() {
            addCriterion("pay_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoEqualTo(Long value) {
            addCriterion("pay_seq_no =", value, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoNotEqualTo(Long value) {
            addCriterion("pay_seq_no <>", value, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoGreaterThan(Long value) {
            addCriterion("pay_seq_no >", value, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_seq_no >=", value, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoLessThan(Long value) {
            addCriterion("pay_seq_no <", value, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoLessThanOrEqualTo(Long value) {
            addCriterion("pay_seq_no <=", value, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoIn(List<Long> values) {
            addCriterion("pay_seq_no in", values, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoNotIn(List<Long> values) {
            addCriterion("pay_seq_no not in", values, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoBetween(Long value1, Long value2) {
            addCriterion("pay_seq_no between", value1, value2, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andPaySeqNoNotBetween(Long value1, Long value2) {
            addCriterion("pay_seq_no not between", value1, value2, "paySeqNo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoIsNull() {
            addCriterion("mat_item_info is null");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoIsNotNull() {
            addCriterion("mat_item_info is not null");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoEqualTo(String value) {
            addCriterion("mat_item_info =", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoNotEqualTo(String value) {
            addCriterion("mat_item_info <>", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoGreaterThan(String value) {
            addCriterion("mat_item_info >", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoGreaterThanOrEqualTo(String value) {
            addCriterion("mat_item_info >=", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoLessThan(String value) {
            addCriterion("mat_item_info <", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoLessThanOrEqualTo(String value) {
            addCriterion("mat_item_info <=", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoLike(String value) {
            addCriterion("mat_item_info like", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoNotLike(String value) {
            addCriterion("mat_item_info not like", value, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoIn(List<String> values) {
            addCriterion("mat_item_info in", values, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoNotIn(List<String> values) {
            addCriterion("mat_item_info not in", values, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoBetween(String value1, String value2) {
            addCriterion("mat_item_info between", value1, value2, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatItemInfoNotBetween(String value1, String value2) {
            addCriterion("mat_item_info not between", value1, value2, "matItemInfo");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeIsNull() {
            addCriterion("mat_rep_code is null");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeIsNotNull() {
            addCriterion("mat_rep_code is not null");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeEqualTo(Integer value) {
            addCriterion("mat_rep_code =", value, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeNotEqualTo(Integer value) {
            addCriterion("mat_rep_code <>", value, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeGreaterThan(Integer value) {
            addCriterion("mat_rep_code >", value, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mat_rep_code >=", value, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeLessThan(Integer value) {
            addCriterion("mat_rep_code <", value, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeLessThanOrEqualTo(Integer value) {
            addCriterion("mat_rep_code <=", value, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeIn(List<Integer> values) {
            addCriterion("mat_rep_code in", values, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeNotIn(List<Integer> values) {
            addCriterion("mat_rep_code not in", values, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeBetween(Integer value1, Integer value2) {
            addCriterion("mat_rep_code between", value1, value2, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatRepCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("mat_rep_code not between", value1, value2, "matRepCode");
            return (Criteria) this;
        }

        public Criteria andMatItemResultIsNull() {
            addCriterion("mat_item_result is null");
            return (Criteria) this;
        }

        public Criteria andMatItemResultIsNotNull() {
            addCriterion("mat_item_result is not null");
            return (Criteria) this;
        }

        public Criteria andMatItemResultEqualTo(String value) {
            addCriterion("mat_item_result =", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultNotEqualTo(String value) {
            addCriterion("mat_item_result <>", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultGreaterThan(String value) {
            addCriterion("mat_item_result >", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultGreaterThanOrEqualTo(String value) {
            addCriterion("mat_item_result >=", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultLessThan(String value) {
            addCriterion("mat_item_result <", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultLessThanOrEqualTo(String value) {
            addCriterion("mat_item_result <=", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultLike(String value) {
            addCriterion("mat_item_result like", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultNotLike(String value) {
            addCriterion("mat_item_result not like", value, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultIn(List<String> values) {
            addCriterion("mat_item_result in", values, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultNotIn(List<String> values) {
            addCriterion("mat_item_result not in", values, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultBetween(String value1, String value2) {
            addCriterion("mat_item_result between", value1, value2, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatItemResultNotBetween(String value1, String value2) {
            addCriterion("mat_item_result not between", value1, value2, "matItemResult");
            return (Criteria) this;
        }

        public Criteria andMatExtIsNull() {
            addCriterion("mat_ext is null");
            return (Criteria) this;
        }

        public Criteria andMatExtIsNotNull() {
            addCriterion("mat_ext is not null");
            return (Criteria) this;
        }

        public Criteria andMatExtEqualTo(String value) {
            addCriterion("mat_ext =", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtNotEqualTo(String value) {
            addCriterion("mat_ext <>", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtGreaterThan(String value) {
            addCriterion("mat_ext >", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtGreaterThanOrEqualTo(String value) {
            addCriterion("mat_ext >=", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtLessThan(String value) {
            addCriterion("mat_ext <", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtLessThanOrEqualTo(String value) {
            addCriterion("mat_ext <=", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtLike(String value) {
            addCriterion("mat_ext like", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtNotLike(String value) {
            addCriterion("mat_ext not like", value, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtIn(List<String> values) {
            addCriterion("mat_ext in", values, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtNotIn(List<String> values) {
            addCriterion("mat_ext not in", values, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtBetween(String value1, String value2) {
            addCriterion("mat_ext between", value1, value2, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatExtNotBetween(String value1, String value2) {
            addCriterion("mat_ext not between", value1, value2, "matExt");
            return (Criteria) this;
        }

        public Criteria andMatRemarkIsNull() {
            addCriterion("mat_remark is null");
            return (Criteria) this;
        }

        public Criteria andMatRemarkIsNotNull() {
            addCriterion("mat_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMatRemarkEqualTo(String value) {
            addCriterion("mat_remark =", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkNotEqualTo(String value) {
            addCriterion("mat_remark <>", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkGreaterThan(String value) {
            addCriterion("mat_remark >", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("mat_remark >=", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkLessThan(String value) {
            addCriterion("mat_remark <", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkLessThanOrEqualTo(String value) {
            addCriterion("mat_remark <=", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkLike(String value) {
            addCriterion("mat_remark like", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkNotLike(String value) {
            addCriterion("mat_remark not like", value, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkIn(List<String> values) {
            addCriterion("mat_remark in", values, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkNotIn(List<String> values) {
            addCriterion("mat_remark not in", values, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkBetween(String value1, String value2) {
            addCriterion("mat_remark between", value1, value2, "matRemark");
            return (Criteria) this;
        }

        public Criteria andMatRemarkNotBetween(String value1, String value2) {
            addCriterion("mat_remark not between", value1, value2, "matRemark");
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