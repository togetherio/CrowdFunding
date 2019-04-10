package com.fengbo.service;

import java.util.List;

import com.fengbo.bean.Projects;

public interface ProjectsService {
	
    public List<Projects> getHotProjects();
	
	public List<Projects> getNewProjects();
	
	public List<Projects> getReadyProjects();
	
	public List<Projects> getSucProjects();
	
	public List<Projects> getPojectByPstId(int pstId);
	
	public Projects getOneDetailBypsId(String psId);
	
	boolean addProject(Projects projects);
	
	public List<Projects> getAllCheckProjects();
	
	boolean checkProjectsPass(String psId);
	
	boolean checkProjectsNoPass(String psId);
	
	public List<Projects> getAllProjects();
	
	boolean addMoney(Double psGetmoney, String psId);
	
}
