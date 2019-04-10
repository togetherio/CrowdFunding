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
import org.springframework.web.servlet.ModelAndView;

import com.fengbo.bean.Projects;
import com.fengbo.service.ProjectsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class AdminProjectsController {

	@Resource
	private ProjectsService projectsService;

	/*
	 * 获取所有待审核项目
	 */
	@ResponseBody
	@RequestMapping("getCheckProjects")
	public List<Projects> getCheckProjects() {
		List<Projects> allCheckProjects = projectsService.getAllCheckProjects();
		return allCheckProjects;
	}

	/*
	 * 审核通过
	 */
	@ResponseBody
	@RequestMapping("checkProjectsPass")
	public Map<String, Object> checkProjectsPass(String psId) {
		Map<String, Object> map = new HashMap<>();
		boolean pass = projectsService.checkProjectsPass(psId);
		if (pass == true) {
			map.put("isPass", true);
		} else {
			map.put("isPass", false);
		}
		return map;
	}

	/*
	 * 审核没有通过
	 */
	@ResponseBody
	@RequestMapping("checkProjectsNoPass")
	public Map<String, Object> checkProjectsNoPass(String psId) {
		Map<String, Object> map = new HashMap<>();
		boolean noPass = projectsService.checkProjectsNoPass(psId);
		if (noPass == true) {
			map.put("isNoPass", true);
		} else {
			map.put("isNoPass", false);
		}
		return map;
	}

	/*
	 * 获取所有项目 分页
	 */
	@ResponseBody
	@RequestMapping("getAllProjects")
	public List<Projects> getAllProjects(HttpSession session,ModelAndView mav,
			@RequestParam(value = "pageNum", required = true, defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Projects> allProjects = projectsService.getAllProjects();
		PageInfo<Projects> pageInfo = new PageInfo<Projects>(allProjects);
		session.setAttribute("pageInfo", pageInfo);
		return allProjects;
		/*mav.addObject("allProjects",allProjects);
		mav.addObject("pageInfo", pageInfo);
		mav.setViewName("admin/all_projects");*/

	}

}
