package com.dmx.evaluationplatform.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaMetricInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaMetricInfoExample() {
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

        public Criteria andEvaMetricIdIsNull() {
            addCriterion("eva_metric_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdIsNotNull() {
            addCriterion("eva_metric_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdEqualTo(Long value) {
            addCriterion("eva_metric_id =", value, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdNotEqualTo(Long value) {
            addCriterion("eva_metric_id <>", value, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdGreaterThan(Long value) {
            addCriterion("eva_metric_id >", value, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdGreaterThanOrEqualTo(Long value) {
            addCriterion("eva_metric_id >=", value, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdLessThan(Long value) {
            addCriterion("eva_metric_id <", value, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdLessThanOrEqualTo(Long value) {
            addCriterion("eva_metric_id <=", value, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdIn(List<Long> values) {
            addCriterion("eva_metric_id in", values, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdNotIn(List<Long> values) {
            addCriterion("eva_metric_id not in", values, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdBetween(Long value1, Long value2) {
            addCriterion("eva_metric_id between", value1, value2, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andEvaMetricIdNotBetween(Long value1, Long value2) {
            addCriterion("eva_metric_id not between", value1, value2, "evaMetricId");
            return (Criteria) this;
        }

        public Criteria andBusniessIsNull() {
            addCriterion("busniess is null");
            return (Criteria) this;
        }

        public Criteria andBusniessIsNotNull() {
            addCriterion("busniess is not null");
            return (Criteria) this;
        }

        public Criteria andBusniessEqualTo(String value) {
            addCriterion("busniess =", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessNotEqualTo(String value) {
            addCriterion("busniess <>", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessGreaterThan(String value) {
            addCriterion("busniess >", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessGreaterThanOrEqualTo(String value) {
            addCriterion("busniess >=", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessLessThan(String value) {
            addCriterion("busniess <", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessLessThanOrEqualTo(String value) {
            addCriterion("busniess <=", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessLike(String value) {
            addCriterion("busniess like", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessNotLike(String value) {
            addCriterion("busniess not like", value, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessIn(List<String> values) {
            addCriterion("busniess in", values, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessNotIn(List<String> values) {
            addCriterion("busniess not in", values, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessBetween(String value1, String value2) {
            addCriterion("busniess between", value1, value2, "busniess");
            return (Criteria) this;
        }

        public Criteria andBusniessNotBetween(String value1, String value2) {
            addCriterion("busniess not between", value1, value2, "busniess");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaIsNull() {
            addCriterion("interface_eva is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaIsNotNull() {
            addCriterion("interface_eva is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaEqualTo(String value) {
            addCriterion("interface_eva =", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaNotEqualTo(String value) {
            addCriterion("interface_eva <>", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaGreaterThan(String value) {
            addCriterion("interface_eva >", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaGreaterThanOrEqualTo(String value) {
            addCriterion("interface_eva >=", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaLessThan(String value) {
            addCriterion("interface_eva <", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaLessThanOrEqualTo(String value) {
            addCriterion("interface_eva <=", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaLike(String value) {
            addCriterion("interface_eva like", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaNotLike(String value) {
            addCriterion("interface_eva not like", value, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaIn(List<String> values) {
            addCriterion("interface_eva in", values, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaNotIn(List<String> values) {
            addCriterion("interface_eva not in", values, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaBetween(String value1, String value2) {
            addCriterion("interface_eva between", value1, value2, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andInterfaceEvaNotBetween(String value1, String value2) {
            addCriterion("interface_eva not between", value1, value2, "interfaceEva");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("`module` is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("`module` is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("`module` =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("`module` <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("`module` >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("`module` >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("`module` <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("`module` <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("`module` like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("`module` not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("`module` in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("`module` not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("`module` between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("`module` not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andEvaIdIsNull() {
            addCriterion("eva_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaIdIsNotNull() {
            addCriterion("eva_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaIdEqualTo(String value) {
            addCriterion("eva_id =", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotEqualTo(String value) {
            addCriterion("eva_id <>", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdGreaterThan(String value) {
            addCriterion("eva_id >", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdGreaterThanOrEqualTo(String value) {
            addCriterion("eva_id >=", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdLessThan(String value) {
            addCriterion("eva_id <", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdLessThanOrEqualTo(String value) {
            addCriterion("eva_id <=", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdLike(String value) {
            addCriterion("eva_id like", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotLike(String value) {
            addCriterion("eva_id not like", value, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdIn(List<String> values) {
            addCriterion("eva_id in", values, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotIn(List<String> values) {
            addCriterion("eva_id not in", values, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdBetween(String value1, String value2) {
            addCriterion("eva_id between", value1, value2, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaIdNotBetween(String value1, String value2) {
            addCriterion("eva_id not between", value1, value2, "evaId");
            return (Criteria) this;
        }

        public Criteria andEvaNameIsNull() {
            addCriterion("eva_name is null");
            return (Criteria) this;
        }

        public Criteria andEvaNameIsNotNull() {
            addCriterion("eva_name is not null");
            return (Criteria) this;
        }

        public Criteria andEvaNameEqualTo(String value) {
            addCriterion("eva_name =", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotEqualTo(String value) {
            addCriterion("eva_name <>", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameGreaterThan(String value) {
            addCriterion("eva_name >", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameGreaterThanOrEqualTo(String value) {
            addCriterion("eva_name >=", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameLessThan(String value) {
            addCriterion("eva_name <", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameLessThanOrEqualTo(String value) {
            addCriterion("eva_name <=", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameLike(String value) {
            addCriterion("eva_name like", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotLike(String value) {
            addCriterion("eva_name not like", value, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameIn(List<String> values) {
            addCriterion("eva_name in", values, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotIn(List<String> values) {
            addCriterion("eva_name not in", values, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameBetween(String value1, String value2) {
            addCriterion("eva_name between", value1, value2, "evaName");
            return (Criteria) this;
        }

        public Criteria andEvaNameNotBetween(String value1, String value2) {
            addCriterion("eva_name not between", value1, value2, "evaName");
            return (Criteria) this;
        }

        public Criteria andMetricTypeIsNull() {
            addCriterion("metric_type is null");
            return (Criteria) this;
        }

        public Criteria andMetricTypeIsNotNull() {
            addCriterion("metric_type is not null");
            return (Criteria) this;
        }

        public Criteria andMetricTypeEqualTo(Integer value) {
            addCriterion("metric_type =", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotEqualTo(Integer value) {
            addCriterion("metric_type <>", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeGreaterThan(Integer value) {
            addCriterion("metric_type >", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("metric_type >=", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeLessThan(Integer value) {
            addCriterion("metric_type <", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeLessThanOrEqualTo(Integer value) {
            addCriterion("metric_type <=", value, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeIn(List<Integer> values) {
            addCriterion("metric_type in", values, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotIn(List<Integer> values) {
            addCriterion("metric_type not in", values, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeBetween(Integer value1, Integer value2) {
            addCriterion("metric_type between", value1, value2, "metricType");
            return (Criteria) this;
        }

        public Criteria andMetricTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("metric_type not between", value1, value2, "metricType");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCategory1IsNull() {
            addCriterion("category_1 is null");
            return (Criteria) this;
        }

        public Criteria andCategory1IsNotNull() {
            addCriterion("category_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1EqualTo(String value) {
            addCriterion("category_1 =", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotEqualTo(String value) {
            addCriterion("category_1 <>", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1GreaterThan(String value) {
            addCriterion("category_1 >", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1GreaterThanOrEqualTo(String value) {
            addCriterion("category_1 >=", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1LessThan(String value) {
            addCriterion("category_1 <", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1LessThanOrEqualTo(String value) {
            addCriterion("category_1 <=", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1Like(String value) {
            addCriterion("category_1 like", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotLike(String value) {
            addCriterion("category_1 not like", value, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1In(List<String> values) {
            addCriterion("category_1 in", values, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotIn(List<String> values) {
            addCriterion("category_1 not in", values, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1Between(String value1, String value2) {
            addCriterion("category_1 between", value1, value2, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory1NotBetween(String value1, String value2) {
            addCriterion("category_1 not between", value1, value2, "category1");
            return (Criteria) this;
        }

        public Criteria andCategory2IsNull() {
            addCriterion("category_2 is null");
            return (Criteria) this;
        }

        public Criteria andCategory2IsNotNull() {
            addCriterion("category_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2EqualTo(String value) {
            addCriterion("category_2 =", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotEqualTo(String value) {
            addCriterion("category_2 <>", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2GreaterThan(String value) {
            addCriterion("category_2 >", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2GreaterThanOrEqualTo(String value) {
            addCriterion("category_2 >=", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2LessThan(String value) {
            addCriterion("category_2 <", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2LessThanOrEqualTo(String value) {
            addCriterion("category_2 <=", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2Like(String value) {
            addCriterion("category_2 like", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotLike(String value) {
            addCriterion("category_2 not like", value, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2In(List<String> values) {
            addCriterion("category_2 in", values, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotIn(List<String> values) {
            addCriterion("category_2 not in", values, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2Between(String value1, String value2) {
            addCriterion("category_2 between", value1, value2, "category2");
            return (Criteria) this;
        }

        public Criteria andCategory2NotBetween(String value1, String value2) {
            addCriterion("category_2 not between", value1, value2, "category2");
            return (Criteria) this;
        }

        public Criteria andThreadholdIsNull() {
            addCriterion("threadhold is null");
            return (Criteria) this;
        }

        public Criteria andThreadholdIsNotNull() {
            addCriterion("threadhold is not null");
            return (Criteria) this;
        }

        public Criteria andThreadholdEqualTo(Double value) {
            addCriterion("threadhold =", value, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdNotEqualTo(Double value) {
            addCriterion("threadhold <>", value, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdGreaterThan(Double value) {
            addCriterion("threadhold >", value, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdGreaterThanOrEqualTo(Double value) {
            addCriterion("threadhold >=", value, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdLessThan(Double value) {
            addCriterion("threadhold <", value, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdLessThanOrEqualTo(Double value) {
            addCriterion("threadhold <=", value, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdIn(List<Double> values) {
            addCriterion("threadhold in", values, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdNotIn(List<Double> values) {
            addCriterion("threadhold not in", values, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdBetween(Double value1, Double value2) {
            addCriterion("threadhold between", value1, value2, "threadhold");
            return (Criteria) this;
        }

        public Criteria andThreadholdNotBetween(Double value1, Double value2) {
            addCriterion("threadhold not between", value1, value2, "threadhold");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
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

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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