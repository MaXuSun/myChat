package com.maxu.mychat.model;

import java.util.ArrayList;
import java.util.List;

public class LogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogExample() {
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

        public Criteria andLogidIsNull() {
            addCriterion("logId is null");
            return (Criteria) this;
        }

        public Criteria andLogidIsNotNull() {
            addCriterion("logId is not null");
            return (Criteria) this;
        }

        public Criteria andLogidEqualTo(Integer value) {
            addCriterion("logId =", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotEqualTo(Integer value) {
            addCriterion("logId <>", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThan(Integer value) {
            addCriterion("logId >", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("logId >=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThan(Integer value) {
            addCriterion("logId <", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidLessThanOrEqualTo(Integer value) {
            addCriterion("logId <=", value, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidIn(List<Integer> values) {
            addCriterion("logId in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotIn(List<Integer> values) {
            addCriterion("logId not in", values, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidBetween(Integer value1, Integer value2) {
            addCriterion("logId between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLogidNotBetween(Integer value1, Integer value2) {
            addCriterion("logId not between", value1, value2, "logid");
            return (Criteria) this;
        }

        public Criteria andLoguseridIsNull() {
            addCriterion("logUserId is null");
            return (Criteria) this;
        }

        public Criteria andLoguseridIsNotNull() {
            addCriterion("logUserId is not null");
            return (Criteria) this;
        }

        public Criteria andLoguseridEqualTo(Integer value) {
            addCriterion("logUserId =", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotEqualTo(Integer value) {
            addCriterion("logUserId <>", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridGreaterThan(Integer value) {
            addCriterion("logUserId >", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("logUserId >=", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLessThan(Integer value) {
            addCriterion("logUserId <", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridLessThanOrEqualTo(Integer value) {
            addCriterion("logUserId <=", value, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridIn(List<Integer> values) {
            addCriterion("logUserId in", values, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotIn(List<Integer> values) {
            addCriterion("logUserId not in", values, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridBetween(Integer value1, Integer value2) {
            addCriterion("logUserId between", value1, value2, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLoguseridNotBetween(Integer value1, Integer value2) {
            addCriterion("logUserId not between", value1, value2, "loguserid");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNull() {
            addCriterion("logTime is null");
            return (Criteria) this;
        }

        public Criteria andLogtimeIsNotNull() {
            addCriterion("logTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogtimeEqualTo(String value) {
            addCriterion("logTime =", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotEqualTo(String value) {
            addCriterion("logTime <>", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThan(String value) {
            addCriterion("logTime >", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeGreaterThanOrEqualTo(String value) {
            addCriterion("logTime >=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThan(String value) {
            addCriterion("logTime <", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLessThanOrEqualTo(String value) {
            addCriterion("logTime <=", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeLike(String value) {
            addCriterion("logTime like", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotLike(String value) {
            addCriterion("logTime not like", value, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeIn(List<String> values) {
            addCriterion("logTime in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotIn(List<String> values) {
            addCriterion("logTime not in", values, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeBetween(String value1, String value2) {
            addCriterion("logTime between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtimeNotBetween(String value1, String value2) {
            addCriterion("logTime not between", value1, value2, "logtime");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNull() {
            addCriterion("logType is null");
            return (Criteria) this;
        }

        public Criteria andLogtypeIsNotNull() {
            addCriterion("logType is not null");
            return (Criteria) this;
        }

        public Criteria andLogtypeEqualTo(String value) {
            addCriterion("logType =", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotEqualTo(String value) {
            addCriterion("logType <>", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThan(String value) {
            addCriterion("logType >", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeGreaterThanOrEqualTo(String value) {
            addCriterion("logType >=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThan(String value) {
            addCriterion("logType <", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLessThanOrEqualTo(String value) {
            addCriterion("logType <=", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeLike(String value) {
            addCriterion("logType like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotLike(String value) {
            addCriterion("logType not like", value, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeIn(List<String> values) {
            addCriterion("logType in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotIn(List<String> values) {
            addCriterion("logType not in", values, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeBetween(String value1, String value2) {
            addCriterion("logType between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogtypeNotBetween(String value1, String value2) {
            addCriterion("logType not between", value1, value2, "logtype");
            return (Criteria) this;
        }

        public Criteria andLogdetailIsNull() {
            addCriterion("logDetail is null");
            return (Criteria) this;
        }

        public Criteria andLogdetailIsNotNull() {
            addCriterion("logDetail is not null");
            return (Criteria) this;
        }

        public Criteria andLogdetailEqualTo(String value) {
            addCriterion("logDetail =", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotEqualTo(String value) {
            addCriterion("logDetail <>", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailGreaterThan(String value) {
            addCriterion("logDetail >", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailGreaterThanOrEqualTo(String value) {
            addCriterion("logDetail >=", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailLessThan(String value) {
            addCriterion("logDetail <", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailLessThanOrEqualTo(String value) {
            addCriterion("logDetail <=", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailLike(String value) {
            addCriterion("logDetail like", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotLike(String value) {
            addCriterion("logDetail not like", value, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailIn(List<String> values) {
            addCriterion("logDetail in", values, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotIn(List<String> values) {
            addCriterion("logDetail not in", values, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailBetween(String value1, String value2) {
            addCriterion("logDetail between", value1, value2, "logdetail");
            return (Criteria) this;
        }

        public Criteria andLogdetailNotBetween(String value1, String value2) {
            addCriterion("logDetail not between", value1, value2, "logdetail");
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