package com.dmx.evaluationplatform.model.pojo;

import java.util.Date;

public class evaSceneTaskInfo {
    private Long sceneTaskId;

    private Long sceneId;

    private Long evaDataId;

    private Long metricPackageId;

    private String resultId;

    private Integer status;

    private String statusDescription;

    private Date startTime;

    private Date endTime;

    private String label;

    private Integer qps;

    private String hostA;

    private String hostB;

    private Integer count;

    private String executeBy;

    private Integer taskType;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public Long getSceneTaskId() {
        return sceneTaskId;
    }

    public void setSceneTaskId(Long sceneTaskId) {
        this.sceneTaskId = sceneTaskId;
    }

    public Long getSceneId() {
        return sceneId;
    }

    public void setSceneId(Long sceneId) {
        this.sceneId = sceneId;
    }

    public Long getEvaDataId() {
        return evaDataId;
    }

    public void setEvaDataId(Long evaDataId) {
        this.evaDataId = evaDataId;
    }

    public Long getMetricPackageId() {
        return metricPackageId;
    }

    public void setMetricPackageId(Long metricPackageId) {
        this.metricPackageId = metricPackageId;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription == null ? null : statusDescription.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getQps() {
        return qps;
    }

    public void setQps(Integer qps) {
        this.qps = qps;
    }

    public String getHostA() {
        return hostA;
    }

    public void setHostA(String hostA) {
        this.hostA = hostA == null ? null : hostA.trim();
    }

    public String getHostB() {
        return hostB;
    }

    public void setHostB(String hostB) {
        this.hostB = hostB == null ? null : hostB.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getExecuteBy() {
        return executeBy;
    }

    public void setExecuteBy(String executeBy) {
        this.executeBy = executeBy == null ? null : executeBy.trim();
    }

    public Integer getTaskType() {
        return taskType;
    }

    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}