package com.rabbit.model;

import java.io.Serializable;
import java.util.Date;

public class SysModel implements Serializable {
    private Long id;

    private Long parentId;

    private int ladder;

    private String modelCode;

    private String name;

    private String keyword;

    private String prefix;

    private Short status;

    private Date appendBy;

    private String desc;

    private static final long serialVersionUID = 1L;

    public SysModel(){
    	
    }
    public SysModel(Long id){
    	this.id=id;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public int getLadder() {
        return ladder;
    }

    public void setLadder(int ladder) {
        this.ladder = ladder;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getAppendBy() {
        return appendBy;
    }

    public void setAppendBy(Date appendBy) {
        this.appendBy = appendBy;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}