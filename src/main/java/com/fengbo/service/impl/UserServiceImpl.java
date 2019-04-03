package com.fengbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.fengbo.bean.User;
import com.fengbo.dao.UserMapper;
import com.fengbo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;


	@Override
	public User login(String phone, String password) {
		User userLogin = userMapper.userLogin(phone, password);
		return userLogin;
	}

	@Override
	public boolean register(User user) {
		int insert = userMapper.insert(user);
		if(insert > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertSignById(String id) {
		int insertSignById = userMapper.insertSignById(id);
		if(insertSignById > 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<User> selectBySign(int sign) {
		List<User> users = userMapper.selectBySign(sign);
		return users;
	}

	@Override
	public boolean insertPassSign(String usId,String usRealname,String usSex,String usEntic,String usBirthday,String usAddress,String usIdcard,String usFaceImgAddr,String usIdcardImgAddr) {
		int insertPassSign = userMapper.insertPassSign(usId,usRealname,usSex,usEntic,usBirthday,usAddress,usIdcard,usFaceImgAddr,usIdcardImgAddr);
		if(insertPassSign > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertNopassSign(String usId) {
		int insertNopassSign = userMapper.insertNopassSign(usId);
		if(insertNopassSign > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean noCheck(String usId) {
		User noCheck = userMapper.noCheck(usId);
		if(noCheck != null) {
			return true;
		}
		return false;
	}
	@Override
	public boolean checkWait(String usId) {
		User checkWait = userMapper.checkWait(usId);
		if(checkWait != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkPass(String usId) {
		User checkPass = userMapper.checkPass(usId);
		if(checkPass != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkNopass(String usID) {
		User checkNopass = userMapper.checkNopass(usID);
		if(checkNopass != null) {
			return true;
		}
		return false;
	}

	

}
