package com.wws.wwsgis.dao;

import com.wws.wwsgis.models.SysUserOnline;
import com.wws.wwsgis.models.SysUserOnlineExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysUserOnlineMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int countByExample(SysUserOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int deleteByExample(SysUserOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int insert(SysUserOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int insertSelective(SysUserOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	List<SysUserOnline> selectByExample(SysUserOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	SysUserOnline selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int updateByExampleSelective(@Param("record") SysUserOnline record, @Param("example") SysUserOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int updateByExample(@Param("record") SysUserOnline record, @Param("example") SysUserOnlineExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int updateByPrimaryKeySelective(SysUserOnline record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table sys_user_online
	 * @mbggenerated  Wed Mar 22 17:45:18 CST 2017
	 */
	int updateByPrimaryKey(SysUserOnline record);
	/**
	 * 心一：修改结束时间
	 * @param record
	 * @return
	 */
	int updateEtime(SysUserOnline record);
	/**
	 * 心一：查询在线用户详情
	 * @param userId
	 * @return
	 */
	Map<String, Object> findSysUserOnlineRemarkByUserId(Integer userId);
}