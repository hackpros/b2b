/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * AppCustomerReq.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-30 Created
 */
package com.jumore.b2b.activity.service.business.io.request;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.jumore.b2b.activity.service.business.io.Validation.AppCustomeConst;

public class AppCustomerReq implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 外部标识
     */
    @NotNull(message = "外部标识不能为空")
    @Pattern(regexp = "^(?![0-9]+$)[0-9A-Za-z\u0391-\uFFE5]{4,16}$", message = "用户名格式不正确",groups = AppCustomeConst.CreateValidation.class)
    private String outerInner;

    /**
     * 外部描述
     */
    private String outerDesc;

    /**
     * 企业名称
     */
    private String corpName;

    /**
     * 企业代码
     */
    private String corpCode;

    /**
     * 企业信息
     */
    private String corpInfo;

    /**
     * 加入时间
     */
    private Date appendBy;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOuterInner() {
        return outerInner;
    }

    public void setOuterInner(String outerInner) {
        this.outerInner = outerInner == null ? null : outerInner.trim();
    }

    public String getOuterDesc() {
        return outerDesc;
    }

    public void setOuterDesc(String outerDesc) {
        this.outerDesc = outerDesc == null ? null : outerDesc.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode == null ? null : corpCode.trim();
    }

    public String getCorpInfo() {
        return corpInfo;
    }

    public void setCorpInfo(String corpInfo) {
        this.corpInfo = corpInfo == null ? null : corpInfo.trim();
    }

    public Date getAppendBy() {
        return appendBy;
    }

    public void setAppendBy(Date appendBy) {
        this.appendBy = appendBy;
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
        AppCustomerReq other = (AppCustomerReq) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOuterInner() == null ? other.getOuterInner() == null : this.getOuterInner().equals(other.getOuterInner()))
            && (this.getOuterDesc() == null ? other.getOuterDesc() == null : this.getOuterDesc().equals(other.getOuterDesc()))
            && (this.getCorpName() == null ? other.getCorpName() == null : this.getCorpName().equals(other.getCorpName()))
            && (this.getCorpCode() == null ? other.getCorpCode() == null : this.getCorpCode().equals(other.getCorpCode()))
            && (this.getCorpInfo() == null ? other.getCorpInfo() == null : this.getCorpInfo().equals(other.getCorpInfo()))
            && (this.getAppendBy() == null ? other.getAppendBy() == null : this.getAppendBy().equals(other.getAppendBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOuterInner() == null) ? 0 : getOuterInner().hashCode());
        result = prime * result + ((getOuterDesc() == null) ? 0 : getOuterDesc().hashCode());
        result = prime * result + ((getCorpName() == null) ? 0 : getCorpName().hashCode());
        result = prime * result + ((getCorpCode() == null) ? 0 : getCorpCode().hashCode());
        result = prime * result + ((getCorpInfo() == null) ? 0 : getCorpInfo().hashCode());
        result = prime * result + ((getAppendBy() == null) ? 0 : getAppendBy().hashCode());
        return result;
    }
}