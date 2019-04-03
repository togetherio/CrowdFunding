package com.fengbo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.Projectstype;
import com.fengbo.service.ProjectstypeService;

@Controller
public class ProjectstypeController {

	@Resource
	private ProjectstypeService projectstypeService;
	
	@RequestMapping("getProjectstype")
	@ResponseBody
	public List<Projectstype> getProjectstype(){
		return projectstypeService.getProjectstype();
	}
}
