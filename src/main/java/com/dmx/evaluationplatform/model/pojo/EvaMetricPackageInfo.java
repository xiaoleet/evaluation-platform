package com.dmx.evaluationplatform.model.pojo;

import java.util.Date;

public class EvaMetricPackageInfo {
    private Long evaPackageId;

    private String description;

    private String business;

    private String product;

    private String interfaceEva;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public Long getEvaPackageId() {
        return evaPackageId;
    }

    public void setEvaPackageId(Long evaPackageId) {
        this.evaPackageId = evaPackageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
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