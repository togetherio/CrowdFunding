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

	@Override
	public List<Projects> getReadyProjects() {
		return projectsMapper.getReadyProjects();
	}

	@Override
	public List<Projects> getSucProjects() {
		return projectsMapper.getSucProjects();
	}

	@Override
	public List<Projects> getPojectByPstId(int pstId) {
		return projectsMapper.getPojectByPstId(pstId);
	}

	@Override
	public Projects getOneDetailBypsId(String psId) {
		return projectsMapper.getOneDetailBypsId(psId);
	}

	@Override
	public boolean addProject(Projects projects) {
		int addProject = projectsMapper.addProject(projects);
		if(addProject > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Projects> getAllCheckProjects() {
		return projectsMapper.getAllCheckProjects();
	}

	@Override
	public boolean checkProjectsPass(String psId) {
		int checkProjectsPass = projectsMapper.checkProjectsPass(psId);
		if(checkProjectsPass > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkProjectsNoPass(String psId) {
		int checkProjectsNoPass = projectsMapper.checkProjectsNoPass(psId);
		if(checkProjectsNoPass > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Projects> getAllProjects() {
		return projectsMapper.getAllProjects();
	}

	@Override
	public boolean addMoney(Double psGetmoney, String psId) {
		int addMoney = projectsMapper.addMoney(psGetmoney, psId);
		if(addMoney > 0) {
			return true;
		}
		return false;
	}


	

}
