
package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rabbit.basic.biz.IUsrRoleFront;
import com.rabbit.fanbase.io.requset.UsrRoleReq;
import com.rabbit.fanbase.io.response.UsrRoleRes;
import com.rabbit.model.UsrRole;
import com.rabbit.model.UsrRoleExample;
import com.rabbit.service.IUsrRoleService;

@Component
public class UsrRoleFrongImp implements IUsrRoleFront {
	
	private final Logger log = LogManager.getLogger(this.getClass());
	
	@Resource
	IUsrRoleService usrRoleService;
	
	
	@Override
	public Pages<UsrRoleRes > browser(UsrRoleReq usrRoleReq, @RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		UsrRoleExample example = new UsrRoleExample();
		/**查询业务逻辑**/

		
		/**查询业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		
		PageHelper.startPage(offset, length);
		List<UsrRole> list = usrRoleService.selectByExample(example);
		PageInfo<UsrRole> pages = new PageInfo<UsrRole>(list);
		List<UsrRoleRes> resultList = new ArrayList<UsrRoleRes>();
		for (UsrRole usrRole : pages.getList()) {
			UsrRoleRes res = new UsrRoleRes();
			SpringBeanUtils.copyProperties(usrRole, res);
			resultList.add(res);
		}
		return new Pages<UsrRoleRes>(resultList, pages.getTotal(), offset, length);
		//return new Pages<UsrRoleRes>(list, pages.getTotal(), offset, length);
	}

	@Override
	public int delete(List<UsrRoleReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(UsrRoleReq usrRoleReq) {
		UsrRole usrRole = new UsrRole();
		SpringBeanUtils.copyProperties(usrRoleReq, usrRole);
		/**新增业务逻辑**/
		
		/**新增业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return usrRoleService.insert(usrRole);
	}

	@Override
	public int update(UsrRoleReq usrRoleReq) {
		UsrRole usrRole = new UsrRole();
		SpringBeanUtils.copyProperties(usrRoleReq, usrRole);
		UsrRoleExample e = new UsrRoleExample();
		/**更新业务逻辑**/

		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return usrRoleService.updateByExampleSelective(usrRole, e);
	}

	@Override
	public UsrRoleRes selectBy(UsrRoleReq usrRole) {
		UsrRoleExample e = new UsrRoleExample();
		/**更新业务逻辑**/
		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<UsrRole> list = usrRoleService.selectByExample(e);
		UsrRoleRes res=new UsrRoleRes();
		if (list.size() >1) {
			SpringBeanUtils.copyProperties(list.get(0), res);
		}
		
		return res;
		
	}
	
}


