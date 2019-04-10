package com.fengbo.dao;

import com.fengbo.bean.Projects;
import com.fengbo.bean.ProjectsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectsMapper {
	int countByExample(ProjectsExample example);

	int deleteByExample(ProjectsExample example);

	int deleteByPrimaryKey(String psId);

	int insert(Projects record);

	int insertSelective(Projects record);

	List<Projects> selectByExample(ProjectsExample example);

	Projects selectByPrimaryKey(String psId);

	int updateByExampleSelective(@Param("record") Projects record, @Param("example") ProjectsExample example);

	int updateByExample(@Param("record") Projects record, @Param("example") ProjectsExample example);

	int updateByPrimaryKeySelective(Projects record);

	int updateByPrimaryKey(Projects record);

	// 获取热门项目
	List<Projects> getHotProjects();

	// 获取最新项目
	List<Projects> getNewProjects();

	// 获取即将开始项目
	List<Projects> getReadyProjects();

	// 已经成功的项目
	List<Projects> getSucProjects();

	// 获取所有项目
	List<Projects> getAllProjects();

	// 根据类型获取
	List<Projects> getPojectByPstId(int pstId);

	//项目详情
	Projects getOneDetailBypsId(String psId);
	
	//发起项目 进行审核
	int addProject(Projects projects);
	
	//获取所有的待审核项目
	List<Projects> getAllCheckProjects();
	
	//项目通过审核
	int checkProjectsPass(String psId);
	
	//项目没有通过审核
	int checkProjectsNoPass(String psId);
	
	//对项目支持后， 筹款金额，人数  改变
	int addMoney(@Param("psGetmoney") Double psGetmoney,@Param("psId") String psId);
}