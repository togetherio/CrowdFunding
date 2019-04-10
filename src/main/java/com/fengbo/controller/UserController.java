package com.fengbo.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.Base64Utils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.aliyuncs.exceptions.ClientException;
import com.fengbo.bean.User;
import com.fengbo.service.UserService;
import com.fengbo.unit.*;

@Controller
public class UserController {

	@Resource
	private UserService userService;

	@ResponseBody
	@RequestMapping("code")
	public String getCode(User user, String tel, HttpServletRequest req) {
		System.out.println("手机号:" + tel);
		String code = NumCodeUtil.getRandomCode(6);
		System.out.println("验证码:" + code);
		try {
			SmsUnit.sendSms(tel, code);
			// 把code放到session里，并设置有限期
			HttpSession session = req.getSession();
			session.setAttribute("code", code);
			// 设置有效时间
			session.setMaxInactiveInterval(5 * 60);
			return "200";
		} catch (ClientException e) {
			e.printStackTrace();
			return "400";
		}

	}

	@RequestMapping("register")
	public String register(User user, HttpServletRequest req) {
		user.setUsId(NumCodeUtil.getRandomCode(10));
		String code = (String) req.getSession().getAttribute("code");
		String usCode = user.getUsCode();
		System.out.println("code" + code + "===" + "usCode" + usCode);
		if (code.equals(usCode)) {
			boolean registerSuc = userService.register(user);
			if (registerSuc) {
				/* req.getSession().setAttribute("regSuccUser", registerSuc); */
				return "login";
			}
		}
		// 注册失败 销毁session中的验证码
		// req.getSession().removeAttribute("code");
		return "error_register";
	}

	@RequestMapping("login")
	public String login(User user, HttpServletRequest req, HttpServletResponse resp) {
		User login = userService.login(user.getUsPhone(), user.getUsPassword());
		if (login != null) {
			// 登陆成功，在session中存入此用户
			req.getSession().setAttribute("activeuser", login);
			// 记住用户名
			String rem = req.getParameter("rem");
			if ("rem".equals(rem)) {
				Cookie ck = new Cookie("userinfo", user.getUsPhone() + ":" + user.getUsPassword());
				ck.setPath(req.getContextPath());
				ck.setMaxAge(Integer.MAX_VALUE);
				resp.addCookie(ck);
			}
			/*
			 * // 自动登陆 String autoLogin = req.getParameter("autoLogin"); if
			 * ("autoLogin".equals(autoLogin)) { Cookie ck2 = new Cookie("autoLogin",
			 * "true"); ck2.setPath(req.getContextPath()); ck2.setMaxAge(Integer.MAX_VALUE);
			 * resp.addCookie(ck2); }
			 */

			return "index";
		}
		return "error_login";
	}

	/*
	 * 退出 删除session的数据， 但cookie中还有用户信息，下次可直接登陆
	 */
	@RequestMapping("quit")
	public String quit(HttpServletRequest req) {
		req.getSession().removeAttribute("activeuser");
		return "index";
	}

	/*
	 * 注销 把cookie中的数据清空，同时删除session中的数据
	 */
	@RequestMapping("logout")
	public String logout(HttpServletRequest req, HttpServletResponse resp) {
		Cookie[] cks = req.getCookies();
		if (cks.length > 0) {
			for (Cookie ck : cks) {
				String cookiename = ck.getName();
				Cookie cookie = new Cookie(cookiename, "");
				cookie.setMaxAge(0);
				cookie.setPath(req.getContextPath());
				resp.addCookie(cookie);
			}
		}

		req.getSession().removeAttribute("activeuser");
		return "index";
	}

	/*
	 * 实名认证 面部照片
	 */
	/*
	 * @RequestMapping("smrz")
	 * 
	 * @ResponseBody public Map<String, Object>
	 * smrz(@RequestParam(value="uploadfile",required=false) MultipartFile
	 * uploadfile,@RequestParam(value="imageData",required=false) String
	 * imageData,HttpServletRequest req) throws Exception { Map<String, Object> map
	 * = new HashMap<>(); User user =
	 * (User)req.getSession().getAttribute("activeuser"); if(user != null) { String
	 * usId = user.getUsId(); //上传文件路径 String path =
	 * "f:/CrowdFunding/images/FaceImg/"; //上传文件名称 String filename = usId; File file
	 * = new File(path+filename+".jpg");
	 * 
	 * if(imageData.length() > 0) { //解码生成图片 byte[] bytes =
	 * Base64Utils.decodeFromString(imageData); FileOutputStream out = new
	 * FileOutputStream(file); out.write(bytes); out.flush(); out.close();
	 * 
	 * map.put("msg", "面部照片提交成功，请提交身份证正面照片！"); map.put("isSubmit", true);
	 * req.getSession().setAttribute("submitFaceImage", true);
	 * 
	 * }else if(uploadfile.getSize() > 0) { //将当前文件传入到指定的目录中
	 * uploadfile.transferTo(file);
	 * 
	 * map.put("msg", "面部照片提交成功，请提交身份证正面照片！"); map.put("isSubmit", true);
	 * req.getSession().setAttribute("submitFaceImage", true); }else {
	 * map.put("msg", "面部照片提交失败,请登陆账号！"); map.put("isSubmit", false);
	 * req.getSession().setAttribute("submitFaceImage", false); } }else {
	 * map.put("msg", "面部照片提交失败,请登陆账号！"); map.put("isSubmit", false);
	 * req.getSession().setAttribute("submitFaceImage", false); } return map; }
	 */

