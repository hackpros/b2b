package com.jumore.b2b.daren.admin.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jumore.b2b.activity.service.business.io.request.UserReq;

/**
 * 用户详情
 * @author Administrator
 */
//@Controller
//@RequestMapping(value = "/admin")
public class LoginControl {
	
	static final Logger log = LogManager.getLogger(StaticController.class);

	/**
	 * 关于我请客
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String about(Model model) {
		return "/login";
	};

	/**
	 * 关于活动规则
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/doLogin")
	public String activityRule(Model model,String username,String password) {
		
		log.info("login in:{}:{}",username,password);
		return "/index";
	};
	
	
	@RequestMapping(value = "/logOut")
	public String inbox(Model model, UserReq req) {
		return "/user/login";
	}; 
}
