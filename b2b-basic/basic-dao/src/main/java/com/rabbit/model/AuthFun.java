package com.rabbit.model;

import java.util.Date;

public class AuthFun  {
	private Long id;

	private String code;

	private String name;

	private String desc;

	private String modelCode;

	private String selfCode;

	private String requestUrl;

	private Short sort;

	private Short status;

	private Long appendBy;

	private Date appendTime;

	private Long modifyBy;

	private Date modifyTime;

	private String remark;


	public AuthFun(Long pk) {
		this.id = pk;
	}

	public AuthFun() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public String getSelfCode() {
		return selfCode;
	}

	public void setSelfCode(String selfCode) {
		this.selfCode = selfCode;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public Short getSort() {
		return sort;
	}

	public void setSort(Short sort) {
		this.sort = sort;
	}

	public Short getStatus() {
		return status;
	}

	public void setStatus(Short status) {
		this.status = status;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}