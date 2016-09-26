package com.rabbit.service.impl;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.dao.MapRoleAuthMapper;
import com.rabbit.model.MapRoleAuth;
import com.rabbit.model.MapRoleAuthExample;
import com.rabbit.service.IMapRoleAuthService;

@Service
public class MapRoleAuthServiceImp extends BaseServiceImp<MapRoleAuth, MapRoleAuthExample> implements IMapRoleAuthService {

	MapRoleAuthMapper mapRoleAuthMapper;

	@Autowired
	public void setMapRoleAuthMapper(MapRoleAuthMapper mapRoleAuthMapper) {
		this.mapRoleAuthMapper = mapRoleAuthMapper;
		this.setBaseMapper(mapRoleAuthMapper);
	}

}
