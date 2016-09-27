package com.rabbit.model;

import java.io.Serializable;
import java.util.Date;

public class SysRoleKey implements Serializable {
    private Long id;

    private Short roleAccType;

    private Long authUserId;

    private Short status;

    private Date createTime;

    private Long modifyBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getRoleAccType() {
        return roleAccType;
    }

    public void setRoleAccType(Short roleAccType) {
        this.roleAccType = roleAccType;
    }

    public Long getAuthUserId() {
        return authUserId;
    }

    public void setAuthUserId(Long authUserId) {
        this.authUserId = authUserId;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }
}