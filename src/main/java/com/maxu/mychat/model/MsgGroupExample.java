package com.maxu.mychat.model;

import java.util.ArrayList;
import java.util.List;

public class MsgGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MsgGroupExample() {
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

        public Criteria andMsgfromIsNull() {
            addCriterion("msgFrom is null");
            return (Criteria) this;
        }

        public Criteria andMsgfromIsNotNull() {
            addCriterion("msgFrom is not null");
            return (Criteria) this;
        }

        public Criteria andMsgfromEqualTo(Integer value) {
            addCriterion("msgFrom =", value, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromNotEqualTo(Integer value) {
            addCriterion("msgFrom <>", value, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromGreaterThan(Integer value) {
            addCriterion("msgFrom >", value, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromGreaterThanOrEqualTo(Integer value) {
            addCriterion("msgFrom >=", value, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromLessThan(Integer value) {
            addCriterion("msgFrom <", value, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromLessThanOrEqualTo(Integer value) {
            addCriterion("msgFrom <=", value, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromIn(List<Integer> values) {
            addCriterion("msgFrom in", values, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromNotIn(List<Integer> values) {
            addCriterion("msgFrom not in", values, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromBetween(Integer value1, Integer value2) {
            addCriterion("msgFrom between", value1, value2, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgfromNotBetween(Integer value1, Integer value2) {
            addCriterion("msgFrom not between", value1, value2, "msgfrom");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNull() {
            addCriterion("msgContent is null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIsNotNull() {
            addCriterion("msgContent is not null");
            return (Criteria) this;
        }

        public Criteria andMsgcontentEqualTo(String value) {
            addCriterion("msgContent =", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotEqualTo(String value) {
            addCriterion("msgContent <>", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThan(String value) {
            addCriterion("msgContent >", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentGreaterThanOrEqualTo(String value) {
            addCriterion("msgContent >=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThan(String value) {
            addCriterion("msgContent <", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLessThanOrEqualTo(String value) {
            addCriterion("msgContent <=", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentLike(String value) {
            addCriterion("msgContent like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotLike(String value) {
            addCriterion("msgContent not like", value, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentIn(List<String> values) {
            addCriterion("msgContent in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotIn(List<String> values) {
            addCriterion("msgContent not in", values, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentBetween(String value1, String value2) {
            addCriterion("msgContent between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgcontentNotBetween(String value1, String value2) {
            addCriterion("msgContent not between", value1, value2, "msgcontent");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIsNull() {
            addCriterion("msgTime is null");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIsNotNull() {
            addCriterion("msgTime is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtimeEqualTo(String value) {
            addCriterion("msgTime =", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotEqualTo(String value) {
            addCriterion("msgTime <>", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeGreaterThan(String value) {
            addCriterion("msgTime >", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeGreaterThanOrEqualTo(String value) {
            addCriterion("msgTime >=", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLessThan(String value) {
            addCriterion("msgTime <", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLessThanOrEqualTo(String value) {
            addCriterion("msgTime <=", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeLike(String value) {
            addCriterion("msgTime like", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotLike(String value) {
            addCriterion("msgTime not like", value, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeIn(List<String> values) {
            addCriterion("msgTime in", values, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotIn(List<String> values) {
            addCriterion("msgTime not in", values, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeBetween(String value1, String value2) {
            addCriterion("msgTime between", value1, value2, "msgtime");
            return (Criteria) this;
        }

        public Criteria andMsgtimeNotBetween(String value1, String value2) {
            addCriterion("msgTime not between", value1, value2, "msgtime");
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