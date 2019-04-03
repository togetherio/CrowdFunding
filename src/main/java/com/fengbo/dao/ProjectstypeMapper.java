package com.fengbo.dao;

import com.fengbo.bean.Projectstype;
import com.fengbo.bean.ProjectstypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectstypeMapper {
    int countByExample(ProjectstypeExample example);

    int deleteByExample(ProjectstypeExample example);

    int deleteByPrimaryKey(Integer pstId);

    int insert(Projectstype record);

    int insertSelective(Projectstype record);

    List<Projectstype> selectByExample(ProjectstypeExample example);

    Projectstype selectByPrimaryKey(Integer pstId);

    int updateByExampleSelective(@Param("record") Projectstype record, @Param("example") ProjectstypeExample example);

    int updateByExample(@Param("record") Projectstype record, @Param("example") ProjectstypeExample example);

    int updateByPrimaryKeySelective(Projectstype record);

    int updateByPrimaryKey(Projectstype record);
}