package com.solution.p2p.core.common.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductDurationCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDurationCategoryExample() {
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

        public Criteria andLimitMinDurationIsNull() {
            addCriterion("limit_min_duration is null");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationIsNotNull() {
            addCriterion("limit_min_duration is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationEqualTo(Integer value) {
            addCriterion("limit_min_duration =", value, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationNotEqualTo(Integer value) {
            addCriterion("limit_min_duration <>", value, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationGreaterThan(Integer value) {
            addCriterion("limit_min_duration >", value, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_min_duration >=", value, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationLessThan(Integer value) {
            addCriterion("limit_min_duration <", value, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationLessThanOrEqualTo(Integer value) {
            addCriterion("limit_min_duration <=", value, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationIn(List<Integer> values) {
            addCriterion("limit_min_duration in", values, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationNotIn(List<Integer> values) {
            addCriterion("limit_min_duration not in", values, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationBetween(Integer value1, Integer value2) {
            addCriterion("limit_min_duration between", value1, value2, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMinDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_min_duration not between", value1, value2, "limitMinDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationIsNull() {
            addCriterion("limit_max_duration is null");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationIsNotNull() {
            addCriterion("limit_max_duration is not null");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationEqualTo(Integer value) {
            addCriterion("limit_max_duration =", value, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationNotEqualTo(Integer value) {
            addCriterion("limit_max_duration <>", value, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationGreaterThan(Integer value) {
            addCriterion("limit_max_duration >", value, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_max_duration >=", value, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationLessThan(Integer value) {
            addCriterion("limit_max_duration <", value, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationLessThanOrEqualTo(Integer value) {
            addCriterion("limit_max_duration <=", value, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationIn(List<Integer> values) {
            addCriterion("limit_max_duration in", values, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationNotIn(List<Integer> values) {
            addCriterion("limit_max_duration not in", values, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationBetween(Integer value1, Integer value2) {
            addCriterion("limit_max_duration between", value1, value2, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andLimitMaxDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_max_duration not between", value1, value2, "limitMaxDuration");
            return (Criteria) this;
        }

        public Criteria andDurationUnitIsNull() {
            addCriterion("duration_unit is null");
            return (Criteria) this;
        }

        public Criteria andDurationUnitIsNotNull() {
            addCriterion("duration_unit is not null");
            return (Criteria) this;
        }

        public Criteria andDurationUnitEqualTo(Integer value) {
            addCriterion("duration_unit =", value, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitNotEqualTo(Integer value) {
            addCriterion("duration_unit <>", value, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitGreaterThan(Integer value) {
            addCriterion("duration_unit >", value, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration_unit >=", value, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitLessThan(Integer value) {
            addCriterion("duration_unit <", value, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitLessThanOrEqualTo(Integer value) {
            addCriterion("duration_unit <=", value, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitIn(List<Integer> values) {
            addCriterion("duration_unit in", values, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitNotIn(List<Integer> values) {
            addCriterion("duration_unit not in", values, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitBetween(Integer value1, Integer value2) {
            addCriterion("duration_unit between", value1, value2, "durationUnit");
            return (Criteria) this;
        }

        public Criteria andDurationUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("duration_unit not between", value1, value2, "durationUnit");
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