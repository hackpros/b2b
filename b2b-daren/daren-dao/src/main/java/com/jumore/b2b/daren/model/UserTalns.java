package com.jumore.b2b.daren.model;

import java.io.Serializable;
import java.util.Date;

public class UserTalns implements Serializable {
    private Long id;

    private Long talentUserId;

    private String toName;

    private String toMobile;

    private Long industryId;

    private Integer userType;

    private Long gainsBalance;

    private Date createTime;

    private Date registerTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTalentUserId() {
        return talentUserId;
    }

    public void setTalentUserId(Long talentUserId) {
        this.talentUserId = talentUserId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName == null ? null : toName.trim();
    }

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile == null ? null : toMobile.trim();
    }

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Long getGainsBalance() {
        return gainsBalance;
    }

    public void setGainsBalance(Long gainsBalance) {
        this.gainsBalance = gainsBalance;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserTalns other = (UserTalns) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTalentUserId() == null ? other.getTalentUserId() == null : this.getTalentUserId().equals(other.getTalentUserId()))
            && (this.getToName() == null ? other.getToName() == null : this.getToName().equals(other.getToName()))
            && (this.getToMobile() == null ? other.getToMobile() == null : this.getToMobile().equals(other.getToMobile()))
            && (this.getIndustryId() == null ? other.getIndustryId() == null : this.getIndustryId().equals(other.getIndustryId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getGainsBalance() == null ? other.getGainsBalance() == null : this.getGainsBalance().equals(other.getGainsBalance()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRegisterTime() == null ? other.getRegisterTime() == null : this.getRegisterTime().equals(other.getRegisterTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTalentUserId() == null) ? 0 : getTalentUserId().hashCode());
        result = prime * result + ((getToName() == null) ? 0 : getToName().hashCode());
        result = prime * result + ((getToMobile() == null) ? 0 : getToMobile().hashCode());
        result = prime * result + ((getIndustryId() == null) ? 0 : getIndustryId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getGainsBalance() == null) ? 0 : getGainsBalance().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRegisterTime() == null) ? 0 : getRegisterTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}