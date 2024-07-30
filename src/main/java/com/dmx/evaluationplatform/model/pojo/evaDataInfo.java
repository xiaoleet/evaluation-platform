package com.dmx.evaluationplatform.model.pojo;

import java.util.Date;

public class evaDataInfo {
    private Long evaDataId;

    private String dataName;

    private Integer sliceNum;

    private String business;

    private String product;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Date expireTime;

    private Integer isDelete;

    private Long size;

    private String readableSize;

    private Long line;

    private Integer dataType;

    private Integer startIndex;

    private Integer page;

    private Integer pageSize;

    private String dataPaths;

    public Long getEvaDataId() {
        return evaDataId;
    }

    public void setEvaDataId(Long evaDataId) {
        this.evaDataId = evaDataId;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName == null ? null : dataName.trim();
    }

    public Integer getSliceNum() {
        return sliceNum;
    }

    public void setSliceNum(Integer sliceNum) {
        this.sliceNum = sliceNum;
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

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getReadableSize() {
        return readableSize;
    }

    public void setReadableSize(String readableSize) {
        this.readableSize = readableSize == null ? null : readableSize.trim();
    }

    public Long getLine() {
        return line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getDataPaths() {
        return dataPaths;
    }

    public void setDataPaths(String dataPaths) {
        this.dataPaths = dataPaths == null ? null : dataPaths.trim();
    }
}