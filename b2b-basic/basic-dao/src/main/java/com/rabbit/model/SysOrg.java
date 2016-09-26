package com.rabbit.model;

import java.io.Serializable;
import java.util.Date;

public class SysOrg implements Serializable {
    private Integer id;

    private Long appendBy;

    private Date appendTime;

    private Integer status;

    private Long modifyBy;

    private Date modifyTime;

    private Integer parentId;

    private String name;

    private String nameEn;

    private String desc;

    private Integer ladder;

    private Integer sort;

    private static final long serialVersionUID = 1L;
    
    public SysOrg(){
    	
    }
    public SysOrg(Integer id){
    	this.id=id;
    }	
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getAppendBy() {
        return appendBy;
    }

    public void setAppendBy(Long appendBy) {
        this.appendBy = appendBy;
    }

    public Date getAppendTime() {
        return appendTime;
    }

    public void setAppendTime(Date appendTime) {
        this.appendTime = appendTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLadder() {
        return ladder;
    }

    public void setLadder(Integer ladder) {
        this.ladder = ladder;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}