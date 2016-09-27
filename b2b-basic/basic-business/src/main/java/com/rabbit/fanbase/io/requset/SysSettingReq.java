package com.rabbit.fanbase.io.requset;

import java.io.Serializable;

public class SysSettingReq implements Serializable {
    private String id;

    private String key;

    private String attribute;

    private String category;

    private Integer sqrt;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getSqrt() {
        return sqrt;
    }

    public void setSqrt(Integer sqrt) {
        this.sqrt = sqrt;
    }
}