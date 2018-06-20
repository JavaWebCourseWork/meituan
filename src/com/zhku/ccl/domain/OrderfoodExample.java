package com.zhku.ccl.domain;

import java.util.ArrayList;
import java.util.List;

public class OrderfoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderfoodExample() {
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

        public Criteria andOfidIsNull() {
            addCriterion("ofid is null");
            return (Criteria) this;
        }

        public Criteria andOfidIsNotNull() {
            addCriterion("ofid is not null");
            return (Criteria) this;
        }

        public Criteria andOfidEqualTo(Integer value) {
            addCriterion("ofid =", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotEqualTo(Integer value) {
            addCriterion("ofid <>", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThan(Integer value) {
            addCriterion("ofid >", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofid >=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThan(Integer value) {
            addCriterion("ofid <", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidLessThanOrEqualTo(Integer value) {
            addCriterion("ofid <=", value, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidIn(List<Integer> values) {
            addCriterion("ofid in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotIn(List<Integer> values) {
            addCriterion("ofid not in", values, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidBetween(Integer value1, Integer value2) {
            addCriterion("ofid between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOfidNotBetween(Integer value1, Integer value2) {
            addCriterion("ofid not between", value1, value2, "ofid");
            return (Criteria) this;
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
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

        public Criteria andOfnumberIsNull() {
            addCriterion("ofnumber is null");
            return (Criteria) this;
        }

        public Criteria andOfnumberIsNotNull() {
            addCriterion("ofnumber is not null");
            return (Criteria) this;
        }

        public Criteria andOfnumberEqualTo(Integer value) {
            addCriterion("ofnumber =", value, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberNotEqualTo(Integer value) {
            addCriterion("ofnumber <>", value, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberGreaterThan(Integer value) {
            addCriterion("ofnumber >", value, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ofnumber >=", value, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberLessThan(Integer value) {
            addCriterion("ofnumber <", value, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberLessThanOrEqualTo(Integer value) {
            addCriterion("ofnumber <=", value, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberIn(List<Integer> values) {
            addCriterion("ofnumber in", values, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberNotIn(List<Integer> values) {
            addCriterion("ofnumber not in", values, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberBetween(Integer value1, Integer value2) {
            addCriterion("ofnumber between", value1, value2, "ofnumber");
            return (Criteria) this;
        }

        public Criteria andOfnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("ofnumber not between", value1, value2, "ofnumber");
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