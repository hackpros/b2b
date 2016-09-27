
package com.rabbit.basic.biz.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.basic.business.Pages;
import org.basic.business.SpringBeanUtils;
import org.fan.baseBusiness.util.DBInfoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rabbit.basic.biz.IAuthFunFront;
import com.rabbit.fanbase.io.requset.AuthFunReq;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.AuthFunRes;
import com.rabbit.model.AuthFun;
import com.rabbit.model.AuthFunExample;
import com.rabbit.service.IAuthFunService;

@Service
public class AuthFunFrontImp  implements IAuthFunFront {

	private final Logger log = Logger.getLogger(this.getClass());

	@Resource
	IAuthFunService authFunService;


	@Override
	public Pages<?> browser(AuthFunReq authFunReq, @RequestParam("offset") int offset,
			@RequestParam("length") int length) {
		AuthFunExample example = new AuthFunExample();
		/** 查询业务逻辑 **/
		example.createCriteria().andModelCodeEqualTo(authFunReq.getModelCode());

		/**查询业务逻辑完**/
		/**_____________________我是分隔线________________________________**/
		
		PageHelper.startPage(offset, length);
		List<AuthFun> list = authFunService.selectByExample(example);
		PageInfo<AuthFun> pages = new PageInfo<AuthFun>(list);
		List<AuthFunRes> resultList = new ArrayList<AuthFunRes>();
		for (AuthFun bean : pages.getList()) {
			AuthFunRes res = new AuthFunRes();
			SpringBeanUtils.copyProperties(bean, res);
			resultList.add(res);
		}
		return new Pages<AuthFunRes>(resultList, pages.getTotal(), offset, length);
		//return new Pages<UsrRoleRes>(list, pages.getTotal(), offset, length);
	}

	@Override
	public int delete(List<AuthFunReq> list) {
		log.info("devlopping");
		return 0;
	}

	@Override
	public long doAppend(AuthFunReq authFunReq) {
		AuthFun authFun = new AuthFun();
		SpringBeanUtils.copyProperties(authFunReq, authFun);
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return authFunService.insert(authFun);
	}

	@Override
	public int update(AuthFunReq authFunReq) {
		AuthFun authFun = new AuthFun();
		SpringBeanUtils.copyProperties(authFunReq, authFun);
		AuthFunExample e = new AuthFunExample();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		return authFunService.updateByExampleSelective(authFun, e);
	}

	@Override
	public AuthFunRes selectBy(AuthFunReq authFun) {
		AuthFunExample e = new AuthFunExample();
		AuthFunExample.Criteria c=e.createCriteria();
		/** 更新业务逻辑 **/
		//TODO 单条记录的查询业务
		c.andIdEqualTo(authFun.getId());

		/** 更新业务逻辑完 **/
		/** _____________________我是分隔线________________________________ **/
		List<AuthFun> list = authFunService.selectByExample(e);
		AuthFunRes res=new AuthFunRes();
		if (list.size() >0) {
			SpringBeanUtils.copyProperties(list.get(0), res);
		}
		
		return res;

	}
	@Override
	public AuthFun initAuth(String targetName, SysModelReq sModle) {

		targetName = DBInfoUtil.dbName2JavaBeanName(new StringBuilder(targetName.toLowerCase()));
		
		AuthFunExample e = new AuthFunExample();
		e.createCriteria().andModelCodeEqualTo(sModle.getModelCode()).andSelfCodeEqualTo(targetName);
		e.setOrderByClause("sort_");
		List<AuthFun> authFuns = authFunService.selectByExample(e);

		AuthFun broswerAuthFun = null;
		if (authFuns.isEmpty()) {
			/*for (AuthFun templete : Constant.INIT_AUTHFUN_ARRAYS) {
				AuthFun authFun=new AuthFun();
				String url=templete.getRequestUrl();
				//System.out.println(url+"#################################");
				//"{'code':'doModify','name':'修改动作','requestUrl':'%s/%s/doModify','sort':'5','status':'0'}," +
				authFun.setCode(templete.getCode());
				authFun.setName(templete.getName());
				authFun.setSort(templete.getSort());
				authFun.setStatus(templete.getStatus());
				authFun.setAppendBy(Constant.SYSTEM_ADMINISTRATOR_PK);
				authFun.setAppendTime(new Date());
				authFun.setModifyBy(Constant.SYSTEM_ADMINISTRATOR_PK);
				authFun.setModifyTime(new Date());
				authFun.setModelCode(sModle.getModelCode());
				authFun.setSelfCode(targetName);
				authFun.setRequestUrl(String.format(url,sModle.getKeyword().toLowerCase(),targetName));
				authFunService.insert(authFun);
				if (authFun.getCode().equals("browser")) {
					broswerAuthFun = authFun;
				}

			}*/
		} else {
			broswerAuthFun = authFuns.get(0);
		}
		return broswerAuthFun;

	}

	@Override
	public Map<Long, AuthFunRes> selectCacheMap() {
		AuthFunExample e = new AuthFunExample();
		//e.createCriteria().andStatusEqualTo((short)GlobStatus.ENABLED.ordinal());
		List<AuthFun> authFuns = authFunService.selectByExample(e);
		Map<Long,AuthFunRes> authFunMap= new HashMap<Long, AuthFunRes>();
		for (AuthFun authFun : authFuns) {
			AuthFunRes res=new AuthFunRes();
			BeanUtils.copyProperties(authFun, res);
			authFunMap.put(authFun.getId(),res);
		}
		return authFunMap;
	}

}

