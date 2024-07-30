package com.dmx.evaluationplatform.model.pojo;

public class evaMetricInfoWithBLOBs extends evaMetricInfo {
    private String description;

    private String pattern;

    private String caclDescription;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern == null ? null : pattern.trim();
    }

    public String getCaclDescription() {
        return caclDescription;
    }

    public void setCaclDescription(String caclDescription) {
        this.caclDescription = caclDescription == null ? null : caclDescription.trim();
    }
}