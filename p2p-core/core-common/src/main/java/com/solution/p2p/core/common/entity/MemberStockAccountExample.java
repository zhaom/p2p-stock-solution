package com.solution.p2p.core.common.entity;

import java.util.*;

public class MemberStockAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberStockAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected MemberStockAccountExample(MemberStockAccountExample example) {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNull() {
            addCriterion("from_date is null");
            return (Criteria) this;
        }

        public Criteria andFromDateIsNotNull() {
            addCriterion("from_date is not null");
            return (Criteria) this;
        }

        public Criteria andFromDateEqualTo(Date value) {
            addCriterion("from_date =", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotEqualTo(Date value) {
            addCriterion("from_date <>", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThan(Date value) {
            addCriterion("from_date >", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateGreaterThanOrEqualTo(Date value) {
            addCriterion("from_date >=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThan(Date value) {
            addCriterion("from_date <", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateLessThanOrEqualTo(Date value) {
            addCriterion("from_date <=", value, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateIn(List<Date> values) {
            addCriterion("from_date in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotIn(List<Date> values) {
            addCriterion("from_date not in", values, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateBetween(Date value1, Date value2) {
            addCriterion("from_date between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andFromDateNotBetween(Date value1, Date value2) {
            addCriterion("from_date not between", value1, value2, "fromDate");
            return (Criteria) this;
        }

        public Criteria andThruDateIsNull() {
            addCriterion("thru_date is null");
            return (Criteria) this;
        }

        public Criteria andThruDateIsNotNull() {
            addCriterion("thru_date is not null");
            return (Criteria) this;
        }

        public Criteria andThruDateEqualTo(Date value) {
            addCriterion("thru_date =", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateNotEqualTo(Date value) {
            addCriterion("thru_date <>", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateGreaterThan(Date value) {
            addCriterion("thru_date >", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateGreaterThanOrEqualTo(Date value) {
            addCriterion("thru_date >=", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateLessThan(Date value) {
            addCriterion("thru_date <", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateLessThanOrEqualTo(Date value) {
            addCriterion("thru_date <=", value, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateIn(List<Date> values) {
            addCriterion("thru_date in", values, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateNotIn(List<Date> values) {
            addCriterion("thru_date not in", values, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateBetween(Date value1, Date value2) {
            addCriterion("thru_date between", value1, value2, "thruDate");
            return (Criteria) this;
        }

        public Criteria andThruDateNotBetween(Date value1, Date value2) {
            addCriterion("thru_date not between", value1, value2, "thruDate");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andUsableAmountIsNull() {
            addCriterion("usable_amount is null");
            return (Criteria) this;
        }

        public Criteria andUsableAmountIsNotNull() {
            addCriterion("usable_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUsableAmountEqualTo(Long value) {
            addCriterion("usable_amount =", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountNotEqualTo(Long value) {
            addCriterion("usable_amount <>", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountGreaterThan(Long value) {
            addCriterion("usable_amount >", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("usable_amount >=", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountLessThan(Long value) {
            addCriterion("usable_amount <", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountLessThanOrEqualTo(Long value) {
            addCriterion("usable_amount <=", value, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountIn(List<Long> values) {
            addCriterion("usable_amount in", values, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountNotIn(List<Long> values) {
            addCriterion("usable_amount not in", values, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountBetween(Long value1, Long value2) {
            addCriterion("usable_amount between", value1, value2, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andUsableAmountNotBetween(Long value1, Long value2) {
            addCriterion("usable_amount not between", value1, value2, "usableAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNull() {
            addCriterion("cash_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNotNull() {
            addCriterion("cash_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashAmountEqualTo(Long value) {
            addCriterion("cash_amount =", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotEqualTo(Long value) {
            addCriterion("cash_amount <>", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThan(Long value) {
            addCriterion("cash_amount >", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("cash_amount >=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThan(Long value) {
            addCriterion("cash_amount <", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThanOrEqualTo(Long value) {
            addCriterion("cash_amount <=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIn(List<Long> values) {
            addCriterion("cash_amount in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotIn(List<Long> values) {
            addCriterion("cash_amount not in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountBetween(Long value1, Long value2) {
            addCriterion("cash_amount between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotBetween(Long value1, Long value2) {
            addCriterion("cash_amount not between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountIsNull() {
            addCriterion("cash_fund_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountIsNotNull() {
            addCriterion("cash_fund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountEqualTo(Long value) {
            addCriterion("cash_fund_amount =", value, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountNotEqualTo(Long value) {
            addCriterion("cash_fund_amount <>", value, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountGreaterThan(Long value) {
            addCriterion("cash_fund_amount >", value, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("cash_fund_amount >=", value, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountLessThan(Long value) {
            addCriterion("cash_fund_amount <", value, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountLessThanOrEqualTo(Long value) {
            addCriterion("cash_fund_amount <=", value, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountIn(List<Long> values) {
            addCriterion("cash_fund_amount in", values, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountNotIn(List<Long> values) {
            addCriterion("cash_fund_amount not in", values, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountBetween(Long value1, Long value2) {
            addCriterion("cash_fund_amount between", value1, value2, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andCashFundAmountNotBetween(Long value1, Long value2) {
            addCriterion("cash_fund_amount not between", value1, value2, "cashFundAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountIsNull() {
            addCriterion("financed_amount is null");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountIsNotNull() {
            addCriterion("financed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountEqualTo(Long value) {
            addCriterion("financed_amount =", value, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountNotEqualTo(Long value) {
            addCriterion("financed_amount <>", value, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountGreaterThan(Long value) {
            addCriterion("financed_amount >", value, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("financed_amount >=", value, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountLessThan(Long value) {
            addCriterion("financed_amount <", value, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountLessThanOrEqualTo(Long value) {
            addCriterion("financed_amount <=", value, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountIn(List<Long> values) {
            addCriterion("financed_amount in", values, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountNotIn(List<Long> values) {
            addCriterion("financed_amount not in", values, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountBetween(Long value1, Long value2) {
            addCriterion("financed_amount between", value1, value2, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andFinancedAmountNotBetween(Long value1, Long value2) {
            addCriterion("financed_amount not between", value1, value2, "financedAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNull() {
            addCriterion("interest_amount is null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIsNotNull() {
            addCriterion("interest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInterestAmountEqualTo(Long value) {
            addCriterion("interest_amount =", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotEqualTo(Long value) {
            addCriterion("interest_amount <>", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThan(Long value) {
            addCriterion("interest_amount >", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("interest_amount >=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThan(Long value) {
            addCriterion("interest_amount <", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountLessThanOrEqualTo(Long value) {
            addCriterion("interest_amount <=", value, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountIn(List<Long> values) {
            addCriterion("interest_amount in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotIn(List<Long> values) {
            addCriterion("interest_amount not in", values, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountBetween(Long value1, Long value2) {
            addCriterion("interest_amount between", value1, value2, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestAmountNotBetween(Long value1, Long value2) {
            addCriterion("interest_amount not between", value1, value2, "interestAmount");
            return (Criteria) this;
        }

        public Criteria andInterestPayedIsNull() {
            addCriterion("interest_payed is null");
            return (Criteria) this;
        }

        public Criteria andInterestPayedIsNotNull() {
            addCriterion("interest_payed is not null");
            return (Criteria) this;
        }

        public Criteria andInterestPayedEqualTo(Long value) {
            addCriterion("interest_payed =", value, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedNotEqualTo(Long value) {
            addCriterion("interest_payed <>", value, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedGreaterThan(Long value) {
            addCriterion("interest_payed >", value, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedGreaterThanOrEqualTo(Long value) {
            addCriterion("interest_payed >=", value, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedLessThan(Long value) {
            addCriterion("interest_payed <", value, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedLessThanOrEqualTo(Long value) {
            addCriterion("interest_payed <=", value, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedIn(List<Long> values) {
            addCriterion("interest_payed in", values, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedNotIn(List<Long> values) {
            addCriterion("interest_payed not in", values, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedBetween(Long value1, Long value2) {
            addCriterion("interest_payed between", value1, value2, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andInterestPayedNotBetween(Long value1, Long value2) {
            addCriterion("interest_payed not between", value1, value2, "interestPayed");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueIsNull() {
            addCriterion("stock_market_value is null");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueIsNotNull() {
            addCriterion("stock_market_value is not null");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueEqualTo(Long value) {
            addCriterion("stock_market_value =", value, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueNotEqualTo(Long value) {
            addCriterion("stock_market_value <>", value, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueGreaterThan(Long value) {
            addCriterion("stock_market_value >", value, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueGreaterThanOrEqualTo(Long value) {
            addCriterion("stock_market_value >=", value, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueLessThan(Long value) {
            addCriterion("stock_market_value <", value, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueLessThanOrEqualTo(Long value) {
            addCriterion("stock_market_value <=", value, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueIn(List<Long> values) {
            addCriterion("stock_market_value in", values, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueNotIn(List<Long> values) {
            addCriterion("stock_market_value not in", values, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueBetween(Long value1, Long value2) {
            addCriterion("stock_market_value between", value1, value2, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andStockMarketValueNotBetween(Long value1, Long value2) {
            addCriterion("stock_market_value not between", value1, value2, "stockMarketValue");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountIsNull() {
            addCriterion("alarm_amount is null");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountIsNotNull() {
            addCriterion("alarm_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountEqualTo(Long value) {
            addCriterion("alarm_amount =", value, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountNotEqualTo(Long value) {
            addCriterion("alarm_amount <>", value, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountGreaterThan(Long value) {
            addCriterion("alarm_amount >", value, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("alarm_amount >=", value, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountLessThan(Long value) {
            addCriterion("alarm_amount <", value, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountLessThanOrEqualTo(Long value) {
            addCriterion("alarm_amount <=", value, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountIn(List<Long> values) {
            addCriterion("alarm_amount in", values, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountNotIn(List<Long> values) {
            addCriterion("alarm_amount not in", values, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountBetween(Long value1, Long value2) {
            addCriterion("alarm_amount between", value1, value2, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andAlarmAmountNotBetween(Long value1, Long value2) {
            addCriterion("alarm_amount not between", value1, value2, "alarmAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountIsNull() {
            addCriterion("forced_liquidation_amount is null");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountIsNotNull() {
            addCriterion("forced_liquidation_amount is not null");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountEqualTo(Long value) {
            addCriterion("forced_liquidation_amount =", value, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountNotEqualTo(Long value) {
            addCriterion("forced_liquidation_amount <>", value, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountGreaterThan(Long value) {
            addCriterion("forced_liquidation_amount >", value, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("forced_liquidation_amount >=", value, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountLessThan(Long value) {
            addCriterion("forced_liquidation_amount <", value, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountLessThanOrEqualTo(Long value) {
            addCriterion("forced_liquidation_amount <=", value, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountIn(List<Long> values) {
            addCriterion("forced_liquidation_amount in", values, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountNotIn(List<Long> values) {
            addCriterion("forced_liquidation_amount not in", values, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountBetween(Long value1, Long value2) {
            addCriterion("forced_liquidation_amount between", value1, value2, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationAmountNotBetween(Long value1, Long value2) {
            addCriterion("forced_liquidation_amount not between", value1, value2, "forcedLiquidationAmount");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeIsNull() {
            addCriterion("last_value_time is null");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeIsNotNull() {
            addCriterion("last_value_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeEqualTo(Date value) {
            addCriterion("last_value_time =", value, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeNotEqualTo(Date value) {
            addCriterion("last_value_time <>", value, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeGreaterThan(Date value) {
            addCriterion("last_value_time >", value, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_value_time >=", value, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeLessThan(Date value) {
            addCriterion("last_value_time <", value, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_value_time <=", value, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeIn(List<Date> values) {
            addCriterion("last_value_time in", values, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeNotIn(List<Date> values) {
            addCriterion("last_value_time not in", values, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeBetween(Date value1, Date value2) {
            addCriterion("last_value_time between", value1, value2, "lastValueTime");
            return (Criteria) this;
        }

        public Criteria andLastValueTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_value_time not between", value1, value2, "lastValueTime");
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