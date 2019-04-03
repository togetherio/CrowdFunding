package com.fengbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fengbo.bean.Projects;
import com.fengbo.dao.ProjectsMapper;
import com.fengbo.service.ProjectsService;

@Service
public class ProjectsServiceImpl implements ProjectsService {
	@Resource
	private ProjectsMapper projectsMapper;

	@Override
	public List<Projects> getHotProjects() {
		return projectsMapper.getHotProjects();
	}

	@Override
	public List<Projects> getNewProjects() {
		return projectsMapper.getNewProjects();
	}



}
