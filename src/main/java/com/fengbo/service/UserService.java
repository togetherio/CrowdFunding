package com.fengbo.service;

import java.util.List;

import com.fengbo.bean.User;

public interface UserService {

	/* 用户登录 */
	User login(String phone, String password);

	/* 注册用户 */
	boolean register(User user);
	
	/*插入一个标记 ，说明实名认证的两张照片都已经提交*/
	boolean insertSignById(String id);
	
	List<User> selectBySign(int sign);
	
	boolean insertPassSign(String usId,String usRealname,String usSex,String usEntic,String usBirthday,String usAddress,String usIdcard,String usFaceImgAddr,String usIdcardImgAddr);

	boolean insertNopassSign(String usId);
	
	//未提交照片进行身份认证
	boolean noCheck(String usId);
  	//审核中
	boolean checkWait(String usId);
  	//审核通过
	boolean checkPass(String usId);
  	//审核不通过
	boolean checkNopass(String usID);


}
