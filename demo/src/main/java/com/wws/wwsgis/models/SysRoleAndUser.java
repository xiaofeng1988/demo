package com.wws.wwsgis.models;

public class SysRoleAndUser {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_user.id
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_user.sysuser
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer sysuser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column sys_role_and_user.role
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	private Integer role;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_user.id
	 * @return  the value of sys_role_and_user.id
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_user.id
	 * @param id  the value for sys_role_and_user.id
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_user.sysuser
	 * @return  the value of sys_role_and_user.sysuser
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getSysuser() {
		return sysuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_user.sysuser
	 * @param sysuser  the value for sys_role_and_user.sysuser
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setSysuser(Integer sysuser) {
		this.sysuser = sysuser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column sys_role_and_user.role
	 * @return  the value of sys_role_and_user.role
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public Integer getRole() {
		return role;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column sys_role_and_user.role
	 * @param role  the value for sys_role_and_user.role
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	public void setRole(Integer role) {
		this.role = role;
	}
}