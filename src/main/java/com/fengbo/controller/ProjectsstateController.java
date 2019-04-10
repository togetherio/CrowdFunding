package com.fengbo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.Projectsstate;
import com.fengbo.service.ProjectsstateService;

@Controller
public class ProjectsstateController {

	@Resource
	private ProjectsstateService projectsstateService;
	
	@RequestMapping("getProjectsstate")
	@ResponseBody
	public List<Projectsstate> getProjectsstate(){
		return projectsstateService.getProjectsstate();
	}
}
