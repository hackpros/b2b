
package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.ISysRoleFront;
import com.rabbit.dao.SysRoleMapper;
import com.rabbit.fanbase.io.requset.SysRoleReq;
import com.rabbit.fanbase.io.response.SysRoleRes;
import com.rabbit.model.SysRole;
import com.rabbit.model.SysRoleExample;

@Service
public class SysRoleFrontImp  implements ISysRoleFront {
	
	private final Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	SysRoleMapper sysRoleMapper;
	
	@Override
	public Pages<?> browser(SysRoleReq sysRole, @RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		SysRoleExample example = new SysRoleExample();
		/**查询业务逻辑**/

		
		/**查询业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<SysRoleReq> list = new ArrayList<SysRoleReq>();
		long total = sysRoleMapper.countByExample(example);
		if (total > 0) {
			//list = sysRoleMapper.selectOnPage(example, offset, length);
		}
		return new Pages<SysRoleReq>(list, total, offset, length);
	}

	@Override
	public int delete(List<SysRoleReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(SysRoleReq sysSettingReq) {
		SysRole sysRole = new SysRole();
		SpringBeanUtils.copyProperties(sysSettingReq, sysRole);
		/**新增业务逻辑**/
		
		/**新增业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return sysRoleMapper.insert(sysRole);
	}

	@Override
	public int update(SysRoleReq sysSettingReq) {
		SysRole sysRole = new SysRole();
		SpringBeanUtils.copyProperties(sysSettingReq, sysRole);
		SysRoleExample e = new SysRoleExample();
		/**更新业务逻辑**/

		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return sysRoleMapper.updateByExampleSelective(sysRole, e);
	}

	@Override
	public SysRoleRes selectBy(SysRoleReq sysRole) {
		SysRoleExample e = new SysRoleExample();
		//SysRoleExample.Criteria c=e.createCriteria();
		/**更新业务逻辑**/
		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<SysRole> list = sysRoleMapper.selectByExample(e);
		if (list.size() != 1) {
			throw new RuntimeException("对象不存在!");
		}
		return null;
		
	}
	
}


