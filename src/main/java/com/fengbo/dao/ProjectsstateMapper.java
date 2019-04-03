package com.fengbo.dao;

import com.fengbo.bean.Projectsstate;
import com.fengbo.bean.ProjectsstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectsstateMapper {
    int countByExample(ProjectsstateExample example);

    int deleteByExample(ProjectsstateExample example);

    int deleteByPrimaryKey(Integer stId);

    int insert(Projectsstate record);

    int insertSelective(Projectsstate record);

    List<Projectsstate> selectByExample(ProjectsstateExample example);

    Projectsstate selectByPrimaryKey(Integer stId);

    int updateByExampleSelective(@Param("record") Projectsstate record, @Param("example") ProjectsstateExample example);

    int updateByExample(@Param("record") Projectsstate record, @Param("example") ProjectsstateExample example);

    int updateByPrimaryKeySelective(Projectsstate record);

    int updateByPrimaryKey(Projectsstate record);
}