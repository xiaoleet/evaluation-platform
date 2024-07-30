package com.dmx.evaluationplatform.model.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EvaSceneTaskInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EvaSceneTaskInfoExample() {
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

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Long value) {
            addCriterion("scene_id =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Long value) {
            addCriterion("scene_id <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Long value) {
            addCriterion("scene_id >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scene_id >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Long value) {
            addCriterion("scene_id <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Long value) {
            addCriterion("scene_id <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Long> values) {
            addCriterion("scene_id in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Long> values) {
            addCriterion("scene_id not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Long value1, Long value2) {
            addCriterion("scene_id between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Long value1, Long value2) {
            addCriterion("scene_id not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdIsNull() {
            addCriterion("eva_data_id is null");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdIsNotNull() {
            addCriterion("eva_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdEqualTo(Long value) {
            addCriterion("eva_data_id =", value, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdNotEqualTo(Long value) {
            addCriterion("eva_data_id <>", value, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdGreaterThan(Long value) {
            addCriterion("eva_data_id >", value, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdGreaterThanOrEqualTo(Long value) {
            addCriterion("eva_data_id >=", value, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdLessThan(Long value) {
            addCriterion("eva_data_id <", value, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdLessThanOrEqualTo(Long value) {
            addCriterion("eva_data_id <=", value, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdIn(List<Long> values) {
            addCriterion("eva_data_id in", values, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdNotIn(List<Long> values) {
            addCriterion("eva_data_id not in", values, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdBetween(Long value1, Long value2) {
            addCriterion("eva_data_id between", value1, value2, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andEvaDataIdNotBetween(Long value1, Long value2) {
            addCriterion("eva_data_id not between", value1, value2, "evaDataId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdIsNull() {
            addCriterion("metric_package_id is null");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdIsNotNull() {
            addCriterion("metric_package_id is not null");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdEqualTo(Long value) {
            addCriterion("metric_package_id =", value, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdNotEqualTo(Long value) {
            addCriterion("metric_package_id <>", value, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdGreaterThan(Long value) {
            addCriterion("metric_package_id >", value, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("metric_package_id >=", value, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdLessThan(Long value) {
            addCriterion("metric_package_id <", value, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdLessThanOrEqualTo(Long value) {
            addCriterion("metric_package_id <=", value, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdIn(List<Long> values) {
            addCriterion("metric_package_id in", values, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdNotIn(List<Long> values) {
            addCriterion("metric_package_id not in", values, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdBetween(Long value1, Long value2) {
            addCriterion("metric_package_id between", value1, value2, "metricPackageId");
            return (Criteria) this;
        }

        public Criteria andMetricPackageIdNotBetween(Long value1, Long value2) {
            addCriterion("metric_package_id not between", value1, value2, "metricPackageId");
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionIsNull() {
            addCriterion("status_description is null");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionIsNotNull() {
            addCriterion("status_description is not null");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionEqualTo(String value) {
            addCriterion("status_description =", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotEqualTo(String value) {
            addCriterion("status_description <>", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionGreaterThan(String value) {
            addCriterion("status_description >", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("status_description >=", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionLessThan(String value) {
            addCriterion("status_description <", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionLessThanOrEqualTo(String value) {
            addCriterion("status_description <=", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionLike(String value) {
            addCriterion("status_description like", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotLike(String value) {
            addCriterion("status_description not like", value, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionIn(List<String> values) {
            addCriterion("status_description in", values, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotIn(List<String> values) {
            addCriterion("status_description not in", values, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionBetween(String value1, String value2) {
            addCriterion("status_description between", value1, value2, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStatusDescriptionNotBetween(String value1, String value2) {
            addCriterion("status_description not between", value1, value2, "statusDescription");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("`label` is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("`label` is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("`label` =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("`label` <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("`label` >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("`label` >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("`label` <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("`label` <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("`label` like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("`label` not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("`label` in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("`label` not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("`label` between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("`label` not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andQpsIsNull() {
            addCriterion("QPS is null");
            return (Criteria) this;
        }

        public Criteria andQpsIsNotNull() {
            addCriterion("QPS is not null");
            return (Criteria) this;
        }

        public Criteria andQpsEqualTo(Integer value) {
            addCriterion("QPS =", value, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsNotEqualTo(Integer value) {
            addCriterion("QPS <>", value, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsGreaterThan(Integer value) {
            addCriterion("QPS >", value, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsGreaterThanOrEqualTo(Integer value) {
            addCriterion("QPS >=", value, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsLessThan(Integer value) {
            addCriterion("QPS <", value, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsLessThanOrEqualTo(Integer value) {
            addCriterion("QPS <=", value, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsIn(List<Integer> values) {
            addCriterion("QPS in", values, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsNotIn(List<Integer> values) {
            addCriterion("QPS not in", values, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsBetween(Integer value1, Integer value2) {
            addCriterion("QPS between", value1, value2, "qps");
            return (Criteria) this;
        }

        public Criteria andQpsNotBetween(Integer value1, Integer value2) {
            addCriterion("QPS not between", value1, value2, "qps");
            return (Criteria) this;
        }

        public Criteria andHostAIsNull() {
            addCriterion("host_a is null");
            return (Criteria) this;
        }

        public Criteria andHostAIsNotNull() {
            addCriterion("host_a is not null");
            return (Criteria) this;
        }

        public Criteria andHostAEqualTo(String value) {
            addCriterion("host_a =", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostANotEqualTo(String value) {
            addCriterion("host_a <>", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostAGreaterThan(String value) {
            addCriterion("host_a >", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostAGreaterThanOrEqualTo(String value) {
            addCriterion("host_a >=", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostALessThan(String value) {
            addCriterion("host_a <", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostALessThanOrEqualTo(String value) {
            addCriterion("host_a <=", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostALike(String value) {
            addCriterion("host_a like", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostANotLike(String value) {
            addCriterion("host_a not like", value, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostAIn(List<String> values) {
            addCriterion("host_a in", values, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostANotIn(List<String> values) {
            addCriterion("host_a not in", values, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostABetween(String value1, String value2) {
            addCriterion("host_a between", value1, value2, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostANotBetween(String value1, String value2) {
            addCriterion("host_a not between", value1, value2, "hostA");
            return (Criteria) this;
        }

        public Criteria andHostBIsNull() {
            addCriterion("host_b is null");
            return (Criteria) this;
        }

        public Criteria andHostBIsNotNull() {
            addCriterion("host_b is not null");
            return (Criteria) this;
        }

        public Criteria andHostBEqualTo(String value) {
            addCriterion("host_b =", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBNotEqualTo(String value) {
            addCriterion("host_b <>", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBGreaterThan(String value) {
            addCriterion("host_b >", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBGreaterThanOrEqualTo(String value) {
            addCriterion("host_b >=", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBLessThan(String value) {
            addCriterion("host_b <", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBLessThanOrEqualTo(String value) {
            addCriterion("host_b <=", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBLike(String value) {
            addCriterion("host_b like", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBNotLike(String value) {
            addCriterion("host_b not like", value, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBIn(List<String> values) {
            addCriterion("host_b in", values, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBNotIn(List<String> values) {
            addCriterion("host_b not in", values, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBBetween(String value1, String value2) {
            addCriterion("host_b between", value1, value2, "hostB");
            return (Criteria) this;
        }

        public Criteria andHostBNotBetween(String value1, String value2) {
            addCriterion("host_b not between", value1, value2, "hostB");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("`count` is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("`count` is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("`count` =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("`count` <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("`count` >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("`count` >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("`count` <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("`count` <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("`count` in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("`count` not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("`count` between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("`count` not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andExecuteByIsNull() {
            addCriterion("execute_by is null");
            return (Criteria) this;
        }

        public Criteria andExecuteByIsNotNull() {
            addCriterion("execute_by is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteByEqualTo(String value) {
            addCriterion("execute_by =", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByNotEqualTo(String value) {
            addCriterion("execute_by <>", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByGreaterThan(String value) {
            addCriterion("execute_by >", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByGreaterThanOrEqualTo(String value) {
            addCriterion("execute_by >=", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByLessThan(String value) {
            addCriterion("execute_by <", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByLessThanOrEqualTo(String value) {
            addCriterion("execute_by <=", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByLike(String value) {
            addCriterion("execute_by like", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByNotLike(String value) {
            addCriterion("execute_by not like", value, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByIn(List<String> values) {
            addCriterion("execute_by in", values, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByNotIn(List<String> values) {
            addCriterion("execute_by not in", values, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByBetween(String value1, String value2) {
            addCriterion("execute_by between", value1, value2, "executeBy");
            return (Criteria) this;
        }

        public Criteria andExecuteByNotBetween(String value1, String value2) {
            addCriterion("execute_by not between", value1, value2, "executeBy");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(Integer value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(Integer value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(Integer value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(Integer value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(Integer value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<Integer> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<Integer> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(Integer value1, Integer value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
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