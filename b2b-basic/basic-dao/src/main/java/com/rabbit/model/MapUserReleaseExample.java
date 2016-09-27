package com.rabbit.model;

import java.util.ArrayList;
import java.util.List;

public class MapUserReleaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MapUserReleaseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdIsNull() {
            addCriterion("SYS_ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdIsNotNull() {
            addCriterion("SYS_ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdEqualTo(Long value) {
            addCriterion("SYS_ADMIN_ID =", value, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdNotEqualTo(Long value) {
            addCriterion("SYS_ADMIN_ID <>", value, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdGreaterThan(Long value) {
            addCriterion("SYS_ADMIN_ID >", value, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SYS_ADMIN_ID >=", value, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdLessThan(Long value) {
            addCriterion("SYS_ADMIN_ID <", value, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdLessThanOrEqualTo(Long value) {
            addCriterion("SYS_ADMIN_ID <=", value, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdIn(List<Long> values) {
            addCriterion("SYS_ADMIN_ID in", values, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdNotIn(List<Long> values) {
            addCriterion("SYS_ADMIN_ID not in", values, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdBetween(Long value1, Long value2) {
            addCriterion("SYS_ADMIN_ID between", value1, value2, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysAdminIdNotBetween(Long value1, Long value2) {
            addCriterion("SYS_ADMIN_ID not between", value1, value2, "sysAdminId");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeIsNull() {
            addCriterion("SYS_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeIsNotNull() {
            addCriterion("SYS_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeEqualTo(String value) {
            addCriterion("SYS_ORG_CODE =", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotEqualTo(String value) {
            addCriterion("SYS_ORG_CODE <>", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeGreaterThan(String value) {
            addCriterion("SYS_ORG_CODE >", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ORG_CODE >=", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLessThan(String value) {
            addCriterion("SYS_ORG_CODE <", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_ORG_CODE <=", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLike(String value) {
            addCriterion("SYS_ORG_CODE like", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotLike(String value) {
            addCriterion("SYS_ORG_CODE not like", value, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeIn(List<String> values) {
            addCriterion("SYS_ORG_CODE in", values, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotIn(List<String> values) {
            addCriterion("SYS_ORG_CODE not in", values, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeBetween(String value1, String value2) {
            addCriterion("SYS_ORG_CODE between", value1, value2, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_ORG_CODE not between", value1, value2, "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeIsNull() {
            addCriterion("USR_ROLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeIsNotNull() {
            addCriterion("USR_ROLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeEqualTo(String value) {
            addCriterion("USR_ROLE_CODE =", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeNotEqualTo(String value) {
            addCriterion("USR_ROLE_CODE <>", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeGreaterThan(String value) {
            addCriterion("USR_ROLE_CODE >", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USR_ROLE_CODE >=", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeLessThan(String value) {
            addCriterion("USR_ROLE_CODE <", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeLessThanOrEqualTo(String value) {
            addCriterion("USR_ROLE_CODE <=", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeLike(String value) {
            addCriterion("USR_ROLE_CODE like", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeNotLike(String value) {
            addCriterion("USR_ROLE_CODE not like", value, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeIn(List<String> values) {
            addCriterion("USR_ROLE_CODE in", values, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeNotIn(List<String> values) {
            addCriterion("USR_ROLE_CODE not in", values, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeBetween(String value1, String value2) {
            addCriterion("USR_ROLE_CODE between", value1, value2, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeNotBetween(String value1, String value2) {
            addCriterion("USR_ROLE_CODE not between", value1, value2, "usrRoleCode");
            return (Criteria) this;
        }

        public Criteria andSysOrgCodeLikeInsensitive(String value) {
            addCriterion("upper(SYS_ORG_CODE) like", value.toUpperCase(), "sysOrgCode");
            return (Criteria) this;
        }

        public Criteria andUsrRoleCodeLikeInsensitive(String value) {
            addCriterion("upper(USR_ROLE_CODE) like", value.toUpperCase(), "usrRoleCode");
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