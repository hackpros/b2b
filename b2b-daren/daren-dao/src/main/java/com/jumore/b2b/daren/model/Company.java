package com.jumore.b2b.daren.model;

import java.io.Serializable;
import java.util.Date;

public class Company implements Serializable {
    private Long id;

    private String companyName;

    private Date applyTime;

    private Date audioTime;

    private String licenseNo;

    private Long country;

    private Long area;

    private String address;

    private String linkMan;

    private String linkManJob;

    private String linkPhone;

    private String linkMobile;

    private String linkFax;

    private String linkEmail;

    private String deleteFlag;

    private Long serviceLevel;

    private String shortName;

    private String remark;

    private String dataSource;

    private String orgCode;

    private String codeStatus;

    private String identity;

    private Integer pdDealOrders;

    private String pdCompanyType;

    private String logoUrl;

    private String languageCode;

    private Date createTime;

    private Long createId;

    private Date updateTime;

    private Long updateId;

    private Long checkUserId;

    private Long punishUserId;

    private Date punishTime;

    private Date punishTimeFrom;

    private Date punishTimeTo;

    private String punishRemark;

    private String status;

    private Integer falseOrders;

    private Integer endOrders;

    private String idType;

    private String idNumber;

    private String website;

    private String legalPerson;

    private Long totalStaff;

    private String registeredAddress;

    private String openingBank;

    private String branchBank;

    private String accountBank;

    private String taxTypes;

    private String invoiceType;

    private String vatRate;

    private Date registerDate;

    private Date expiryDate;

    private String creditCode;

    private String businessScope;

    private String legalPhone;

    private String industry;

    private Integer score;

    private String gradeReason;

    private Double kpi;

    private String foreignId;

    private String enterpriseType;

    private String createUserType;

    private String companyIntroduces;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getAudioTime() {
        return audioTime;
    }

    public void setAudioTime(Date audioTime) {
        this.audioTime = audioTime;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo == null ? null : licenseNo.trim();
    }

    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    public String getLinkManJob() {
        return linkManJob;
    }

