package com.taotao.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ServiceprocalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceprocalExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("SERVICEID is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("SERVICEID is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(String value) {
            addCriterion("SERVICEID =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(String value) {
            addCriterion("SERVICEID <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(String value) {
            addCriterion("SERVICEID >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICEID >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(String value) {
            addCriterion("SERVICEID <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(String value) {
            addCriterion("SERVICEID <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLike(String value) {
            addCriterion("SERVICEID like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotLike(String value) {
            addCriterion("SERVICEID not like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<String> values) {
            addCriterion("SERVICEID in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<String> values) {
            addCriterion("SERVICEID not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(String value1, String value2) {
            addCriterion("SERVICEID between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(String value1, String value2) {
            addCriterion("SERVICEID not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNull() {
            addCriterion("SERVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andServicenameIsNotNull() {
            addCriterion("SERVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andServicenameEqualTo(String value) {
            addCriterion("SERVICENAME =", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotEqualTo(String value) {
            addCriterion("SERVICENAME <>", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThan(String value) {
            addCriterion("SERVICENAME >", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICENAME >=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThan(String value) {
            addCriterion("SERVICENAME <", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLessThanOrEqualTo(String value) {
            addCriterion("SERVICENAME <=", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameLike(String value) {
            addCriterion("SERVICENAME like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotLike(String value) {
            addCriterion("SERVICENAME not like", value, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameIn(List<String> values) {
            addCriterion("SERVICENAME in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotIn(List<String> values) {
            addCriterion("SERVICENAME not in", values, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameBetween(String value1, String value2) {
            addCriterion("SERVICENAME between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andServicenameNotBetween(String value1, String value2) {
            addCriterion("SERVICENAME not between", value1, value2, "servicename");
            return (Criteria) this;
        }

        public Criteria andTimedateIsNull() {
            addCriterion("TIMEDATE is null");
            return (Criteria) this;
        }

        public Criteria andTimedateIsNotNull() {
            addCriterion("TIMEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTimedateEqualTo(Date value) {
            addCriterion("TIMEDATE =", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateNotEqualTo(Date value) {
            addCriterion("TIMEDATE <>", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateGreaterThan(Date value) {
            addCriterion("TIMEDATE >", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateGreaterThanOrEqualTo(Date value) {
            addCriterion("TIMEDATE >=", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateLessThan(Date value) {
            addCriterion("TIMEDATE <", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateLessThanOrEqualTo(Date value) {
            addCriterion("TIMEDATE <=", value, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateIn(List<Date> values) {
            addCriterion("TIMEDATE in", values, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateNotIn(List<Date> values) {
            addCriterion("TIMEDATE not in", values, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateBetween(Date value1, Date value2) {
            addCriterion("TIMEDATE between", value1, value2, "timedate");
            return (Criteria) this;
        }

        public Criteria andTimedateNotBetween(Date value1, Date value2) {
            addCriterion("TIMEDATE not between", value1, value2, "timedate");
            return (Criteria) this;
        }

        public Criteria andConsumtimeIsNull() {
            addCriterion("CONSUMTIME is null");
            return (Criteria) this;
        }

        public Criteria andConsumtimeIsNotNull() {
            addCriterion("CONSUMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConsumtimeEqualTo(BigDecimal value) {
            addCriterion("CONSUMTIME =", value, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeNotEqualTo(BigDecimal value) {
            addCriterion("CONSUMTIME <>", value, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeGreaterThan(BigDecimal value) {
            addCriterion("CONSUMTIME >", value, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSUMTIME >=", value, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeLessThan(BigDecimal value) {
            addCriterion("CONSUMTIME <", value, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSUMTIME <=", value, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeIn(List<BigDecimal> values) {
            addCriterion("CONSUMTIME in", values, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeNotIn(List<BigDecimal> values) {
            addCriterion("CONSUMTIME not in", values, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSUMTIME between", value1, value2, "consumtime");
            return (Criteria) this;
        }

        public Criteria andConsumtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSUMTIME not between", value1, value2, "consumtime");
            return (Criteria) this;
        }

        public Criteria andBiztracknoIsNull() {
            addCriterion("BIZTRACKNO is null");
            return (Criteria) this;
        }

        public Criteria andBiztracknoIsNotNull() {
            addCriterion("BIZTRACKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBiztracknoEqualTo(String value) {
            addCriterion("BIZTRACKNO =", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotEqualTo(String value) {
            addCriterion("BIZTRACKNO <>", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoGreaterThan(String value) {
            addCriterion("BIZTRACKNO >", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoGreaterThanOrEqualTo(String value) {
            addCriterion("BIZTRACKNO >=", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoLessThan(String value) {
            addCriterion("BIZTRACKNO <", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoLessThanOrEqualTo(String value) {
            addCriterion("BIZTRACKNO <=", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoLike(String value) {
            addCriterion("BIZTRACKNO like", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotLike(String value) {
            addCriterion("BIZTRACKNO not like", value, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoIn(List<String> values) {
            addCriterion("BIZTRACKNO in", values, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotIn(List<String> values) {
            addCriterion("BIZTRACKNO not in", values, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoBetween(String value1, String value2) {
            addCriterion("BIZTRACKNO between", value1, value2, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andBiztracknoNotBetween(String value1, String value2) {
            addCriterion("BIZTRACKNO not between", value1, value2, "biztrackno");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("TRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("TRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANSDATE >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(Date value) {
            addCriterionForJDBCDate("TRANSDATE <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSDATE in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSDATE not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSDATE between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSDATE not between", value1, value2, "transdate");
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