package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.IMapRoleAuthFront;
import com.rabbit.dao.MapRoleAuthMapper;
import com.rabbit.fanbase.io.requset.MapRoleAuthReq;
import com.rabbit.fanbase.io.response.MapRoleAuthRes;
import com.rabbit.model.MapRoleAuth;
import com.rabbit.model.MapRoleAuthExample;

@Service
public class MapRoleAuthFrontImp implements IMapRoleAuthFront {

	private final Logger log = LogManager.getLogger(this.getClass());

	@Autowired
	MapRoleAuthMapper mapRoleAuthMapper;

	@Override
	public Pages<MapRoleAuthReq> browser(MapRoleAuthReq mapRoleAuth,
			@RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		MapRoleAuthExample example = new MapRoleAuthExample();
		/** 查询业务逻辑 **/

		// example.createCriteria().andParentIdEqualTo(sysOrg.getParentId());

		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<MapRoleAuthReq> list = new ArrayList<MapRoleAuthReq>();
		long total = mapRoleAuthMapper.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause("SORT_");
			/** 排序业务逻辑完 **/
			// list = mapRoleAuthMapper.selectOnPage(example, offset, length);
		}
		return new Pages<MapRoleAuthReq>(list, total, offset, length);
	}

	@Override
	public int delete(List<MapRoleAuthReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(MapRoleAuthReq mapRoleAuthReq) {
		MapRoleAuth mapRoleAuth = new MapRoleAuth();
		SpringBeanUtils.copyProperties(mapRoleAuthReq, mapRoleAuth);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return mapRoleAuthMapper.insert(mapRoleAuth);
	}

	@Override
	public int update(MapRoleAuthReq mapRoleAuthReq) {
		MapRoleAuth mapRoleAuth = new MapRoleAuth();
		SpringBeanUtils.copyProperties(mapRoleAuthReq, mapRoleAuth);
		MapRoleAuthExample e = new MapRoleAuthExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return mapRoleAuthMapper.updateByExampleSelective(mapRoleAuth, e);
	}

	@Override
	public MapRoleAuthRes selectBy(MapRoleAuthReq mapRoleAuthReq) {
		MapRoleAuthExample e = new MapRoleAuthExample();
		// MapRoleAuthExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<MapRoleAuth> list = mapRoleAuthMapper.selectByExample(e);
		if (list.size() != 1) {
			throw new RuntimeException("对象不存在!");
		}
		return null;

	}

}
