package com.rabbit.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.mybatis.generator.base.service.single.BaseServiceImp;
import com.rabbit.dao.MapUserReleaseMapper;
import com.rabbit.model.MapUserRelease;
import com.rabbit.model.MapUserReleaseExample;
import com.rabbit.service.IMapUserReleaseService;

@Service
public class MapUserReleaseServiceImp extends
		BaseServiceImp<MapUserRelease, MapUserReleaseExample> implements
		IMapUserReleaseService {

	MapUserReleaseMapper mapUserReleaseMapper;

	@Autowired
	public void setMapUserReleaseMapper(
			MapUserReleaseMapper mapUserReleaseMapper) {
		this.mapUserReleaseMapper = mapUserReleaseMapper;
		this.setBaseMapper(mapUserReleaseMapper);
	}

	@Override
	public List<Integer> selectOrgIdsByOrgCode(String nameEn) {
		List<Integer> ListIds=new ArrayList<Integer>();
		MapUserReleaseExample e = new MapUserReleaseExample();
		// MapUserReleaseExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/
		e.createCriteria().andSysOrgCodeEqualTo(nameEn);
		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<MapUserRelease> list = mapUserReleaseMapper.selectByExample(e);
		for (MapUserRelease mapUserRelease : list) {
			ListIds.add(mapUserRelease.getSysAdminId().intValue());
		}
		return ListIds;
	}

}
