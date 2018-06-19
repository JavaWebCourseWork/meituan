package com.zhku.ccl.domain;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFimageIsNull() {
            addCriterion("fimage is null");
            return (Criteria) this;
        }

        public Criteria andFimageIsNotNull() {
            addCriterion("fimage is not null");
            return (Criteria) this;
        }

        public Criteria andFimageEqualTo(String value) {
            addCriterion("fimage =", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageNotEqualTo(String value) {
            addCriterion("fimage <>", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageGreaterThan(String value) {
            addCriterion("fimage >", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageGreaterThanOrEqualTo(String value) {
            addCriterion("fimage >=", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageLessThan(String value) {
            addCriterion("fimage <", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageLessThanOrEqualTo(String value) {
            addCriterion("fimage <=", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageLike(String value) {
            addCriterion("fimage like", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageNotLike(String value) {
            addCriterion("fimage not like", value, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageIn(List<String> values) {
            addCriterion("fimage in", values, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageNotIn(List<String> values) {
            addCriterion("fimage not in", values, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageBetween(String value1, String value2) {
            addCriterion("fimage between", value1, value2, "fimage");
            return (Criteria) this;
        }

        public Criteria andFimageNotBetween(String value1, String value2) {
            addCriterion("fimage not between", value1, value2, "fimage");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNull() {
            addCriterion("fprice is null");
            return (Criteria) this;
        }

        public Criteria andFpriceIsNotNull() {
            addCriterion("fprice is not null");
            return (Criteria) this;
        }

        public Criteria andFpriceEqualTo(Float value) {
            addCriterion("fprice =", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotEqualTo(Float value) {
            addCriterion("fprice <>", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThan(Float value) {
            addCriterion("fprice >", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("fprice >=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThan(Float value) {
            addCriterion("fprice <", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceLessThanOrEqualTo(Float value) {
            addCriterion("fprice <=", value, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceIn(List<Float> values) {
            addCriterion("fprice in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotIn(List<Float> values) {
            addCriterion("fprice not in", values, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceBetween(Float value1, Float value2) {
            addCriterion("fprice between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFpriceNotBetween(Float value1, Float value2) {
            addCriterion("fprice not between", value1, value2, "fprice");
            return (Criteria) this;
        }

        public Criteria andFtagidIsNull() {
            addCriterion("ftagid is null");
            return (Criteria) this;
        }

        public Criteria andFtagidIsNotNull() {
            addCriterion("ftagid is not null");
            return (Criteria) this;
        }

        public Criteria andFtagidEqualTo(Integer value) {
            addCriterion("ftagid =", value, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidNotEqualTo(Integer value) {
            addCriterion("ftagid <>", value, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidGreaterThan(Integer value) {
            addCriterion("ftagid >", value, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ftagid >=", value, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidLessThan(Integer value) {
            addCriterion("ftagid <", value, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidLessThanOrEqualTo(Integer value) {
            addCriterion("ftagid <=", value, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidIn(List<Integer> values) {
            addCriterion("ftagid in", values, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidNotIn(List<Integer> values) {
            addCriterion("ftagid not in", values, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidBetween(Integer value1, Integer value2) {
            addCriterion("ftagid between", value1, value2, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFtagidNotBetween(Integer value1, Integer value2) {
            addCriterion("ftagid not between", value1, value2, "ftagid");
            return (Criteria) this;
        }

        public Criteria andFisbanIsNull() {
            addCriterion("fisban is null");
            return (Criteria) this;
        }

        public Criteria andFisbanIsNotNull() {
            addCriterion("fisban is not null");
            return (Criteria) this;
        }

        public Criteria andFisbanEqualTo(Boolean value) {
            addCriterion("fisban =", value, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanNotEqualTo(Boolean value) {
            addCriterion("fisban <>", value, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanGreaterThan(Boolean value) {
            addCriterion("fisban >", value, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fisban >=", value, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanLessThan(Boolean value) {
            addCriterion("fisban <", value, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanLessThanOrEqualTo(Boolean value) {
            addCriterion("fisban <=", value, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanIn(List<Boolean> values) {
            addCriterion("fisban in", values, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanNotIn(List<Boolean> values) {
            addCriterion("fisban not in", values, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanBetween(Boolean value1, Boolean value2) {
            addCriterion("fisban between", value1, value2, "fisban");
            return (Criteria) this;
        }

        public Criteria andFisbanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fisban not between", value1, value2, "fisban");
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