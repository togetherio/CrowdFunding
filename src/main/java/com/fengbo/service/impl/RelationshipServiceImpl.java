package com.fengbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fengbo.bean.Relationship;
import com.fengbo.dao.RelationshipMapper;
import com.fengbo.service.RelationshipService;

@Service
public class RelationshipServiceImpl implements RelationshipService {

	@Resource
	private RelationshipMapper relationshipMapper;
	
	@Override
	public List<Relationship> getRelationship() {
		return relationshipMapper.selectByExample(null);
	}

}
