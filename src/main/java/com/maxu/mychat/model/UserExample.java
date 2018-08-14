package com.maxu.mychat.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNull() {
            addCriterion("userNickname is null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIsNotNull() {
            addCriterion("userNickname is not null");
            return (Criteria) this;
        }

        public Criteria andUsernicknameEqualTo(String value) {
            addCriterion("userNickname =", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotEqualTo(String value) {
            addCriterion("userNickname <>", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThan(String value) {
            addCriterion("userNickname >", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameGreaterThanOrEqualTo(String value) {
            addCriterion("userNickname >=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThan(String value) {
            addCriterion("userNickname <", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLessThanOrEqualTo(String value) {
            addCriterion("userNickname <=", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameLike(String value) {
            addCriterion("userNickname like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotLike(String value) {
            addCriterion("userNickname not like", value, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameIn(List<String> values) {
            addCriterion("userNickname in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotIn(List<String> values) {
            addCriterion("userNickname not in", values, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameBetween(String value1, String value2) {
            addCriterion("userNickname between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsernicknameNotBetween(String value1, String value2) {
            addCriterion("userNickname not between", value1, value2, "usernickname");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNull() {
            addCriterion("userGender is null");
            return (Criteria) this;
        }

        public Criteria andUsergenderIsNotNull() {
            addCriterion("userGender is not null");
            return (Criteria) this;
        }

        public Criteria andUsergenderEqualTo(Integer value) {
            addCriterion("userGender =", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotEqualTo(Integer value) {
            addCriterion("userGender <>", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThan(Integer value) {
            addCriterion("userGender >", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("userGender >=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThan(Integer value) {
            addCriterion("userGender <", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderLessThanOrEqualTo(Integer value) {
            addCriterion("userGender <=", value, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderIn(List<Integer> values) {
            addCriterion("userGender in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotIn(List<Integer> values) {
            addCriterion("userGender not in", values, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderBetween(Integer value1, Integer value2) {
            addCriterion("userGender between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUsergenderNotBetween(Integer value1, Integer value2) {
            addCriterion("userGender not between", value1, value2, "usergender");
            return (Criteria) this;
        }

        public Criteria andUserageIsNull() {
            addCriterion("userAge is null");
            return (Criteria) this;
        }

        public Criteria andUserageIsNotNull() {
            addCriterion("userAge is not null");
            return (Criteria) this;
        }

        public Criteria andUserageEqualTo(Integer value) {
            addCriterion("userAge =", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotEqualTo(Integer value) {
            addCriterion("userAge <>", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageGreaterThan(Integer value) {
            addCriterion("userAge >", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageGreaterThanOrEqualTo(Integer value) {
            addCriterion("userAge >=", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLessThan(Integer value) {
            addCriterion("userAge <", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageLessThanOrEqualTo(Integer value) {
            addCriterion("userAge <=", value, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageIn(List<Integer> values) {
            addCriterion("userAge in", values, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotIn(List<Integer> values) {
            addCriterion("userAge not in", values, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageBetween(Integer value1, Integer value2) {
            addCriterion("userAge between", value1, value2, "userage");
            return (Criteria) this;
        }

        public Criteria andUserageNotBetween(Integer value1, Integer value2) {
            addCriterion("userAge not between", value1, value2, "userage");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadIsNull() {
            addCriterion("userProfiledhead is null");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadIsNotNull() {
            addCriterion("userProfiledhead is not null");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadEqualTo(String value) {
            addCriterion("userProfiledhead =", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadNotEqualTo(String value) {
            addCriterion("userProfiledhead <>", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadGreaterThan(String value) {
            addCriterion("userProfiledhead >", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadGreaterThanOrEqualTo(String value) {
            addCriterion("userProfiledhead >=", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadLessThan(String value) {
            addCriterion("userProfiledhead <", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadLessThanOrEqualTo(String value) {
            addCriterion("userProfiledhead <=", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadLike(String value) {
            addCriterion("userProfiledhead like", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadNotLike(String value) {
            addCriterion("userProfiledhead not like", value, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadIn(List<String> values) {
            addCriterion("userProfiledhead in", values, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadNotIn(List<String> values) {
            addCriterion("userProfiledhead not in", values, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadBetween(String value1, String value2) {
            addCriterion("userProfiledhead between", value1, value2, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofiledheadNotBetween(String value1, String value2) {
            addCriterion("userProfiledhead not between", value1, value2, "userprofiledhead");
            return (Criteria) this;
        }

        public Criteria andUserprofileIsNull() {
            addCriterion("userProfile is null");
            return (Criteria) this;
        }

        public Criteria andUserprofileIsNotNull() {
            addCriterion("userProfile is not null");
            return (Criteria) this;
        }

        public Criteria andUserprofileEqualTo(String value) {
            addCriterion("userProfile =", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileNotEqualTo(String value) {
            addCriterion("userProfile <>", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileGreaterThan(String value) {
            addCriterion("userProfile >", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileGreaterThanOrEqualTo(String value) {
            addCriterion("userProfile >=", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileLessThan(String value) {
            addCriterion("userProfile <", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileLessThanOrEqualTo(String value) {
            addCriterion("userProfile <=", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileLike(String value) {
            addCriterion("userProfile like", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileNotLike(String value) {
            addCriterion("userProfile not like", value, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileIn(List<String> values) {
            addCriterion("userProfile in", values, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileNotIn(List<String> values) {
            addCriterion("userProfile not in", values, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileBetween(String value1, String value2) {
            addCriterion("userProfile between", value1, value2, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserprofileNotBetween(String value1, String value2) {
            addCriterion("userProfile not between", value1, value2, "userprofile");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNull() {
            addCriterion("userBirthday is null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIsNotNull() {
            addCriterion("userBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayEqualTo(String value) {
            addCriterion("userBirthday =", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotEqualTo(String value) {
            addCriterion("userBirthday <>", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThan(String value) {
            addCriterion("userBirthday >", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("userBirthday >=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThan(String value) {
            addCriterion("userBirthday <", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLessThanOrEqualTo(String value) {
            addCriterion("userBirthday <=", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayLike(String value) {
            addCriterion("userBirthday like", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotLike(String value) {
            addCriterion("userBirthday not like", value, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayIn(List<String> values) {
            addCriterion("userBirthday in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotIn(List<String> values) {
            addCriterion("userBirthday not in", values, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayBetween(String value1, String value2) {
            addCriterion("userBirthday between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUserbirthdayNotBetween(String value1, String value2) {
            addCriterion("userBirthday not between", value1, value2, "userbirthday");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("userEmail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("userEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("userEmail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("userEmail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("userEmail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("userEmail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("userEmail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("userEmail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("userEmail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("userEmail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("userEmail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("userEmail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("userEmail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("userEmail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseripIsNull() {
            addCriterion("userIp is null");
            return (Criteria) this;
        }

        public Criteria andUseripIsNotNull() {
            addCriterion("userIp is not null");
            return (Criteria) this;
        }

        public Criteria andUseripEqualTo(String value) {
            addCriterion("userIp =", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotEqualTo(String value) {
            addCriterion("userIp <>", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThan(String value) {
            addCriterion("userIp >", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripGreaterThanOrEqualTo(String value) {
            addCriterion("userIp >=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThan(String value) {
            addCriterion("userIp <", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLessThanOrEqualTo(String value) {
            addCriterion("userIp <=", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripLike(String value) {
            addCriterion("userIp like", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotLike(String value) {
            addCriterion("userIp not like", value, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripIn(List<String> values) {
            addCriterion("userIp in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotIn(List<String> values) {
            addCriterion("userIp not in", values, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripBetween(String value1, String value2) {
            addCriterion("userIp between", value1, value2, "userip");
            return (Criteria) this;
        }

        public Criteria andUseripNotBetween(String value1, String value2) {
            addCriterion("userIp not between", value1, value2, "userip");
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