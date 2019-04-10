package com.fengbo.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.fengbo.bean.Projects;
import com.fengbo.bean.User;
import com.fengbo.service.ProjectsService;
import com.fengbo.unit.NumCodeUtil;
import com.fengbo.unit.UploadFileUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class ProjectsController {
	@Resource // 写在字段上, 那么就不需要再写setter方法
	private ProjectsService projectsService;

	/*
	 * 最热项目 最新项目
	 */
	@ResponseBody
	@RequestMapping("getProjects")
	public Map<String, List<Projects>> getProduct() {
		Map<String, List<Projects>> map = new HashMap<String, List<Projects>>();
		map.put("hotProjects", projectsService.getHotProjects());
		map.put("newProjects", projectsService.getNewProjects());
		return map;
	}

	/*
	 * 审核中项目
	 */
	@ResponseBody
	@RequestMapping("getReadyProjects")
	public List<Projects> getReadyProjects() {
		List<Projects> readyProjects = projectsService.getReadyProjects();
		return readyProjects;
	}

	/*
	 * 已结束项目
	 */
	@ResponseBody
	@RequestMapping("getSucProjects")
	public List<Projects> getSucProjects() {
		List<Projects> sucProjects = projectsService.getSucProjects();
		return sucProjects;
	}

	/*
	 * @ResponseBody
	 * 
	 * @RequestMapping("getAllProjects") public void getAllProjects( HttpSession
	 * session,@RequestParam(value="pageNum",required=true,defaultValue="1") Integer
	 * pageNum,@RequestParam(required=false,defaultValue="8") Integer pageSize){
	 * PageHelper.startPage(pageNum, pageSize); List<Projects> allProjects =
	 * projectsService.getAllProjects(); PageInfo<Projects> info = new
	 * PageInfo<Projects>(allProjects); session.setAttribute("info", info);
	 * 
	 * }
	 */

	/*
	 * 分类 分页
	 * 
	 */
	@RequestMapping("getPojectByPstId")
	public String getPojectByPstId(int pstId, HttpSession session,
			@RequestParam(value = "pageNum", required = true, defaultValue = "1") Integer pageNum,
			@RequestParam(value = "pageSize",required = false, defaultValue = "8") Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Projects> pojectByPstId = projectsService.getPojectByPstId(pstId);
		PageInfo<Projects> info = new PageInfo<Projects>(pojectByPstId);
		session.setAttribute("info", info);
		session.setAttribute("pstId", pstId);

		return "gyzc_list";
	}

	/*
	 * 每个项目的详情
	 * 
	 */
	@RequestMapping("getOneDetailBypsId")
	public String getOneDetailBypsId(String psId, HttpSession session) {
		System.out.println("psId=" + psId);
		Projects oneDetailBypsId = projectsService.getOneDetailBypsId(psId);
		System.out.println("====" + oneDetailBypsId);
		session.setAttribute("one", oneDetailBypsId);
		return "project_detail";
	}

	/*
	 * 保存草稿
	 */
	@ResponseBody
	@RequestMapping("savedraft")
	public void savedraft(HttpServletRequest request) throws IllegalStateException, IOException {

		MultipartHttpServletRequest mprequest = (MultipartHttpServletRequest) request;

		String psPatientRelationship = mprequest.getParameter("psPatientRelationship");
		request.getSession().setAttribute("psPatientRelationship", psPatientRelationship);
		String psIllnessName = mprequest.getParameter("psIllnessName");
		String psName = mprequest.getParameter("psName");
		String psStory = mprequest.getParameter("psStory");
		Double psMoney = Double.parseDouble(mprequest.getParameter("psMoney"));
		Integer psDays = Integer.parseInt(mprequest.getParameter("psDays"));

		MultipartFile coverFile = mprequest.getFile("paImgName");
		// 上传文件的真实名字
		String imgRealName = coverFile.getOriginalFilename();
		// String path =
		// request.getSession().getServletContext().getRealPath("/")+"preview"+"\\"+imgName;
		// D:\eclipse-workspace\CrowdFunding\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\CrowdFunding\preview

		String path = "F:/CrowdFunding/images/preview/";
		File destFile = new File(path, imgRealName);
		coverFile.transferTo(destFile);
		
		Projects projects = new Projects();
		projects.setPsPatientRelationship(psPatientRelationship);
		projects.setPsIllnessName(psIllnessName);
		projects.setPsName(psName);
		projects.setPsStory(psStory);
		projects.setPsMoney(psMoney);
		projects.setPsDays(psDays);
		projects.setPaImgName("preview/" + imgRealName);

		request.getSession().setAttribute("projects", projects);

	}

	/*
	 * 项目提交审核
	 */
	@ResponseBody
	@RequestMapping("pojectSubmit")
	public Map<String, Object> pojectSubmit(HttpServletRequest request) throws IllegalStateException, IOException {
		Map<String, Object> map = new HashMap<>();
		User user = (User) request.getSession().getAttribute("activeuser");
		String psUsId = user.getUsId();
		String psId = NumCodeUtil.getRandomCode(10);

		MultipartHttpServletRequest mprequest = (MultipartHttpServletRequest) request;

		String psPatientRelationship = mprequest.getParameter("psPatientRelationship");
		String psIllnessName = mprequest.getParameter("psIllnessName");
		String psName = mprequest.getParameter("psName");
		Integer psPstId = Integer.parseInt(mprequest.getParameter("psPstId"));
		String psStory = mprequest.getParameter("psStory");
		Double psMoney = Double.parseDouble(mprequest.getParameter("psMoney"));
		Integer psDays = Integer.parseInt(mprequest.getParameter("psDays"));

		MultipartFile coverFile = mprequest.getFile("paImgName");
		// 上传文件的真实名字
		String imgRealName = coverFile.getOriginalFilename();
		// 获取后缀名
		String suffixName = imgRealName.substring(imgRealName.lastIndexOf("."));
		String imgName = psId + suffixName;
		String path = "F:/CrowdFunding/images/projects/";
		File destFile = new File(path, imgName);
		coverFile.transferTo(destFile);

		Projects projects = new Projects();
		projects.setPsPatientRelationship(psPatientRelationship);
		projects.setPsIllnessName(psIllnessName);
		projects.setPsName(psName);
		projects.setPsPstId(psPstId);
		projects.setPsStory(psStory);
		projects.setPsMoney(psMoney);
		projects.setPsDays(psDays);
		projects.setPaImgName(imgName);

		projects.setPsId(psId);
		projects.setPsUsId(psUsId);

		boolean addProject = projectsService.addProject(projects);
		if (addProject == true) {
			map.put("isAdd", true);
		} else {
			map.put("isAdd", false);
		}
		return map;

	}
	
	/*
	 * 对项目支持后， 筹款金额，人数  改变
	 */
	@ResponseBody
	@RequestMapping("addMoney")
	public Map<String, Object> addMoney(Double money, String psId){
		Map<String, Object> map = new HashMap<>();
		boolean addMoney = projectsService.addMoney(money, psId);
		if(addMoney == true) {
			map.put("isAdd", true);
		}else {
			map.put("isAdd", false);
		}
		return map;
	}

}
