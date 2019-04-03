package com.fengbo.bean;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andUsIdIsNull() {
            addCriterion("us_id is null");
            return (Criteria) this;
        }

        public Criteria andUsIdIsNotNull() {
            addCriterion("us_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdEqualTo(String value) {
            addCriterion("us_id =", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotEqualTo(String value) {
            addCriterion("us_id <>", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThan(String value) {
            addCriterion("us_id >", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdGreaterThanOrEqualTo(String value) {
            addCriterion("us_id >=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThan(String value) {
            addCriterion("us_id <", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLessThanOrEqualTo(String value) {
            addCriterion("us_id <=", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdLike(String value) {
            addCriterion("us_id like", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotLike(String value) {
            addCriterion("us_id not like", value, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdIn(List<String> values) {
            addCriterion("us_id in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotIn(List<String> values) {
            addCriterion("us_id not in", values, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdBetween(String value1, String value2) {
            addCriterion("us_id between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsIdNotBetween(String value1, String value2) {
            addCriterion("us_id not between", value1, value2, "usId");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIsNull() {
            addCriterion("us_username is null");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIsNotNull() {
            addCriterion("us_username is not null");
            return (Criteria) this;
        }

        public Criteria andUsUsernameEqualTo(String value) {
            addCriterion("us_username =", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotEqualTo(String value) {
            addCriterion("us_username <>", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameGreaterThan(String value) {
            addCriterion("us_username >", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("us_username >=", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLessThan(String value) {
            addCriterion("us_username <", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLessThanOrEqualTo(String value) {
            addCriterion("us_username <=", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameLike(String value) {
            addCriterion("us_username like", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotLike(String value) {
            addCriterion("us_username not like", value, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameIn(List<String> values) {
            addCriterion("us_username in", values, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotIn(List<String> values) {
            addCriterion("us_username not in", values, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameBetween(String value1, String value2) {
            addCriterion("us_username between", value1, value2, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsUsernameNotBetween(String value1, String value2) {
            addCriterion("us_username not between", value1, value2, "usUsername");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNull() {
            addCriterion("us_password is null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIsNotNull() {
            addCriterion("us_password is not null");
            return (Criteria) this;
        }

        public Criteria andUsPasswordEqualTo(String value) {
            addCriterion("us_password =", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotEqualTo(String value) {
            addCriterion("us_password <>", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThan(String value) {
            addCriterion("us_password >", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("us_password >=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThan(String value) {
            addCriterion("us_password <", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLessThanOrEqualTo(String value) {
            addCriterion("us_password <=", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordLike(String value) {
            addCriterion("us_password like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotLike(String value) {
            addCriterion("us_password not like", value, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordIn(List<String> values) {
            addCriterion("us_password in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotIn(List<String> values) {
            addCriterion("us_password not in", values, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordBetween(String value1, String value2) {
            addCriterion("us_password between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPasswordNotBetween(String value1, String value2) {
            addCriterion("us_password not between", value1, value2, "usPassword");
            return (Criteria) this;
        }

        public Criteria andUsPhoneIsNull() {
            addCriterion("us_phone is null");
            return (Criteria) this;
        }

        public Criteria andUsPhoneIsNotNull() {
            addCriterion("us_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUsPhoneEqualTo(String value) {
            addCriterion("us_phone =", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotEqualTo(String value) {
            addCriterion("us_phone <>", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneGreaterThan(String value) {
            addCriterion("us_phone >", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("us_phone >=", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneLessThan(String value) {
            addCriterion("us_phone <", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneLessThanOrEqualTo(String value) {
            addCriterion("us_phone <=", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneLike(String value) {
            addCriterion("us_phone like", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotLike(String value) {
            addCriterion("us_phone not like", value, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneIn(List<String> values) {
            addCriterion("us_phone in", values, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotIn(List<String> values) {
            addCriterion("us_phone not in", values, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneBetween(String value1, String value2) {
            addCriterion("us_phone between", value1, value2, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsPhoneNotBetween(String value1, String value2) {
            addCriterion("us_phone not between", value1, value2, "usPhone");
            return (Criteria) this;
        }

        public Criteria andUsCodeIsNull() {
            addCriterion("us_code is null");
            return (Criteria) this;
        }

        public Criteria andUsCodeIsNotNull() {
            addCriterion("us_code is not null");
            return (Criteria) this;
        }

        public Criteria andUsCodeEqualTo(String value) {
            addCriterion("us_code =", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotEqualTo(String value) {
            addCriterion("us_code <>", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeGreaterThan(String value) {
            addCriterion("us_code >", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("us_code >=", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeLessThan(String value) {
            addCriterion("us_code <", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeLessThanOrEqualTo(String value) {
            addCriterion("us_code <=", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeLike(String value) {
            addCriterion("us_code like", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotLike(String value) {
            addCriterion("us_code not like", value, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeIn(List<String> values) {
            addCriterion("us_code in", values, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotIn(List<String> values) {
            addCriterion("us_code not in", values, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeBetween(String value1, String value2) {
            addCriterion("us_code between", value1, value2, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsCodeNotBetween(String value1, String value2) {
            addCriterion("us_code not between", value1, value2, "usCode");
            return (Criteria) this;
        }

        public Criteria andUsRealnameIsNull() {
            addCriterion("us_realname is null");
            return (Criteria) this;
        }

        public Criteria andUsRealnameIsNotNull() {
            addCriterion("us_realname is not null");
            return (Criteria) this;
        }

        public Criteria andUsRealnameEqualTo(String value) {
            addCriterion("us_realname =", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameNotEqualTo(String value) {
            addCriterion("us_realname <>", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameGreaterThan(String value) {
            addCriterion("us_realname >", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("us_realname >=", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameLessThan(String value) {
            addCriterion("us_realname <", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameLessThanOrEqualTo(String value) {
            addCriterion("us_realname <=", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameLike(String value) {
            addCriterion("us_realname like", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameNotLike(String value) {
            addCriterion("us_realname not like", value, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameIn(List<String> values) {
            addCriterion("us_realname in", values, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameNotIn(List<String> values) {
            addCriterion("us_realname not in", values, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameBetween(String value1, String value2) {
            addCriterion("us_realname between", value1, value2, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsRealnameNotBetween(String value1, String value2) {
            addCriterion("us_realname not between", value1, value2, "usRealname");
            return (Criteria) this;
        }

        public Criteria andUsSexIsNull() {
            addCriterion("us_sex is null");
            return (Criteria) this;
        }

        public Criteria andUsSexIsNotNull() {
            addCriterion("us_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUsSexEqualTo(String value) {
            addCriterion("us_sex =", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotEqualTo(String value) {
            addCriterion("us_sex <>", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexGreaterThan(String value) {
            addCriterion("us_sex >", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexGreaterThanOrEqualTo(String value) {
            addCriterion("us_sex >=", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexLessThan(String value) {
            addCriterion("us_sex <", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexLessThanOrEqualTo(String value) {
            addCriterion("us_sex <=", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexLike(String value) {
            addCriterion("us_sex like", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotLike(String value) {
            addCriterion("us_sex not like", value, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexIn(List<String> values) {
            addCriterion("us_sex in", values, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotIn(List<String> values) {
            addCriterion("us_sex not in", values, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexBetween(String value1, String value2) {
            addCriterion("us_sex between", value1, value2, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsSexNotBetween(String value1, String value2) {
            addCriterion("us_sex not between", value1, value2, "usSex");
            return (Criteria) this;
        }

        public Criteria andUsEnticIsNull() {
            addCriterion("us_entic is null");
            return (Criteria) this;
        }

        public Criteria andUsEnticIsNotNull() {
            addCriterion("us_entic is not null");
            return (Criteria) this;
        }

        public Criteria andUsEnticEqualTo(String value) {
            addCriterion("us_entic =", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticNotEqualTo(String value) {
            addCriterion("us_entic <>", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticGreaterThan(String value) {
            addCriterion("us_entic >", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticGreaterThanOrEqualTo(String value) {
            addCriterion("us_entic >=", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticLessThan(String value) {
            addCriterion("us_entic <", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticLessThanOrEqualTo(String value) {
            addCriterion("us_entic <=", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticLike(String value) {
            addCriterion("us_entic like", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticNotLike(String value) {
            addCriterion("us_entic not like", value, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticIn(List<String> values) {
            addCriterion("us_entic in", values, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticNotIn(List<String> values) {
            addCriterion("us_entic not in", values, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticBetween(String value1, String value2) {
            addCriterion("us_entic between", value1, value2, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsEnticNotBetween(String value1, String value2) {
            addCriterion("us_entic not between", value1, value2, "usEntic");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayIsNull() {
            addCriterion("us_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayIsNotNull() {
            addCriterion("us_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayEqualTo(String value) {
            addCriterion("us_birthday =", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayNotEqualTo(String value) {
            addCriterion("us_birthday <>", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayGreaterThan(String value) {
            addCriterion("us_birthday >", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("us_birthday >=", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayLessThan(String value) {
            addCriterion("us_birthday <", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayLessThanOrEqualTo(String value) {
            addCriterion("us_birthday <=", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayLike(String value) {
            addCriterion("us_birthday like", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayNotLike(String value) {
            addCriterion("us_birthday not like", value, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayIn(List<String> values) {
            addCriterion("us_birthday in", values, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayNotIn(List<String> values) {
            addCriterion("us_birthday not in", values, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayBetween(String value1, String value2) {
            addCriterion("us_birthday between", value1, value2, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsBirthdayNotBetween(String value1, String value2) {
            addCriterion("us_birthday not between", value1, value2, "usBirthday");
            return (Criteria) this;
        }

        public Criteria andUsAddressIsNull() {
            addCriterion("us_address is null");
            return (Criteria) this;
        }

        public Criteria andUsAddressIsNotNull() {
            addCriterion("us_address is not null");
            return (Criteria) this;
        }

        public Criteria andUsAddressEqualTo(String value) {
            addCriterion("us_address =", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotEqualTo(String value) {
            addCriterion("us_address <>", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressGreaterThan(String value) {
            addCriterion("us_address >", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressGreaterThanOrEqualTo(String value) {
            addCriterion("us_address >=", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressLessThan(String value) {
            addCriterion("us_address <", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressLessThanOrEqualTo(String value) {
            addCriterion("us_address <=", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressLike(String value) {
            addCriterion("us_address like", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotLike(String value) {
            addCriterion("us_address not like", value, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressIn(List<String> values) {
            addCriterion("us_address in", values, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotIn(List<String> values) {
            addCriterion("us_address not in", values, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressBetween(String value1, String value2) {
            addCriterion("us_address between", value1, value2, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsAddressNotBetween(String value1, String value2) {
            addCriterion("us_address not between", value1, value2, "usAddress");
            return (Criteria) this;
        }

        public Criteria andUsIdcardIsNull() {
            addCriterion("us_idcard is null");
            return (Criteria) this;
        }

        public Criteria andUsIdcardIsNotNull() {
            addCriterion("us_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdcardEqualTo(String value) {
            addCriterion("us_idcard =", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotEqualTo(String value) {
            addCriterion("us_idcard <>", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardGreaterThan(String value) {
            addCriterion("us_idcard >", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("us_idcard >=", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardLessThan(String value) {
            addCriterion("us_idcard <", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardLessThanOrEqualTo(String value) {
            addCriterion("us_idcard <=", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardLike(String value) {
            addCriterion("us_idcard like", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotLike(String value) {
            addCriterion("us_idcard not like", value, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardIn(List<String> values) {
            addCriterion("us_idcard in", values, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotIn(List<String> values) {
            addCriterion("us_idcard not in", values, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardBetween(String value1, String value2) {
            addCriterion("us_idcard between", value1, value2, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsIdcardNotBetween(String value1, String value2) {
            addCriterion("us_idcard not between", value1, value2, "usIdcard");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrIsNull() {
            addCriterion("us_face_img_addr is null");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrIsNotNull() {
            addCriterion("us_face_img_addr is not null");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrEqualTo(String value) {
            addCriterion("us_face_img_addr =", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrNotEqualTo(String value) {
            addCriterion("us_face_img_addr <>", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrGreaterThan(String value) {
            addCriterion("us_face_img_addr >", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrGreaterThanOrEqualTo(String value) {
            addCriterion("us_face_img_addr >=", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrLessThan(String value) {
            addCriterion("us_face_img_addr <", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrLessThanOrEqualTo(String value) {
            addCriterion("us_face_img_addr <=", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrLike(String value) {
            addCriterion("us_face_img_addr like", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrNotLike(String value) {
            addCriterion("us_face_img_addr not like", value, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrIn(List<String> values) {
            addCriterion("us_face_img_addr in", values, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrNotIn(List<String> values) {
            addCriterion("us_face_img_addr not in", values, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrBetween(String value1, String value2) {
            addCriterion("us_face_img_addr between", value1, value2, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsFaceImgAddrNotBetween(String value1, String value2) {
            addCriterion("us_face_img_addr not between", value1, value2, "usFaceImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrIsNull() {
            addCriterion("us_idcard_img_addr is null");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrIsNotNull() {
            addCriterion("us_idcard_img_addr is not null");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrEqualTo(String value) {
            addCriterion("us_idcard_img_addr =", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrNotEqualTo(String value) {
            addCriterion("us_idcard_img_addr <>", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrGreaterThan(String value) {
            addCriterion("us_idcard_img_addr >", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrGreaterThanOrEqualTo(String value) {
            addCriterion("us_idcard_img_addr >=", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrLessThan(String value) {
            addCriterion("us_idcard_img_addr <", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrLessThanOrEqualTo(String value) {
            addCriterion("us_idcard_img_addr <=", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrLike(String value) {
            addCriterion("us_idcard_img_addr like", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrNotLike(String value) {
            addCriterion("us_idcard_img_addr not like", value, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrIn(List<String> values) {
            addCriterion("us_idcard_img_addr in", values, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrNotIn(List<String> values) {
            addCriterion("us_idcard_img_addr not in", values, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrBetween(String value1, String value2) {
            addCriterion("us_idcard_img_addr between", value1, value2, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsIdcardImgAddrNotBetween(String value1, String value2) {
            addCriterion("us_idcard_img_addr not between", value1, value2, "usIdcardImgAddr");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignIsNull() {
            addCriterion("us_subm_img_sign is null");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignIsNotNull() {
            addCriterion("us_subm_img_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignEqualTo(Integer value) {
            addCriterion("us_subm_img_sign =", value, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignNotEqualTo(Integer value) {
            addCriterion("us_subm_img_sign <>", value, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignGreaterThan(Integer value) {
            addCriterion("us_subm_img_sign >", value, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_subm_img_sign >=", value, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignLessThan(Integer value) {
            addCriterion("us_subm_img_sign <", value, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignLessThanOrEqualTo(Integer value) {
            addCriterion("us_subm_img_sign <=", value, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignIn(List<Integer> values) {
            addCriterion("us_subm_img_sign in", values, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignNotIn(List<Integer> values) {
            addCriterion("us_subm_img_sign not in", values, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignBetween(Integer value1, Integer value2) {
            addCriterion("us_subm_img_sign between", value1, value2, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsSubmImgSignNotBetween(Integer value1, Integer value2) {
            addCriterion("us_subm_img_sign not between", value1, value2, "usSubmImgSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignIsNull() {
            addCriterion("us_checkpass_sign is null");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignIsNotNull() {
            addCriterion("us_checkpass_sign is not null");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignEqualTo(Integer value) {
            addCriterion("us_checkpass_sign =", value, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignNotEqualTo(Integer value) {
            addCriterion("us_checkpass_sign <>", value, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignGreaterThan(Integer value) {
            addCriterion("us_checkpass_sign >", value, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("us_checkpass_sign >=", value, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignLessThan(Integer value) {
            addCriterion("us_checkpass_sign <", value, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignLessThanOrEqualTo(Integer value) {
            addCriterion("us_checkpass_sign <=", value, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignIn(List<Integer> values) {
            addCriterion("us_checkpass_sign in", values, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignNotIn(List<Integer> values) {
            addCriterion("us_checkpass_sign not in", values, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignBetween(Integer value1, Integer value2) {
            addCriterion("us_checkpass_sign between", value1, value2, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCheckpassSignNotBetween(Integer value1, Integer value2) {
            addCriterion("us_checkpass_sign not between", value1, value2, "usCheckpassSign");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeIsNull() {
            addCriterion("us_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeIsNotNull() {
            addCriterion("us_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeEqualTo(Date value) {
            addCriterion("us_create_time =", value, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeNotEqualTo(Date value) {
            addCriterion("us_create_time <>", value, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeGreaterThan(Date value) {
            addCriterion("us_create_time >", value, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("us_create_time >=", value, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeLessThan(Date value) {
            addCriterion("us_create_time <", value, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("us_create_time <=", value, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeIn(List<Date> values) {
            addCriterion("us_create_time in", values, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeNotIn(List<Date> values) {
            addCriterion("us_create_time not in", values, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("us_create_time between", value1, value2, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("us_create_time not between", value1, value2, "usCreateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeIsNull() {
            addCriterion("us_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeIsNotNull() {
            addCriterion("us_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeEqualTo(Date value) {
            addCriterion("us_update_time =", value, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeNotEqualTo(Date value) {
            addCriterion("us_update_time <>", value, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeGreaterThan(Date value) {
            addCriterion("us_update_time >", value, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("us_update_time >=", value, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeLessThan(Date value) {
            addCriterion("us_update_time <", value, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("us_update_time <=", value, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeIn(List<Date> values) {
            addCriterion("us_update_time in", values, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeNotIn(List<Date> values) {
            addCriterion("us_update_time not in", values, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("us_update_time between", value1, value2, "usUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUsUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("us_update_time not between", value1, value2, "usUpdateTime");
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