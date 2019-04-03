package com.fengbo.daotest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengbo.bean.Projectstype;
import com.fengbo.dao.ProjectstypeMapper;

public class DaoTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
/*		UserMapper userMapper = context.getBean(UserMapper.class);
		//User user = userMapper.selectByPrimaryKey(1);
		//System.out.println(user+"==");
		User user = new User();
		user.setUsUsername("张三");
		//userMapper.insert(user);
		System.out.println("OK");*/
		
		ProjectstypeMapper mapper = context.getBean(ProjectstypeMapper.class);
		Projectstype pro = mapper.selectByPrimaryKey(1);
		System.out.println(pro);
		
		
	}

}
