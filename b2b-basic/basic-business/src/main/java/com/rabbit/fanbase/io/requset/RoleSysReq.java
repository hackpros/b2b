package com.rabbit.fanbase.io.requset;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.rabbit.fanbase.io.response.AuthFunRes;

public class RoleSysReq implements Serializable {
    private Long id;

    private String name;

    private String desc;

    private String code;

    private Integer category;

    private Short status;

    private Long appendBy;

    private Date appendTime;

    private Long modifyBy;

    private Date modifiedTime;

    private String remark;
    
    //用户角色对应的权限
    private List<AuthFunRes> roleAuths;
    

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
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

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
	public List<AuthFunRes> getRoleAuths() {
		return roleAuths;
	}

	public void setRoleAuths(List<AuthFunRes> roleAuths) {
		this.roleAuths = roleAuths;
	}
	
    
	
    
    
}