package com.longruan.zmsys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.longruan.zmsys.models.SysUser;
import com.longruan.zmsys.models.SysUserExample;

public interface SysUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int countByExample(SysUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int deleteByExample(SysUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int insert(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int insertSelective(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	List<SysUser> selectByExample(SysUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	SysUser selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByPrimaryKeySelective(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user
	 * @mbggenerated  Sat Feb 04 16:21:42 CST 2017
	 */
	int updateByPrimaryKey(SysUser record);
	/**
	 * 方法名称: findUserByLoginfo ；
	 * 方法描述:  TODO:  登陆查询用户 ；
	 * 返回类型: SysUser ；
	 * 创建人：心一  ；
	 * 创建时间：2017年2月4日 下午4:23:28；
	 * @throws
	 */
	SysUser findUserByLoginfo(SysUser sysUser);
	
	int findSysUserCount();
	/**
	 * 心一：分页查询用户对象count
	 * @param sysUser
	 * @return
	 */
	 int findSysUserCountByCondition(Map<String,Object> paraMap);
	/**
	 * 心一：分页查询用户对象列表
	 * 
	 * @param sysUser
	 * @return
	 */
	 List<Map<String,Object>> findSysUserPageByCondition(Map<String,Object> paraMap);
	 /**
	  * 心一：校验登录名是否存在
	  * @param loginName
	  * @return
	  */
	 int findCountByLoginName(String loginName);

	/**
	 * 心一：查询在线人员详细信息
	 * 
	 * @param userId：用户ID
	 * @return
	 */
	Map<String, Object> findUserOnlineByUserId(Integer userId);
}