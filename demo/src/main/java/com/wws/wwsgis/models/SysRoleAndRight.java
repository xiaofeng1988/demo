package com.wws.wwsgis.models;

public class SysRoleAndRight {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_right.id
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_right.sysright
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer sysright;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_right.role
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer role;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_right.childrights
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer childrights;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_right.id
	 * @return  the value of sys_role_and_right.id
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_right.id
	 * @param id  the value for sys_role_and_right.id
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_right.sysright
	 * @return  the value of sys_role_and_right.sysright
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getSysright() {
		return sysright;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_right.sysright
	 * @param sysright  the value for sys_role_and_right.sysright
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setSysright(Integer sysright) {
		this.sysright = sysright;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_right.role
	 * @return  the value of sys_role_and_right.role
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_right.role
	 * @param role  the value for sys_role_and_right.role
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setRole(Integer role) {
		this.role = role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_right.childrights
	 * @return  the value of sys_role_and_right.childrights
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getChildrights() {
		return childrights;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_right.childrights
	 * @param childrights  the value for sys_role_and_right.childrights
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setChildrights(Integer childrights) {
		this.childrights = childrights;
	}
}