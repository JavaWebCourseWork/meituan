package com.zhku.ccl.domain;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andSnameIsNull() {
            addCriterion("sname is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("sname is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("sname =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("sname <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("sname >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("sname >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("sname <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("sname <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("sname like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("sname not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("sname in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("sname not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("sname between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("sname not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNull() {
            addCriterion("saddress is null");
            return (Criteria) this;
        }

        public Criteria andSaddressIsNotNull() {
            addCriterion("saddress is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressEqualTo(String value) {
            addCriterion("saddress =", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotEqualTo(String value) {
            addCriterion("saddress <>", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThan(String value) {
            addCriterion("saddress >", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressGreaterThanOrEqualTo(String value) {
            addCriterion("saddress >=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThan(String value) {
            addCriterion("saddress <", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLessThanOrEqualTo(String value) {
            addCriterion("saddress <=", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressLike(String value) {
            addCriterion("saddress like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotLike(String value) {
            addCriterion("saddress not like", value, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressIn(List<String> values) {
            addCriterion("saddress in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotIn(List<String> values) {
            addCriterion("saddress not in", values, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressBetween(String value1, String value2) {
            addCriterion("saddress between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSaddressNotBetween(String value1, String value2) {
            addCriterion("saddress not between", value1, value2, "saddress");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("sphone is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("sphone is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("sphone =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("sphone <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("sphone >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sphone >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("sphone <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("sphone <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("sphone like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("sphone not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("sphone in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("sphone not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("sphone between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("sphone not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSstabusinessIsNull() {
            addCriterion("sstabusiness is null");
            return (Criteria) this;
        }

        public Criteria andSstabusinessIsNotNull() {
            addCriterion("sstabusiness is not null");
            return (Criteria) this;
        }

        public Criteria andSstabusinessEqualTo(String value) {
            addCriterion("sstabusiness =", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessNotEqualTo(String value) {
            addCriterion("sstabusiness <>", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessGreaterThan(String value) {
            addCriterion("sstabusiness >", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessGreaterThanOrEqualTo(String value) {
            addCriterion("sstabusiness >=", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessLessThan(String value) {
            addCriterion("sstabusiness <", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessLessThanOrEqualTo(String value) {
            addCriterion("sstabusiness <=", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessLike(String value) {
            addCriterion("sstabusiness like", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessNotLike(String value) {
            addCriterion("sstabusiness not like", value, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessIn(List<String> values) {
            addCriterion("sstabusiness in", values, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessNotIn(List<String> values) {
            addCriterion("sstabusiness not in", values, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessBetween(String value1, String value2) {
            addCriterion("sstabusiness between", value1, value2, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSstabusinessNotBetween(String value1, String value2) {
            addCriterion("sstabusiness not between", value1, value2, "sstabusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessIsNull() {
            addCriterion("sendbusiness is null");
            return (Criteria) this;
        }

        public Criteria andSendbusinessIsNotNull() {
            addCriterion("sendbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andSendbusinessEqualTo(String value) {
            addCriterion("sendbusiness =", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessNotEqualTo(String value) {
            addCriterion("sendbusiness <>", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessGreaterThan(String value) {
            addCriterion("sendbusiness >", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessGreaterThanOrEqualTo(String value) {
            addCriterion("sendbusiness >=", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessLessThan(String value) {
            addCriterion("sendbusiness <", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessLessThanOrEqualTo(String value) {
            addCriterion("sendbusiness <=", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessLike(String value) {
            addCriterion("sendbusiness like", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessNotLike(String value) {
            addCriterion("sendbusiness not like", value, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessIn(List<String> values) {
            addCriterion("sendbusiness in", values, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessNotIn(List<String> values) {
            addCriterion("sendbusiness not in", values, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessBetween(String value1, String value2) {
            addCriterion("sendbusiness between", value1, value2, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSendbusinessNotBetween(String value1, String value2) {
            addCriterion("sendbusiness not between", value1, value2, "sendbusiness");
            return (Criteria) this;
        }

        public Criteria andSstateIsNull() {
            addCriterion("sstate is null");
            return (Criteria) this;
        }

        public Criteria andSstateIsNotNull() {
            addCriterion("sstate is not null");
            return (Criteria) this;
        }

        public Criteria andSstateEqualTo(Integer value) {
            addCriterion("sstate =", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotEqualTo(Integer value) {
            addCriterion("sstate <>", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThan(Integer value) {
            addCriterion("sstate >", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("sstate >=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThan(Integer value) {
            addCriterion("sstate <", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateLessThanOrEqualTo(Integer value) {
            addCriterion("sstate <=", value, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateIn(List<Integer> values) {
            addCriterion("sstate in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotIn(List<Integer> values) {
            addCriterion("sstate not in", values, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateBetween(Integer value1, Integer value2) {
            addCriterion("sstate between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSstateNotBetween(Integer value1, Integer value2) {
            addCriterion("sstate not between", value1, value2, "sstate");
            return (Criteria) this;
        }

        public Criteria andSfreightIsNull() {
            addCriterion("sfreight is null");
            return (Criteria) this;
        }

        public Criteria andSfreightIsNotNull() {
            addCriterion("sfreight is not null");
            return (Criteria) this;
        }

        public Criteria andSfreightEqualTo(Float value) {
            addCriterion("sfreight =", value, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightNotEqualTo(Float value) {
            addCriterion("sfreight <>", value, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightGreaterThan(Float value) {
            addCriterion("sfreight >", value, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightGreaterThanOrEqualTo(Float value) {
            addCriterion("sfreight >=", value, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightLessThan(Float value) {
            addCriterion("sfreight <", value, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightLessThanOrEqualTo(Float value) {
            addCriterion("sfreight <=", value, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightIn(List<Float> values) {
            addCriterion("sfreight in", values, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightNotIn(List<Float> values) {
            addCriterion("sfreight not in", values, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightBetween(Float value1, Float value2) {
            addCriterion("sfreight between", value1, value2, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSfreightNotBetween(Float value1, Float value2) {
            addCriterion("sfreight not between", value1, value2, "sfreight");
            return (Criteria) this;
        }

        public Criteria andSstartIsNull() {
            addCriterion("sstart is null");
            return (Criteria) this;
        }

        public Criteria andSstartIsNotNull() {
            addCriterion("sstart is not null");
            return (Criteria) this;
        }

        public Criteria andSstartEqualTo(Float value) {
            addCriterion("sstart =", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotEqualTo(Float value) {
            addCriterion("sstart <>", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartGreaterThan(Float value) {
            addCriterion("sstart >", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartGreaterThanOrEqualTo(Float value) {
            addCriterion("sstart >=", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartLessThan(Float value) {
            addCriterion("sstart <", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartLessThanOrEqualTo(Float value) {
            addCriterion("sstart <=", value, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartIn(List<Float> values) {
            addCriterion("sstart in", values, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotIn(List<Float> values) {
            addCriterion("sstart not in", values, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartBetween(Float value1, Float value2) {
            addCriterion("sstart between", value1, value2, "sstart");
            return (Criteria) this;
        }

        public Criteria andSstartNotBetween(Float value1, Float value2) {
            addCriterion("sstart not between", value1, value2, "sstart");
            return (Criteria) this;
        }

        public Criteria andSmeantimeIsNull() {
            addCriterion("smeantime is null");
            return (Criteria) this;
        }

        public Criteria andSmeantimeIsNotNull() {
            addCriterion("smeantime is not null");
            return (Criteria) this;
        }

        public Criteria andSmeantimeEqualTo(Integer value) {
            addCriterion("smeantime =", value, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeNotEqualTo(Integer value) {
            addCriterion("smeantime <>", value, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeGreaterThan(Integer value) {
            addCriterion("smeantime >", value, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("smeantime >=", value, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeLessThan(Integer value) {
            addCriterion("smeantime <", value, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeLessThanOrEqualTo(Integer value) {
            addCriterion("smeantime <=", value, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeIn(List<Integer> values) {
            addCriterion("smeantime in", values, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeNotIn(List<Integer> values) {
            addCriterion("smeantime not in", values, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeBetween(Integer value1, Integer value2) {
            addCriterion("smeantime between", value1, value2, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSmeantimeNotBetween(Integer value1, Integer value2) {
            addCriterion("smeantime not between", value1, value2, "smeantime");
            return (Criteria) this;
        }

        public Criteria andSlicenceIsNull() {
            addCriterion("slicence is null");
            return (Criteria) this;
        }

        public Criteria andSlicenceIsNotNull() {
            addCriterion("slicence is not null");
            return (Criteria) this;
        }

        public Criteria andSlicenceEqualTo(String value) {
            addCriterion("slicence =", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceNotEqualTo(String value) {
            addCriterion("slicence <>", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceGreaterThan(String value) {
            addCriterion("slicence >", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceGreaterThanOrEqualTo(String value) {
            addCriterion("slicence >=", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceLessThan(String value) {
            addCriterion("slicence <", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceLessThanOrEqualTo(String value) {
            addCriterion("slicence <=", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceLike(String value) {
            addCriterion("slicence like", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceNotLike(String value) {
            addCriterion("slicence not like", value, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceIn(List<String> values) {
            addCriterion("slicence in", values, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceNotIn(List<String> values) {
            addCriterion("slicence not in", values, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceBetween(String value1, String value2) {
            addCriterion("slicence between", value1, value2, "slicence");
            return (Criteria) this;
        }

        public Criteria andSlicenceNotBetween(String value1, String value2) {
            addCriterion("slicence not between", value1, value2, "slicence");
            return (Criteria) this;
        }

        public Criteria andSmasterIsNull() {
            addCriterion("smaster is null");
            return (Criteria) this;
        }

        public Criteria andSmasterIsNotNull() {
            addCriterion("smaster is not null");
            return (Criteria) this;
        }

        public Criteria andSmasterEqualTo(String value) {
            addCriterion("smaster =", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterNotEqualTo(String value) {
            addCriterion("smaster <>", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterGreaterThan(String value) {
            addCriterion("smaster >", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterGreaterThanOrEqualTo(String value) {
            addCriterion("smaster >=", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterLessThan(String value) {
            addCriterion("smaster <", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterLessThanOrEqualTo(String value) {
            addCriterion("smaster <=", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterLike(String value) {
            addCriterion("smaster like", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterNotLike(String value) {
            addCriterion("smaster not like", value, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterIn(List<String> values) {
            addCriterion("smaster in", values, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterNotIn(List<String> values) {
            addCriterion("smaster not in", values, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterBetween(String value1, String value2) {
            addCriterion("smaster between", value1, value2, "smaster");
            return (Criteria) this;
        }

        public Criteria andSmasterNotBetween(String value1, String value2) {
            addCriterion("smaster not between", value1, value2, "smaster");
            return (Criteria) this;
        }

        public Criteria andStagidIsNull() {
            addCriterion("stagid is null");
            return (Criteria) this;
        }

        public Criteria andStagidIsNotNull() {
            addCriterion("stagid is not null");
            return (Criteria) this;
        }

        public Criteria andStagidEqualTo(Integer value) {
            addCriterion("stagid =", value, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidNotEqualTo(Integer value) {
            addCriterion("stagid <>", value, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidGreaterThan(Integer value) {
            addCriterion("stagid >", value, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stagid >=", value, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidLessThan(Integer value) {
            addCriterion("stagid <", value, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidLessThanOrEqualTo(Integer value) {
            addCriterion("stagid <=", value, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidIn(List<Integer> values) {
            addCriterion("stagid in", values, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidNotIn(List<Integer> values) {
            addCriterion("stagid not in", values, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidBetween(Integer value1, Integer value2) {
            addCriterion("stagid between", value1, value2, "stagid");
            return (Criteria) this;
        }

        public Criteria andStagidNotBetween(Integer value1, Integer value2) {
            addCriterion("stagid not between", value1, value2, "stagid");
            return (Criteria) this;
        }

        public Criteria andSstarIsNull() {
            addCriterion("sstar is null");
            return (Criteria) this;
        }

        public Criteria andSstarIsNotNull() {
            addCriterion("sstar is not null");
            return (Criteria) this;
        }

        public Criteria andSstarEqualTo(Float value) {
            addCriterion("sstar =", value, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarNotEqualTo(Float value) {
            addCriterion("sstar <>", value, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarGreaterThan(Float value) {
            addCriterion("sstar >", value, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarGreaterThanOrEqualTo(Float value) {
            addCriterion("sstar >=", value, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarLessThan(Float value) {
            addCriterion("sstar <", value, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarLessThanOrEqualTo(Float value) {
            addCriterion("sstar <=", value, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarIn(List<Float> values) {
            addCriterion("sstar in", values, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarNotIn(List<Float> values) {
            addCriterion("sstar not in", values, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarBetween(Float value1, Float value2) {
            addCriterion("sstar between", value1, value2, "sstar");
            return (Criteria) this;
        }

        public Criteria andSstarNotBetween(Float value1, Float value2) {
            addCriterion("sstar not between", value1, value2, "sstar");
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