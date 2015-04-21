package com.solution.p2p.core.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BidRefundInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BidRefundInfoExample() {
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

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(String value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(String value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(String value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(String value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(String value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(String value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLike(String value) {
            addCriterion("issue like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotLike(String value) {
            addCriterion("issue not like", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<String> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<String> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(String value1, String value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(String value1, String value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeIsNull() {
            addCriterion("scheduled_refund_time is null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeIsNotNull() {
            addCriterion("scheduled_refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeEqualTo(Date value) {
            addCriterion("scheduled_refund_time =", value, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeNotEqualTo(Date value) {
            addCriterion("scheduled_refund_time <>", value, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeGreaterThan(Date value) {
            addCriterion("scheduled_refund_time >", value, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scheduled_refund_time >=", value, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeLessThan(Date value) {
            addCriterion("scheduled_refund_time <", value, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("scheduled_refund_time <=", value, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeIn(List<Date> values) {
            addCriterion("scheduled_refund_time in", values, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeNotIn(List<Date> values) {
            addCriterion("scheduled_refund_time not in", values, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeBetween(Date value1, Date value2) {
            addCriterion("scheduled_refund_time between", value1, value2, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("scheduled_refund_time not between", value1, value2, "scheduledRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeIsNull() {
            addCriterion("real_refund_time is null");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeIsNotNull() {
            addCriterion("real_refund_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeEqualTo(Date value) {
            addCriterion("real_refund_time =", value, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeNotEqualTo(Date value) {
            addCriterion("real_refund_time <>", value, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeGreaterThan(Date value) {
            addCriterion("real_refund_time >", value, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("real_refund_time >=", value, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeLessThan(Date value) {
            addCriterion("real_refund_time <", value, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeLessThanOrEqualTo(Date value) {
            addCriterion("real_refund_time <=", value, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeIn(List<Date> values) {
            addCriterion("real_refund_time in", values, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeNotIn(List<Date> values) {
            addCriterion("real_refund_time not in", values, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeBetween(Date value1, Date value2) {
            addCriterion("real_refund_time between", value1, value2, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRealRefundTimeNotBetween(Date value1, Date value2) {
            addCriterion("real_refund_time not between", value1, value2, "realRefundTime");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdIsNull() {
            addCriterion("refund_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdIsNotNull() {
            addCriterion("refund_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdEqualTo(String value) {
            addCriterion("refund_flow_id =", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdNotEqualTo(String value) {
            addCriterion("refund_flow_id <>", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdGreaterThan(String value) {
            addCriterion("refund_flow_id >", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("refund_flow_id >=", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdLessThan(String value) {
            addCriterion("refund_flow_id <", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdLessThanOrEqualTo(String value) {
            addCriterion("refund_flow_id <=", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdLike(String value) {
            addCriterion("refund_flow_id like", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdNotLike(String value) {
            addCriterion("refund_flow_id not like", value, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdIn(List<String> values) {
            addCriterion("refund_flow_id in", values, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdNotIn(List<String> values) {
            addCriterion("refund_flow_id not in", values, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdBetween(String value1, String value2) {
            addCriterion("refund_flow_id between", value1, value2, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andRefundFlowIdNotBetween(String value1, String value2) {
            addCriterion("refund_flow_id not between", value1, value2, "refundFlowId");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalIsNull() {
            addCriterion("scheduled_refund_principal is null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalIsNotNull() {
            addCriterion("scheduled_refund_principal is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalEqualTo(Long value) {
            addCriterion("scheduled_refund_principal =", value, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalNotEqualTo(Long value) {
            addCriterion("scheduled_refund_principal <>", value, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalGreaterThan(Long value) {
            addCriterion("scheduled_refund_principal >", value, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduled_refund_principal >=", value, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalLessThan(Long value) {
            addCriterion("scheduled_refund_principal <", value, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalLessThanOrEqualTo(Long value) {
            addCriterion("scheduled_refund_principal <=", value, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalIn(List<Long> values) {
            addCriterion("scheduled_refund_principal in", values, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalNotIn(List<Long> values) {
            addCriterion("scheduled_refund_principal not in", values, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalBetween(Long value1, Long value2) {
            addCriterion("scheduled_refund_principal between", value1, value2, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundPrincipalNotBetween(Long value1, Long value2) {
            addCriterion("scheduled_refund_principal not between", value1, value2, "scheduledRefundPrincipal");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestIsNull() {
            addCriterion("scheduled_refund_interest is null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestIsNotNull() {
            addCriterion("scheduled_refund_interest is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestEqualTo(Long value) {
            addCriterion("scheduled_refund_interest =", value, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestNotEqualTo(Long value) {
            addCriterion("scheduled_refund_interest <>", value, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestGreaterThan(Long value) {
            addCriterion("scheduled_refund_interest >", value, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduled_refund_interest >=", value, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestLessThan(Long value) {
            addCriterion("scheduled_refund_interest <", value, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestLessThanOrEqualTo(Long value) {
            addCriterion("scheduled_refund_interest <=", value, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestIn(List<Long> values) {
            addCriterion("scheduled_refund_interest in", values, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestNotIn(List<Long> values) {
            addCriterion("scheduled_refund_interest not in", values, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestBetween(Long value1, Long value2) {
            addCriterion("scheduled_refund_interest between", value1, value2, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundInterestNotBetween(Long value1, Long value2) {
            addCriterion("scheduled_refund_interest not between", value1, value2, "scheduledRefundInterest");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeIsNull() {
            addCriterion("scheduled_refund_service_fee is null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeIsNotNull() {
            addCriterion("scheduled_refund_service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeEqualTo(Long value) {
            addCriterion("scheduled_refund_service_fee =", value, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeNotEqualTo(Long value) {
            addCriterion("scheduled_refund_service_fee <>", value, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeGreaterThan(Long value) {
            addCriterion("scheduled_refund_service_fee >", value, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduled_refund_service_fee >=", value, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeLessThan(Long value) {
            addCriterion("scheduled_refund_service_fee <", value, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeLessThanOrEqualTo(Long value) {
            addCriterion("scheduled_refund_service_fee <=", value, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeIn(List<Long> values) {
            addCriterion("scheduled_refund_service_fee in", values, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeNotIn(List<Long> values) {
            addCriterion("scheduled_refund_service_fee not in", values, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeBetween(Long value1, Long value2) {
            addCriterion("scheduled_refund_service_fee between", value1, value2, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andScheduledRefundServiceFeeNotBetween(Long value1, Long value2) {
            addCriterion("scheduled_refund_service_fee not between", value1, value2, "scheduledRefundServiceFee");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountIsNull() {
            addCriterion("real_refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountIsNotNull() {
            addCriterion("real_refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountEqualTo(Long value) {
            addCriterion("real_refund_amount =", value, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountNotEqualTo(Long value) {
            addCriterion("real_refund_amount <>", value, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountGreaterThan(Long value) {
            addCriterion("real_refund_amount >", value, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("real_refund_amount >=", value, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountLessThan(Long value) {
            addCriterion("real_refund_amount <", value, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountLessThanOrEqualTo(Long value) {
            addCriterion("real_refund_amount <=", value, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountIn(List<Long> values) {
            addCriterion("real_refund_amount in", values, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountNotIn(List<Long> values) {
            addCriterion("real_refund_amount not in", values, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountBetween(Long value1, Long value2) {
            addCriterion("real_refund_amount between", value1, value2, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundAmountNotBetween(Long value1, Long value2) {
            addCriterion("real_refund_amount not between", value1, value2, "realRefundAmount");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineIsNull() {
            addCriterion("real_refund_fine is null");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineIsNotNull() {
            addCriterion("real_refund_fine is not null");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineEqualTo(Long value) {
            addCriterion("real_refund_fine =", value, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineNotEqualTo(Long value) {
            addCriterion("real_refund_fine <>", value, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineGreaterThan(Long value) {
            addCriterion("real_refund_fine >", value, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineGreaterThanOrEqualTo(Long value) {
            addCriterion("real_refund_fine >=", value, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineLessThan(Long value) {
            addCriterion("real_refund_fine <", value, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineLessThanOrEqualTo(Long value) {
            addCriterion("real_refund_fine <=", value, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineIn(List<Long> values) {
            addCriterion("real_refund_fine in", values, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineNotIn(List<Long> values) {
            addCriterion("real_refund_fine not in", values, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineBetween(Long value1, Long value2) {
            addCriterion("real_refund_fine between", value1, value2, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRealRefundFineNotBetween(Long value1, Long value2) {
            addCriterion("real_refund_fine not between", value1, value2, "realRefundFine");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(Integer value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(Integer value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(Integer value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(Integer value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<Integer> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<Integer> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(Integer value1, Integer value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
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