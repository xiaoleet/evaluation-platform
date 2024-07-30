package com.dmx.evaluationplatform.model.pojo;

public class evaResult {
    private Long id;

    private Long sceneTaskId;

    private String resultId;

    private String patrolVersion;

    private String moduleName;

    private String cnModuleName;

    private String strategyCode;

    private String strategyName;

    private String cnStrategyName;

    private Byte priority;

    private Boolean isStages;

    private Double hitVolume;

    private Double hitRate;

    private Integer topK;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSceneTaskId() {
        return sceneTaskId;
    }

    public void setSceneTaskId(Long sceneTaskId) {
        this.sceneTaskId = sceneTaskId;
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    public String getPatrolVersion() {
        return patrolVersion;
    }

    public void setPatrolVersion(String patrolVersion) {
        this.patrolVersion = patrolVersion == null ? null : patrolVersion.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getCnModuleName() {
        return cnModuleName;
    }

    public void setCnModuleName(String cnModuleName) {
        this.cnModuleName = cnModuleName == null ? null : cnModuleName.trim();
    }

    public String getStrategyCode() {
        return strategyCode;
    }

    public void setStrategyCode(String strategyCode) {
        this.strategyCode = strategyCode == null ? null : strategyCode.trim();
    }

    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName == null ? null : strategyName.trim();
    }

    public String getCnStrategyName() {
        return cnStrategyName;
    }

    public void setCnStrategyName(String cnStrategyName) {
        this.cnStrategyName = cnStrategyName == null ? null : cnStrategyName.trim();
    }

    public Byte getPriority() {
        return priority;
    }

    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    public Boolean getIsStages() {
        return isStages;
    }

    public void setIsStages(Boolean isStages) {
        this.isStages = isStages;
    }

    public Double getHitVolume() {
        return hitVolume;
    }

    public void setHitVolume(Double hitVolume) {
        this.hitVolume = hitVolume;
    }

    public Double getHitRate() {
        return hitRate;
    }

    public void setHitRate(Double hitRate) {
        this.hitRate = hitRate;
    }

    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }
}