    public void setLinkManJob(String linkManJob) {
        this.linkManJob = linkManJob == null ? null : linkManJob.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getLinkMobile() {
        return linkMobile;
    }

    public void setLinkMobile(String linkMobile) {
        this.linkMobile = linkMobile == null ? null : linkMobile.trim();
    }

    public String getLinkFax() {
        return linkFax;
    }

    public void setLinkFax(String linkFax) {
        this.linkFax = linkFax == null ? null : linkFax.trim();
    }

    public String getLinkEmail() {
        return linkEmail;
    }

    public void setLinkEmail(String linkEmail) {
        this.linkEmail = linkEmail == null ? null : linkEmail.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Long getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(Long serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource == null ? null : dataSource.trim();
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getCodeStatus() {
        return codeStatus;
    }

    public void setCodeStatus(String codeStatus) {
        this.codeStatus = codeStatus == null ? null : codeStatus.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Integer getPdDealOrders() {
        return pdDealOrders;
    }

    public void setPdDealOrders(Integer pdDealOrders) {
        this.pdDealOrders = pdDealOrders;
    }

    public String getPdCompanyType() {
        return pdCompanyType;
    }

    public void setPdCompanyType(String pdCompanyType) {
        this.pdCompanyType = pdCompanyType == null ? null : pdCompanyType.trim();
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl == null ? null : logoUrl.trim();
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode == null ? null : languageCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

    public Long getPunishUserId() {
        return punishUserId;
    }

    public void setPunishUserId(Long punishUserId) {
        this.punishUserId = punishUserId;
    }

    public Date getPunishTime() {
        return punishTime;
    }

    public void setPunishTime(Date punishTime) {
        this.punishTime = punishTime;
    }

    public Date getPunishTimeFrom() {
        return punishTimeFrom;
    }

    public void setPunishTimeFrom(Date punishTimeFrom) {
        this.punishTimeFrom = punishTimeFrom;
    }

    public Date getPunishTimeTo() {
        return punishTimeTo;
    }

    public void setPunishTimeTo(Date punishTimeTo) {
        this.punishTimeTo = punishTimeTo;
    }

    public String getPunishRemark() {
        return punishRemark;
    }

    public void setPunishRemark(String punishRemark) {
        this.punishRemark = punishRemark == null ? null : punishRemark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getFalseOrders() {
        return falseOrders;
    }

    public void setFalseOrders(Integer falseOrders) {
        this.falseOrders = falseOrders;
    }

    public Integer getEndOrders() {
        return endOrders;
    }

    public void setEndOrders(Integer endOrders) {
        this.endOrders = endOrders;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType == null ? null : idType.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public Long getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Long totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress == null ? null : registeredAddress.trim();
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank == null ? null : openingBank.trim();
    }

    public String getBranchBank() {
        return branchBank;
    }

    public void setBranchBank(String branchBank) {
        this.branchBank = branchBank == null ? null : branchBank.trim();
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    public String getTaxTypes() {
        return taxTypes;
    }

    public void setTaxTypes(String taxTypes) {
        this.taxTypes = taxTypes == null ? null : taxTypes.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getVatRate() {
        return vatRate;
    }

    public void setVatRate(String vatRate) {
        this.vatRate = vatRate == null ? null : vatRate.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope == null ? null : businessScope.trim();
    }

    public String getLegalPhone() {
        return legalPhone;
    }

    public void setLegalPhone(String legalPhone) {
        this.legalPhone = legalPhone == null ? null : legalPhone.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getGradeReason() {
        return gradeReason;
    }

    public void setGradeReason(String gradeReason) {
        this.gradeReason = gradeReason == null ? null : gradeReason.trim();
    }

    public Double getKpi() {
        return kpi;
    }

    public void setKpi(Double kpi) {
        this.kpi = kpi;
    }

    public String getForeignId() {
        return foreignId;
    }

    public void setForeignId(String foreignId) {
        this.foreignId = foreignId == null ? null : foreignId.trim();
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType == null ? null : enterpriseType.trim();
    }

    public String getCreateUserType() {
        return createUserType;
    }

    public void setCreateUserType(String createUserType) {
        this.createUserType = createUserType == null ? null : createUserType.trim();
    }

    public String getCompanyIntroduces() {
        return companyIntroduces;
    }

    public void setCompanyIntroduces(String companyIntroduces) {
        this.companyIntroduces = companyIntroduces == null ? null : companyIntroduces.trim();
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
        Company other = (Company) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getAudioTime() == null ? other.getAudioTime() == null : this.getAudioTime().equals(other.getAudioTime()))
            && (this.getLicenseNo() == null ? other.getLicenseNo() == null : this.getLicenseNo().equals(other.getLicenseNo()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLinkMan() == null ? other.getLinkMan() == null : this.getLinkMan().equals(other.getLinkMan()))
            && (this.getLinkManJob() == null ? other.getLinkManJob() == null : this.getLinkManJob().equals(other.getLinkManJob()))
            && (this.getLinkPhone() == null ? other.getLinkPhone() == null : this.getLinkPhone().equals(other.getLinkPhone()))
            && (this.getLinkMobile() == null ? other.getLinkMobile() == null : this.getLinkMobile().equals(other.getLinkMobile()))
            && (this.getLinkFax() == null ? other.getLinkFax() == null : this.getLinkFax().equals(other.getLinkFax()))
            && (this.getLinkEmail() == null ? other.getLinkEmail() == null : this.getLinkEmail().equals(other.getLinkEmail()))
            && (this.getDeleteFlag() == null ? other.getDeleteFlag() == null : this.getDeleteFlag().equals(other.getDeleteFlag()))
            && (this.getServiceLevel() == null ? other.getServiceLevel() == null : this.getServiceLevel().equals(other.getServiceLevel()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDataSource() == null ? other.getDataSource() == null : this.getDataSource().equals(other.getDataSource()))
            && (this.getOrgCode() == null ? other.getOrgCode() == null : this.getOrgCode().equals(other.getOrgCode()))
            && (this.getCodeStatus() == null ? other.getCodeStatus() == null : this.getCodeStatus().equals(other.getCodeStatus()))
            && (this.getIdentity() == null ? other.getIdentity() == null : this.getIdentity().equals(other.getIdentity()))
            && (this.getPdDealOrders() == null ? other.getPdDealOrders() == null : this.getPdDealOrders().equals(other.getPdDealOrders()))
            && (this.getPdCompanyType() == null ? other.getPdCompanyType() == null : this.getPdCompanyType().equals(other.getPdCompanyType()))
            && (this.getLogoUrl() == null ? other.getLogoUrl() == null : this.getLogoUrl().equals(other.getLogoUrl()))
            && (this.getLanguageCode() == null ? other.getLanguageCode() == null : this.getLanguageCode().equals(other.getLanguageCode()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateId() == null ? other.getUpdateId() == null : this.getUpdateId().equals(other.getUpdateId()))
            && (this.getCheckUserId() == null ? other.getCheckUserId() == null : this.getCheckUserId().equals(other.getCheckUserId()))
            && (this.getPunishUserId() == null ? other.getPunishUserId() == null : this.getPunishUserId().equals(other.getPunishUserId()))
            && (this.getPunishTime() == null ? other.getPunishTime() == null : this.getPunishTime().equals(other.getPunishTime()))
            && (this.getPunishTimeFrom() == null ? other.getPunishTimeFrom() == null : this.getPunishTimeFrom().equals(other.getPunishTimeFrom()))
            && (this.getPunishTimeTo() == null ? other.getPunishTimeTo() == null : this.getPunishTimeTo().equals(other.getPunishTimeTo()))
            && (this.getPunishRemark() == null ? other.getPunishRemark() == null : this.getPunishRemark().equals(other.getPunishRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getFalseOrders() == null ? other.getFalseOrders() == null : this.getFalseOrders().equals(other.getFalseOrders()))
            && (this.getEndOrders() == null ? other.getEndOrders() == null : this.getEndOrders().equals(other.getEndOrders()))
            && (this.getIdType() == null ? other.getIdType() == null : this.getIdType().equals(other.getIdType()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getTotalStaff() == null ? other.getTotalStaff() == null : this.getTotalStaff().equals(other.getTotalStaff()))
            && (this.getRegisteredAddress() == null ? other.getRegisteredAddress() == null : this.getRegisteredAddress().equals(other.getRegisteredAddress()))
            && (this.getOpeningBank() == null ? other.getOpeningBank() == null : this.getOpeningBank().equals(other.getOpeningBank()))
            && (this.getBranchBank() == null ? other.getBranchBank() == null : this.getBranchBank().equals(other.getBranchBank()))
            && (this.getAccountBank() == null ? other.getAccountBank() == null : this.getAccountBank().equals(other.getAccountBank()))
            && (this.getTaxTypes() == null ? other.getTaxTypes() == null : this.getTaxTypes().equals(other.getTaxTypes()))
            && (this.getInvoiceType() == null ? other.getInvoiceType() == null : this.getInvoiceType().equals(other.getInvoiceType()))
            && (this.getVatRate() == null ? other.getVatRate() == null : this.getVatRate().equals(other.getVatRate()))
            && (this.getRegisterDate() == null ? other.getRegisterDate() == null : this.getRegisterDate().equals(other.getRegisterDate()))
            && (this.getExpiryDate() == null ? other.getExpiryDate() == null : this.getExpiryDate().equals(other.getExpiryDate()))
            && (this.getCreditCode() == null ? other.getCreditCode() == null : this.getCreditCode().equals(other.getCreditCode()))
            && (this.getBusinessScope() == null ? other.getBusinessScope() == null : this.getBusinessScope().equals(other.getBusinessScope()))
            && (this.getLegalPhone() == null ? other.getLegalPhone() == null : this.getLegalPhone().equals(other.getLegalPhone()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getGradeReason() == null ? other.getGradeReason() == null : this.getGradeReason().equals(other.getGradeReason()))
            && (this.getKpi() == null ? other.getKpi() == null : this.getKpi().equals(other.getKpi()))
            && (this.getForeignId() == null ? other.getForeignId() == null : this.getForeignId().equals(other.getForeignId()))
            && (this.getEnterpriseType() == null ? other.getEnterpriseType() == null : this.getEnterpriseType().equals(other.getEnterpriseType()))
            && (this.getCreateUserType() == null ? other.getCreateUserType() == null : this.getCreateUserType().equals(other.getCreateUserType()))
            && (this.getCompanyIntroduces() == null ? other.getCompanyIntroduces() == null : this.getCompanyIntroduces().equals(other.getCompanyIntroduces()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getAudioTime() == null) ? 0 : getAudioTime().hashCode());
        result = prime * result + ((getLicenseNo() == null) ? 0 : getLicenseNo().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLinkMan() == null) ? 0 : getLinkMan().hashCode());
        result = prime * result + ((getLinkManJob() == null) ? 0 : getLinkManJob().hashCode());
        result = prime * result + ((getLinkPhone() == null) ? 0 : getLinkPhone().hashCode());
        result = prime * result + ((getLinkMobile() == null) ? 0 : getLinkMobile().hashCode());
        result = prime * result + ((getLinkFax() == null) ? 0 : getLinkFax().hashCode());
        result = prime * result + ((getLinkEmail() == null) ? 0 : getLinkEmail().hashCode());
        result = prime * result + ((getDeleteFlag() == null) ? 0 : getDeleteFlag().hashCode());
        result = prime * result + ((getServiceLevel() == null) ? 0 : getServiceLevel().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        result = prime * result + ((getOrgCode() == null) ? 0 : getOrgCode().hashCode());
        result = prime * result + ((getCodeStatus() == null) ? 0 : getCodeStatus().hashCode());
        result = prime * result + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        result = prime * result + ((getPdDealOrders() == null) ? 0 : getPdDealOrders().hashCode());
        result = prime * result + ((getPdCompanyType() == null) ? 0 : getPdCompanyType().hashCode());
        result = prime * result + ((getLogoUrl() == null) ? 0 : getLogoUrl().hashCode());
        result = prime * result + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateId() == null) ? 0 : getUpdateId().hashCode());
        result = prime * result + ((getCheckUserId() == null) ? 0 : getCheckUserId().hashCode());
        result = prime * result + ((getPunishUserId() == null) ? 0 : getPunishUserId().hashCode());
        result = prime * result + ((getPunishTime() == null) ? 0 : getPunishTime().hashCode());
        result = prime * result + ((getPunishTimeFrom() == null) ? 0 : getPunishTimeFrom().hashCode());
        result = prime * result + ((getPunishTimeTo() == null) ? 0 : getPunishTimeTo().hashCode());
        result = prime * result + ((getPunishRemark() == null) ? 0 : getPunishRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getFalseOrders() == null) ? 0 : getFalseOrders().hashCode());
        result = prime * result + ((getEndOrders() == null) ? 0 : getEndOrders().hashCode());
        result = prime * result + ((getIdType() == null) ? 0 : getIdType().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getTotalStaff() == null) ? 0 : getTotalStaff().hashCode());
        result = prime * result + ((getRegisteredAddress() == null) ? 0 : getRegisteredAddress().hashCode());
        result = prime * result + ((getOpeningBank() == null) ? 0 : getOpeningBank().hashCode());
        result = prime * result + ((getBranchBank() == null) ? 0 : getBranchBank().hashCode());
        result = prime * result + ((getAccountBank() == null) ? 0 : getAccountBank().hashCode());
        result = prime * result + ((getTaxTypes() == null) ? 0 : getTaxTypes().hashCode());
        result = prime * result + ((getInvoiceType() == null) ? 0 : getInvoiceType().hashCode());
        result = prime * result + ((getVatRate() == null) ? 0 : getVatRate().hashCode());
        result = prime * result + ((getRegisterDate() == null) ? 0 : getRegisterDate().hashCode());
        result = prime * result + ((getExpiryDate() == null) ? 0 : getExpiryDate().hashCode());
        result = prime * result + ((getCreditCode() == null) ? 0 : getCreditCode().hashCode());
        result = prime * result + ((getBusinessScope() == null) ? 0 : getBusinessScope().hashCode());
        result = prime * result + ((getLegalPhone() == null) ? 0 : getLegalPhone().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getGradeReason() == null) ? 0 : getGradeReason().hashCode());
        result = prime * result + ((getKpi() == null) ? 0 : getKpi().hashCode());
        result = prime * result + ((getForeignId() == null) ? 0 : getForeignId().hashCode());
        result = prime * result + ((getEnterpriseType() == null) ? 0 : getEnterpriseType().hashCode());
        result = prime * result + ((getCreateUserType() == null) ? 0 : getCreateUserType().hashCode());
        result = prime * result + ((getCompanyIntroduces() == null) ? 0 : getCompanyIntroduces().hashCode());
        return result;
    }
}