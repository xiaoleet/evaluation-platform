package com.dmx.evaluationplatform.model.pojo;

import java.util.Date;

public class EvaMetricInfo {
    private Long evaMetricId;

    private String busniess;

    private String product;

    private String interfaceEva;

    private String module;

    private String evaId;

    private String evaName;

    private Integer metricType;

    private Integer priority;

    private String category1;

    private String category2;

    private Double threadhold;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public Long getEvaMetricId() {
        return evaMetricId;
    }

    public void setEvaMetricId(Long evaMetricId) {
        this.evaMetricId = evaMetricId;
    }

    public String getBusniess() {
        return busniess;
    }

    public void setBusniess(String busniess) {
        this.busniess = busniess == null ? null : busniess.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getInterfaceEva() {
        return interfaceEva;
    }

    public void setInterfaceEva(String interfaceEva) {
        this.interfaceEva = interfaceEva == null ? null : interfaceEva.trim();
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getEvaId() {
        return evaId;
    }

    public void setEvaId(String evaId) {
        this.evaId = evaId == null ? null : evaId.trim();
    }

    public String getEvaName() {
        return evaName;
    }

    public void setEvaName(String evaName) {
        this.evaName = evaName == null ? null : evaName.trim();
    }

    public Integer getMetricType() {
        return metricType;
    }

    public void setMetricType(Integer metricType) {
        this.metricType = metricType;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getCategory1() {
        return category1;
    }

    public void setCategory1(String category1) {
        this.category1 = category1 == null ? null : category1.trim();
    }

    public String getCategory2() {
        return category2;
    }

    public void setCategory2(String category2) {
        this.category2 = category2 == null ? null : category2.trim();
    }

    public Double getThreadhold() {
        return threadhold;
    }

    public void setThreadhold(Double threadhold) {
        this.threadhold = threadhold;
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