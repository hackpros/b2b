
package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.IMapUserReleaseFront;
import com.rabbit.fanbase.io.requset.MapUserReleaseReq;
import com.rabbit.fanbase.io.response.MapUserReleaseRes;
import com.rabbit.model.MapUserRelease;
import com.rabbit.model.MapUserReleaseExample;
import com.rabbit.service.IMapUserReleaseService;

@Service
public class MapUserReleaseFrontImp implements IMapUserReleaseFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Resource
	IMapUserReleaseService mapUserReleaseService;


	@Override
	public Pages<?> browser(MapUserReleaseReq mapUserRelease, @RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		MapUserReleaseExample example = new MapUserReleaseExample();
		/** 查询业务逻辑 **/

		// example.createCriteria().andParentIdEqualTo(sysOrg.getParentId());

		/** 查询业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<MapUserReleaseRes> list = new ArrayList<MapUserReleaseRes>();
		long total = mapUserReleaseService.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause("SORT_");
			/** 排序业务逻辑完 **/
		}
		return new Pages<MapUserReleaseRes>(list, total, offset, length);
	}

	@Override
	public int delete(List<MapUserReleaseReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(MapUserReleaseReq mapUserReleaseReq) {
		MapUserRelease mapUserRelease=new MapUserRelease();
		SpringBeanUtils.copyProperties(mapUserReleaseReq, mapUserRelease);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return mapUserReleaseService.insert(mapUserRelease);
	}

	@Override
	public int update(MapUserReleaseReq mapUserReleaseReq) {
		MapUserRelease mapUserRelease=new MapUserRelease();
		SpringBeanUtils.copyProperties(mapUserReleaseReq, mapUserRelease);
		MapUserReleaseExample e = new MapUserReleaseExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return mapUserReleaseService.updateByExampleSelective(mapUserRelease, e);
	}

	@Override
	public MapUserReleaseRes selectBy(MapUserReleaseReq mapUserReleaseReq) {
		MapUserRelease mapUserRelease=new MapUserRelease();
		SpringBeanUtils.copyProperties(mapUserReleaseReq, mapUserRelease);
		MapUserReleaseExample e = new MapUserReleaseExample();
		// MapUserReleaseExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<MapUserRelease> list = mapUserReleaseService.selectByExample(e);
		MapUserReleaseRes mapUserReleaseRes=new MapUserReleaseRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(list.get(0), mapUserRelease);
		}
		return mapUserReleaseRes;

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
		List<MapUserRelease> list = mapUserReleaseService.selectByExample(e);
		for (MapUserRelease mapUserRelease : list) {
			ListIds.add(mapUserRelease.getSysAdminId().intValue());
		}
		return ListIds;
	}


}

