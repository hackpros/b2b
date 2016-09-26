package com.rabbit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.bean.MenuTree;

public class SysAdmin implements Serializable {
    private Long id;

    private String name;

    private String pwd;

    private String enabled;

    private String locked;

    private Date lockTime;

    private Date loginTime;

    private String mobile;

    private String email;

    private Integer loginFailureCount;

    private Long appendBy;

    private Long modifyBy;

    private Date appendTime;

    private Date modifyTime;

    private String salt;

    private Short status;

    private Integer pictureId;
    
    /**
     * 验证码
     */
    private String authCode;
    
    

	//private String userType; //用户类型
    private List<RoleSys> userRoles;//用户解角色关系
    private List<SysOrg> userOrgs;//用户组织关系
    private List<MenuTree> userMenus;
    
    private Integer orgId;
    
    
    public List<MenuTree> getUserMenus() {
		return userMenus;
	}

	public void setUserMenus(List<MenuTree> userMenus) {
		this.userMenus = userMenus;
	}

	public List<RoleSys> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<RoleSys> userRoles) {
		this.userRoles = userRoles;
	}

	public List<SysOrg> getUserOrgs() {
		return userOrgs;
	}

	public void setUserOrgs(List<SysOrg> userOrgs) {
		this.userOrgs = userOrgs;
	}

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public Date getLockTime() {
        return lockTime;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public Long getAppendBy() {
        return appendBy;
    }

    public void setAppendBy(Long appendBy) {
        this.appendBy = appendBy;
    }

    public Long getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getAppendTime() {
        return appendTime;
    }

    public void setAppendTime(Date appendTime) {
        this.appendTime = appendTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

	public Integer getOrgId() {
		return orgId;
	}

	public void setOrgId(Integer orgId) {
		this.orgId = orgId;
	}
    
    
}