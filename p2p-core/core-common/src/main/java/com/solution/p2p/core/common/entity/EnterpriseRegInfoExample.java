package com.solution.p2p.core.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnterpriseRegInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnterpriseRegInfoExample() {
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

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoIsNull() {
            addCriterion("enterprise_reg_no is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoIsNotNull() {
            addCriterion("enterprise_reg_no is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoEqualTo(String value) {
            addCriterion("enterprise_reg_no =", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoNotEqualTo(String value) {
            addCriterion("enterprise_reg_no <>", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoGreaterThan(String value) {
            addCriterion("enterprise_reg_no >", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_no >=", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoLessThan(String value) {
            addCriterion("enterprise_reg_no <", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_no <=", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoLike(String value) {
            addCriterion("enterprise_reg_no like", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoNotLike(String value) {
            addCriterion("enterprise_reg_no not like", value, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoIn(List<String> values) {
            addCriterion("enterprise_reg_no in", values, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoNotIn(List<String> values) {
            addCriterion("enterprise_reg_no not in", values, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoBetween(String value1, String value2) {
            addCriterion("enterprise_reg_no between", value1, value2, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegNoNotBetween(String value1, String value2) {
            addCriterion("enterprise_reg_no not between", value1, value2, "enterpriseRegNo");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrIsNull() {
            addCriterion("enterprise_reg_addr is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrIsNotNull() {
            addCriterion("enterprise_reg_addr is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrEqualTo(String value) {
            addCriterion("enterprise_reg_addr =", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrNotEqualTo(String value) {
            addCriterion("enterprise_reg_addr <>", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrGreaterThan(String value) {
            addCriterion("enterprise_reg_addr >", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_addr >=", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrLessThan(String value) {
            addCriterion("enterprise_reg_addr <", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_addr <=", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrLike(String value) {
            addCriterion("enterprise_reg_addr like", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrNotLike(String value) {
            addCriterion("enterprise_reg_addr not like", value, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrIn(List<String> values) {
            addCriterion("enterprise_reg_addr in", values, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrNotIn(List<String> values) {
            addCriterion("enterprise_reg_addr not in", values, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrBetween(String value1, String value2) {
            addCriterion("enterprise_reg_addr between", value1, value2, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAddrNotBetween(String value1, String value2) {
            addCriterion("enterprise_reg_addr not between", value1, value2, "enterpriseRegAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationIsNull() {
            addCriterion("enterprise_duration is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationIsNotNull() {
            addCriterion("enterprise_duration is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationEqualTo(Date value) {
            addCriterion("enterprise_duration =", value, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationNotEqualTo(Date value) {
            addCriterion("enterprise_duration <>", value, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationGreaterThan(Date value) {
            addCriterion("enterprise_duration >", value, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationGreaterThanOrEqualTo(Date value) {
            addCriterion("enterprise_duration >=", value, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationLessThan(Date value) {
            addCriterion("enterprise_duration <", value, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationLessThanOrEqualTo(Date value) {
            addCriterion("enterprise_duration <=", value, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationIn(List<Date> values) {
            addCriterion("enterprise_duration in", values, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationNotIn(List<Date> values) {
            addCriterion("enterprise_duration not in", values, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationBetween(Date value1, Date value2) {
            addCriterion("enterprise_duration between", value1, value2, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseDurationNotBetween(Date value1, Date value2) {
            addCriterion("enterprise_duration not between", value1, value2, "enterpriseDuration");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrIsNull() {
            addCriterion("enterprise_addr is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrIsNotNull() {
            addCriterion("enterprise_addr is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrEqualTo(String value) {
            addCriterion("enterprise_addr =", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrNotEqualTo(String value) {
            addCriterion("enterprise_addr <>", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrGreaterThan(String value) {
            addCriterion("enterprise_addr >", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_addr >=", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrLessThan(String value) {
            addCriterion("enterprise_addr <", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrLessThanOrEqualTo(String value) {
            addCriterion("enterprise_addr <=", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrLike(String value) {
            addCriterion("enterprise_addr like", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrNotLike(String value) {
            addCriterion("enterprise_addr not like", value, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrIn(List<String> values) {
            addCriterion("enterprise_addr in", values, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrNotIn(List<String> values) {
            addCriterion("enterprise_addr not in", values, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrBetween(String value1, String value2) {
            addCriterion("enterprise_addr between", value1, value2, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseAddrNotBetween(String value1, String value2) {
            addCriterion("enterprise_addr not between", value1, value2, "enterpriseAddr");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIsNull() {
            addCriterion("enterprise_tel is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIsNotNull() {
            addCriterion("enterprise_tel is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelEqualTo(String value) {
            addCriterion("enterprise_tel =", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotEqualTo(String value) {
            addCriterion("enterprise_tel <>", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelGreaterThan(String value) {
            addCriterion("enterprise_tel >", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_tel >=", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLessThan(String value) {
            addCriterion("enterprise_tel <", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLessThanOrEqualTo(String value) {
            addCriterion("enterprise_tel <=", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelLike(String value) {
            addCriterion("enterprise_tel like", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotLike(String value) {
            addCriterion("enterprise_tel not like", value, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelIn(List<String> values) {
            addCriterion("enterprise_tel in", values, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotIn(List<String> values) {
            addCriterion("enterprise_tel not in", values, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelBetween(String value1, String value2) {
            addCriterion("enterprise_tel between", value1, value2, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTelNotBetween(String value1, String value2) {
            addCriterion("enterprise_tel not between", value1, value2, "enterpriseTel");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicIsNull() {
            addCriterion("enterprise_reg_pic is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicIsNotNull() {
            addCriterion("enterprise_reg_pic is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicEqualTo(String value) {
            addCriterion("enterprise_reg_pic =", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicNotEqualTo(String value) {
            addCriterion("enterprise_reg_pic <>", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicGreaterThan(String value) {
            addCriterion("enterprise_reg_pic >", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_pic >=", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicLessThan(String value) {
            addCriterion("enterprise_reg_pic <", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_pic <=", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicLike(String value) {
            addCriterion("enterprise_reg_pic like", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicNotLike(String value) {
            addCriterion("enterprise_reg_pic not like", value, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicIn(List<String> values) {
            addCriterion("enterprise_reg_pic in", values, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicNotIn(List<String> values) {
            addCriterion("enterprise_reg_pic not in", values, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicBetween(String value1, String value2) {
            addCriterion("enterprise_reg_pic between", value1, value2, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegPicNotBetween(String value1, String value2) {
            addCriterion("enterprise_reg_pic not between", value1, value2, "enterpriseRegPic");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeIsNull() {
            addCriterion("enterprise_org_code is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeIsNotNull() {
            addCriterion("enterprise_org_code is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeEqualTo(String value) {
            addCriterion("enterprise_org_code =", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeNotEqualTo(String value) {
            addCriterion("enterprise_org_code <>", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeGreaterThan(String value) {
            addCriterion("enterprise_org_code >", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_org_code >=", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeLessThan(String value) {
            addCriterion("enterprise_org_code <", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_org_code <=", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeLike(String value) {
            addCriterion("enterprise_org_code like", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeNotLike(String value) {
            addCriterion("enterprise_org_code not like", value, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeIn(List<String> values) {
            addCriterion("enterprise_org_code in", values, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeNotIn(List<String> values) {
            addCriterion("enterprise_org_code not in", values, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeBetween(String value1, String value2) {
            addCriterion("enterprise_org_code between", value1, value2, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseOrgCodeNotBetween(String value1, String value2) {
            addCriterion("enterprise_org_code not between", value1, value2, "enterpriseOrgCode");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeIsNull() {
            addCriterion("enterprise_biz_scope is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeIsNotNull() {
            addCriterion("enterprise_biz_scope is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeEqualTo(String value) {
            addCriterion("enterprise_biz_scope =", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeNotEqualTo(String value) {
            addCriterion("enterprise_biz_scope <>", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeGreaterThan(String value) {
            addCriterion("enterprise_biz_scope >", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_biz_scope >=", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeLessThan(String value) {
            addCriterion("enterprise_biz_scope <", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_biz_scope <=", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeLike(String value) {
            addCriterion("enterprise_biz_scope like", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeNotLike(String value) {
            addCriterion("enterprise_biz_scope not like", value, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeIn(List<String> values) {
            addCriterion("enterprise_biz_scope in", values, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeNotIn(List<String> values) {
            addCriterion("enterprise_biz_scope not in", values, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeBetween(String value1, String value2) {
            addCriterion("enterprise_biz_scope between", value1, value2, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseBizScopeNotBetween(String value1, String value2) {
            addCriterion("enterprise_biz_scope not between", value1, value2, "enterpriseBizScope");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountIsNull() {
            addCriterion("enterprise_reg_amount is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountIsNotNull() {
            addCriterion("enterprise_reg_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountEqualTo(String value) {
            addCriterion("enterprise_reg_amount =", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountNotEqualTo(String value) {
            addCriterion("enterprise_reg_amount <>", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountGreaterThan(String value) {
            addCriterion("enterprise_reg_amount >", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_amount >=", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountLessThan(String value) {
            addCriterion("enterprise_reg_amount <", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountLessThanOrEqualTo(String value) {
            addCriterion("enterprise_reg_amount <=", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountLike(String value) {
            addCriterion("enterprise_reg_amount like", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountNotLike(String value) {
            addCriterion("enterprise_reg_amount not like", value, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountIn(List<String> values) {
            addCriterion("enterprise_reg_amount in", values, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountNotIn(List<String> values) {
            addCriterion("enterprise_reg_amount not in", values, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountBetween(String value1, String value2) {
            addCriterion("enterprise_reg_amount between", value1, value2, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseRegAmountNotBetween(String value1, String value2) {
            addCriterion("enterprise_reg_amount not between", value1, value2, "enterpriseRegAmount");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxIsNull() {
            addCriterion("enterprise_fax is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxIsNotNull() {
            addCriterion("enterprise_fax is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxEqualTo(String value) {
            addCriterion("enterprise_fax =", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotEqualTo(String value) {
            addCriterion("enterprise_fax <>", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxGreaterThan(String value) {
            addCriterion("enterprise_fax >", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_fax >=", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxLessThan(String value) {
            addCriterion("enterprise_fax <", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxLessThanOrEqualTo(String value) {
            addCriterion("enterprise_fax <=", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxLike(String value) {
            addCriterion("enterprise_fax like", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotLike(String value) {
            addCriterion("enterprise_fax not like", value, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxIn(List<String> values) {
            addCriterion("enterprise_fax in", values, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotIn(List<String> values) {
            addCriterion("enterprise_fax not in", values, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxBetween(String value1, String value2) {
            addCriterion("enterprise_fax between", value1, value2, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseFaxNotBetween(String value1, String value2) {
            addCriterion("enterprise_fax not between", value1, value2, "enterpriseFax");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameIsNull() {
            addCriterion("enterprise_legal_real_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameIsNotNull() {
            addCriterion("enterprise_legal_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameEqualTo(String value) {
            addCriterion("enterprise_legal_real_name =", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameNotEqualTo(String value) {
            addCriterion("enterprise_legal_real_name <>", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameGreaterThan(String value) {
            addCriterion("enterprise_legal_real_name >", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_legal_real_name >=", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameLessThan(String value) {
            addCriterion("enterprise_legal_real_name <", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_legal_real_name <=", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameLike(String value) {
            addCriterion("enterprise_legal_real_name like", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameNotLike(String value) {
            addCriterion("enterprise_legal_real_name not like", value, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameIn(List<String> values) {
            addCriterion("enterprise_legal_real_name in", values, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameNotIn(List<String> values) {
            addCriterion("enterprise_legal_real_name not in", values, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameBetween(String value1, String value2) {
            addCriterion("enterprise_legal_real_name between", value1, value2, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalRealNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_legal_real_name not between", value1, value2, "enterpriseLegalRealName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardIsNull() {
            addCriterion("enterprise_legal_id_card is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardIsNotNull() {
            addCriterion("enterprise_legal_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardEqualTo(String value) {
            addCriterion("enterprise_legal_id_card =", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardNotEqualTo(String value) {
            addCriterion("enterprise_legal_id_card <>", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardGreaterThan(String value) {
            addCriterion("enterprise_legal_id_card >", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_legal_id_card >=", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardLessThan(String value) {
            addCriterion("enterprise_legal_id_card <", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardLessThanOrEqualTo(String value) {
            addCriterion("enterprise_legal_id_card <=", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardLike(String value) {
            addCriterion("enterprise_legal_id_card like", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardNotLike(String value) {
            addCriterion("enterprise_legal_id_card not like", value, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardIn(List<String> values) {
            addCriterion("enterprise_legal_id_card in", values, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardNotIn(List<String> values) {
            addCriterion("enterprise_legal_id_card not in", values, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardBetween(String value1, String value2) {
            addCriterion("enterprise_legal_id_card between", value1, value2, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseLegalIdCardNotBetween(String value1, String value2) {
            addCriterion("enterprise_legal_id_card not between", value1, value2, "enterpriseLegalIdCard");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontIsNull() {
            addCriterion("enterprise_id_pic_front is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontIsNotNull() {
            addCriterion("enterprise_id_pic_front is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontEqualTo(String value) {
            addCriterion("enterprise_id_pic_front =", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontNotEqualTo(String value) {
            addCriterion("enterprise_id_pic_front <>", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontGreaterThan(String value) {
            addCriterion("enterprise_id_pic_front >", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id_pic_front >=", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontLessThan(String value) {
            addCriterion("enterprise_id_pic_front <", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id_pic_front <=", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontLike(String value) {
            addCriterion("enterprise_id_pic_front like", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontNotLike(String value) {
            addCriterion("enterprise_id_pic_front not like", value, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontIn(List<String> values) {
            addCriterion("enterprise_id_pic_front in", values, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontNotIn(List<String> values) {
            addCriterion("enterprise_id_pic_front not in", values, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontBetween(String value1, String value2) {
            addCriterion("enterprise_id_pic_front between", value1, value2, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicFrontNotBetween(String value1, String value2) {
            addCriterion("enterprise_id_pic_front not between", value1, value2, "enterpriseIdPicFront");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackIsNull() {
            addCriterion("enterprise_id_pic_back is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackIsNotNull() {
            addCriterion("enterprise_id_pic_back is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackEqualTo(String value) {
            addCriterion("enterprise_id_pic_back =", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackNotEqualTo(String value) {
            addCriterion("enterprise_id_pic_back <>", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackGreaterThan(String value) {
            addCriterion("enterprise_id_pic_back >", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_id_pic_back >=", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackLessThan(String value) {
            addCriterion("enterprise_id_pic_back <", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackLessThanOrEqualTo(String value) {
            addCriterion("enterprise_id_pic_back <=", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackLike(String value) {
            addCriterion("enterprise_id_pic_back like", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackNotLike(String value) {
            addCriterion("enterprise_id_pic_back not like", value, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackIn(List<String> values) {
            addCriterion("enterprise_id_pic_back in", values, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackNotIn(List<String> values) {
            addCriterion("enterprise_id_pic_back not in", values, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackBetween(String value1, String value2) {
            addCriterion("enterprise_id_pic_back between", value1, value2, "enterpriseIdPicBack");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdPicBackNotBetween(String value1, String value2) {
            addCriterion("enterprise_id_pic_back not between", value1, value2, "enterpriseIdPicBack");
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