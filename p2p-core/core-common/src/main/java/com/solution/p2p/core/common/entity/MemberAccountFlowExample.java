package com.solution.p2p.core.common.entity;

import java.util.*;

public class MemberAccountFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberAccountFlowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected MemberAccountFlowExample(MemberAccountFlowExample example) {
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

        public Criteria andMemberAccountIdIsNull() {
            addCriterion("member_account_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIsNotNull() {
            addCriterion("member_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdEqualTo(Long value) {
            addCriterion("member_account_id =", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotEqualTo(Long value) {
            addCriterion("member_account_id <>", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdGreaterThan(Long value) {
            addCriterion("member_account_id >", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_account_id >=", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdLessThan(Long value) {
            addCriterion("member_account_id <", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("member_account_id <=", value, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdIn(List<Long> values) {
            addCriterion("member_account_id in", values, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotIn(List<Long> values) {
            addCriterion("member_account_id not in", values, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdBetween(Long value1, Long value2) {
            addCriterion("member_account_id between", value1, value2, "memberAccountId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("member_account_id not between", value1, value2, "memberAccountId");
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

        public Criteria andMemberAccountItemIdIsNull() {
            addCriterion("member_account_item_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdIsNotNull() {
            addCriterion("member_account_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdEqualTo(Long value) {
            addCriterion("member_account_item_id =", value, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdNotEqualTo(Long value) {
            addCriterion("member_account_item_id <>", value, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdGreaterThan(Long value) {
            addCriterion("member_account_item_id >", value, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_account_item_id >=", value, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdLessThan(Long value) {
            addCriterion("member_account_item_id <", value, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdLessThanOrEqualTo(Long value) {
            addCriterion("member_account_item_id <=", value, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdIn(List<Long> values) {
            addCriterion("member_account_item_id in", values, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdNotIn(List<Long> values) {
            addCriterion("member_account_item_id not in", values, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdBetween(Long value1, Long value2) {
            addCriterion("member_account_item_id between", value1, value2, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMemberAccountItemIdNotBetween(Long value1, Long value2) {
            addCriterion("member_account_item_id not between", value1, value2, "memberAccountItemId");
            return (Criteria) this;
        }

        public Criteria andMatIdIsNull() {
            addCriterion("mat_id is null");
            return (Criteria) this;
        }

        public Criteria andMatIdIsNotNull() {
            addCriterion("mat_id is not null");
            return (Criteria) this;
        }

        public Criteria andMatIdEqualTo(Long value) {
            addCriterion("mat_id =", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdNotEqualTo(Long value) {
            addCriterion("mat_id <>", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdGreaterThan(Long value) {
            addCriterion("mat_id >", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mat_id >=", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdLessThan(Long value) {
            addCriterion("mat_id <", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdLessThanOrEqualTo(Long value) {
            addCriterion("mat_id <=", value, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdIn(List<Long> values) {
            addCriterion("mat_id in", values, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdNotIn(List<Long> values) {
            addCriterion("mat_id not in", values, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdBetween(Long value1, Long value2) {
            addCriterion("mat_id between", value1, value2, "matId");
            return (Criteria) this;
        }

        public Criteria andMatIdNotBetween(Long value1, Long value2) {
            addCriterion("mat_id not between", value1, value2, "matId");
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

        public Criteria andMatServiceCodeIsNull() {
            addCriterion("mat_service_code is null");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeIsNotNull() {
            addCriterion("mat_service_code is not null");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeEqualTo(Integer value) {
            addCriterion("mat_service_code =", value, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeNotEqualTo(Integer value) {
            addCriterion("mat_service_code <>", value, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeGreaterThan(Integer value) {
            addCriterion("mat_service_code >", value, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mat_service_code >=", value, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeLessThan(Integer value) {
            addCriterion("mat_service_code <", value, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("mat_service_code <=", value, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeIn(List<Integer> values) {
            addCriterion("mat_service_code in", values, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeNotIn(List<Integer> values) {
            addCriterion("mat_service_code not in", values, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeBetween(Integer value1, Integer value2) {
            addCriterion("mat_service_code between", value1, value2, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andMatServiceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("mat_service_code not between", value1, value2, "matServiceCode");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeIsNull() {
            addCriterion("finance_op_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeIsNotNull() {
            addCriterion("finance_op_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeEqualTo(Integer value) {
            addCriterion("finance_op_type =", value, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeNotEqualTo(Integer value) {
            addCriterion("finance_op_type <>", value, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeGreaterThan(Integer value) {
            addCriterion("finance_op_type >", value, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_op_type >=", value, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeLessThan(Integer value) {
            addCriterion("finance_op_type <", value, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("finance_op_type <=", value, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeIn(List<Integer> values) {
            addCriterion("finance_op_type in", values, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeNotIn(List<Integer> values) {
            addCriterion("finance_op_type not in", values, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeBetween(Integer value1, Integer value2) {
            addCriterion("finance_op_type between", value1, value2, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andFinanceOpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_op_type not between", value1, value2, "financeOpType");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountIsNull() {
            addCriterion("thawed_amount is null");
            return (Criteria) this;
        }

        public Criteria andThawedAmountIsNotNull() {
            addCriterion("thawed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andThawedAmountEqualTo(Long value) {
            addCriterion("thawed_amount =", value, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountNotEqualTo(Long value) {
            addCriterion("thawed_amount <>", value, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountGreaterThan(Long value) {
            addCriterion("thawed_amount >", value, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("thawed_amount >=", value, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountLessThan(Long value) {
            addCriterion("thawed_amount <", value, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountLessThanOrEqualTo(Long value) {
            addCriterion("thawed_amount <=", value, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountIn(List<Long> values) {
            addCriterion("thawed_amount in", values, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountNotIn(List<Long> values) {
            addCriterion("thawed_amount not in", values, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountBetween(Long value1, Long value2) {
            addCriterion("thawed_amount between", value1, value2, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andThawedAmountNotBetween(Long value1, Long value2) {
            addCriterion("thawed_amount not between", value1, value2, "thawedAmount");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andMatSummaryIsNull() {
            addCriterion("mat_summary is null");
            return (Criteria) this;
        }

        public Criteria andMatSummaryIsNotNull() {
            addCriterion("mat_summary is not null");
            return (Criteria) this;
        }

        public Criteria andMatSummaryEqualTo(String value) {
            addCriterion("mat_summary =", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryNotEqualTo(String value) {
            addCriterion("mat_summary <>", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryGreaterThan(String value) {
            addCriterion("mat_summary >", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("mat_summary >=", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryLessThan(String value) {
            addCriterion("mat_summary <", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryLessThanOrEqualTo(String value) {
            addCriterion("mat_summary <=", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryLike(String value) {
            addCriterion("mat_summary like", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryNotLike(String value) {
            addCriterion("mat_summary not like", value, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryIn(List<String> values) {
            addCriterion("mat_summary in", values, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryNotIn(List<String> values) {
            addCriterion("mat_summary not in", values, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryBetween(String value1, String value2) {
            addCriterion("mat_summary between", value1, value2, "matSummary");
            return (Criteria) this;
        }

        public Criteria andMatSummaryNotBetween(String value1, String value2) {
            addCriterion("mat_summary not between", value1, value2, "matSummary");
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

        public Criteria andThruFrozenAmountIsNull() {
            addCriterion("thru_frozen_amount is null");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountIsNotNull() {
            addCriterion("thru_frozen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountEqualTo(Long value) {
            addCriterion("thru_frozen_amount =", value, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountNotEqualTo(Long value) {
            addCriterion("thru_frozen_amount <>", value, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountGreaterThan(Long value) {
            addCriterion("thru_frozen_amount >", value, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("thru_frozen_amount >=", value, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountLessThan(Long value) {
            addCriterion("thru_frozen_amount <", value, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountLessThanOrEqualTo(Long value) {
            addCriterion("thru_frozen_amount <=", value, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountIn(List<Long> values) {
            addCriterion("thru_frozen_amount in", values, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountNotIn(List<Long> values) {
            addCriterion("thru_frozen_amount not in", values, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountBetween(Long value1, Long value2) {
            addCriterion("thru_frozen_amount between", value1, value2, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruFrozenAmountNotBetween(Long value1, Long value2) {
            addCriterion("thru_frozen_amount not between", value1, value2, "thruFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountIsNull() {
            addCriterion("thru_amount is null");
            return (Criteria) this;
        }

        public Criteria andThruAmountIsNotNull() {
            addCriterion("thru_amount is not null");
            return (Criteria) this;
        }

        public Criteria andThruAmountEqualTo(Long value) {
            addCriterion("thru_amount =", value, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountNotEqualTo(Long value) {
            addCriterion("thru_amount <>", value, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountGreaterThan(Long value) {
            addCriterion("thru_amount >", value, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("thru_amount >=", value, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountLessThan(Long value) {
            addCriterion("thru_amount <", value, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountLessThanOrEqualTo(Long value) {
            addCriterion("thru_amount <=", value, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountIn(List<Long> values) {
            addCriterion("thru_amount in", values, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountNotIn(List<Long> values) {
            addCriterion("thru_amount not in", values, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountBetween(Long value1, Long value2) {
            addCriterion("thru_amount between", value1, value2, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andThruAmountNotBetween(Long value1, Long value2) {
            addCriterion("thru_amount not between", value1, value2, "thruAmount");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdIsNull() {
            addCriterion("biz_member_id is null");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdIsNotNull() {
            addCriterion("biz_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdEqualTo(String value) {
            addCriterion("biz_member_id =", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdNotEqualTo(String value) {
            addCriterion("biz_member_id <>", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdGreaterThan(String value) {
            addCriterion("biz_member_id >", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("biz_member_id >=", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdLessThan(String value) {
            addCriterion("biz_member_id <", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdLessThanOrEqualTo(String value) {
            addCriterion("biz_member_id <=", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdLike(String value) {
            addCriterion("biz_member_id like", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdNotLike(String value) {
            addCriterion("biz_member_id not like", value, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdIn(List<String> values) {
            addCriterion("biz_member_id in", values, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdNotIn(List<String> values) {
            addCriterion("biz_member_id not in", values, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdBetween(String value1, String value2) {
            addCriterion("biz_member_id between", value1, value2, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizMemberIdNotBetween(String value1, String value2) {
            addCriterion("biz_member_id not between", value1, value2, "bizMemberId");
            return (Criteria) this;
        }

        public Criteria andBizAppDateIsNull() {
            addCriterion("biz_app_date is null");
            return (Criteria) this;
        }

        public Criteria andBizAppDateIsNotNull() {
            addCriterion("biz_app_date is not null");
            return (Criteria) this;
        }

        public Criteria andBizAppDateEqualTo(String value) {
            addCriterion("biz_app_date =", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateNotEqualTo(String value) {
            addCriterion("biz_app_date <>", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateGreaterThan(String value) {
            addCriterion("biz_app_date >", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateGreaterThanOrEqualTo(String value) {
            addCriterion("biz_app_date >=", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateLessThan(String value) {
            addCriterion("biz_app_date <", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateLessThanOrEqualTo(String value) {
            addCriterion("biz_app_date <=", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateLike(String value) {
            addCriterion("biz_app_date like", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateNotLike(String value) {
            addCriterion("biz_app_date not like", value, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateIn(List<String> values) {
            addCriterion("biz_app_date in", values, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateNotIn(List<String> values) {
            addCriterion("biz_app_date not in", values, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateBetween(String value1, String value2) {
            addCriterion("biz_app_date between", value1, value2, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizAppDateNotBetween(String value1, String value2) {
            addCriterion("biz_app_date not between", value1, value2, "bizAppDate");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIsNull() {
            addCriterion("biz_order_no is null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIsNotNull() {
            addCriterion("biz_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoEqualTo(String value) {
            addCriterion("biz_order_no =", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotEqualTo(String value) {
            addCriterion("biz_order_no <>", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoGreaterThan(String value) {
            addCriterion("biz_order_no >", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("biz_order_no >=", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLessThan(String value) {
            addCriterion("biz_order_no <", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLessThanOrEqualTo(String value) {
            addCriterion("biz_order_no <=", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoLike(String value) {
            addCriterion("biz_order_no like", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotLike(String value) {
            addCriterion("biz_order_no not like", value, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoIn(List<String> values) {
            addCriterion("biz_order_no in", values, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotIn(List<String> values) {
            addCriterion("biz_order_no not in", values, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoBetween(String value1, String value2) {
            addCriterion("biz_order_no between", value1, value2, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andBizOrderNoNotBetween(String value1, String value2) {
            addCriterion("biz_order_no not between", value1, value2, "bizOrderNo");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(Integer value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(Integer value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(Integer value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(Integer value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<Integer> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<Integer> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(Integer value1, Integer value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeIsNull() {
            addCriterion("bank_biz_code is null");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeIsNotNull() {
            addCriterion("bank_biz_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeEqualTo(String value) {
            addCriterion("bank_biz_code =", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeNotEqualTo(String value) {
            addCriterion("bank_biz_code <>", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeGreaterThan(String value) {
            addCriterion("bank_biz_code >", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_biz_code >=", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeLessThan(String value) {
            addCriterion("bank_biz_code <", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_biz_code <=", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeLike(String value) {
            addCriterion("bank_biz_code like", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeNotLike(String value) {
            addCriterion("bank_biz_code not like", value, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeIn(List<String> values) {
            addCriterion("bank_biz_code in", values, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeNotIn(List<String> values) {
            addCriterion("bank_biz_code not in", values, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeBetween(String value1, String value2) {
            addCriterion("bank_biz_code between", value1, value2, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankBizCodeNotBetween(String value1, String value2) {
            addCriterion("bank_biz_code not between", value1, value2, "bankBizCode");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateIsNull() {
            addCriterion("bank_accept_date is null");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateIsNotNull() {
            addCriterion("bank_accept_date is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateEqualTo(String value) {
            addCriterion("bank_accept_date =", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateNotEqualTo(String value) {
            addCriterion("bank_accept_date <>", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateGreaterThan(String value) {
            addCriterion("bank_accept_date >", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateGreaterThanOrEqualTo(String value) {
            addCriterion("bank_accept_date >=", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateLessThan(String value) {
            addCriterion("bank_accept_date <", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateLessThanOrEqualTo(String value) {
            addCriterion("bank_accept_date <=", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateLike(String value) {
            addCriterion("bank_accept_date like", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateNotLike(String value) {
            addCriterion("bank_accept_date not like", value, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateIn(List<String> values) {
            addCriterion("bank_accept_date in", values, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateNotIn(List<String> values) {
            addCriterion("bank_accept_date not in", values, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateBetween(String value1, String value2) {
            addCriterion("bank_accept_date between", value1, value2, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptDateNotBetween(String value1, String value2) {
            addCriterion("bank_accept_date not between", value1, value2, "bankAcceptDate");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoIsNull() {
            addCriterion("bank_accept_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoIsNotNull() {
            addCriterion("bank_accept_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoEqualTo(String value) {
            addCriterion("bank_accept_seq_no =", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoNotEqualTo(String value) {
            addCriterion("bank_accept_seq_no <>", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoGreaterThan(String value) {
            addCriterion("bank_accept_seq_no >", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_accept_seq_no >=", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoLessThan(String value) {
            addCriterion("bank_accept_seq_no <", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoLessThanOrEqualTo(String value) {
            addCriterion("bank_accept_seq_no <=", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoLike(String value) {
            addCriterion("bank_accept_seq_no like", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoNotLike(String value) {
            addCriterion("bank_accept_seq_no not like", value, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoIn(List<String> values) {
            addCriterion("bank_accept_seq_no in", values, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoNotIn(List<String> values) {
            addCriterion("bank_accept_seq_no not in", values, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoBetween(String value1, String value2) {
            addCriterion("bank_accept_seq_no between", value1, value2, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankAcceptSeqNoNotBetween(String value1, String value2) {
            addCriterion("bank_accept_seq_no not between", value1, value2, "bankAcceptSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoIsNull() {
            addCriterion("bank_rep_seq_no is null");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoIsNotNull() {
            addCriterion("bank_rep_seq_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoEqualTo(String value) {
            addCriterion("bank_rep_seq_no =", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoNotEqualTo(String value) {
            addCriterion("bank_rep_seq_no <>", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoGreaterThan(String value) {
            addCriterion("bank_rep_seq_no >", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_rep_seq_no >=", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoLessThan(String value) {
            addCriterion("bank_rep_seq_no <", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoLessThanOrEqualTo(String value) {
            addCriterion("bank_rep_seq_no <=", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoLike(String value) {
            addCriterion("bank_rep_seq_no like", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoNotLike(String value) {
            addCriterion("bank_rep_seq_no not like", value, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoIn(List<String> values) {
            addCriterion("bank_rep_seq_no in", values, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoNotIn(List<String> values) {
            addCriterion("bank_rep_seq_no not in", values, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoBetween(String value1, String value2) {
            addCriterion("bank_rep_seq_no between", value1, value2, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBankRepSeqNoNotBetween(String value1, String value2) {
            addCriterion("bank_rep_seq_no not between", value1, value2, "bankRepSeqNo");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIsNull() {
            addCriterion("balance_type is null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIsNotNull() {
            addCriterion("balance_type is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeEqualTo(Integer value) {
            addCriterion("balance_type =", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotEqualTo(Integer value) {
            addCriterion("balance_type <>", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeGreaterThan(Integer value) {
            addCriterion("balance_type >", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_type >=", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLessThan(Integer value) {
            addCriterion("balance_type <", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("balance_type <=", value, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeIn(List<Integer> values) {
            addCriterion("balance_type in", values, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotIn(List<Integer> values) {
            addCriterion("balance_type not in", values, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeBetween(Integer value1, Integer value2) {
            addCriterion("balance_type between", value1, value2, "balanceType");
            return (Criteria) this;
        }

        public Criteria andBalanceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_type not between", value1, value2, "balanceType");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagIsNull() {
            addCriterion("up_balance_flag is null");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagIsNotNull() {
            addCriterion("up_balance_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagEqualTo(Integer value) {
            addCriterion("up_balance_flag =", value, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagNotEqualTo(Integer value) {
            addCriterion("up_balance_flag <>", value, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagGreaterThan(Integer value) {
            addCriterion("up_balance_flag >", value, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_balance_flag >=", value, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagLessThan(Integer value) {
            addCriterion("up_balance_flag <", value, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("up_balance_flag <=", value, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagIn(List<Integer> values) {
            addCriterion("up_balance_flag in", values, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagNotIn(List<Integer> values) {
            addCriterion("up_balance_flag not in", values, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagBetween(Integer value1, Integer value2) {
            addCriterion("up_balance_flag between", value1, value2, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andUpBalanceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("up_balance_flag not between", value1, value2, "upBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagIsNull() {
            addCriterion("down_balance_flag is null");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagIsNotNull() {
            addCriterion("down_balance_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagEqualTo(Integer value) {
            addCriterion("down_balance_flag =", value, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagNotEqualTo(Integer value) {
            addCriterion("down_balance_flag <>", value, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagGreaterThan(Integer value) {
            addCriterion("down_balance_flag >", value, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("down_balance_flag >=", value, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagLessThan(Integer value) {
            addCriterion("down_balance_flag <", value, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagLessThanOrEqualTo(Integer value) {
            addCriterion("down_balance_flag <=", value, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagIn(List<Integer> values) {
            addCriterion("down_balance_flag in", values, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagNotIn(List<Integer> values) {
            addCriterion("down_balance_flag not in", values, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagBetween(Integer value1, Integer value2) {
            addCriterion("down_balance_flag between", value1, value2, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andDownBalanceFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("down_balance_flag not between", value1, value2, "downBalanceFlag");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtIsNull() {
            addCriterion("member_account_flow_ext is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtIsNotNull() {
            addCriterion("member_account_flow_ext is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtEqualTo(String value) {
            addCriterion("member_account_flow_ext =", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtNotEqualTo(String value) {
            addCriterion("member_account_flow_ext <>", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtGreaterThan(String value) {
            addCriterion("member_account_flow_ext >", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtGreaterThanOrEqualTo(String value) {
            addCriterion("member_account_flow_ext >=", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtLessThan(String value) {
            addCriterion("member_account_flow_ext <", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtLessThanOrEqualTo(String value) {
            addCriterion("member_account_flow_ext <=", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtLike(String value) {
            addCriterion("member_account_flow_ext like", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtNotLike(String value) {
            addCriterion("member_account_flow_ext not like", value, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtIn(List<String> values) {
            addCriterion("member_account_flow_ext in", values, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtNotIn(List<String> values) {
            addCriterion("member_account_flow_ext not in", values, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtBetween(String value1, String value2) {
            addCriterion("member_account_flow_ext between", value1, value2, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andMemberAccountFlowExtNotBetween(String value1, String value2) {
            addCriterion("member_account_flow_ext not between", value1, value2, "memberAccountFlowExt");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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