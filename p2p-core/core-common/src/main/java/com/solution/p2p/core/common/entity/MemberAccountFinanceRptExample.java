package com.solution.p2p.core.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberAccountFinanceRptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberAccountFinanceRptExample() {
        oredCriteria = new ArrayList<Criteria>();
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
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
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

        public Criteria andFinanceRptTimeTypeIsNull() {
            addCriterion("finance_rpt_time_type is null");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeIsNotNull() {
            addCriterion("finance_rpt_time_type is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeEqualTo(Integer value) {
            addCriterion("finance_rpt_time_type =", value, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeNotEqualTo(Integer value) {
            addCriterion("finance_rpt_time_type <>", value, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeGreaterThan(Integer value) {
            addCriterion("finance_rpt_time_type >", value, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("finance_rpt_time_type >=", value, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeLessThan(Integer value) {
            addCriterion("finance_rpt_time_type <", value, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("finance_rpt_time_type <=", value, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeIn(List<Integer> values) {
            addCriterion("finance_rpt_time_type in", values, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeNotIn(List<Integer> values) {
            addCriterion("finance_rpt_time_type not in", values, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeBetween(Integer value1, Integer value2) {
            addCriterion("finance_rpt_time_type between", value1, value2, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceRptTimeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("finance_rpt_time_type not between", value1, value2, "financeRptTimeType");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeIsNull() {
            addCriterion("finance_time is null");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeIsNotNull() {
            addCriterion("finance_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeEqualTo(String value) {
            addCriterion("finance_time =", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeNotEqualTo(String value) {
            addCriterion("finance_time <>", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeGreaterThan(String value) {
            addCriterion("finance_time >", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("finance_time >=", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeLessThan(String value) {
            addCriterion("finance_time <", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeLessThanOrEqualTo(String value) {
            addCriterion("finance_time <=", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeLike(String value) {
            addCriterion("finance_time like", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeNotLike(String value) {
            addCriterion("finance_time not like", value, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeIn(List<String> values) {
            addCriterion("finance_time in", values, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeNotIn(List<String> values) {
            addCriterion("finance_time not in", values, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeBetween(String value1, String value2) {
            addCriterion("finance_time between", value1, value2, "financeTime");
            return (Criteria) this;
        }

        public Criteria andFinanceTimeNotBetween(String value1, String value2) {
            addCriterion("finance_time not between", value1, value2, "financeTime");
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

        public Criteria andMemberAccountNameIsNull() {
            addCriterion("member_account_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameIsNotNull() {
            addCriterion("member_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameEqualTo(Long value) {
            addCriterion("member_account_name =", value, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameNotEqualTo(Long value) {
            addCriterion("member_account_name <>", value, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameGreaterThan(Long value) {
            addCriterion("member_account_name >", value, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameGreaterThanOrEqualTo(Long value) {
            addCriterion("member_account_name >=", value, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameLessThan(Long value) {
            addCriterion("member_account_name <", value, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameLessThanOrEqualTo(Long value) {
            addCriterion("member_account_name <=", value, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameIn(List<Long> values) {
            addCriterion("member_account_name in", values, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameNotIn(List<Long> values) {
            addCriterion("member_account_name not in", values, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameBetween(Long value1, Long value2) {
            addCriterion("member_account_name between", value1, value2, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountNameNotBetween(Long value1, Long value2) {
            addCriterion("member_account_name not between", value1, value2, "memberAccountName");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeIsNull() {
            addCriterion("member_account_type is null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeIsNotNull() {
            addCriterion("member_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeEqualTo(Integer value) {
            addCriterion("member_account_type =", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeNotEqualTo(Integer value) {
            addCriterion("member_account_type <>", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeGreaterThan(Integer value) {
            addCriterion("member_account_type >", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_account_type >=", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeLessThan(Integer value) {
            addCriterion("member_account_type <", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("member_account_type <=", value, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeIn(List<Integer> values) {
            addCriterion("member_account_type in", values, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeNotIn(List<Integer> values) {
            addCriterion("member_account_type not in", values, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeBetween(Integer value1, Integer value2) {
            addCriterion("member_account_type between", value1, value2, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andMemberAccountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("member_account_type not between", value1, value2, "memberAccountType");
            return (Criteria) this;
        }

        public Criteria andSetNoIsNull() {
            addCriterion("set_no is null");
            return (Criteria) this;
        }

        public Criteria andSetNoIsNotNull() {
            addCriterion("set_no is not null");
            return (Criteria) this;
        }

        public Criteria andSetNoEqualTo(Integer value) {
            addCriterion("set_no =", value, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoNotEqualTo(Integer value) {
            addCriterion("set_no <>", value, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoGreaterThan(Integer value) {
            addCriterion("set_no >", value, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("set_no >=", value, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoLessThan(Integer value) {
            addCriterion("set_no <", value, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoLessThanOrEqualTo(Integer value) {
            addCriterion("set_no <=", value, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoIn(List<Integer> values) {
            addCriterion("set_no in", values, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoNotIn(List<Integer> values) {
            addCriterion("set_no not in", values, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoBetween(Integer value1, Integer value2) {
            addCriterion("set_no between", value1, value2, "setNo");
            return (Criteria) this;
        }

        public Criteria andSetNoNotBetween(Integer value1, Integer value2) {
            addCriterion("set_no not between", value1, value2, "setNo");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Integer value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Integer value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Integer value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Integer value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Integer> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Integer> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Integer value1, Integer value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("direction not between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andFromAmountIsNull() {
            addCriterion("from_amount is null");
            return (Criteria) this;
        }

        public Criteria andFromAmountIsNotNull() {
            addCriterion("from_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFromAmountEqualTo(Long value) {
            addCriterion("from_amount =", value, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountNotEqualTo(Long value) {
            addCriterion("from_amount <>", value, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountGreaterThan(Long value) {
            addCriterion("from_amount >", value, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("from_amount >=", value, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountLessThan(Long value) {
            addCriterion("from_amount <", value, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountLessThanOrEqualTo(Long value) {
            addCriterion("from_amount <=", value, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountIn(List<Long> values) {
            addCriterion("from_amount in", values, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountNotIn(List<Long> values) {
            addCriterion("from_amount not in", values, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountBetween(Long value1, Long value2) {
            addCriterion("from_amount between", value1, value2, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromAmountNotBetween(Long value1, Long value2) {
            addCriterion("from_amount not between", value1, value2, "fromAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountIsNull() {
            addCriterion("from_frozen_amount is null");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountIsNotNull() {
            addCriterion("from_frozen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountEqualTo(Long value) {
            addCriterion("from_frozen_amount =", value, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountNotEqualTo(Long value) {
            addCriterion("from_frozen_amount <>", value, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountGreaterThan(Long value) {
            addCriterion("from_frozen_amount >", value, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("from_frozen_amount >=", value, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountLessThan(Long value) {
            addCriterion("from_frozen_amount <", value, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountLessThanOrEqualTo(Long value) {
            addCriterion("from_frozen_amount <=", value, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountIn(List<Long> values) {
            addCriterion("from_frozen_amount in", values, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountNotIn(List<Long> values) {
            addCriterion("from_frozen_amount not in", values, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountBetween(Long value1, Long value2) {
            addCriterion("from_frozen_amount between", value1, value2, "fromFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andFromFrozenAmountNotBetween(Long value1, Long value2) {
            addCriterion("from_frozen_amount not between", value1, value2, "fromFrozenAmount");
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

        public Criteria andTotalIncomeCountIsNull() {
            addCriterion("total_income_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountIsNotNull() {
            addCriterion("total_income_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountEqualTo(Integer value) {
            addCriterion("total_income_count =", value, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountNotEqualTo(Integer value) {
            addCriterion("total_income_count <>", value, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountGreaterThan(Integer value) {
            addCriterion("total_income_count >", value, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_income_count >=", value, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountLessThan(Integer value) {
            addCriterion("total_income_count <", value, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_income_count <=", value, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountIn(List<Integer> values) {
            addCriterion("total_income_count in", values, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountNotIn(List<Integer> values) {
            addCriterion("total_income_count not in", values, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountBetween(Integer value1, Integer value2) {
            addCriterion("total_income_count between", value1, value2, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_income_count not between", value1, value2, "totalIncomeCount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountIsNull() {
            addCriterion("total_income_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountIsNotNull() {
            addCriterion("total_income_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountEqualTo(Long value) {
            addCriterion("total_income_amount =", value, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountNotEqualTo(Long value) {
            addCriterion("total_income_amount <>", value, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountGreaterThan(Long value) {
            addCriterion("total_income_amount >", value, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_income_amount >=", value, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountLessThan(Long value) {
            addCriterion("total_income_amount <", value, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_income_amount <=", value, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountIn(List<Long> values) {
            addCriterion("total_income_amount in", values, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountNotIn(List<Long> values) {
            addCriterion("total_income_amount not in", values, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountBetween(Long value1, Long value2) {
            addCriterion("total_income_amount between", value1, value2, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalIncomeAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_income_amount not between", value1, value2, "totalIncomeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountIsNull() {
            addCriterion("total_expend_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountIsNotNull() {
            addCriterion("total_expend_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountEqualTo(Integer value) {
            addCriterion("total_expend_count =", value, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountNotEqualTo(Integer value) {
            addCriterion("total_expend_count <>", value, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountGreaterThan(Integer value) {
            addCriterion("total_expend_count >", value, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_expend_count >=", value, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountLessThan(Integer value) {
            addCriterion("total_expend_count <", value, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_expend_count <=", value, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountIn(List<Integer> values) {
            addCriterion("total_expend_count in", values, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountNotIn(List<Integer> values) {
            addCriterion("total_expend_count not in", values, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountBetween(Integer value1, Integer value2) {
            addCriterion("total_expend_count between", value1, value2, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_expend_count not between", value1, value2, "totalExpendCount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountIsNull() {
            addCriterion("total_expend_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountIsNotNull() {
            addCriterion("total_expend_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountEqualTo(Long value) {
            addCriterion("total_expend_amount =", value, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountNotEqualTo(Long value) {
            addCriterion("total_expend_amount <>", value, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountGreaterThan(Long value) {
            addCriterion("total_expend_amount >", value, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_expend_amount >=", value, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountLessThan(Long value) {
            addCriterion("total_expend_amount <", value, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_expend_amount <=", value, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountIn(List<Long> values) {
            addCriterion("total_expend_amount in", values, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountNotIn(List<Long> values) {
            addCriterion("total_expend_amount not in", values, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountBetween(Long value1, Long value2) {
            addCriterion("total_expend_amount between", value1, value2, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalExpendAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_expend_amount not between", value1, value2, "totalExpendAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountIsNull() {
            addCriterion("total_frozen_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountIsNotNull() {
            addCriterion("total_frozen_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountEqualTo(Integer value) {
            addCriterion("total_frozen_count =", value, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountNotEqualTo(Integer value) {
            addCriterion("total_frozen_count <>", value, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountGreaterThan(Integer value) {
            addCriterion("total_frozen_count >", value, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_frozen_count >=", value, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountLessThan(Integer value) {
            addCriterion("total_frozen_count <", value, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_frozen_count <=", value, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountIn(List<Integer> values) {
            addCriterion("total_frozen_count in", values, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountNotIn(List<Integer> values) {
            addCriterion("total_frozen_count not in", values, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountBetween(Integer value1, Integer value2) {
            addCriterion("total_frozen_count between", value1, value2, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_frozen_count not between", value1, value2, "totalFrozenCount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountIsNull() {
            addCriterion("total_frozen_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountIsNotNull() {
            addCriterion("total_frozen_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountEqualTo(Long value) {
            addCriterion("total_frozen_amount =", value, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountNotEqualTo(Long value) {
            addCriterion("total_frozen_amount <>", value, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountGreaterThan(Long value) {
            addCriterion("total_frozen_amount >", value, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_frozen_amount >=", value, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountLessThan(Long value) {
            addCriterion("total_frozen_amount <", value, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_frozen_amount <=", value, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountIn(List<Long> values) {
            addCriterion("total_frozen_amount in", values, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountNotIn(List<Long> values) {
            addCriterion("total_frozen_amount not in", values, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountBetween(Long value1, Long value2) {
            addCriterion("total_frozen_amount between", value1, value2, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrozenAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_frozen_amount not between", value1, value2, "totalFrozenAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountIsNull() {
            addCriterion("total_thaw_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountIsNotNull() {
            addCriterion("total_thaw_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountEqualTo(Integer value) {
            addCriterion("total_thaw_count =", value, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountNotEqualTo(Integer value) {
            addCriterion("total_thaw_count <>", value, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountGreaterThan(Integer value) {
            addCriterion("total_thaw_count >", value, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_thaw_count >=", value, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountLessThan(Integer value) {
            addCriterion("total_thaw_count <", value, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_thaw_count <=", value, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountIn(List<Integer> values) {
            addCriterion("total_thaw_count in", values, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountNotIn(List<Integer> values) {
            addCriterion("total_thaw_count not in", values, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountBetween(Integer value1, Integer value2) {
            addCriterion("total_thaw_count between", value1, value2, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_thaw_count not between", value1, value2, "totalThawCount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountIsNull() {
            addCriterion("total_thaw_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountIsNotNull() {
            addCriterion("total_thaw_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountEqualTo(Long value) {
            addCriterion("total_thaw_amount =", value, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountNotEqualTo(Long value) {
            addCriterion("total_thaw_amount <>", value, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountGreaterThan(Long value) {
            addCriterion("total_thaw_amount >", value, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_thaw_amount >=", value, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountLessThan(Long value) {
            addCriterion("total_thaw_amount <", value, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_thaw_amount <=", value, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountIn(List<Long> values) {
            addCriterion("total_thaw_amount in", values, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountNotIn(List<Long> values) {
            addCriterion("total_thaw_amount not in", values, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountBetween(Long value1, Long value2) {
            addCriterion("total_thaw_amount between", value1, value2, "totalThawAmount");
            return (Criteria) this;
        }

        public Criteria andTotalThawAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_thaw_amount not between", value1, value2, "totalThawAmount");
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

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}