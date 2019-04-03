package com.fengbo.servicetest;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fengbo.bean.Projectstype;
import com.fengbo.service.ProjectstypeService;
import com.fengbo.service.impl.ProjectstypeServiceImpl;

public class ServiceTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-service.xml");

		
		ProjectstypeService bean = context.getBean(ProjectstypeServiceImpl.class);
		List<Projectstype> projectstype = bean.getProjectstype();
		System.out.println(projectstype);

		
		
	}

}
