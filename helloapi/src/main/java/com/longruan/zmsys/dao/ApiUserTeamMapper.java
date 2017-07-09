package com.longruan.zmsys.dao;

import com.longruan.zmsys.models.ApiUserTeam;
import com.longruan.zmsys.models.ApiUserTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiUserTeamMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int countByExample(ApiUserTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int deleteByExample(ApiUserTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int insert(ApiUserTeam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int insertSelective(ApiUserTeam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	List<ApiUserTeam> selectByExample(ApiUserTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	ApiUserTeam selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int updateByExampleSelective(@Param("record") ApiUserTeam record,
			@Param("example") ApiUserTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int updateByExample(@Param("record") ApiUserTeam record,
			@Param("example") ApiUserTeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int updateByPrimaryKeySelective(ApiUserTeam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table api_user_team
	 * @mbggenerated  Thu Jun 01 08:56:08 CST 2017
	 */
	int updateByPrimaryKey(ApiUserTeam record);
}