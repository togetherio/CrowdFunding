package com.fengbo.service;

import java.util.List;

import com.fengbo.bean.Projectstype;

public interface ProjectstypeService {
	List<Projectstype> getProjectstype();
	
	public Projectstype getOne(int id);

}