	/*
	 * 实名认证 面部照片
	 */
	@RequestMapping("smrz")
	@ResponseBody
	public Map<String, Object> smrz(String imageData, HttpServletRequest req) throws Exception {
		Map<String, Object> map = new HashMap<>();
		User user = (User) req.getSession().getAttribute("activeuser");
		if (user != null) {
			String usId = user.getUsId();
			// 上传文件路径
			String path = "f:/CrowdFunding/images/FaceImg/";
			// 上传文件名称
			String filename = usId;
			File file = new File(path + filename + ".jpg");

			// 解码生成图片
			byte[] bytes = Base64Utils.decodeFromString(imageData);
			
			FileOutputStream out = new FileOutputStream(file);
			out.write(bytes);
			out.flush();
			out.close();

			map.put("msg", "面部照片提交成功，请提交身份证正面照片！");
			map.put("isSubmit", true);
			req.getSession().setAttribute("submitFaceImage", true);

		} else {
			map.put("msg", "面部照片提交失败,请登陆账号！");
			map.put("isSubmit", false);
			req.getSession().setAttribute("submitFaceImage", false);
		}
		return map;
	}

	/*
	 * 实名认证 身份证照片
	 */
	@RequestMapping("imgUpload")
	@ResponseBody
	public Map<String, Object> imgUpload(MultipartFile uploadfile, HttpServletRequest req) {
		Map<String, Object> map = new HashMap<>();
		User user = (User) req.getSession().getAttribute("activeuser");
		if (user != null) {
			String usId = user.getUsId();
			if (uploadfile.getSize() > 0) {
				// 上传文件路径
				String path = "f:/CrowdFunding/images/IdCardImg/";
				// 上传文件名称
				String filename = usId;
				File file = new File(path + filename + ".jpg");
				// 将当前文件传入到指定的目录中
				try {
					uploadfile.transferTo(file);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				map.put("msg", "身份证照片上传成功，请等待审核结果！");
				map.put("isSubmit", true);
				req.getSession().setAttribute("submitIdCardImage", true);
				// 执行方法
				insertSubmitImgSign(req, user);

			} else {
				map.put("msg", "身份证照片上传失败,请重新上传！");
				map.put("isSubmit", false);
				req.getSession().setAttribute("submitIdCardImage", false);
			}
		} else {
			map.put("msg", "身份证照片上传失败,请重新上传！");
			map.put("isSubmit", false);
			req.getSession().setAttribute("submitIdCardImage", false);
		}
		return map;
	}

	/*
	 * 向数据库中插入一个标记 1 ，说明实名认证的两张照片都已经提交
	 */
	public void insertSubmitImgSign(HttpServletRequest req, User user) {
		Boolean submitFaceImage = (Boolean) req.getSession().getAttribute("submitFaceImage");
		Boolean submitIdCardImage = (Boolean) req.getSession().getAttribute("submitIdCardImage");
		if (submitFaceImage == true && submitIdCardImage == true) {
			userService.insertSignById(user.getUsId());
		}

	}

	/*
	 * 审核结果
	 */
	@RequestMapping("checkResult")
	@ResponseBody
	public Map<String, Object> checkResult(HttpServletRequest req) {
		Map<String, Object> map = new HashMap<>();
		User user = (User) req.getSession().getAttribute("activeuser");
		String usId = user.getUsId();
		boolean noCheck = userService.noCheck(usId);
		if (noCheck == true) {
			map.put("check", "您还未进行实名认证，请上传身份信息！");
			map.put("isPass", false);
		}
		boolean checkWait = userService.checkWait(usId);
		if (checkWait == true) {
			map.put("check", "实名认证，正在审核中，请等待！");
			map.put("isPass", false);
		}
		boolean checkPass = userService.checkPass(usId);
		if (checkPass == true) {
			map.put("check", "实名认证，审核通过！");
			map.put("isPass", true);
		}
		boolean checkNopass = userService.checkNopass(usId);
		if (checkNopass == true) {
			map.put("check", "实名认证，审核没有通过！请重新上传身份信息！");
			map.put("isPass", false);
		}
		return map;
	}
	
	/*
	 * 获取所有用户
	 */
	@RequestMapping("getAllUsers")
	@ResponseBody
	public List<User> getAllUsers(){
		List<User> allUsers = userService.getAllUsers();
		return allUsers;
	}
	
	/*
	 * 修改基本信息
	 */
	@RequestMapping("changeInfo")
	@ResponseBody
	public Map<String, Object> changeInfo(String username,String password,String phone,  HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		User user = (User)request.getSession().getAttribute("activeuser");
		String usId = user.getUsId();		
		boolean changeInfo = userService.changeInfo(username, password, phone, usId);
		if(changeInfo == true) {
			map.put("isChange", true);
		}else {
			map.put("isChange", false);
		}
		return map;
	}
}
