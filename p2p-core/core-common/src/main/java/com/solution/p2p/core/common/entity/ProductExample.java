package com.solution.p2p.core.common.entity;

import java.util.*;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected ProductExample(ProductExample example) {
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

        public Criteria andGuarantyCategoryIsNull() {
            addCriterion("guaranty_category is null");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryIsNotNull() {
            addCriterion("guaranty_category is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryEqualTo(Integer value) {
            addCriterion("guaranty_category =", value, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryNotEqualTo(Integer value) {
            addCriterion("guaranty_category <>", value, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryGreaterThan(Integer value) {
            addCriterion("guaranty_category >", value, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("guaranty_category >=", value, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryLessThan(Integer value) {
            addCriterion("guaranty_category <", value, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("guaranty_category <=", value, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryIn(List<Integer> values) {
            addCriterion("guaranty_category in", values, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryNotIn(List<Integer> values) {
            addCriterion("guaranty_category not in", values, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryBetween(Integer value1, Integer value2) {
            addCriterion("guaranty_category between", value1, value2, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andGuarantyCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("guaranty_category not between", value1, value2, "guarantyCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryIsNull() {
            addCriterion("life_duration_category is null");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryIsNotNull() {
            addCriterion("life_duration_category is not null");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryEqualTo(Integer value) {
            addCriterion("life_duration_category =", value, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryNotEqualTo(Integer value) {
            addCriterion("life_duration_category <>", value, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryGreaterThan(Integer value) {
            addCriterion("life_duration_category >", value, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("life_duration_category >=", value, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryLessThan(Integer value) {
            addCriterion("life_duration_category <", value, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("life_duration_category <=", value, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryIn(List<Integer> values) {
            addCriterion("life_duration_category in", values, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryNotIn(List<Integer> values) {
            addCriterion("life_duration_category not in", values, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryBetween(Integer value1, Integer value2) {
            addCriterion("life_duration_category between", value1, value2, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLifeDurationCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("life_duration_category not between", value1, value2, "lifeDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryIsNull() {
            addCriterion("collect_duration_category is null");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryIsNotNull() {
            addCriterion("collect_duration_category is not null");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryEqualTo(Integer value) {
            addCriterion("collect_duration_category =", value, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryNotEqualTo(Integer value) {
            addCriterion("collect_duration_category <>", value, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryGreaterThan(Integer value) {
            addCriterion("collect_duration_category >", value, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_duration_category >=", value, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryLessThan(Integer value) {
            addCriterion("collect_duration_category <", value, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("collect_duration_category <=", value, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryIn(List<Integer> values) {
            addCriterion("collect_duration_category in", values, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryNotIn(List<Integer> values) {
            addCriterion("collect_duration_category not in", values, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryBetween(Integer value1, Integer value2) {
            addCriterion("collect_duration_category between", value1, value2, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andCollectDurationCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_duration_category not between", value1, value2, "collectDurationCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryIsNull() {
            addCriterion("loan_amount_category is null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryIsNotNull() {
            addCriterion("loan_amount_category is not null");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryEqualTo(Integer value) {
            addCriterion("loan_amount_category =", value, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryNotEqualTo(Integer value) {
            addCriterion("loan_amount_category <>", value, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryGreaterThan(Integer value) {
            addCriterion("loan_amount_category >", value, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("loan_amount_category >=", value, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryLessThan(Integer value) {
            addCriterion("loan_amount_category <", value, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("loan_amount_category <=", value, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryIn(List<Integer> values) {
            addCriterion("loan_amount_category in", values, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryNotIn(List<Integer> values) {
            addCriterion("loan_amount_category not in", values, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryBetween(Integer value1, Integer value2) {
            addCriterion("loan_amount_category between", value1, value2, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLoanAmountCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("loan_amount_category not between", value1, value2, "loanAmountCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryIsNull() {
            addCriterion("l_interest_category is null");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryIsNotNull() {
            addCriterion("l_interest_category is not null");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryEqualTo(Integer value) {
            addCriterion("l_interest_category =", value, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryNotEqualTo(Integer value) {
            addCriterion("l_interest_category <>", value, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryGreaterThan(Integer value) {
            addCriterion("l_interest_category >", value, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_interest_category >=", value, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryLessThan(Integer value) {
            addCriterion("l_interest_category <", value, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("l_interest_category <=", value, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryIn(List<Integer> values) {
            addCriterion("l_interest_category in", values, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryNotIn(List<Integer> values) {
            addCriterion("l_interest_category not in", values, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryBetween(Integer value1, Integer value2) {
            addCriterion("l_interest_category between", value1, value2, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLInterestCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("l_interest_category not between", value1, value2, "lInterestCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryIsNull() {
            addCriterion("l_service_fee_category is null");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryIsNotNull() {
            addCriterion("l_service_fee_category is not null");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryEqualTo(Integer value) {
            addCriterion("l_service_fee_category =", value, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryNotEqualTo(Integer value) {
            addCriterion("l_service_fee_category <>", value, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryGreaterThan(Integer value) {
            addCriterion("l_service_fee_category >", value, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_service_fee_category >=", value, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryLessThan(Integer value) {
            addCriterion("l_service_fee_category <", value, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("l_service_fee_category <=", value, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryIn(List<Integer> values) {
            addCriterion("l_service_fee_category in", values, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryNotIn(List<Integer> values) {
            addCriterion("l_service_fee_category not in", values, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryBetween(Integer value1, Integer value2) {
            addCriterion("l_service_fee_category between", value1, value2, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLServiceFeeCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("l_service_fee_category not between", value1, value2, "lServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryIsNull() {
            addCriterion("l_pay_category is null");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryIsNotNull() {
            addCriterion("l_pay_category is not null");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryEqualTo(Integer value) {
            addCriterion("l_pay_category =", value, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryNotEqualTo(Integer value) {
            addCriterion("l_pay_category <>", value, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryGreaterThan(Integer value) {
            addCriterion("l_pay_category >", value, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_pay_category >=", value, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryLessThan(Integer value) {
            addCriterion("l_pay_category <", value, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("l_pay_category <=", value, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryIn(List<Integer> values) {
            addCriterion("l_pay_category in", values, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryNotIn(List<Integer> values) {
            addCriterion("l_pay_category not in", values, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryBetween(Integer value1, Integer value2) {
            addCriterion("l_pay_category between", value1, value2, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLPayCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("l_pay_category not between", value1, value2, "lPayCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryIsNull() {
            addCriterion("l_member_category is null");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryIsNotNull() {
            addCriterion("l_member_category is not null");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryEqualTo(Integer value) {
            addCriterion("l_member_category =", value, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryNotEqualTo(Integer value) {
            addCriterion("l_member_category <>", value, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryGreaterThan(Integer value) {
            addCriterion("l_member_category >", value, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_member_category >=", value, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryLessThan(Integer value) {
            addCriterion("l_member_category <", value, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("l_member_category <=", value, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryIn(List<Integer> values) {
            addCriterion("l_member_category in", values, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryNotIn(List<Integer> values) {
            addCriterion("l_member_category not in", values, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryBetween(Integer value1, Integer value2) {
            addCriterion("l_member_category between", value1, value2, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andLMemberCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("l_member_category not between", value1, value2, "lMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryIsNull() {
            addCriterion("b_interest_category is null");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryIsNotNull() {
            addCriterion("b_interest_category is not null");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryEqualTo(Integer value) {
            addCriterion("b_interest_category =", value, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryNotEqualTo(Integer value) {
            addCriterion("b_interest_category <>", value, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryGreaterThan(Integer value) {
            addCriterion("b_interest_category >", value, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_interest_category >=", value, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryLessThan(Integer value) {
            addCriterion("b_interest_category <", value, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("b_interest_category <=", value, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryIn(List<Integer> values) {
            addCriterion("b_interest_category in", values, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryNotIn(List<Integer> values) {
            addCriterion("b_interest_category not in", values, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryBetween(Integer value1, Integer value2) {
            addCriterion("b_interest_category between", value1, value2, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBInterestCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("b_interest_category not between", value1, value2, "bInterestCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryIsNull() {
            addCriterion("b_service_fee_category is null");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryIsNotNull() {
            addCriterion("b_service_fee_category is not null");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryEqualTo(Integer value) {
            addCriterion("b_service_fee_category =", value, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryNotEqualTo(Integer value) {
            addCriterion("b_service_fee_category <>", value, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryGreaterThan(Integer value) {
            addCriterion("b_service_fee_category >", value, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_service_fee_category >=", value, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryLessThan(Integer value) {
            addCriterion("b_service_fee_category <", value, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("b_service_fee_category <=", value, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryIn(List<Integer> values) {
            addCriterion("b_service_fee_category in", values, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryNotIn(List<Integer> values) {
            addCriterion("b_service_fee_category not in", values, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryBetween(Integer value1, Integer value2) {
            addCriterion("b_service_fee_category between", value1, value2, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBServiceFeeCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("b_service_fee_category not between", value1, value2, "bServiceFeeCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryIsNull() {
            addCriterion("b_amount_category is null");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryIsNotNull() {
            addCriterion("b_amount_category is not null");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryEqualTo(Integer value) {
            addCriterion("b_amount_category =", value, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryNotEqualTo(Integer value) {
            addCriterion("b_amount_category <>", value, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryGreaterThan(Integer value) {
            addCriterion("b_amount_category >", value, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_amount_category >=", value, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryLessThan(Integer value) {
            addCriterion("b_amount_category <", value, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("b_amount_category <=", value, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryIn(List<Integer> values) {
            addCriterion("b_amount_category in", values, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryNotIn(List<Integer> values) {
            addCriterion("b_amount_category not in", values, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryBetween(Integer value1, Integer value2) {
            addCriterion("b_amount_category between", value1, value2, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBAmountCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("b_amount_category not between", value1, value2, "bAmountCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryIsNull() {
            addCriterion("b_pay_category is null");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryIsNotNull() {
            addCriterion("b_pay_category is not null");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryEqualTo(Integer value) {
            addCriterion("b_pay_category =", value, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryNotEqualTo(Integer value) {
            addCriterion("b_pay_category <>", value, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryGreaterThan(Integer value) {
            addCriterion("b_pay_category >", value, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_pay_category >=", value, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryLessThan(Integer value) {
            addCriterion("b_pay_category <", value, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("b_pay_category <=", value, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryIn(List<Integer> values) {
            addCriterion("b_pay_category in", values, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryNotIn(List<Integer> values) {
            addCriterion("b_pay_category not in", values, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryBetween(Integer value1, Integer value2) {
            addCriterion("b_pay_category between", value1, value2, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBPayCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("b_pay_category not between", value1, value2, "bPayCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryIsNull() {
            addCriterion("b_member_category is null");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryIsNotNull() {
            addCriterion("b_member_category is not null");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryEqualTo(Integer value) {
            addCriterion("b_member_category =", value, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryNotEqualTo(Integer value) {
            addCriterion("b_member_category <>", value, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryGreaterThan(Integer value) {
            addCriterion("b_member_category >", value, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_member_category >=", value, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryLessThan(Integer value) {
            addCriterion("b_member_category <", value, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("b_member_category <=", value, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryIn(List<Integer> values) {
            addCriterion("b_member_category in", values, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryNotIn(List<Integer> values) {
            addCriterion("b_member_category not in", values, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryBetween(Integer value1, Integer value2) {
            addCriterion("b_member_category between", value1, value2, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andBMemberCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("b_member_category not between", value1, value2, "bMemberCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryIsNull() {
            addCriterion("channel_category is null");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryIsNotNull() {
            addCriterion("channel_category is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryEqualTo(Integer value) {
            addCriterion("channel_category =", value, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryNotEqualTo(Integer value) {
            addCriterion("channel_category <>", value, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryGreaterThan(Integer value) {
            addCriterion("channel_category >", value, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_category >=", value, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryLessThan(Integer value) {
            addCriterion("channel_category <", value, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("channel_category <=", value, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryIn(List<Integer> values) {
            addCriterion("channel_category in", values, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryNotIn(List<Integer> values) {
            addCriterion("channel_category not in", values, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryBetween(Integer value1, Integer value2) {
            addCriterion("channel_category between", value1, value2, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andChannelCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_category not between", value1, value2, "channelCategory");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNull() {
            addCriterion("available is null");
            return (Criteria) this;
        }

        public Criteria andAvailableIsNotNull() {
            addCriterion("available is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableEqualTo(Integer value) {
            addCriterion("available =", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotEqualTo(Integer value) {
            addCriterion("available <>", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThan(Integer value) {
            addCriterion("available >", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableGreaterThanOrEqualTo(Integer value) {
            addCriterion("available >=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThan(Integer value) {
            addCriterion("available <", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableLessThanOrEqualTo(Integer value) {
            addCriterion("available <=", value, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableIn(List<Integer> values) {
            addCriterion("available in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotIn(List<Integer> values) {
            addCriterion("available not in", values, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableBetween(Integer value1, Integer value2) {
            addCriterion("available between", value1, value2, "available");
            return (Criteria) this;
        }

        public Criteria andAvailableNotBetween(Integer value1, Integer value2) {
            addCriterion("available not between", value1, value2, "available");
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