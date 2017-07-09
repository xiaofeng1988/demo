package com.longruan.zmsys.models;

import java.util.ArrayList;
import java.util.List;

public class ApiReqParamExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public ApiReqParamExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdIsNull() {
			addCriterion("req_url_id is null");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdIsNotNull() {
			addCriterion("req_url_id is not null");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdEqualTo(Integer value) {
			addCriterion("req_url_id =", value, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdNotEqualTo(Integer value) {
			addCriterion("req_url_id <>", value, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdGreaterThan(Integer value) {
			addCriterion("req_url_id >", value, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("req_url_id >=", value, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdLessThan(Integer value) {
			addCriterion("req_url_id <", value, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdLessThanOrEqualTo(Integer value) {
			addCriterion("req_url_id <=", value, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdIn(List<Integer> values) {
			addCriterion("req_url_id in", values, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdNotIn(List<Integer> values) {
			addCriterion("req_url_id not in", values, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdBetween(Integer value1, Integer value2) {
			addCriterion("req_url_id between", value1, value2, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqUrlIdNotBetween(Integer value1, Integer value2) {
			addCriterion("req_url_id not between", value1, value2, "reqUrlId");
			return (Criteria) this;
		}

		public Criteria andReqFieldIsNull() {
			addCriterion("req_field is null");
			return (Criteria) this;
		}

		public Criteria andReqFieldIsNotNull() {
			addCriterion("req_field is not null");
			return (Criteria) this;
		}

		public Criteria andReqFieldEqualTo(String value) {
			addCriterion("req_field =", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldNotEqualTo(String value) {
			addCriterion("req_field <>", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldGreaterThan(String value) {
			addCriterion("req_field >", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldGreaterThanOrEqualTo(String value) {
			addCriterion("req_field >=", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldLessThan(String value) {
			addCriterion("req_field <", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldLessThanOrEqualTo(String value) {
			addCriterion("req_field <=", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldLike(String value) {
			addCriterion("req_field like", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldNotLike(String value) {
			addCriterion("req_field not like", value, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldIn(List<String> values) {
			addCriterion("req_field in", values, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldNotIn(List<String> values) {
			addCriterion("req_field not in", values, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldBetween(String value1, String value2) {
			addCriterion("req_field between", value1, value2, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqFieldNotBetween(String value1, String value2) {
			addCriterion("req_field not between", value1, value2, "reqField");
			return (Criteria) this;
		}

		public Criteria andReqTypeIsNull() {
			addCriterion("req_type is null");
			return (Criteria) this;
		}

		public Criteria andReqTypeIsNotNull() {
			addCriterion("req_type is not null");
			return (Criteria) this;
		}

		public Criteria andReqTypeEqualTo(String value) {
			addCriterion("req_type =", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeNotEqualTo(String value) {
			addCriterion("req_type <>", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeGreaterThan(String value) {
			addCriterion("req_type >", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeGreaterThanOrEqualTo(String value) {
			addCriterion("req_type >=", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeLessThan(String value) {
			addCriterion("req_type <", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeLessThanOrEqualTo(String value) {
			addCriterion("req_type <=", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeLike(String value) {
			addCriterion("req_type like", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeNotLike(String value) {
			addCriterion("req_type not like", value, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeIn(List<String> values) {
			addCriterion("req_type in", values, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeNotIn(List<String> values) {
			addCriterion("req_type not in", values, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeBetween(String value1, String value2) {
			addCriterion("req_type between", value1, value2, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqTypeNotBetween(String value1, String value2) {
			addCriterion("req_type not between", value1, value2, "reqType");
			return (Criteria) this;
		}

		public Criteria andReqDesIsNull() {
			addCriterion("req_des is null");
			return (Criteria) this;
		}

		public Criteria andReqDesIsNotNull() {
			addCriterion("req_des is not null");
			return (Criteria) this;
		}

		public Criteria andReqDesEqualTo(String value) {
			addCriterion("req_des =", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesNotEqualTo(String value) {
			addCriterion("req_des <>", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesGreaterThan(String value) {
			addCriterion("req_des >", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesGreaterThanOrEqualTo(String value) {
			addCriterion("req_des >=", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesLessThan(String value) {
			addCriterion("req_des <", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesLessThanOrEqualTo(String value) {
			addCriterion("req_des <=", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesLike(String value) {
			addCriterion("req_des like", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesNotLike(String value) {
			addCriterion("req_des not like", value, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesIn(List<String> values) {
			addCriterion("req_des in", values, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesNotIn(List<String> values) {
			addCriterion("req_des not in", values, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesBetween(String value1, String value2) {
			addCriterion("req_des between", value1, value2, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqDesNotBetween(String value1, String value2) {
			addCriterion("req_des not between", value1, value2, "reqDes");
			return (Criteria) this;
		}

		public Criteria andReqRequiredIsNull() {
			addCriterion("req_required is null");
			return (Criteria) this;
		}

		public Criteria andReqRequiredIsNotNull() {
			addCriterion("req_required is not null");
			return (Criteria) this;
		}

		public Criteria andReqRequiredEqualTo(String value) {
			addCriterion("req_required =", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredNotEqualTo(String value) {
			addCriterion("req_required <>", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredGreaterThan(String value) {
			addCriterion("req_required >", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredGreaterThanOrEqualTo(String value) {
			addCriterion("req_required >=", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredLessThan(String value) {
			addCriterion("req_required <", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredLessThanOrEqualTo(String value) {
			addCriterion("req_required <=", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredLike(String value) {
			addCriterion("req_required like", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredNotLike(String value) {
			addCriterion("req_required not like", value, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredIn(List<String> values) {
			addCriterion("req_required in", values, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredNotIn(List<String> values) {
			addCriterion("req_required not in", values, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredBetween(String value1, String value2) {
			addCriterion("req_required between", value1, value2, "reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqRequiredNotBetween(String value1, String value2) {
			addCriterion("req_required not between", value1, value2,
					"reqRequired");
			return (Criteria) this;
		}

		public Criteria andReqDefValIsNull() {
			addCriterion("req_def_val is null");
			return (Criteria) this;
		}

		public Criteria andReqDefValIsNotNull() {
			addCriterion("req_def_val is not null");
			return (Criteria) this;
		}

		public Criteria andReqDefValEqualTo(String value) {
			addCriterion("req_def_val =", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValNotEqualTo(String value) {
			addCriterion("req_def_val <>", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValGreaterThan(String value) {
			addCriterion("req_def_val >", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValGreaterThanOrEqualTo(String value) {
			addCriterion("req_def_val >=", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValLessThan(String value) {
			addCriterion("req_def_val <", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValLessThanOrEqualTo(String value) {
			addCriterion("req_def_val <=", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValLike(String value) {
			addCriterion("req_def_val like", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValNotLike(String value) {
			addCriterion("req_def_val not like", value, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValIn(List<String> values) {
			addCriterion("req_def_val in", values, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValNotIn(List<String> values) {
			addCriterion("req_def_val not in", values, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValBetween(String value1, String value2) {
			addCriterion("req_def_val between", value1, value2, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andReqDefValNotBetween(String value1, String value2) {
			addCriterion("req_def_val not between", value1, value2, "reqDefVal");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table api_req_param
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table api_req_param
     *
     * @mbggenerated do_not_delete_during_merge Sun May 21 15:45:42 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}