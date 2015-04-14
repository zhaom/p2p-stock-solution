package com.solution.p2p.core.common.entity;

import java.util.*;

public class ProductGuarantyCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductGuarantyCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected ProductGuarantyCategoryExample(ProductGuarantyCategoryExample example) {
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

        public Criteria andNetValueCycleIsNull() {
            addCriterion("net_value_cycle is null");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleIsNotNull() {
            addCriterion("net_value_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleEqualTo(Integer value) {
            addCriterion("net_value_cycle =", value, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleNotEqualTo(Integer value) {
            addCriterion("net_value_cycle <>", value, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleGreaterThan(Integer value) {
            addCriterion("net_value_cycle >", value, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_value_cycle >=", value, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleLessThan(Integer value) {
            addCriterion("net_value_cycle <", value, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleLessThanOrEqualTo(Integer value) {
            addCriterion("net_value_cycle <=", value, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleIn(List<Integer> values) {
            addCriterion("net_value_cycle in", values, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleNotIn(List<Integer> values) {
            addCriterion("net_value_cycle not in", values, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleBetween(Integer value1, Integer value2) {
            addCriterion("net_value_cycle between", value1, value2, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("net_value_cycle not between", value1, value2, "netValueCycle");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitIsNull() {
            addCriterion("net_value_cycle_unit is null");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitIsNotNull() {
            addCriterion("net_value_cycle_unit is not null");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitEqualTo(Integer value) {
            addCriterion("net_value_cycle_unit =", value, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitNotEqualTo(Integer value) {
            addCriterion("net_value_cycle_unit <>", value, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitGreaterThan(Integer value) {
            addCriterion("net_value_cycle_unit >", value, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("net_value_cycle_unit >=", value, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitLessThan(Integer value) {
            addCriterion("net_value_cycle_unit <", value, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitLessThanOrEqualTo(Integer value) {
            addCriterion("net_value_cycle_unit <=", value, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitIn(List<Integer> values) {
            addCriterion("net_value_cycle_unit in", values, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitNotIn(List<Integer> values) {
            addCriterion("net_value_cycle_unit not in", values, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitBetween(Integer value1, Integer value2) {
            addCriterion("net_value_cycle_unit between", value1, value2, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andNetValueCycleUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("net_value_cycle_unit not between", value1, value2, "netValueCycleUnit");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentIsNull() {
            addCriterion("alarm_percent is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentIsNotNull() {
            addCriterion("alarm_percent is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentEqualTo(Integer value) {
            addCriterion("alarm_percent =", value, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentNotEqualTo(Integer value) {
            addCriterion("alarm_percent <>", value, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentGreaterThan(Integer value) {
            addCriterion("alarm_percent >", value, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarm_percent >=", value, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentLessThan(Integer value) {
            addCriterion("alarm_percent <", value, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentLessThanOrEqualTo(Integer value) {
            addCriterion("alarm_percent <=", value, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentIn(List<Integer> values) {
            addCriterion("alarm_percent in", values, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentNotIn(List<Integer> values) {
            addCriterion("alarm_percent not in", values, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentBetween(Integer value1, Integer value2) {
            addCriterion("alarm_percent between", value1, value2, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andAlarmPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("alarm_percent not between", value1, value2, "alarmPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentIsNull() {
            addCriterion("forced_liquidation_percent is null");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentIsNotNull() {
            addCriterion("forced_liquidation_percent is not null");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentEqualTo(Integer value) {
            addCriterion("forced_liquidation_percent =", value, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentNotEqualTo(Integer value) {
            addCriterion("forced_liquidation_percent <>", value, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentGreaterThan(Integer value) {
            addCriterion("forced_liquidation_percent >", value, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentGreaterThanOrEqualTo(Integer value) {
            addCriterion("forced_liquidation_percent >=", value, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentLessThan(Integer value) {
            addCriterion("forced_liquidation_percent <", value, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentLessThanOrEqualTo(Integer value) {
            addCriterion("forced_liquidation_percent <=", value, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentIn(List<Integer> values) {
            addCriterion("forced_liquidation_percent in", values, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentNotIn(List<Integer> values) {
            addCriterion("forced_liquidation_percent not in", values, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentBetween(Integer value1, Integer value2) {
            addCriterion("forced_liquidation_percent between", value1, value2, "forcedLiquidationPercent");
            return (Criteria) this;
        }

        public Criteria andForcedLiquidationPercentNotBetween(Integer value1, Integer value2) {
            addCriterion("forced_liquidation_percent not between", value1, value2, "forcedLiquidationPercent");
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