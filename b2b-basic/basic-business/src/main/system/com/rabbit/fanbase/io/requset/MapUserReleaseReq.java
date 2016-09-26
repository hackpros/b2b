package com.rabbit.fanbase.io.requset;

import java.io.Serializable;

import com.rabbit.fanbase.io.response.SysOrgRes;

public class MapUserReleaseReq implements Serializable {
    private Long id;

    private Long sysAdminId;

    private String sysOrgCode;

    private String usrRoleCode;
    
    private SysOrgRes org;
    
    private RoleSysReq role;
    
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

	public SysOrgRes getOrg() {
		return org;
	}

	public void setOrg(SysOrgRes org) {
		this.org = org;
	}

	public RoleSysReq getRole() {
		return role;
	}

	public void setRole(RoleSysReq role) {
		this.role = role;
	}

	
    
    
}