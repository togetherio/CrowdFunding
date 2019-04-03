package com.fengbo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.User;
import com.fengbo.service.UserService;
import com.fengbo.unit.Base64Util;
import com.fengbo.unit.FileUtil;
import com.fengbo.unit.IdCardUtil;

@Controller
public class AdminUserController {
	
	@Resource
	private UserService userService;
	
	
	@RequestMapping("getCheckUser")
	@ResponseBody
	public List<Object> getCheckUser(HttpServletRequest req) throws IOException {
		
		List<Object> ll = new ArrayList<>();
		List<User> users = userService.selectBySign(1);
		for (User user : users) {
			List<Object> list = new ArrayList<>();
			String FaceImg = "f:/CrowdFunding/images/FaceImg/"+user.getUsId()+".jpg";
			String IdCardImg = "f:/CrowdFunding/images/IdCardImg/"+user.getUsId()+".jpg";
			byte[] faceImg = FileUtil.readFileByBytes(FaceImg);
			byte[] idCardImg = FileUtil.readFileByBytes(IdCardImg);
			String faceImgBase64 = Base64Util.encode(faceImg);
			String idCardImgBase64 = Base64Util.encode(idCardImg);
			
			list.add(user);
			list.add(faceImgBase64);
			list.add(idCardImgBase64);
			ll.add(list);

		}	 
		return ll;
	}
	
	@RequestMapping("smshDetail")
	public String smshDetail(String usId,HttpServletRequest req) {
		String imgUrl = "F:/CrowdFunding/images/IdCardImg/"+usId+".jpg";
		User userIdCardDetail = IdCardUtil.getIdCardMessage(imgUrl);
		req.getSession().setAttribute("userIdCardDetail", userIdCardDetail);
		return "admin/smsh_detail";
	}
	
	
	/*
	 * 审核通过，把两张照片，身份证文字信息 尺寸如数据库
	 * 在数据库中存入一个审核通过的标志 1
	 */
	@RequestMapping("CheckPass")
	@ResponseBody
	public Map<String,Object> CheckPass(String usId) {
		Map<String,Object> map = new HashMap<>();
		System.out.println(usId);
		String faceImgUrl = "F:/CrowdFunding/images/FaceImg/"+usId+".jpg";
		String idCardImgUrl = "F:/CrowdFunding/images/IdCardImg/"+usId+".jpg";
		//身份证上的文字信息
		User u = IdCardUtil.getIdCardMessage(idCardImgUrl);
		
		boolean pass = userService.insertPassSign(usId,u.getUsRealname(),u.getUsSex(),u.getUsEntic(),u.getUsBirthday(),u.getUsAddress(),u.getUsIdcard(),faceImgUrl,idCardImgUrl);
		if(pass = true) {
			map.put("passSign", true);
		}else {
			map.put("passSign", false);
		}
		return map;
	}
	
	/*
	 * 审核不通过，
	 * 在数据库中存入一个审核不通过的标志 2
	 */
	@RequestMapping("CheckNopass")
	@ResponseBody
	public Map<String,Object> ChecNopass(String usId) {
		Map<String,Object> map = new HashMap<>();
		boolean noPass = userService.insertNopassSign(usId);
		if(noPass = true) {
			map.put("noPassSign", true);
		}else {
			map.put("noPassSign", false);
		}
		return map;
	}
	
	
}
