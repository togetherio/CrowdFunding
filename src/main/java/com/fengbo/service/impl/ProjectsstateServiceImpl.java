package com.fengbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fengbo.bean.Projectsstate;
import com.fengbo.dao.ProjectsstateMapper;
import com.fengbo.service.ProjectsstateService;


@Service
public class ProjectsstateServiceImpl implements ProjectsstateService {
	
	@Resource
	private ProjectsstateMapper projectsstateMapper;

	@Override
	public List<Projectsstate> getProjectsstate() {
		return projectsstateMapper.selectByExample(null);
	}

	

	
	

}
