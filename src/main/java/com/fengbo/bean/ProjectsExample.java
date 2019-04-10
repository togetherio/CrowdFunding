package com.fengbo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProjectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectsExample() {
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

        public Criteria andPsIdIsNull() {
            addCriterion("ps_id is null");
            return (Criteria) this;
        }

        public Criteria andPsIdIsNotNull() {
            addCriterion("ps_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsIdEqualTo(String value) {
            addCriterion("ps_id =", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotEqualTo(String value) {
            addCriterion("ps_id <>", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThan(String value) {
            addCriterion("ps_id >", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ps_id >=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThan(String value) {
            addCriterion("ps_id <", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLessThanOrEqualTo(String value) {
            addCriterion("ps_id <=", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdLike(String value) {
            addCriterion("ps_id like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotLike(String value) {
            addCriterion("ps_id not like", value, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdIn(List<String> values) {
            addCriterion("ps_id in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotIn(List<String> values) {
            addCriterion("ps_id not in", values, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdBetween(String value1, String value2) {
            addCriterion("ps_id between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsIdNotBetween(String value1, String value2) {
            addCriterion("ps_id not between", value1, value2, "psId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdIsNull() {
            addCriterion("ps_us_id is null");
            return (Criteria) this;
        }

        public Criteria andPsUsIdIsNotNull() {
            addCriterion("ps_us_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsUsIdEqualTo(String value) {
            addCriterion("ps_us_id =", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotEqualTo(String value) {
            addCriterion("ps_us_id <>", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdGreaterThan(String value) {
            addCriterion("ps_us_id >", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ps_us_id >=", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdLessThan(String value) {
            addCriterion("ps_us_id <", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdLessThanOrEqualTo(String value) {
            addCriterion("ps_us_id <=", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdLike(String value) {
            addCriterion("ps_us_id like", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotLike(String value) {
            addCriterion("ps_us_id not like", value, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdIn(List<String> values) {
            addCriterion("ps_us_id in", values, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotIn(List<String> values) {
            addCriterion("ps_us_id not in", values, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdBetween(String value1, String value2) {
            addCriterion("ps_us_id between", value1, value2, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsUsIdNotBetween(String value1, String value2) {
            addCriterion("ps_us_id not between", value1, value2, "psUsId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdIsNull() {
            addCriterion("ps_pst_id is null");
            return (Criteria) this;
        }

        public Criteria andPsPstIdIsNotNull() {
            addCriterion("ps_pst_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsPstIdEqualTo(Integer value) {
            addCriterion("ps_pst_id =", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdNotEqualTo(Integer value) {
            addCriterion("ps_pst_id <>", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdGreaterThan(Integer value) {
            addCriterion("ps_pst_id >", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_pst_id >=", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdLessThan(Integer value) {
            addCriterion("ps_pst_id <", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_pst_id <=", value, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdIn(List<Integer> values) {
            addCriterion("ps_pst_id in", values, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdNotIn(List<Integer> values) {
            addCriterion("ps_pst_id not in", values, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_pst_id between", value1, value2, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsPstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_pst_id not between", value1, value2, "psPstId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdIsNull() {
            addCriterion("ps_state_id is null");
            return (Criteria) this;
        }

        public Criteria andPsStateIdIsNotNull() {
            addCriterion("ps_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsStateIdEqualTo(Integer value) {
            addCriterion("ps_state_id =", value, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdNotEqualTo(Integer value) {
            addCriterion("ps_state_id <>", value, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdGreaterThan(Integer value) {
            addCriterion("ps_state_id >", value, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_state_id >=", value, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdLessThan(Integer value) {
            addCriterion("ps_state_id <", value, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdLessThanOrEqualTo(Integer value) {
            addCriterion("ps_state_id <=", value, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdIn(List<Integer> values) {
            addCriterion("ps_state_id in", values, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdNotIn(List<Integer> values) {
            addCriterion("ps_state_id not in", values, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdBetween(Integer value1, Integer value2) {
            addCriterion("ps_state_id between", value1, value2, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsStateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_state_id not between", value1, value2, "psStateId");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipIsNull() {
            addCriterion("ps_patient_relationship is null");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipIsNotNull() {
            addCriterion("ps_patient_relationship is not null");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipEqualTo(String value) {
            addCriterion("ps_patient_relationship =", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipNotEqualTo(String value) {
            addCriterion("ps_patient_relationship <>", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipGreaterThan(String value) {
            addCriterion("ps_patient_relationship >", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("ps_patient_relationship >=", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipLessThan(String value) {
            addCriterion("ps_patient_relationship <", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipLessThanOrEqualTo(String value) {
            addCriterion("ps_patient_relationship <=", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipLike(String value) {
            addCriterion("ps_patient_relationship like", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipNotLike(String value) {
            addCriterion("ps_patient_relationship not like", value, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipIn(List<String> values) {
            addCriterion("ps_patient_relationship in", values, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipNotIn(List<String> values) {
            addCriterion("ps_patient_relationship not in", values, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipBetween(String value1, String value2) {
            addCriterion("ps_patient_relationship between", value1, value2, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsPatientRelationshipNotBetween(String value1, String value2) {
            addCriterion("ps_patient_relationship not between", value1, value2, "psPatientRelationship");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameIsNull() {
            addCriterion("ps_illness_name is null");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameIsNotNull() {
            addCriterion("ps_illness_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameEqualTo(String value) {
            addCriterion("ps_illness_name =", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameNotEqualTo(String value) {
            addCriterion("ps_illness_name <>", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameGreaterThan(String value) {
            addCriterion("ps_illness_name >", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_illness_name >=", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameLessThan(String value) {
            addCriterion("ps_illness_name <", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameLessThanOrEqualTo(String value) {
            addCriterion("ps_illness_name <=", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameLike(String value) {
            addCriterion("ps_illness_name like", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameNotLike(String value) {
            addCriterion("ps_illness_name not like", value, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameIn(List<String> values) {
            addCriterion("ps_illness_name in", values, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameNotIn(List<String> values) {
            addCriterion("ps_illness_name not in", values, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameBetween(String value1, String value2) {
            addCriterion("ps_illness_name between", value1, value2, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsIllnessNameNotBetween(String value1, String value2) {
            addCriterion("ps_illness_name not between", value1, value2, "psIllnessName");
            return (Criteria) this;
        }

        public Criteria andPsNameIsNull() {
            addCriterion("ps_name is null");
            return (Criteria) this;
        }

        public Criteria andPsNameIsNotNull() {
            addCriterion("ps_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsNameEqualTo(String value) {
            addCriterion("ps_name =", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotEqualTo(String value) {
            addCriterion("ps_name <>", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameGreaterThan(String value) {
            addCriterion("ps_name >", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ps_name >=", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLessThan(String value) {
            addCriterion("ps_name <", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLessThanOrEqualTo(String value) {
            addCriterion("ps_name <=", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameLike(String value) {
            addCriterion("ps_name like", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotLike(String value) {
            addCriterion("ps_name not like", value, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameIn(List<String> values) {
            addCriterion("ps_name in", values, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotIn(List<String> values) {
            addCriterion("ps_name not in", values, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameBetween(String value1, String value2) {
            addCriterion("ps_name between", value1, value2, "psName");
            return (Criteria) this;
        }

        public Criteria andPsNameNotBetween(String value1, String value2) {
            addCriterion("ps_name not between", value1, value2, "psName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameIsNull() {
            addCriterion("pa_img_name is null");
            return (Criteria) this;
        }

        public Criteria andPaImgNameIsNotNull() {
            addCriterion("pa_img_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaImgNameEqualTo(String value) {
            addCriterion("pa_img_name =", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameNotEqualTo(String value) {
            addCriterion("pa_img_name <>", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameGreaterThan(String value) {
            addCriterion("pa_img_name >", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameGreaterThanOrEqualTo(String value) {
            addCriterion("pa_img_name >=", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameLessThan(String value) {
            addCriterion("pa_img_name <", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameLessThanOrEqualTo(String value) {
            addCriterion("pa_img_name <=", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameLike(String value) {
            addCriterion("pa_img_name like", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameNotLike(String value) {
            addCriterion("pa_img_name not like", value, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameIn(List<String> values) {
            addCriterion("pa_img_name in", values, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameNotIn(List<String> values) {
            addCriterion("pa_img_name not in", values, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameBetween(String value1, String value2) {
            addCriterion("pa_img_name between", value1, value2, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPaImgNameNotBetween(String value1, String value2) {
            addCriterion("pa_img_name not between", value1, value2, "paImgName");
            return (Criteria) this;
        }

        public Criteria andPsStoryIsNull() {
            addCriterion("ps_story is null");
            return (Criteria) this;
        }

        public Criteria andPsStoryIsNotNull() {
            addCriterion("ps_story is not null");
            return (Criteria) this;
        }

        public Criteria andPsStoryEqualTo(String value) {
            addCriterion("ps_story =", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotEqualTo(String value) {
            addCriterion("ps_story <>", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryGreaterThan(String value) {
            addCriterion("ps_story >", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryGreaterThanOrEqualTo(String value) {
            addCriterion("ps_story >=", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryLessThan(String value) {
            addCriterion("ps_story <", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryLessThanOrEqualTo(String value) {
            addCriterion("ps_story <=", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryLike(String value) {
            addCriterion("ps_story like", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotLike(String value) {
            addCriterion("ps_story not like", value, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryIn(List<String> values) {
            addCriterion("ps_story in", values, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotIn(List<String> values) {
            addCriterion("ps_story not in", values, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryBetween(String value1, String value2) {
            addCriterion("ps_story between", value1, value2, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsStoryNotBetween(String value1, String value2) {
            addCriterion("ps_story not between", value1, value2, "psStory");
            return (Criteria) this;
        }

        public Criteria andPsMoneyIsNull() {
            addCriterion("ps_money is null");
            return (Criteria) this;
        }

        public Criteria andPsMoneyIsNotNull() {
            addCriterion("ps_money is not null");
            return (Criteria) this;
        }

        public Criteria andPsMoneyEqualTo(Double value) {
            addCriterion("ps_money =", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyNotEqualTo(Double value) {
            addCriterion("ps_money <>", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyGreaterThan(Double value) {
            addCriterion("ps_money >", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ps_money >=", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyLessThan(Double value) {
            addCriterion("ps_money <", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("ps_money <=", value, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyIn(List<Double> values) {
            addCriterion("ps_money in", values, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyNotIn(List<Double> values) {
            addCriterion("ps_money not in", values, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyBetween(Double value1, Double value2) {
            addCriterion("ps_money between", value1, value2, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("ps_money not between", value1, value2, "psMoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyIsNull() {
            addCriterion("ps_getmoney is null");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyIsNotNull() {
            addCriterion("ps_getmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyEqualTo(Double value) {
            addCriterion("ps_getmoney =", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyNotEqualTo(Double value) {
            addCriterion("ps_getmoney <>", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyGreaterThan(Double value) {
            addCriterion("ps_getmoney >", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("ps_getmoney >=", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyLessThan(Double value) {
            addCriterion("ps_getmoney <", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyLessThanOrEqualTo(Double value) {
            addCriterion("ps_getmoney <=", value, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyIn(List<Double> values) {
            addCriterion("ps_getmoney in", values, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyNotIn(List<Double> values) {
            addCriterion("ps_getmoney not in", values, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyBetween(Double value1, Double value2) {
            addCriterion("ps_getmoney between", value1, value2, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetmoneyNotBetween(Double value1, Double value2) {
            addCriterion("ps_getmoney not between", value1, value2, "psGetmoney");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleIsNull() {
            addCriterion("ps_getpeople is null");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleIsNotNull() {
            addCriterion("ps_getpeople is not null");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleEqualTo(Integer value) {
            addCriterion("ps_getpeople =", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleNotEqualTo(Integer value) {
            addCriterion("ps_getpeople <>", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleGreaterThan(Integer value) {
            addCriterion("ps_getpeople >", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_getpeople >=", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleLessThan(Integer value) {
            addCriterion("ps_getpeople <", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleLessThanOrEqualTo(Integer value) {
            addCriterion("ps_getpeople <=", value, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleIn(List<Integer> values) {
            addCriterion("ps_getpeople in", values, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleNotIn(List<Integer> values) {
            addCriterion("ps_getpeople not in", values, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleBetween(Integer value1, Integer value2) {
            addCriterion("ps_getpeople between", value1, value2, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsGetpeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_getpeople not between", value1, value2, "psGetpeople");
            return (Criteria) this;
        }

        public Criteria andPsDaysIsNull() {
            addCriterion("ps_days is null");
            return (Criteria) this;
        }

        public Criteria andPsDaysIsNotNull() {
            addCriterion("ps_days is not null");
            return (Criteria) this;
        }

        public Criteria andPsDaysEqualTo(Integer value) {
            addCriterion("ps_days =", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysNotEqualTo(Integer value) {
            addCriterion("ps_days <>", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysGreaterThan(Integer value) {
            addCriterion("ps_days >", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_days >=", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysLessThan(Integer value) {
            addCriterion("ps_days <", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysLessThanOrEqualTo(Integer value) {
            addCriterion("ps_days <=", value, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysIn(List<Integer> values) {
            addCriterion("ps_days in", values, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysNotIn(List<Integer> values) {
            addCriterion("ps_days not in", values, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysBetween(Integer value1, Integer value2) {
            addCriterion("ps_days between", value1, value2, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_days not between", value1, value2, "psDays");
            return (Criteria) this;
        }

        public Criteria andPsIshotIsNull() {
            addCriterion("ps_ishot is null");
            return (Criteria) this;
        }

        public Criteria andPsIshotIsNotNull() {
            addCriterion("ps_ishot is not null");
            return (Criteria) this;
        }

        public Criteria andPsIshotEqualTo(Integer value) {
            addCriterion("ps_ishot =", value, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotNotEqualTo(Integer value) {
            addCriterion("ps_ishot <>", value, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotGreaterThan(Integer value) {
            addCriterion("ps_ishot >", value, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotGreaterThanOrEqualTo(Integer value) {
            addCriterion("ps_ishot >=", value, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotLessThan(Integer value) {
            addCriterion("ps_ishot <", value, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotLessThanOrEqualTo(Integer value) {
            addCriterion("ps_ishot <=", value, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotIn(List<Integer> values) {
            addCriterion("ps_ishot in", values, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotNotIn(List<Integer> values) {
            addCriterion("ps_ishot not in", values, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotBetween(Integer value1, Integer value2) {
            addCriterion("ps_ishot between", value1, value2, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsIshotNotBetween(Integer value1, Integer value2) {
            addCriterion("ps_ishot not between", value1, value2, "psIshot");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeIsNull() {
            addCriterion("ps_starttime is null");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeIsNotNull() {
            addCriterion("ps_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeEqualTo(Date value) {
            addCriterion("ps_starttime =", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeNotEqualTo(Date value) {
            addCriterion("ps_starttime <>", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeGreaterThan(Date value) {
            addCriterion("ps_starttime >", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ps_starttime >=", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeLessThan(Date value) {
            addCriterion("ps_starttime <", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ps_starttime <=", value, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeIn(List<Date> values) {
            addCriterion("ps_starttime in", values, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeNotIn(List<Date> values) {
            addCriterion("ps_starttime not in", values, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeBetween(Date value1, Date value2) {
            addCriterion("ps_starttime between", value1, value2, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ps_starttime not between", value1, value2, "psStarttime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeIsNull() {
            addCriterion("ps_endtime is null");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeIsNotNull() {
            addCriterion("ps_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime =", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime <>", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ps_endtime >", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime >=", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("ps_endtime <", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ps_endtime <=", value, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ps_endtime in", values, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ps_endtime not in", values, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_endtime between", value1, value2, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ps_endtime not between", value1, value2, "psEndtime");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignIsNull() {
            addCriterion("ps_check_sign is null");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignIsNotNull() {
            addCriterion("ps_check_sign is not null");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignEqualTo(String value) {
            addCriterion("ps_check_sign =", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignNotEqualTo(String value) {
            addCriterion("ps_check_sign <>", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignGreaterThan(String value) {
            addCriterion("ps_check_sign >", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignGreaterThanOrEqualTo(String value) {
            addCriterion("ps_check_sign >=", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignLessThan(String value) {
            addCriterion("ps_check_sign <", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignLessThanOrEqualTo(String value) {
            addCriterion("ps_check_sign <=", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignLike(String value) {
            addCriterion("ps_check_sign like", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignNotLike(String value) {
            addCriterion("ps_check_sign not like", value, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignIn(List<String> values) {
            addCriterion("ps_check_sign in", values, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignNotIn(List<String> values) {
            addCriterion("ps_check_sign not in", values, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignBetween(String value1, String value2) {
            addCriterion("ps_check_sign between", value1, value2, "psCheckSign");
            return (Criteria) this;
        }

        public Criteria andPsCheckSignNotBetween(String value1, String value2) {
            addCriterion("ps_check_sign not between", value1, value2, "psCheckSign");
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