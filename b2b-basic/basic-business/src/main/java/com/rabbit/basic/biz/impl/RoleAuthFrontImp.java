
package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.IRoleAuthFront;
import com.rabbit.fanbase.io.requset.RoleAuthReq;
import com.rabbit.fanbase.io.response.RoleAuthRes;
import com.rabbit.model.RoleAuth;
import com.rabbit.model.RoleAuthExample;
import com.rabbit.service.IRoleAuthService;

@Service
public class RoleAuthFrontImp  implements IRoleAuthFront {
	
	private final Logger log = LogManager.getLogger(this.getClass());
	
	@Resource
	IRoleAuthService roleAuthService;
	@Override
	public Pages<?> browser(RoleAuthReq roleAuth, @RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		RoleAuthExample example = new RoleAuthExample();
		/**查询业务逻辑**/

		
		/**查询业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<RoleAuth> list = new ArrayList<RoleAuth>();
		long total = roleAuthService.countByExample(example);
		if (total > 0) {
		}
		return new Pages<RoleAuth>(list, total, offset, length);
	}

	@Override
	public int delete(List<RoleAuthReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(RoleAuthReq roleAuthReq) {
		RoleAuth roleAuth=new RoleAuth();
		SpringBeanUtils.copyProperties(roleAuthReq, roleAuth);
		/**新增业务逻辑**/
		
		/**新增业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return roleAuthService.insert(roleAuth);
	}

	@Override
	public int update(RoleAuthReq roleAuthReq) {
		RoleAuth roleAuth=new RoleAuth();
		SpringBeanUtils.copyProperties(roleAuthReq, roleAuth);
		RoleAuthExample e = new RoleAuthExample();
		/**更新业务逻辑**/

		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return roleAuthService.updateByExampleSelective(roleAuth, e);
	}

	@Override
	public RoleAuthRes selectBy(RoleAuthReq roleAuthReq) {
		RoleAuth roleAuth=new RoleAuth();
		SpringBeanUtils.copyProperties(roleAuthReq, roleAuth);
		RoleAuthExample e = new RoleAuthExample();
		//RoleAuthExample.Criteria c=e.createCriteria();
		/**更新业务逻辑**/
		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<RoleAuth> list = roleAuthService.selectByExample(e);
		RoleAuthRes res=new RoleAuthRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(roleAuth, res);
		}
		return res;
		
	}
	
}


