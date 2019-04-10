package com.fengbo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengbo.bean.Relationship;
import com.fengbo.service.RelationshipService;

@Controller
public class RelationshipController {

	@Resource
	private RelationshipService relationshipService;
	
	@ResponseBody
	@RequestMapping("getRelationship")
	public List<Relationship> getRelationship(){
		return relationshipService.getRelationship();
	}
	
}
