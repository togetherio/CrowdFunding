package com.fengbo.service;

import java.util.List;

import com.fengbo.bean.Projects;

public interface ProjectsService {
	
    public List<Projects> getHotProjects();
	
	public List<Projects> getNewProjects();
	
}
