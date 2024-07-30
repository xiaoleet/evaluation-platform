package com.dmx.evaluationplatform.model.pojo;

import java.util.ArrayList;
import java.util.List;

public class EvaResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaResultExample() {
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

        public Criteria andSceneTaskIdIsNull() {
            addCriterion("scene_task_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdIsNotNull() {
            addCriterion("scene_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdEqualTo(Long value) {
            addCriterion("scene_task_id =", value, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdNotEqualTo(Long value) {
            addCriterion("scene_task_id <>", value, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdGreaterThan(Long value) {
            addCriterion("scene_task_id >", value, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scene_task_id >=", value, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdLessThan(Long value) {
            addCriterion("scene_task_id <", value, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("scene_task_id <=", value, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdIn(List<Long> values) {
            addCriterion("scene_task_id in", values, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdNotIn(List<Long> values) {
            addCriterion("scene_task_id not in", values, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdBetween(Long value1, Long value2) {
            addCriterion("scene_task_id between", value1, value2, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andSceneTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("scene_task_id not between", value1, value2, "sceneTaskId");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNull() {
            addCriterion("result_id is null");
            return (Criteria) this;
        }

        public Criteria andResultIdIsNotNull() {
            addCriterion("result_id is not null");
            return (Criteria) this;
        }

        public Criteria andResultIdEqualTo(String value) {
            addCriterion("result_id =", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotEqualTo(String value) {
            addCriterion("result_id <>", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThan(String value) {
            addCriterion("result_id >", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdGreaterThanOrEqualTo(String value) {
            addCriterion("result_id >=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThan(String value) {
            addCriterion("result_id <", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLessThanOrEqualTo(String value) {
            addCriterion("result_id <=", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdLike(String value) {
            addCriterion("result_id like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotLike(String value) {
            addCriterion("result_id not like", value, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdIn(List<String> values) {
            addCriterion("result_id in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotIn(List<String> values) {
            addCriterion("result_id not in", values, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdBetween(String value1, String value2) {
            addCriterion("result_id between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andResultIdNotBetween(String value1, String value2) {
            addCriterion("result_id not between", value1, value2, "resultId");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionIsNull() {
            addCriterion("patrol_version is null");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionIsNotNull() {
            addCriterion("patrol_version is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionEqualTo(String value) {
            addCriterion("patrol_version =", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionNotEqualTo(String value) {
            addCriterion("patrol_version <>", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionGreaterThan(String value) {
            addCriterion("patrol_version >", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionGreaterThanOrEqualTo(String value) {
            addCriterion("patrol_version >=", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionLessThan(String value) {
            addCriterion("patrol_version <", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionLessThanOrEqualTo(String value) {
            addCriterion("patrol_version <=", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionLike(String value) {
            addCriterion("patrol_version like", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionNotLike(String value) {
            addCriterion("patrol_version not like", value, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionIn(List<String> values) {
            addCriterion("patrol_version in", values, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionNotIn(List<String> values) {
            addCriterion("patrol_version not in", values, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionBetween(String value1, String value2) {
            addCriterion("patrol_version between", value1, value2, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andPatrolVersionNotBetween(String value1, String value2) {
            addCriterion("patrol_version not between", value1, value2, "patrolVersion");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNull() {
            addCriterion("module_name is null");
            return (Criteria) this;
        }

        public Criteria andModuleNameIsNotNull() {
            addCriterion("module_name is not null");
            return (Criteria) this;
        }

        public Criteria andModuleNameEqualTo(String value) {
            addCriterion("module_name =", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotEqualTo(String value) {
            addCriterion("module_name <>", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThan(String value) {
            addCriterion("module_name >", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("module_name >=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThan(String value) {
            addCriterion("module_name <", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLessThanOrEqualTo(String value) {
            addCriterion("module_name <=", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameLike(String value) {
            addCriterion("module_name like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotLike(String value) {
            addCriterion("module_name not like", value, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameIn(List<String> values) {
            addCriterion("module_name in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotIn(List<String> values) {
            addCriterion("module_name not in", values, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameBetween(String value1, String value2) {
            addCriterion("module_name between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andModuleNameNotBetween(String value1, String value2) {
            addCriterion("module_name not between", value1, value2, "moduleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameIsNull() {
            addCriterion("cn_module_name is null");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameIsNotNull() {
            addCriterion("cn_module_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameEqualTo(String value) {
            addCriterion("cn_module_name =", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameNotEqualTo(String value) {
            addCriterion("cn_module_name <>", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameGreaterThan(String value) {
            addCriterion("cn_module_name >", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_module_name >=", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameLessThan(String value) {
            addCriterion("cn_module_name <", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameLessThanOrEqualTo(String value) {
            addCriterion("cn_module_name <=", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameLike(String value) {
            addCriterion("cn_module_name like", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameNotLike(String value) {
            addCriterion("cn_module_name not like", value, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameIn(List<String> values) {
            addCriterion("cn_module_name in", values, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameNotIn(List<String> values) {
            addCriterion("cn_module_name not in", values, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameBetween(String value1, String value2) {
            addCriterion("cn_module_name between", value1, value2, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andCnModuleNameNotBetween(String value1, String value2) {
            addCriterion("cn_module_name not between", value1, value2, "cnModuleName");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeIsNull() {
            addCriterion("strategy_code is null");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeIsNotNull() {
            addCriterion("strategy_code is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeEqualTo(String value) {
            addCriterion("strategy_code =", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeNotEqualTo(String value) {
            addCriterion("strategy_code <>", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeGreaterThan(String value) {
            addCriterion("strategy_code >", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_code >=", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeLessThan(String value) {
            addCriterion("strategy_code <", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeLessThanOrEqualTo(String value) {
            addCriterion("strategy_code <=", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeLike(String value) {
            addCriterion("strategy_code like", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeNotLike(String value) {
            addCriterion("strategy_code not like", value, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeIn(List<String> values) {
            addCriterion("strategy_code in", values, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeNotIn(List<String> values) {
            addCriterion("strategy_code not in", values, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeBetween(String value1, String value2) {
            addCriterion("strategy_code between", value1, value2, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyCodeNotBetween(String value1, String value2) {
            addCriterion("strategy_code not between", value1, value2, "strategyCode");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIsNull() {
            addCriterion("strategy_name is null");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIsNotNull() {
            addCriterion("strategy_name is not null");
            return (Criteria) this;
        }

        public Criteria andStrategyNameEqualTo(String value) {
            addCriterion("strategy_name =", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotEqualTo(String value) {
            addCriterion("strategy_name <>", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameGreaterThan(String value) {
            addCriterion("strategy_name >", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameGreaterThanOrEqualTo(String value) {
            addCriterion("strategy_name >=", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLessThan(String value) {
            addCriterion("strategy_name <", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLessThanOrEqualTo(String value) {
            addCriterion("strategy_name <=", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameLike(String value) {
            addCriterion("strategy_name like", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotLike(String value) {
            addCriterion("strategy_name not like", value, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameIn(List<String> values) {
            addCriterion("strategy_name in", values, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotIn(List<String> values) {
            addCriterion("strategy_name not in", values, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameBetween(String value1, String value2) {
            addCriterion("strategy_name between", value1, value2, "strategyName");
            return (Criteria) this;
        }

        public Criteria andStrategyNameNotBetween(String value1, String value2) {
            addCriterion("strategy_name not between", value1, value2, "strategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameIsNull() {
            addCriterion("cn_strategy_name is null");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameIsNotNull() {
            addCriterion("cn_strategy_name is not null");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameEqualTo(String value) {
            addCriterion("cn_strategy_name =", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameNotEqualTo(String value) {
            addCriterion("cn_strategy_name <>", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameGreaterThan(String value) {
            addCriterion("cn_strategy_name >", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameGreaterThanOrEqualTo(String value) {
            addCriterion("cn_strategy_name >=", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameLessThan(String value) {
            addCriterion("cn_strategy_name <", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameLessThanOrEqualTo(String value) {
            addCriterion("cn_strategy_name <=", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameLike(String value) {
            addCriterion("cn_strategy_name like", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameNotLike(String value) {
            addCriterion("cn_strategy_name not like", value, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameIn(List<String> values) {
            addCriterion("cn_strategy_name in", values, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameNotIn(List<String> values) {
            addCriterion("cn_strategy_name not in", values, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameBetween(String value1, String value2) {
            addCriterion("cn_strategy_name between", value1, value2, "cnStrategyName");
            return (Criteria) this;
        }

        public Criteria andCnStrategyNameNotBetween(String value1, String value2) {
            addCriterion("cn_strategy_name not between", value1, value2, "cnStrategyName");
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

        public Criteria andPriorityEqualTo(Byte value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Byte value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Byte value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Byte value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Byte value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Byte value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Byte> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Byte> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Byte value1, Byte value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Byte value1, Byte value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andIsStagesIsNull() {
            addCriterion("is_stages is null");
            return (Criteria) this;
        }

        public Criteria andIsStagesIsNotNull() {
            addCriterion("is_stages is not null");
            return (Criteria) this;
        }

        public Criteria andIsStagesEqualTo(Boolean value) {
            addCriterion("is_stages =", value, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesNotEqualTo(Boolean value) {
            addCriterion("is_stages <>", value, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesGreaterThan(Boolean value) {
            addCriterion("is_stages >", value, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_stages >=", value, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesLessThan(Boolean value) {
            addCriterion("is_stages <", value, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesLessThanOrEqualTo(Boolean value) {
            addCriterion("is_stages <=", value, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesIn(List<Boolean> values) {
            addCriterion("is_stages in", values, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesNotIn(List<Boolean> values) {
            addCriterion("is_stages not in", values, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesBetween(Boolean value1, Boolean value2) {
            addCriterion("is_stages between", value1, value2, "isStages");
            return (Criteria) this;
        }

        public Criteria andIsStagesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_stages not between", value1, value2, "isStages");
            return (Criteria) this;
        }

        public Criteria andHitVolumeIsNull() {
            addCriterion("hit_volume is null");
            return (Criteria) this;
        }

        public Criteria andHitVolumeIsNotNull() {
            addCriterion("hit_volume is not null");
            return (Criteria) this;
        }

        public Criteria andHitVolumeEqualTo(Double value) {
            addCriterion("hit_volume =", value, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeNotEqualTo(Double value) {
            addCriterion("hit_volume <>", value, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeGreaterThan(Double value) {
            addCriterion("hit_volume >", value, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("hit_volume >=", value, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeLessThan(Double value) {
            addCriterion("hit_volume <", value, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeLessThanOrEqualTo(Double value) {
            addCriterion("hit_volume <=", value, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeIn(List<Double> values) {
            addCriterion("hit_volume in", values, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeNotIn(List<Double> values) {
            addCriterion("hit_volume not in", values, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeBetween(Double value1, Double value2) {
            addCriterion("hit_volume between", value1, value2, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitVolumeNotBetween(Double value1, Double value2) {
            addCriterion("hit_volume not between", value1, value2, "hitVolume");
            return (Criteria) this;
        }

        public Criteria andHitRateIsNull() {
            addCriterion("hit_rate is null");
            return (Criteria) this;
        }

        public Criteria andHitRateIsNotNull() {
            addCriterion("hit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHitRateEqualTo(Double value) {
            addCriterion("hit_rate =", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateNotEqualTo(Double value) {
            addCriterion("hit_rate <>", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateGreaterThan(Double value) {
            addCriterion("hit_rate >", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateGreaterThanOrEqualTo(Double value) {
            addCriterion("hit_rate >=", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateLessThan(Double value) {
            addCriterion("hit_rate <", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateLessThanOrEqualTo(Double value) {
            addCriterion("hit_rate <=", value, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateIn(List<Double> values) {
            addCriterion("hit_rate in", values, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateNotIn(List<Double> values) {
            addCriterion("hit_rate not in", values, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateBetween(Double value1, Double value2) {
            addCriterion("hit_rate between", value1, value2, "hitRate");
            return (Criteria) this;
        }

        public Criteria andHitRateNotBetween(Double value1, Double value2) {
            addCriterion("hit_rate not between", value1, value2, "hitRate");
            return (Criteria) this;
        }

        public Criteria andTopKIsNull() {
            addCriterion("top_k is null");
            return (Criteria) this;
        }

        public Criteria andTopKIsNotNull() {
            addCriterion("top_k is not null");
            return (Criteria) this;
        }

        public Criteria andTopKEqualTo(Integer value) {
            addCriterion("top_k =", value, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKNotEqualTo(Integer value) {
            addCriterion("top_k <>", value, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKGreaterThan(Integer value) {
            addCriterion("top_k >", value, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_k >=", value, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKLessThan(Integer value) {
            addCriterion("top_k <", value, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKLessThanOrEqualTo(Integer value) {
            addCriterion("top_k <=", value, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKIn(List<Integer> values) {
            addCriterion("top_k in", values, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKNotIn(List<Integer> values) {
            addCriterion("top_k not in", values, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKBetween(Integer value1, Integer value2) {
            addCriterion("top_k between", value1, value2, "topK");
            return (Criteria) this;
        }

        public Criteria andTopKNotBetween(Integer value1, Integer value2) {
            addCriterion("top_k not between", value1, value2, "topK");
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