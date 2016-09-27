package com.rabbit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysItemExample() {
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

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLadderIsNull() {
            addCriterion("LADDER_ is null");
            return (Criteria) this;
        }

        public Criteria andLadderIsNotNull() {
            addCriterion("LADDER_ is not null");
            return (Criteria) this;
        }

        public Criteria andLadderEqualTo(int value) {
            addCriterion("LADDER_ =", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotEqualTo(int value) {
            addCriterion("LADDER_ <>", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderGreaterThan(int value) {
            addCriterion("LADDER_ >", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderGreaterThanOrEqualTo(int value) {
            addCriterion("LADDER_ >=", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderLessThan(int value) {
            addCriterion("LADDER_ <", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderLessThanOrEqualTo(int value) {
            addCriterion("LADDER_ <=", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderLike(int value) {
            addCriterion("LADDER_ like", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotLike(int value) {
            addCriterion("LADDER_ not like", value, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderIn(List<Integer> values) {
            addCriterion("LADDER_ in", values, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotIn(List<Integer> values) {
            addCriterion("LADDER_ not in", values, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderBetween(int value1, int value2) {
            addCriterion("LADDER_ between", value1, value2, "ladder");
            return (Criteria) this;
        }

        public Criteria andLadderNotBetween(int value1, int value2) {
            addCriterion("LADDER_ not between", value1, value2, "ladder");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCommentsIsNull() {
            addCriterion("ITEM_COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andItemCommentsIsNotNull() {
            addCriterion("ITEM_COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andItemCommentsEqualTo(String value) {
            addCriterion("ITEM_COMMENTS =", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsNotEqualTo(String value) {
            addCriterion("ITEM_COMMENTS <>", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsGreaterThan(String value) {
            addCriterion("ITEM_COMMENTS >", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_COMMENTS >=", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsLessThan(String value) {
            addCriterion("ITEM_COMMENTS <", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsLessThanOrEqualTo(String value) {
            addCriterion("ITEM_COMMENTS <=", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsLike(String value) {
            addCriterion("ITEM_COMMENTS like", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsNotLike(String value) {
            addCriterion("ITEM_COMMENTS not like", value, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsIn(List<String> values) {
            addCriterion("ITEM_COMMENTS in", values, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsNotIn(List<String> values) {
            addCriterion("ITEM_COMMENTS not in", values, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsBetween(String value1, String value2) {
            addCriterion("ITEM_COMMENTS between", value1, value2, "itemComments");
            return (Criteria) this;
        }

        public Criteria andItemCommentsNotBetween(String value1, String value2) {
            addCriterion("ITEM_COMMENTS not between", value1, value2, "itemComments");
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

        public Criteria andKeyCodeIsNull() {
            addCriterion("KEY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIsNotNull() {
            addCriterion("KEY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyCodeEqualTo(String value) {
            addCriterion("KEY_CODE =", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotEqualTo(String value) {
            addCriterion("KEY_CODE <>", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeGreaterThan(String value) {
            addCriterion("KEY_CODE >", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_CODE >=", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLessThan(String value) {
            addCriterion("KEY_CODE <", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLessThanOrEqualTo(String value) {
            addCriterion("KEY_CODE <=", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLike(String value) {
            addCriterion("KEY_CODE like", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotLike(String value) {
            addCriterion("KEY_CODE not like", value, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeIn(List<String> values) {
            addCriterion("KEY_CODE in", values, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotIn(List<String> values) {
            addCriterion("KEY_CODE not in", values, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeBetween(String value1, String value2) {
            addCriterion("KEY_CODE between", value1, value2, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyCodeNotBetween(String value1, String value2) {
            addCriterion("KEY_CODE not between", value1, value2, "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyValueIsNull() {
            addCriterion("KEY_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andKeyValueIsNotNull() {
            addCriterion("KEY_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andKeyValueEqualTo(String value) {
            addCriterion("KEY_VALUE =", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotEqualTo(String value) {
            addCriterion("KEY_VALUE <>", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueGreaterThan(String value) {
            addCriterion("KEY_VALUE >", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_VALUE >=", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueLessThan(String value) {
            addCriterion("KEY_VALUE <", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueLessThanOrEqualTo(String value) {
            addCriterion("KEY_VALUE <=", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueLike(String value) {
            addCriterion("KEY_VALUE like", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotLike(String value) {
            addCriterion("KEY_VALUE not like", value, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueIn(List<String> values) {
            addCriterion("KEY_VALUE in", values, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotIn(List<String> values) {
            addCriterion("KEY_VALUE not in", values, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueBetween(String value1, String value2) {
            addCriterion("KEY_VALUE between", value1, value2, "keyValue");
            return (Criteria) this;
        }

        public Criteria andKeyValueNotBetween(String value1, String value2) {
            addCriterion("KEY_VALUE not between", value1, value2, "keyValue");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("SORT_ is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("SORT_ is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Short value) {
            addCriterion("SORT_ =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Short value) {
            addCriterion("SORT_ <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Short value) {
            addCriterion("SORT_ >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Short value) {
            addCriterion("SORT_ >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Short value) {
            addCriterion("SORT_ <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Short value) {
            addCriterion("SORT_ <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Short> values) {
            addCriterion("SORT_ in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Short> values) {
            addCriterion("SORT_ not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Short value1, Short value2) {
            addCriterion("SORT_ between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Short value1, Short value2) {
            addCriterion("SORT_ not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andAppendByIsNull() {
            addCriterion("APPEND_BY_ is null");
            return (Criteria) this;
        }

        public Criteria andAppendByIsNotNull() {
            addCriterion("APPEND_BY_ is not null");
            return (Criteria) this;
        }

        public Criteria andAppendByEqualTo(Long value) {
            addCriterion("APPEND_BY_ =", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotEqualTo(Long value) {
            addCriterion("APPEND_BY_ <>", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThan(Long value) {
            addCriterion("APPEND_BY_ >", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByGreaterThanOrEqualTo(Long value) {
            addCriterion("APPEND_BY_ >=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThan(Long value) {
            addCriterion("APPEND_BY_ <", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByLessThanOrEqualTo(Long value) {
            addCriterion("APPEND_BY_ <=", value, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByIn(List<Long> values) {
            addCriterion("APPEND_BY_ in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotIn(List<Long> values) {
            addCriterion("APPEND_BY_ not in", values, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByBetween(Long value1, Long value2) {
            addCriterion("APPEND_BY_ between", value1, value2, "appendBy");
            return (Criteria) this;
        }

        public Criteria andAppendByNotBetween(Long value1, Long value2) {
            addCriterion("APPEND_BY_ not between", value1, value2, "appendBy");
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
            addCriterion("MODIFY_BY_ is null");
            return (Criteria) this;
        }

        public Criteria andModifyByIsNotNull() {
            addCriterion("MODIFY_BY_ is not null");
            return (Criteria) this;
        }

        public Criteria andModifyByEqualTo(Long value) {
            addCriterion("MODIFY_BY_ =", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotEqualTo(Long value) {
            addCriterion("MODIFY_BY_ <>", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThan(Long value) {
            addCriterion("MODIFY_BY_ >", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFY_BY_ >=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThan(Long value) {
            addCriterion("MODIFY_BY_ <", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByLessThanOrEqualTo(Long value) {
            addCriterion("MODIFY_BY_ <=", value, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByIn(List<Long> values) {
            addCriterion("MODIFY_BY_ in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotIn(List<Long> values) {
            addCriterion("MODIFY_BY_ not in", values, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByBetween(Long value1, Long value2) {
            addCriterion("MODIFY_BY_ between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyByNotBetween(Long value1, Long value2) {
            addCriterion("MODIFY_BY_ not between", value1, value2, "modifyBy");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
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

        public Criteria andExcerptItemCodeIsNull() {
            addCriterion("EXCERPT_ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeIsNotNull() {
            addCriterion("EXCERPT_ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeEqualTo(String value) {
            addCriterion("EXCERPT_ITEM_CODE =", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeNotEqualTo(String value) {
            addCriterion("EXCERPT_ITEM_CODE <>", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeGreaterThan(String value) {
            addCriterion("EXCERPT_ITEM_CODE >", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCERPT_ITEM_CODE >=", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeLessThan(String value) {
            addCriterion("EXCERPT_ITEM_CODE <", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeLessThanOrEqualTo(String value) {
            addCriterion("EXCERPT_ITEM_CODE <=", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeLike(String value) {
            addCriterion("EXCERPT_ITEM_CODE like", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeNotLike(String value) {
            addCriterion("EXCERPT_ITEM_CODE not like", value, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeIn(List<String> values) {
            addCriterion("EXCERPT_ITEM_CODE in", values, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeNotIn(List<String> values) {
            addCriterion("EXCERPT_ITEM_CODE not in", values, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeBetween(String value1, String value2) {
            addCriterion("EXCERPT_ITEM_CODE between", value1, value2, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeNotBetween(String value1, String value2) {
            addCriterion("EXCERPT_ITEM_CODE not between", value1, value2, "excerptItemCode");
            return (Criteria) this;
        }

        public Criteria andLadderLikeInsensitive(String value) {
            addCriterion("upper(LADDER_) like", value.toUpperCase(), "ladder");
            return (Criteria) this;
        }

        public Criteria andItemCodeLikeInsensitive(String value) {
            addCriterion("upper(ITEM_CODE) like", value.toUpperCase(), "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCommentsLikeInsensitive(String value) {
            addCriterion("upper(ITEM_COMMENTS) like", value.toUpperCase(), "itemComments");
            return (Criteria) this;
        }

        public Criteria andKeyCodeLikeInsensitive(String value) {
            addCriterion("upper(KEY_CODE) like", value.toUpperCase(), "keyCode");
            return (Criteria) this;
        }

        public Criteria andKeyValueLikeInsensitive(String value) {
            addCriterion("upper(KEY_VALUE) like", value.toUpperCase(), "keyValue");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK_) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andExcerptItemCodeLikeInsensitive(String value) {
            addCriterion("upper(EXCERPT_ITEM_CODE) like", value.toUpperCase(), "excerptItemCode");
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