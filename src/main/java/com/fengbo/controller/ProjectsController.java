package com.fengbo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.Projects;
import com.fengbo.service.ProjectsService;


@Controller
public class ProjectsController {
	@Resource  //写在字段上, 那么就不需要再写setter方法
	private ProjectsService projectsService;

	@ResponseBody
	@RequestMapping("getProjects")
	public Map<String, List<Projects>> getProduct(){
		Map<String, List<Projects>> map = new HashMap<String, List<Projects>>();
		map.put("hotProjects",projectsService.getHotProjects());
		map.put("newProjects", projectsService.getNewProjects());
		return map;
	}
	
}
