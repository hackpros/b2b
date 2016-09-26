
package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.rabbit.basic.biz.IRoleSysFront;
import com.rabbit.fanbase.io.requset.RoleSysReq;
import com.rabbit.fanbase.io.response.RoleSysRes;
import com.rabbit.model.RoleSys;
import com.rabbit.model.RoleSysExample;
import com.rabbit.service.IRoleSysService;

@Service
public class RoleSysFrontImp  implements IRoleSysFront {
	
	private final Logger log = LogManager.getLogger(this.getClass());
	@Resource
	IRoleSysService roleSysService;
	
	@Override
	public Pages<RoleSys> browser(RoleSysReq roleSys, @RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		RoleSysExample example = new RoleSysExample();
		/**查询业务逻辑**/

		
		/**查询业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<RoleSys> list = new ArrayList<RoleSys>();
		long total = roleSysService.countByExample(example);
		return new Pages<RoleSys>(list, total, offset, length);
	}

	@Override
	public int delete(List<RoleSysReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(RoleSysReq roleSysReq) {
		RoleSys roleSys=new RoleSys();
		SpringBeanUtils.copyProperties(roleSysReq, roleSys);
		/**新增业务逻辑**/
		roleSys.setAppendBy(1L);
		roleSys.setAppendTime(new Date());
		
		/**新增业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		
		return roleSysService.insert(roleSys);
	}

	@Override
	public int update(RoleSysReq roleSysReq) {
		RoleSys roleSys=new RoleSys();
		SpringBeanUtils.copyProperties(roleSysReq, roleSys);
		RoleSysExample e = new RoleSysExample();
		/**更新业务逻辑**/

		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		return roleSysService.updateByExampleSelective(roleSys, e);
	}

	@Override
	public RoleSysRes selectBy(RoleSysReq roleSys) {
		RoleSysExample e = new RoleSysExample();
		//RoleSysExample.Criteria c=e.createCriteria();
		/**更新业务逻辑**/
		
		/**更新业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		List<RoleSys> list = roleSysService.selectByExample(e);
		RoleSysRes res=new RoleSysRes();
		if (list.size() != 1) {
			SpringBeanUtils.copyProperties(roleSys, res);
		}
		return res;
		
	}
	
}


