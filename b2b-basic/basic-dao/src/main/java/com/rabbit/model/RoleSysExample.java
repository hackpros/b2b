package com.rabbit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoleSysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoleSysExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME_ is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME_ is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME_ =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME_ <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME_ >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_ >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME_ <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME_ <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME_ like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME_ not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME_ in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME_ not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME_ between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME_ not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("DESC_ is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("DESC_ is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("DESC_ =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("DESC_ <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("DESC_ >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("DESC_ >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("DESC_ <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("DESC_ <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("DESC_ like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("DESC_ not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("DESC_ in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("DESC_ not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("DESC_ between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("DESC_ not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE_ is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE_ is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE_ =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE_ <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE_ >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_ >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE_ <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE_ <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE_ like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE_ not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE_ in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE_ not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE_ between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE_ not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("CATEGORY_ is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("CATEGORY_ is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("CATEGORY_ =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("CATEGORY_ <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("CATEGORY_ >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("CATEGORY_ <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("CATEGORY_ <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("CATEGORY_ in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("CATEGORY_ not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("CATEGORY_ not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS_ is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS_ is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS_ =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS_ <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS_ >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS_ >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS_ <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS_ <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS_ in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS_ not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS_ between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS_ not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAppendByIsNull() {
            addCriterion("APPEND_BY is null");
            return (Criteria) this;
        }

        public Criteria andAppendByIsNotNull() {
            addCriterion("APPEND_BY is not null");
            return (Criteria) this;
        }

        public Criteria andAppendByEqualTo(Long value) {
            addCriterion("APPEND_BY =", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotEqualTo(Long value) {
            addCriterion("APPEND_BY <>", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThan(Long value) {
            addCriterion("APPEND_BY >", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThanOrEqualTo(Long value) {
            addCriterion("APPEND_BY >=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThan(Long value) {
            addCriterion("APPEND_BY <", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThanOrEqualTo(Long value) {
            addCriterion("APPEND_BY <=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByIn(List<Long> values) {
            addCriterion("APPEND_BY in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotIn(List<Long> values) {
            addCriterion("APPEND_BY not in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByBetween(Long value1, Long value2) {
            addCriterion("APPEND_BY between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotBetween(Long value1, Long value2) {
            addCriterion("APPEND_BY not between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendTimeIsNull() {
            addCriterion("APPEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAppendTimeIsNotNull() {
            addCriterion("APPEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAppendTimeEqualTo(Date value) {
            addCriterion("APPEND_TIME =", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeNotEqualTo(Date value) {
            addCriterion("APPEND_TIME <>", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeGreaterThan(Date value) {
            addCriterion("APPEND_TIME >", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("APPEND_TIME >=", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeLessThan(Date value) {
            addCriterion("APPEND_TIME <", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeLessThanOrEqualTo(Date value) {
            addCriterion("APPEND_TIME <=", value, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeIn(List<Date> values) {
            addCriterion("APPEND_TIME in", values, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeNotIn(List<Date> values) {
            addCriterion("APPEND_TIME not in", values, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeBetween(Date value1, Date value2) {
            addCriterion("APPEND_TIME between", value1, value2, "appendTime");
            return (Criteria) this;
        }

        public Criteria andAppendTimeNotBetween(Date value1, Date value2) {
            addCriterion("APPEND_TIME not between", value1, value2, "appendTime");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNull() {
            addCriterion("MODIFY_BY is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("MODIFY_BY is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(Long value) {
            addCriterion("MODIFY_BY =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(Long value) {
            addCriterion("MODIFY_BY <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(Long value) {
            addCriterion("MODIFY_BY >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFY_BY >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(Long value) {
            addCriterion("MODIFY_BY <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(Long value) {
            addCriterion("MODIFY_BY <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<Long> values) {
            addCriterion("MODIFY_BY in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<Long> values) {
            addCriterion("MODIFY_BY not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(Long value1, Long value2) {
            addCriterion("MODIFY_BY between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(Long value1, Long value2) {
            addCriterion("MODIFY_BY not between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("MODIFIED_TIME =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("MODIFIED_TIME >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("MODIFIED_TIME <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIED_TIME <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("MODIFIED_TIME in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("MODIFIED_TIME not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIED_TIME not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK_ is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK_ is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK_ =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK_ <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK_ >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK_ >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK_ <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK_ <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK_ like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK_ not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK_ in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK_ not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK_ between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK_ not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(NAME_) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andDescLikeInsensitive(String value) {
            addCriterion("upper(DESC_) like", value.toUpperCase(), "desc");
            return (Criteria) this;
        }

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(CODE_) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK_) like", value.toUpperCase(), "remark");
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