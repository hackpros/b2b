/**
 *  introspectedTable.getFullyQualifiedTable().getComment()
 * AppCustomerQueryHelper.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-22 Created
 */
package com.jumore.b2b.daren.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppCustomerQueryHelper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppCustomerQueryHelper() {
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

    /**
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2016-11-22
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOuterInnerIsNull() {
            addCriterion("OUTER_INNER is null");
            return (Criteria) this;
        }

        public Criteria andOuterInnerIsNotNull() {
            addCriterion("OUTER_INNER is not null");
            return (Criteria) this;
        }

        public Criteria andOuterInnerEqualTo(String value) {
            addCriterion("OUTER_INNER =", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerNotEqualTo(String value) {
            addCriterion("OUTER_INNER <>", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerGreaterThan(String value) {
            addCriterion("OUTER_INNER >", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerGreaterThanOrEqualTo(String value) {
            addCriterion("OUTER_INNER >=", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerLessThan(String value) {
            addCriterion("OUTER_INNER <", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerLessThanOrEqualTo(String value) {
            addCriterion("OUTER_INNER <=", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerLike(String value) {
            addCriterion("OUTER_INNER like", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerNotLike(String value) {
            addCriterion("OUTER_INNER not like", value, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerIn(List<String> values) {
            addCriterion("OUTER_INNER in", values, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerNotIn(List<String> values) {
            addCriterion("OUTER_INNER not in", values, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerBetween(String value1, String value2) {
            addCriterion("OUTER_INNER between", value1, value2, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterInnerNotBetween(String value1, String value2) {
            addCriterion("OUTER_INNER not between", value1, value2, "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterDescIsNull() {
            addCriterion("OUTER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andOuterDescIsNotNull() {
            addCriterion("OUTER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andOuterDescEqualTo(String value) {
            addCriterion("OUTER_DESC =", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescNotEqualTo(String value) {
            addCriterion("OUTER_DESC <>", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescGreaterThan(String value) {
            addCriterion("OUTER_DESC >", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescGreaterThanOrEqualTo(String value) {
            addCriterion("OUTER_DESC >=", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescLessThan(String value) {
            addCriterion("OUTER_DESC <", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescLessThanOrEqualTo(String value) {
            addCriterion("OUTER_DESC <=", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescLike(String value) {
            addCriterion("OUTER_DESC like", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescNotLike(String value) {
            addCriterion("OUTER_DESC not like", value, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescIn(List<String> values) {
            addCriterion("OUTER_DESC in", values, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescNotIn(List<String> values) {
            addCriterion("OUTER_DESC not in", values, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescBetween(String value1, String value2) {
            addCriterion("OUTER_DESC between", value1, value2, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andOuterDescNotBetween(String value1, String value2) {
            addCriterion("OUTER_DESC not between", value1, value2, "outerDesc");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNull() {
            addCriterion("CORP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("CORP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("CORP_NAME =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("CORP_NAME <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("CORP_NAME >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_NAME >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("CORP_NAME <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("CORP_NAME <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("CORP_NAME like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("CORP_NAME not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("CORP_NAME in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("CORP_NAME not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("CORP_NAME between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("CORP_NAME not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNull() {
            addCriterion("CORP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNotNull() {
            addCriterion("CORP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeEqualTo(String value) {
            addCriterion("CORP_CODE =", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotEqualTo(String value) {
            addCriterion("CORP_CODE <>", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThan(String value) {
            addCriterion("CORP_CODE >", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_CODE >=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThan(String value) {
            addCriterion("CORP_CODE <", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThanOrEqualTo(String value) {
            addCriterion("CORP_CODE <=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLike(String value) {
            addCriterion("CORP_CODE like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotLike(String value) {
            addCriterion("CORP_CODE not like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIn(List<String> values) {
            addCriterion("CORP_CODE in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotIn(List<String> values) {
            addCriterion("CORP_CODE not in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeBetween(String value1, String value2) {
            addCriterion("CORP_CODE between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotBetween(String value1, String value2) {
            addCriterion("CORP_CODE not between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpInfoIsNull() {
            addCriterion("CORP_INFO is null");
            return (Criteria) this;
        }

        public Criteria andCorpInfoIsNotNull() {
            addCriterion("CORP_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andCorpInfoEqualTo(String value) {
            addCriterion("CORP_INFO =", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoNotEqualTo(String value) {
            addCriterion("CORP_INFO <>", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoGreaterThan(String value) {
            addCriterion("CORP_INFO >", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_INFO >=", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoLessThan(String value) {
            addCriterion("CORP_INFO <", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoLessThanOrEqualTo(String value) {
            addCriterion("CORP_INFO <=", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoLike(String value) {
            addCriterion("CORP_INFO like", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoNotLike(String value) {
            addCriterion("CORP_INFO not like", value, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoIn(List<String> values) {
            addCriterion("CORP_INFO in", values, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoNotIn(List<String> values) {
            addCriterion("CORP_INFO not in", values, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoBetween(String value1, String value2) {
            addCriterion("CORP_INFO between", value1, value2, "corpInfo");
            return (Criteria) this;
        }

        public Criteria andCorpInfoNotBetween(String value1, String value2) {
            addCriterion("CORP_INFO not between", value1, value2, "corpInfo");
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

        public Criteria andAppendByEqualTo(Date value) {
            addCriterion("APPEND_BY =", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotEqualTo(Date value) {
            addCriterion("APPEND_BY <>", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThan(Date value) {
            addCriterion("APPEND_BY >", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThanOrEqualTo(Date value) {
            addCriterion("APPEND_BY >=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThan(Date value) {
            addCriterion("APPEND_BY <", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThanOrEqualTo(Date value) {
            addCriterion("APPEND_BY <=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByIn(List<Date> values) {
            addCriterion("APPEND_BY in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotIn(List<Date> values) {
            addCriterion("APPEND_BY not in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByBetween(Date value1, Date value2) {
            addCriterion("APPEND_BY between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotBetween(Date value1, Date value2) {
            addCriterion("APPEND_BY not between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andOuterInnerLikeInsensitive(String value) {
            addCriterion("upper(OUTER_INNER) like", value.toUpperCase(), "outerInner");
            return (Criteria) this;
        }

        public Criteria andOuterDescLikeInsensitive(String value) {
            addCriterion("upper(OUTER_DESC) like", value.toUpperCase(), "outerDesc");
            return (Criteria) this;
        }

        public Criteria andCorpNameLikeInsensitive(String value) {
            addCriterion("upper(CORP_NAME) like", value.toUpperCase(), "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLikeInsensitive(String value) {
            addCriterion("upper(CORP_CODE) like", value.toUpperCase(), "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpInfoLikeInsensitive(String value) {
            addCriterion("upper(CORP_INFO) like", value.toUpperCase(), "corpInfo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author 菠萝大象
     * @version 1.0 2016-11-22
     */
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