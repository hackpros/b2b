package com.rabbit.fanbase.io.response;

import java.io.Serializable;

import com.rabbit.model.RoleSys;

public class MapUserReleaseRes implements Serializable {
    private Long id;

    private Long sysAdminId;

    private String sysOrgCode;

    private String usrRoleCode;
    
    private SysOrgRes org;
    
    private RoleSys role;
    
	private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSysAdminId() {
        return sysAdminId;
    }

    public void setSysAdminId(Long sysAdminId) {
        this.sysAdminId = sysAdminId;
    }

    public String getSysOrgCode() {
        return sysOrgCode;
    }

    public void setSysOrgCode(String sysOrgCode) {
        this.sysOrgCode = sysOrgCode;
    }

    public String getUsrRoleCode() {
        return usrRoleCode;
    }

    public void setUsrRoleCode(String usrRoleCode) {
        this.usrRoleCode = usrRoleCode;
    }

	public RoleSys getRole() {
		return role;
	}

	public void setRole(RoleSys role) {
		this.role = role;
	}

	public SysOrgRes getOrg() {
		return org;
	}

	public void setOrg(SysOrgRes org) {
		this.org = org;
	}
    
    
}