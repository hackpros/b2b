package com.jumore.b2b.daren.api;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;

@Service
public class TalentUserApi implements ITalentUserApi {

	static final Logger log = LogManager.getLogger(TalentUserApi.class);;


	public AppCustomerRes selectUnique(AppCustomerReq activity) {
		System.out.println("come hrer..");
		
		//TalentUserQueryHelper e = new TalentUserQueryHelper();
		AppCustomerRes t=new AppCustomerRes(); 
		t.setCorpCode("hello");
		return t;
		
		/** 　查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/*List<TalentUser> list = talentUserService.selectByExample(e);
		if (list.size() == 1) {
			return list.get(0);
		}
		return null;*/
	}
}