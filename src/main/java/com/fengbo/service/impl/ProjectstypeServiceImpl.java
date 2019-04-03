package com.fengbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fengbo.bean.Projectstype;
import com.fengbo.dao.ProjectstypeMapper;
import com.fengbo.service.ProjectstypeService;


@Service
public class ProjectstypeServiceImpl implements ProjectstypeService {
	
	@Resource
	private ProjectstypeMapper projectstypeMapper;

	@Override
	public List<Projectstype> getProjectstype() {
		return projectstypeMapper.selectByExample(null);
	}

	@Override
	public Projectstype getOne(int id) {
		Projectstype key = projectstypeMapper.selectByPrimaryKey(id);
		return key;
	}

	
	

}
