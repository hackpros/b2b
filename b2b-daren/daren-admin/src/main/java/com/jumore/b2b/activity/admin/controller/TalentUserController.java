package com.jumore.b2b.activity.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cnnct.rabbit.framework.BaseController;
import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;
import com.jumore.b2b.daren.api.ITalentUserApi;

/**
 * 用户详情
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/user")
public class TalentUserController  extends BaseController{
	//private static final Logger log = LogManager.getLogger(StaticController.class);

	
	@Reference
	ITalentUserApi talentUserApi;
	/**
	 * 达人主而
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/browser.do")
	public String about(Model model) {
		return "/static/about";
	};

	/**
	 * test
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/doBrowser.do")
	@ResponseBody
	public Object activityRule(Model model,AppCustomerReq req) {
		AppCustomerRes res= talentUserApi.selectUnique(req);
		return res;
		//return talentUserBiz.selectPage(user,page,rows);
	};

}
