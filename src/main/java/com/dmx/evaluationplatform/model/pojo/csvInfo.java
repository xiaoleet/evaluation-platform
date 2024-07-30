package com.dmx.evaluationplatform.model.pojo;

import java.util.Date;

public class csvInfo {
    private Long csvInfoId;

    private Long evaDataId;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private String headerInfo;

    public Long getCsvInfoId() {
        return csvInfoId;
    }

    public void setCsvInfoId(Long csvInfoId) {
        this.csvInfoId = csvInfoId;
    }

    public Long getEvaDataId() {
        return evaDataId;
    }

    public void setEvaDataId(Long evaDataId) {
        this.evaDataId = evaDataId;
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

    public String getHeaderInfo() {
        return headerInfo;
    }

    public void setHeaderInfo(String headerInfo) {
        this.headerInfo = headerInfo == null ? null : headerInfo.trim();
    }
}