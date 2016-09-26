package com.jumore.b2b.daren.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompanyQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyQueryHelper() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeIsNull() {
            addCriterion("audio_time is null");
            return (Criteria) this;
        }

        public Criteria andAudioTimeIsNotNull() {
            addCriterion("audio_time is not null");
            return (Criteria) this;
        }

        public Criteria andAudioTimeEqualTo(Date value) {
            addCriterion("audio_time =", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotEqualTo(Date value) {
            addCriterion("audio_time <>", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeGreaterThan(Date value) {
            addCriterion("audio_time >", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audio_time >=", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeLessThan(Date value) {
            addCriterion("audio_time <", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeLessThanOrEqualTo(Date value) {
            addCriterion("audio_time <=", value, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeIn(List<Date> values) {
            addCriterion("audio_time in", values, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotIn(List<Date> values) {
            addCriterion("audio_time not in", values, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeBetween(Date value1, Date value2) {
            addCriterion("audio_time between", value1, value2, "audioTime");
            return (Criteria) this;
        }

        public Criteria andAudioTimeNotBetween(Date value1, Date value2) {
            addCriterion("audio_time not between", value1, value2, "audioTime");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNull() {
            addCriterion("license_no is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIsNotNull() {
            addCriterion("license_no is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNoEqualTo(String value) {
            addCriterion("license_no =", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotEqualTo(String value) {
            addCriterion("license_no <>", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThan(String value) {
            addCriterion("license_no >", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("license_no >=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThan(String value) {
            addCriterion("license_no <", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("license_no <=", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLike(String value) {
            addCriterion("license_no like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotLike(String value) {
            addCriterion("license_no not like", value, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoIn(List<String> values) {
            addCriterion("license_no in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotIn(List<String> values) {
            addCriterion("license_no not in", values, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoBetween(String value1, String value2) {
            addCriterion("license_no between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andLicenseNoNotBetween(String value1, String value2) {
            addCriterion("license_no not between", value1, value2, "licenseNo");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(Long value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(Long value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(Long value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(Long value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(Long value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(Long value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<Long> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<Long> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(Long value1, Long value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(Long value1, Long value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Long value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Long value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Long value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Long value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Long value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Long> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Long> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Long value1, Long value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Long value1, Long value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNull() {
            addCriterion("link_man is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("link_man is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("link_man =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("link_man <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("link_man >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("link_man >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("link_man <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("link_man <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("link_man like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("link_man not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("link_man in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("link_man not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("link_man between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("link_man not between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManJobIsNull() {
            addCriterion("link_man_job is null");
            return (Criteria) this;
        }

        public Criteria andLinkManJobIsNotNull() {
            addCriterion("link_man_job is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManJobEqualTo(String value) {
            addCriterion("link_man_job =", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobNotEqualTo(String value) {
            addCriterion("link_man_job <>", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobGreaterThan(String value) {
            addCriterion("link_man_job >", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobGreaterThanOrEqualTo(String value) {
            addCriterion("link_man_job >=", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobLessThan(String value) {
            addCriterion("link_man_job <", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobLessThanOrEqualTo(String value) {
            addCriterion("link_man_job <=", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobLike(String value) {
            addCriterion("link_man_job like", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobNotLike(String value) {
            addCriterion("link_man_job not like", value, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobIn(List<String> values) {
            addCriterion("link_man_job in", values, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobNotIn(List<String> values) {
            addCriterion("link_man_job not in", values, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobBetween(String value1, String value2) {
            addCriterion("link_man_job between", value1, value2, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkManJobNotBetween(String value1, String value2) {
            addCriterion("link_man_job not between", value1, value2, "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNull() {
            addCriterion("link_phone is null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIsNotNull() {
            addCriterion("link_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneEqualTo(String value) {
            addCriterion("link_phone =", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotEqualTo(String value) {
            addCriterion("link_phone <>", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThan(String value) {
            addCriterion("link_phone >", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("link_phone >=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThan(String value) {
            addCriterion("link_phone <", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLessThanOrEqualTo(String value) {
            addCriterion("link_phone <=", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLike(String value) {
            addCriterion("link_phone like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotLike(String value) {
            addCriterion("link_phone not like", value, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneIn(List<String> values) {
            addCriterion("link_phone in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotIn(List<String> values) {
            addCriterion("link_phone not in", values, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneBetween(String value1, String value2) {
            addCriterion("link_phone between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneNotBetween(String value1, String value2) {
            addCriterion("link_phone not between", value1, value2, "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkMobileIsNull() {
            addCriterion("link_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLinkMobileIsNotNull() {
            addCriterion("link_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLinkMobileEqualTo(String value) {
            addCriterion("link_mobile =", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotEqualTo(String value) {
            addCriterion("link_mobile <>", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileGreaterThan(String value) {
            addCriterion("link_mobile >", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileGreaterThanOrEqualTo(String value) {
            addCriterion("link_mobile >=", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLessThan(String value) {
            addCriterion("link_mobile <", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLessThanOrEqualTo(String value) {
            addCriterion("link_mobile <=", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLike(String value) {
            addCriterion("link_mobile like", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotLike(String value) {
            addCriterion("link_mobile not like", value, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileIn(List<String> values) {
            addCriterion("link_mobile in", values, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotIn(List<String> values) {
            addCriterion("link_mobile not in", values, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileBetween(String value1, String value2) {
            addCriterion("link_mobile between", value1, value2, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkMobileNotBetween(String value1, String value2) {
            addCriterion("link_mobile not between", value1, value2, "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkFaxIsNull() {
            addCriterion("link_fax is null");
            return (Criteria) this;
        }

        public Criteria andLinkFaxIsNotNull() {
            addCriterion("link_fax is not null");
            return (Criteria) this;
        }

        public Criteria andLinkFaxEqualTo(String value) {
            addCriterion("link_fax =", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxNotEqualTo(String value) {
            addCriterion("link_fax <>", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxGreaterThan(String value) {
            addCriterion("link_fax >", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxGreaterThanOrEqualTo(String value) {
            addCriterion("link_fax >=", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxLessThan(String value) {
            addCriterion("link_fax <", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxLessThanOrEqualTo(String value) {
            addCriterion("link_fax <=", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxLike(String value) {
            addCriterion("link_fax like", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxNotLike(String value) {
            addCriterion("link_fax not like", value, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxIn(List<String> values) {
            addCriterion("link_fax in", values, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxNotIn(List<String> values) {
            addCriterion("link_fax not in", values, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxBetween(String value1, String value2) {
            addCriterion("link_fax between", value1, value2, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkFaxNotBetween(String value1, String value2) {
            addCriterion("link_fax not between", value1, value2, "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNull() {
            addCriterion("link_email is null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIsNotNull() {
            addCriterion("link_email is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEmailEqualTo(String value) {
            addCriterion("link_email =", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotEqualTo(String value) {
            addCriterion("link_email <>", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThan(String value) {
            addCriterion("link_email >", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailGreaterThanOrEqualTo(String value) {
            addCriterion("link_email >=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThan(String value) {
            addCriterion("link_email <", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLessThanOrEqualTo(String value) {
            addCriterion("link_email <=", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLike(String value) {
            addCriterion("link_email like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotLike(String value) {
            addCriterion("link_email not like", value, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailIn(List<String> values) {
            addCriterion("link_email in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotIn(List<String> values) {
            addCriterion("link_email not in", values, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailBetween(String value1, String value2) {
            addCriterion("link_email between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andLinkEmailNotBetween(String value1, String value2) {
            addCriterion("link_email not between", value1, value2, "linkEmail");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(String value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(String value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(String value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(String value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(String value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(String value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLike(String value) {
            addCriterion("delete_flag like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotLike(String value) {
            addCriterion("delete_flag not like", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<String> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<String> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(String value1, String value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(String value1, String value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andServiceLevelIsNull() {
            addCriterion("service_level is null");
            return (Criteria) this;
        }

        public Criteria andServiceLevelIsNotNull() {
            addCriterion("service_level is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLevelEqualTo(Long value) {
            addCriterion("service_level =", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelNotEqualTo(Long value) {
            addCriterion("service_level <>", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelGreaterThan(Long value) {
            addCriterion("service_level >", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelGreaterThanOrEqualTo(Long value) {
            addCriterion("service_level >=", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelLessThan(Long value) {
            addCriterion("service_level <", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelLessThanOrEqualTo(Long value) {
            addCriterion("service_level <=", value, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelIn(List<Long> values) {
            addCriterion("service_level in", values, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelNotIn(List<Long> values) {
            addCriterion("service_level not in", values, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelBetween(Long value1, Long value2) {
            addCriterion("service_level between", value1, value2, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andServiceLevelNotBetween(Long value1, Long value2) {
            addCriterion("service_level not between", value1, value2, "serviceLevel");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("data_source is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("data_source is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("data_source =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("data_source <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("data_source >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("data_source >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("data_source <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("data_source <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("data_source like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("data_source not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("data_source in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("data_source not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("data_source between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("data_source not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("org_code is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("org_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("org_code =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("org_code <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("org_code >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("org_code >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("org_code <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("org_code <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("org_code like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("org_code not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("org_code in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("org_code not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("org_code between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("org_code not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andCodeStatusIsNull() {
            addCriterion("code_status is null");
            return (Criteria) this;
        }

        public Criteria andCodeStatusIsNotNull() {
            addCriterion("code_status is not null");
            return (Criteria) this;
        }

        public Criteria andCodeStatusEqualTo(String value) {
            addCriterion("code_status =", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotEqualTo(String value) {
            addCriterion("code_status <>", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusGreaterThan(String value) {
            addCriterion("code_status >", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("code_status >=", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusLessThan(String value) {
            addCriterion("code_status <", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusLessThanOrEqualTo(String value) {
            addCriterion("code_status <=", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusLike(String value) {
            addCriterion("code_status like", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotLike(String value) {
            addCriterion("code_status not like", value, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusIn(List<String> values) {
            addCriterion("code_status in", values, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotIn(List<String> values) {
            addCriterion("code_status not in", values, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusBetween(String value1, String value2) {
            addCriterion("code_status between", value1, value2, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andCodeStatusNotBetween(String value1, String value2) {
            addCriterion("code_status not between", value1, value2, "codeStatus");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersIsNull() {
            addCriterion("pd_deal_orders is null");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersIsNotNull() {
            addCriterion("pd_deal_orders is not null");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersEqualTo(Integer value) {
            addCriterion("pd_deal_orders =", value, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersNotEqualTo(Integer value) {
            addCriterion("pd_deal_orders <>", value, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersGreaterThan(Integer value) {
            addCriterion("pd_deal_orders >", value, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("pd_deal_orders >=", value, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersLessThan(Integer value) {
            addCriterion("pd_deal_orders <", value, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("pd_deal_orders <=", value, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersIn(List<Integer> values) {
            addCriterion("pd_deal_orders in", values, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersNotIn(List<Integer> values) {
            addCriterion("pd_deal_orders not in", values, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersBetween(Integer value1, Integer value2) {
            addCriterion("pd_deal_orders between", value1, value2, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdDealOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("pd_deal_orders not between", value1, value2, "pdDealOrders");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeIsNull() {
            addCriterion("pd_company_type is null");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeIsNotNull() {
            addCriterion("pd_company_type is not null");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeEqualTo(String value) {
            addCriterion("pd_company_type =", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeNotEqualTo(String value) {
            addCriterion("pd_company_type <>", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeGreaterThan(String value) {
            addCriterion("pd_company_type >", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pd_company_type >=", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeLessThan(String value) {
            addCriterion("pd_company_type <", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeLessThanOrEqualTo(String value) {
            addCriterion("pd_company_type <=", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeLike(String value) {
            addCriterion("pd_company_type like", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeNotLike(String value) {
            addCriterion("pd_company_type not like", value, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeIn(List<String> values) {
            addCriterion("pd_company_type in", values, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeNotIn(List<String> values) {
            addCriterion("pd_company_type not in", values, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeBetween(String value1, String value2) {
            addCriterion("pd_company_type between", value1, value2, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeNotBetween(String value1, String value2) {
            addCriterion("pd_company_type not between", value1, value2, "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNull() {
            addCriterion("logo_url is null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIsNotNull() {
            addCriterion("logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andLogoUrlEqualTo(String value) {
            addCriterion("logo_url =", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotEqualTo(String value) {
            addCriterion("logo_url <>", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThan(String value) {
            addCriterion("logo_url >", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("logo_url >=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThan(String value) {
            addCriterion("logo_url <", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("logo_url <=", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLike(String value) {
            addCriterion("logo_url like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotLike(String value) {
            addCriterion("logo_url not like", value, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlIn(List<String> values) {
            addCriterion("logo_url in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotIn(List<String> values) {
            addCriterion("logo_url not in", values, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlBetween(String value1, String value2) {
            addCriterion("logo_url between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLogoUrlNotBetween(String value1, String value2) {
            addCriterion("logo_url not between", value1, value2, "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeIsNull() {
            addCriterion("language_code is null");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeIsNotNull() {
            addCriterion("language_code is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeEqualTo(String value) {
            addCriterion("language_code =", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotEqualTo(String value) {
            addCriterion("language_code <>", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeGreaterThan(String value) {
            addCriterion("language_code >", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("language_code >=", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLessThan(String value) {
            addCriterion("language_code <", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLessThanOrEqualTo(String value) {
            addCriterion("language_code <=", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLike(String value) {
            addCriterion("language_code like", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotLike(String value) {
            addCriterion("language_code not like", value, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeIn(List<String> values) {
            addCriterion("language_code in", values, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotIn(List<String> values) {
            addCriterion("language_code not in", values, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeBetween(String value1, String value2) {
            addCriterion("language_code between", value1, value2, "languageCode");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeNotBetween(String value1, String value2) {
            addCriterion("language_code not between", value1, value2, "languageCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(Long value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(Long value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(Long value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(Long value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(Long value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<Long> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<Long> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(Long value1, Long value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(Long value1, Long value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNull() {
            addCriterion("check_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIsNotNull() {
            addCriterion("check_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdEqualTo(Long value) {
            addCriterion("check_user_id =", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotEqualTo(Long value) {
            addCriterion("check_user_id <>", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThan(Long value) {
            addCriterion("check_user_id >", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("check_user_id >=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThan(Long value) {
            addCriterion("check_user_id <", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdLessThanOrEqualTo(Long value) {
            addCriterion("check_user_id <=", value, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdIn(List<Long> values) {
            addCriterion("check_user_id in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotIn(List<Long> values) {
            addCriterion("check_user_id not in", values, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdBetween(Long value1, Long value2) {
            addCriterion("check_user_id between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andCheckUserIdNotBetween(Long value1, Long value2) {
            addCriterion("check_user_id not between", value1, value2, "checkUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdIsNull() {
            addCriterion("punish_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdIsNotNull() {
            addCriterion("punish_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdEqualTo(Long value) {
            addCriterion("punish_user_id =", value, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdNotEqualTo(Long value) {
            addCriterion("punish_user_id <>", value, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdGreaterThan(Long value) {
            addCriterion("punish_user_id >", value, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("punish_user_id >=", value, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdLessThan(Long value) {
            addCriterion("punish_user_id <", value, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdLessThanOrEqualTo(Long value) {
            addCriterion("punish_user_id <=", value, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdIn(List<Long> values) {
            addCriterion("punish_user_id in", values, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdNotIn(List<Long> values) {
            addCriterion("punish_user_id not in", values, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdBetween(Long value1, Long value2) {
            addCriterion("punish_user_id between", value1, value2, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishUserIdNotBetween(Long value1, Long value2) {
            addCriterion("punish_user_id not between", value1, value2, "punishUserId");
            return (Criteria) this;
        }

        public Criteria andPunishTimeIsNull() {
            addCriterion("punish_time is null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeIsNotNull() {
            addCriterion("punish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeEqualTo(Date value) {
            addCriterion("punish_time =", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotEqualTo(Date value) {
            addCriterion("punish_time <>", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeGreaterThan(Date value) {
            addCriterion("punish_time >", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("punish_time >=", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeLessThan(Date value) {
            addCriterion("punish_time <", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeLessThanOrEqualTo(Date value) {
            addCriterion("punish_time <=", value, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeIn(List<Date> values) {
            addCriterion("punish_time in", values, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotIn(List<Date> values) {
            addCriterion("punish_time not in", values, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeBetween(Date value1, Date value2) {
            addCriterion("punish_time between", value1, value2, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeNotBetween(Date value1, Date value2) {
            addCriterion("punish_time not between", value1, value2, "punishTime");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromIsNull() {
            addCriterion("punish_time_from is null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromIsNotNull() {
            addCriterion("punish_time_from is not null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromEqualTo(Date value) {
            addCriterion("punish_time_from =", value, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromNotEqualTo(Date value) {
            addCriterion("punish_time_from <>", value, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromGreaterThan(Date value) {
            addCriterion("punish_time_from >", value, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromGreaterThanOrEqualTo(Date value) {
            addCriterion("punish_time_from >=", value, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromLessThan(Date value) {
            addCriterion("punish_time_from <", value, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromLessThanOrEqualTo(Date value) {
            addCriterion("punish_time_from <=", value, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromIn(List<Date> values) {
            addCriterion("punish_time_from in", values, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromNotIn(List<Date> values) {
            addCriterion("punish_time_from not in", values, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromBetween(Date value1, Date value2) {
            addCriterion("punish_time_from between", value1, value2, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeFromNotBetween(Date value1, Date value2) {
            addCriterion("punish_time_from not between", value1, value2, "punishTimeFrom");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToIsNull() {
            addCriterion("punish_time_to is null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToIsNotNull() {
            addCriterion("punish_time_to is not null");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToEqualTo(Date value) {
            addCriterion("punish_time_to =", value, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToNotEqualTo(Date value) {
            addCriterion("punish_time_to <>", value, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToGreaterThan(Date value) {
            addCriterion("punish_time_to >", value, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToGreaterThanOrEqualTo(Date value) {
            addCriterion("punish_time_to >=", value, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToLessThan(Date value) {
            addCriterion("punish_time_to <", value, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToLessThanOrEqualTo(Date value) {
            addCriterion("punish_time_to <=", value, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToIn(List<Date> values) {
            addCriterion("punish_time_to in", values, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToNotIn(List<Date> values) {
            addCriterion("punish_time_to not in", values, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToBetween(Date value1, Date value2) {
            addCriterion("punish_time_to between", value1, value2, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishTimeToNotBetween(Date value1, Date value2) {
            addCriterion("punish_time_to not between", value1, value2, "punishTimeTo");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkIsNull() {
            addCriterion("punish_remark is null");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkIsNotNull() {
            addCriterion("punish_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkEqualTo(String value) {
            addCriterion("punish_remark =", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkNotEqualTo(String value) {
            addCriterion("punish_remark <>", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkGreaterThan(String value) {
            addCriterion("punish_remark >", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("punish_remark >=", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkLessThan(String value) {
            addCriterion("punish_remark <", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkLessThanOrEqualTo(String value) {
            addCriterion("punish_remark <=", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkLike(String value) {
            addCriterion("punish_remark like", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkNotLike(String value) {
            addCriterion("punish_remark not like", value, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkIn(List<String> values) {
            addCriterion("punish_remark in", values, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkNotIn(List<String> values) {
            addCriterion("punish_remark not in", values, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkBetween(String value1, String value2) {
            addCriterion("punish_remark between", value1, value2, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkNotBetween(String value1, String value2) {
            addCriterion("punish_remark not between", value1, value2, "punishRemark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersIsNull() {
            addCriterion("false_orders is null");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersIsNotNull() {
            addCriterion("false_orders is not null");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersEqualTo(Integer value) {
            addCriterion("false_orders =", value, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersNotEqualTo(Integer value) {
            addCriterion("false_orders <>", value, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersGreaterThan(Integer value) {
            addCriterion("false_orders >", value, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("false_orders >=", value, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersLessThan(Integer value) {
            addCriterion("false_orders <", value, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("false_orders <=", value, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersIn(List<Integer> values) {
            addCriterion("false_orders in", values, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersNotIn(List<Integer> values) {
            addCriterion("false_orders not in", values, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersBetween(Integer value1, Integer value2) {
            addCriterion("false_orders between", value1, value2, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andFalseOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("false_orders not between", value1, value2, "falseOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersIsNull() {
            addCriterion("end_orders is null");
            return (Criteria) this;
        }

        public Criteria andEndOrdersIsNotNull() {
            addCriterion("end_orders is not null");
            return (Criteria) this;
        }

        public Criteria andEndOrdersEqualTo(Integer value) {
            addCriterion("end_orders =", value, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersNotEqualTo(Integer value) {
            addCriterion("end_orders <>", value, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersGreaterThan(Integer value) {
            addCriterion("end_orders >", value, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_orders >=", value, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersLessThan(Integer value) {
            addCriterion("end_orders <", value, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("end_orders <=", value, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersIn(List<Integer> values) {
            addCriterion("end_orders in", values, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersNotIn(List<Integer> values) {
            addCriterion("end_orders not in", values, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersBetween(Integer value1, Integer value2) {
            addCriterion("end_orders between", value1, value2, "endOrders");
            return (Criteria) this;
        }

        public Criteria andEndOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("end_orders not between", value1, value2, "endOrders");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNull() {
            addCriterion("id_type is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeIsNotNull() {
            addCriterion("id_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeEqualTo(String value) {
            addCriterion("id_type =", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotEqualTo(String value) {
            addCriterion("id_type <>", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThan(String value) {
            addCriterion("id_type >", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("id_type >=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThan(String value) {
            addCriterion("id_type <", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLessThanOrEqualTo(String value) {
            addCriterion("id_type <=", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeLike(String value) {
            addCriterion("id_type like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotLike(String value) {
            addCriterion("id_type not like", value, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeIn(List<String> values) {
            addCriterion("id_type in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotIn(List<String> values) {
            addCriterion("id_type not in", values, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeBetween(String value1, String value2) {
            addCriterion("id_type between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdTypeNotBetween(String value1, String value2) {
            addCriterion("id_type not between", value1, value2, "idType");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andTotalStaffIsNull() {
            addCriterion("total_staff is null");
            return (Criteria) this;
        }

        public Criteria andTotalStaffIsNotNull() {
            addCriterion("total_staff is not null");
            return (Criteria) this;
        }

        public Criteria andTotalStaffEqualTo(Long value) {
            addCriterion("total_staff =", value, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffNotEqualTo(Long value) {
            addCriterion("total_staff <>", value, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffGreaterThan(Long value) {
            addCriterion("total_staff >", value, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffGreaterThanOrEqualTo(Long value) {
            addCriterion("total_staff >=", value, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffLessThan(Long value) {
            addCriterion("total_staff <", value, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffLessThanOrEqualTo(Long value) {
            addCriterion("total_staff <=", value, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffIn(List<Long> values) {
            addCriterion("total_staff in", values, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffNotIn(List<Long> values) {
            addCriterion("total_staff not in", values, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffBetween(Long value1, Long value2) {
            addCriterion("total_staff between", value1, value2, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andTotalStaffNotBetween(Long value1, Long value2) {
            addCriterion("total_staff not between", value1, value2, "totalStaff");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNull() {
            addCriterion("registered_address is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIsNotNull() {
            addCriterion("registered_address is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressEqualTo(String value) {
            addCriterion("registered_address =", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotEqualTo(String value) {
            addCriterion("registered_address <>", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThan(String value) {
            addCriterion("registered_address >", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressGreaterThanOrEqualTo(String value) {
            addCriterion("registered_address >=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThan(String value) {
            addCriterion("registered_address <", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLessThanOrEqualTo(String value) {
            addCriterion("registered_address <=", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLike(String value) {
            addCriterion("registered_address like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotLike(String value) {
            addCriterion("registered_address not like", value, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressIn(List<String> values) {
            addCriterion("registered_address in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotIn(List<String> values) {
            addCriterion("registered_address not in", values, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressBetween(String value1, String value2) {
            addCriterion("registered_address between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressNotBetween(String value1, String value2) {
            addCriterion("registered_address not between", value1, value2, "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNull() {
            addCriterion("opening_bank is null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIsNotNull() {
            addCriterion("opening_bank is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningBankEqualTo(String value) {
            addCriterion("opening_bank =", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotEqualTo(String value) {
            addCriterion("opening_bank <>", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThan(String value) {
            addCriterion("opening_bank >", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankGreaterThanOrEqualTo(String value) {
            addCriterion("opening_bank >=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThan(String value) {
            addCriterion("opening_bank <", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLessThanOrEqualTo(String value) {
            addCriterion("opening_bank <=", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLike(String value) {
            addCriterion("opening_bank like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotLike(String value) {
            addCriterion("opening_bank not like", value, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankIn(List<String> values) {
            addCriterion("opening_bank in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotIn(List<String> values) {
            addCriterion("opening_bank not in", values, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankBetween(String value1, String value2) {
            addCriterion("opening_bank between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andOpeningBankNotBetween(String value1, String value2) {
            addCriterion("opening_bank not between", value1, value2, "openingBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankIsNull() {
            addCriterion("branch_bank is null");
            return (Criteria) this;
        }

        public Criteria andBranchBankIsNotNull() {
            addCriterion("branch_bank is not null");
            return (Criteria) this;
        }

        public Criteria andBranchBankEqualTo(String value) {
            addCriterion("branch_bank =", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankNotEqualTo(String value) {
            addCriterion("branch_bank <>", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankGreaterThan(String value) {
            addCriterion("branch_bank >", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankGreaterThanOrEqualTo(String value) {
            addCriterion("branch_bank >=", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankLessThan(String value) {
            addCriterion("branch_bank <", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankLessThanOrEqualTo(String value) {
            addCriterion("branch_bank <=", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankLike(String value) {
            addCriterion("branch_bank like", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankNotLike(String value) {
            addCriterion("branch_bank not like", value, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankIn(List<String> values) {
            addCriterion("branch_bank in", values, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankNotIn(List<String> values) {
            addCriterion("branch_bank not in", values, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankBetween(String value1, String value2) {
            addCriterion("branch_bank between", value1, value2, "branchBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankNotBetween(String value1, String value2) {
            addCriterion("branch_bank not between", value1, value2, "branchBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNull() {
            addCriterion("account_bank is null");
            return (Criteria) this;
        }

        public Criteria andAccountBankIsNotNull() {
            addCriterion("account_bank is not null");
            return (Criteria) this;
        }

        public Criteria andAccountBankEqualTo(String value) {
            addCriterion("account_bank =", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotEqualTo(String value) {
            addCriterion("account_bank <>", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThan(String value) {
            addCriterion("account_bank >", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankGreaterThanOrEqualTo(String value) {
            addCriterion("account_bank >=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThan(String value) {
            addCriterion("account_bank <", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLessThanOrEqualTo(String value) {
            addCriterion("account_bank <=", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLike(String value) {
            addCriterion("account_bank like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotLike(String value) {
            addCriterion("account_bank not like", value, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankIn(List<String> values) {
            addCriterion("account_bank in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotIn(List<String> values) {
            addCriterion("account_bank not in", values, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankBetween(String value1, String value2) {
            addCriterion("account_bank between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankNotBetween(String value1, String value2) {
            addCriterion("account_bank not between", value1, value2, "accountBank");
            return (Criteria) this;
        }

        public Criteria andTaxTypesIsNull() {
            addCriterion("tax_types is null");
            return (Criteria) this;
        }

        public Criteria andTaxTypesIsNotNull() {
            addCriterion("tax_types is not null");
            return (Criteria) this;
        }

        public Criteria andTaxTypesEqualTo(String value) {
            addCriterion("tax_types =", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesNotEqualTo(String value) {
            addCriterion("tax_types <>", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesGreaterThan(String value) {
            addCriterion("tax_types >", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesGreaterThanOrEqualTo(String value) {
            addCriterion("tax_types >=", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesLessThan(String value) {
            addCriterion("tax_types <", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesLessThanOrEqualTo(String value) {
            addCriterion("tax_types <=", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesLike(String value) {
            addCriterion("tax_types like", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesNotLike(String value) {
            addCriterion("tax_types not like", value, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesIn(List<String> values) {
            addCriterion("tax_types in", values, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesNotIn(List<String> values) {
            addCriterion("tax_types not in", values, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesBetween(String value1, String value2) {
            addCriterion("tax_types between", value1, value2, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andTaxTypesNotBetween(String value1, String value2) {
            addCriterion("tax_types not between", value1, value2, "taxTypes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andVatRateIsNull() {
            addCriterion("vat_rate is null");
            return (Criteria) this;
        }

        public Criteria andVatRateIsNotNull() {
            addCriterion("vat_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVatRateEqualTo(String value) {
            addCriterion("vat_rate =", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateNotEqualTo(String value) {
            addCriterion("vat_rate <>", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateGreaterThan(String value) {
            addCriterion("vat_rate >", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateGreaterThanOrEqualTo(String value) {
            addCriterion("vat_rate >=", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateLessThan(String value) {
            addCriterion("vat_rate <", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateLessThanOrEqualTo(String value) {
            addCriterion("vat_rate <=", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateLike(String value) {
            addCriterion("vat_rate like", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateNotLike(String value) {
            addCriterion("vat_rate not like", value, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateIn(List<String> values) {
            addCriterion("vat_rate in", values, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateNotIn(List<String> values) {
            addCriterion("vat_rate not in", values, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateBetween(String value1, String value2) {
            addCriterion("vat_rate between", value1, value2, "vatRate");
            return (Criteria) this;
        }

        public Criteria andVatRateNotBetween(String value1, String value2) {
            addCriterion("vat_rate not between", value1, value2, "vatRate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(Date value) {
            addCriterionForJDBCDate("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(Date value) {
            addCriterionForJDBCDate("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(Date value) {
            addCriterionForJDBCDate("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<Date> values) {
            addCriterionForJDBCDate("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expiry_date >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Date value) {
            addCriterionForJDBCDate("expiry_date <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiry_date <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Date> values) {
            addCriterionForJDBCDate("expiry_date in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expiry_date not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiry_date between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiry_date not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNull() {
            addCriterion("credit_code is null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIsNotNull() {
            addCriterion("credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andCreditCodeEqualTo(String value) {
            addCriterion("credit_code =", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotEqualTo(String value) {
            addCriterion("credit_code <>", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThan(String value) {
            addCriterion("credit_code >", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("credit_code >=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThan(String value) {
            addCriterion("credit_code <", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("credit_code <=", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLike(String value) {
            addCriterion("credit_code like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotLike(String value) {
            addCriterion("credit_code not like", value, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeIn(List<String> values) {
            addCriterion("credit_code in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotIn(List<String> values) {
            addCriterion("credit_code not in", values, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeBetween(String value1, String value2) {
            addCriterion("credit_code between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andCreditCodeNotBetween(String value1, String value2) {
            addCriterion("credit_code not between", value1, value2, "creditCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNull() {
            addCriterion("business_scope is null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIsNotNull() {
            addCriterion("business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeEqualTo(String value) {
            addCriterion("business_scope =", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotEqualTo(String value) {
            addCriterion("business_scope <>", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThan(String value) {
            addCriterion("business_scope >", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("business_scope >=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThan(String value) {
            addCriterion("business_scope <", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("business_scope <=", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLike(String value) {
            addCriterion("business_scope like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotLike(String value) {
            addCriterion("business_scope not like", value, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeIn(List<String> values) {
            addCriterion("business_scope in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotIn(List<String> values) {
            addCriterion("business_scope not in", values, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeBetween(String value1, String value2) {
            addCriterion("business_scope between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("business_scope not between", value1, value2, "businessScope");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIsNull() {
            addCriterion("legal_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIsNotNull() {
            addCriterion("legal_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneEqualTo(String value) {
            addCriterion("legal_phone =", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotEqualTo(String value) {
            addCriterion("legal_phone <>", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneGreaterThan(String value) {
            addCriterion("legal_phone >", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_phone >=", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLessThan(String value) {
            addCriterion("legal_phone <", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_phone <=", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLike(String value) {
            addCriterion("legal_phone like", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotLike(String value) {
            addCriterion("legal_phone not like", value, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneIn(List<String> values) {
            addCriterion("legal_phone in", values, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotIn(List<String> values) {
            addCriterion("legal_phone not in", values, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneBetween(String value1, String value2) {
            addCriterion("legal_phone between", value1, value2, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneNotBetween(String value1, String value2) {
            addCriterion("legal_phone not between", value1, value2, "legalPhone");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andGradeReasonIsNull() {
            addCriterion("grade_reason is null");
            return (Criteria) this;
        }

        public Criteria andGradeReasonIsNotNull() {
            addCriterion("grade_reason is not null");
            return (Criteria) this;
        }

        public Criteria andGradeReasonEqualTo(String value) {
            addCriterion("grade_reason =", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonNotEqualTo(String value) {
            addCriterion("grade_reason <>", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonGreaterThan(String value) {
            addCriterion("grade_reason >", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("grade_reason >=", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonLessThan(String value) {
            addCriterion("grade_reason <", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonLessThanOrEqualTo(String value) {
            addCriterion("grade_reason <=", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonLike(String value) {
            addCriterion("grade_reason like", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonNotLike(String value) {
            addCriterion("grade_reason not like", value, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonIn(List<String> values) {
            addCriterion("grade_reason in", values, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonNotIn(List<String> values) {
            addCriterion("grade_reason not in", values, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonBetween(String value1, String value2) {
            addCriterion("grade_reason between", value1, value2, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andGradeReasonNotBetween(String value1, String value2) {
            addCriterion("grade_reason not between", value1, value2, "gradeReason");
            return (Criteria) this;
        }

        public Criteria andKpiIsNull() {
            addCriterion("kpi is null");
            return (Criteria) this;
        }

        public Criteria andKpiIsNotNull() {
            addCriterion("kpi is not null");
            return (Criteria) this;
        }

        public Criteria andKpiEqualTo(Double value) {
            addCriterion("kpi =", value, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiNotEqualTo(Double value) {
            addCriterion("kpi <>", value, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiGreaterThan(Double value) {
            addCriterion("kpi >", value, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiGreaterThanOrEqualTo(Double value) {
            addCriterion("kpi >=", value, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiLessThan(Double value) {
            addCriterion("kpi <", value, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiLessThanOrEqualTo(Double value) {
            addCriterion("kpi <=", value, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiIn(List<Double> values) {
            addCriterion("kpi in", values, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiNotIn(List<Double> values) {
            addCriterion("kpi not in", values, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiBetween(Double value1, Double value2) {
            addCriterion("kpi between", value1, value2, "kpi");
            return (Criteria) this;
        }

        public Criteria andKpiNotBetween(Double value1, Double value2) {
            addCriterion("kpi not between", value1, value2, "kpi");
            return (Criteria) this;
        }

        public Criteria andForeignIdIsNull() {
            addCriterion("foreign_id is null");
            return (Criteria) this;
        }

        public Criteria andForeignIdIsNotNull() {
            addCriterion("foreign_id is not null");
            return (Criteria) this;
        }

        public Criteria andForeignIdEqualTo(String value) {
            addCriterion("foreign_id =", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotEqualTo(String value) {
            addCriterion("foreign_id <>", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdGreaterThan(String value) {
            addCriterion("foreign_id >", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_id >=", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLessThan(String value) {
            addCriterion("foreign_id <", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLessThanOrEqualTo(String value) {
            addCriterion("foreign_id <=", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLike(String value) {
            addCriterion("foreign_id like", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotLike(String value) {
            addCriterion("foreign_id not like", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdIn(List<String> values) {
            addCriterion("foreign_id in", values, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotIn(List<String> values) {
            addCriterion("foreign_id not in", values, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdBetween(String value1, String value2) {
            addCriterion("foreign_id between", value1, value2, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotBetween(String value1, String value2) {
            addCriterion("foreign_id not between", value1, value2, "foreignId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeIsNull() {
            addCriterion("create_user_type is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeIsNotNull() {
            addCriterion("create_user_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeEqualTo(String value) {
            addCriterion("create_user_type =", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotEqualTo(String value) {
            addCriterion("create_user_type <>", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeGreaterThan(String value) {
            addCriterion("create_user_type >", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_type >=", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeLessThan(String value) {
            addCriterion("create_user_type <", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeLessThanOrEqualTo(String value) {
            addCriterion("create_user_type <=", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeLike(String value) {
            addCriterion("create_user_type like", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotLike(String value) {
            addCriterion("create_user_type not like", value, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeIn(List<String> values) {
            addCriterion("create_user_type in", values, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotIn(List<String> values) {
            addCriterion("create_user_type not in", values, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeBetween(String value1, String value2) {
            addCriterion("create_user_type between", value1, value2, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeNotBetween(String value1, String value2) {
            addCriterion("create_user_type not between", value1, value2, "createUserType");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLikeInsensitive(String value) {
            addCriterion("upper(company_name) like", value.toUpperCase(), "companyName");
            return (Criteria) this;
        }

        public Criteria andLicenseNoLikeInsensitive(String value) {
            addCriterion("upper(license_no) like", value.toUpperCase(), "licenseNo");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andLinkManLikeInsensitive(String value) {
            addCriterion("upper(link_man) like", value.toUpperCase(), "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManJobLikeInsensitive(String value) {
            addCriterion("upper(link_man_job) like", value.toUpperCase(), "linkManJob");
            return (Criteria) this;
        }

        public Criteria andLinkPhoneLikeInsensitive(String value) {
            addCriterion("upper(link_phone) like", value.toUpperCase(), "linkPhone");
            return (Criteria) this;
        }

        public Criteria andLinkMobileLikeInsensitive(String value) {
            addCriterion("upper(link_mobile) like", value.toUpperCase(), "linkMobile");
            return (Criteria) this;
        }

        public Criteria andLinkFaxLikeInsensitive(String value) {
            addCriterion("upper(link_fax) like", value.toUpperCase(), "linkFax");
            return (Criteria) this;
        }

        public Criteria andLinkEmailLikeInsensitive(String value) {
            addCriterion("upper(link_email) like", value.toUpperCase(), "linkEmail");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLikeInsensitive(String value) {
            addCriterion("upper(delete_flag) like", value.toUpperCase(), "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andShortNameLikeInsensitive(String value) {
            addCriterion("upper(short_name) like", value.toUpperCase(), "shortName");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(remark) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andDataSourceLikeInsensitive(String value) {
            addCriterion("upper(data_source) like", value.toUpperCase(), "dataSource");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLikeInsensitive(String value) {
            addCriterion("upper(org_code) like", value.toUpperCase(), "orgCode");
            return (Criteria) this;
        }

        public Criteria andCodeStatusLikeInsensitive(String value) {
            addCriterion("upper(code_status) like", value.toUpperCase(), "codeStatus");
            return (Criteria) this;
        }

        public Criteria andIdentityLikeInsensitive(String value) {
            addCriterion("upper(identity) like", value.toUpperCase(), "identity");
            return (Criteria) this;
        }

        public Criteria andPdCompanyTypeLikeInsensitive(String value) {
            addCriterion("upper(pd_company_type) like", value.toUpperCase(), "pdCompanyType");
            return (Criteria) this;
        }

        public Criteria andLogoUrlLikeInsensitive(String value) {
            addCriterion("upper(logo_url) like", value.toUpperCase(), "logoUrl");
            return (Criteria) this;
        }

        public Criteria andLanguageCodeLikeInsensitive(String value) {
            addCriterion("upper(language_code) like", value.toUpperCase(), "languageCode");
            return (Criteria) this;
        }

        public Criteria andPunishRemarkLikeInsensitive(String value) {
            addCriterion("upper(punish_remark) like", value.toUpperCase(), "punishRemark");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(status) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }

        public Criteria andIdTypeLikeInsensitive(String value) {
            addCriterion("upper(id_type) like", value.toUpperCase(), "idType");
            return (Criteria) this;
        }

        public Criteria andIdNumberLikeInsensitive(String value) {
            addCriterion("upper(id_number) like", value.toUpperCase(), "idNumber");
            return (Criteria) this;
        }

        public Criteria andWebsiteLikeInsensitive(String value) {
            addCriterion("upper(website) like", value.toUpperCase(), "website");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLikeInsensitive(String value) {
            addCriterion("upper(legal_person) like", value.toUpperCase(), "legalPerson");
            return (Criteria) this;
        }

        public Criteria andRegisteredAddressLikeInsensitive(String value) {
            addCriterion("upper(registered_address) like", value.toUpperCase(), "registeredAddress");
            return (Criteria) this;
        }

        public Criteria andOpeningBankLikeInsensitive(String value) {
            addCriterion("upper(opening_bank) like", value.toUpperCase(), "openingBank");
            return (Criteria) this;
        }

        public Criteria andBranchBankLikeInsensitive(String value) {
            addCriterion("upper(branch_bank) like", value.toUpperCase(), "branchBank");
            return (Criteria) this;
        }

        public Criteria andAccountBankLikeInsensitive(String value) {
            addCriterion("upper(account_bank) like", value.toUpperCase(), "accountBank");
            return (Criteria) this;
        }

        public Criteria andTaxTypesLikeInsensitive(String value) {
            addCriterion("upper(tax_types) like", value.toUpperCase(), "taxTypes");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLikeInsensitive(String value) {
            addCriterion("upper(invoice_type) like", value.toUpperCase(), "invoiceType");
            return (Criteria) this;
        }

        public Criteria andVatRateLikeInsensitive(String value) {
            addCriterion("upper(vat_rate) like", value.toUpperCase(), "vatRate");
            return (Criteria) this;
        }

        public Criteria andCreditCodeLikeInsensitive(String value) {
            addCriterion("upper(credit_code) like", value.toUpperCase(), "creditCode");
            return (Criteria) this;
        }

        public Criteria andBusinessScopeLikeInsensitive(String value) {
            addCriterion("upper(business_scope) like", value.toUpperCase(), "businessScope");
            return (Criteria) this;
        }

        public Criteria andLegalPhoneLikeInsensitive(String value) {
            addCriterion("upper(legal_phone) like", value.toUpperCase(), "legalPhone");
            return (Criteria) this;
        }

        public Criteria andIndustryLikeInsensitive(String value) {
            addCriterion("upper(industry) like", value.toUpperCase(), "industry");
            return (Criteria) this;
        }

        public Criteria andGradeReasonLikeInsensitive(String value) {
            addCriterion("upper(grade_reason) like", value.toUpperCase(), "gradeReason");
            return (Criteria) this;
        }

        public Criteria andForeignIdLikeInsensitive(String value) {
            addCriterion("upper(foreign_id) like", value.toUpperCase(), "foreignId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLikeInsensitive(String value) {
            addCriterion("upper(enterprise_type) like", value.toUpperCase(), "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andCreateUserTypeLikeInsensitive(String value) {
            addCriterion("upper(create_user_type) like", value.toUpperCase(), "createUserType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}