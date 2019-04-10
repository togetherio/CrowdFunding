package com.fengbo.bean;

public class Relationship {
    private Integer rsId;

    private String rsName;

    public Integer getRsId() {
        return rsId;
    }

    public void setRsId(Integer rsId) {
        this.rsId = rsId;
    }

    public String getRsName() {
        return rsName;
    }

    public void setRsName(String rsName) {
        this.rsName = rsName == null ? null : rsName.trim();
    }
}