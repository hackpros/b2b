package com.jumore.b2b.daren.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.UserReq;
import com.jumore.b2b.activity.service.business.io.response.UserRes;
import com.jumore.b2b.daren.admin.comm.JsonResult;
import com.jumore.b2b.daren.business.IUserBiz;

@Controller
@RequestMapping(value = "/user")
public class UserCtl {

	@Resource
	IUserBiz userBiz;

	@RequestMapping(value = "/browser")
	public String browser() {
		return "/auther/authfun/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, UserReq req, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<UserRes> pages = userBiz.browser(req, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/auther/authfun/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/auther/authfun/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, UserReq req) {
		long code = userBiz.doAppend(req);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, UserReq req) {

		model.addAttribute("res", userBiz.selectByPrimaryKey(req));
		return "/auther/authfun/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, UserReq req) {
		userBiz.updateByPrimaryKeySelective(req);
		return "/auther/authfun/browser";
	};
	
	
	
	//###############################
	//以下以测试用户面面跳
	//###############################

		
	@RequestMapping(value = "/myProfile")
	public String myProfile(Model model, UserReq req) {
		return "/user/extra_profile";
	}; 

	
	@RequestMapping(value = "/myCalender")
	public String myCalender(Model model, UserReq req) {
		return "/user/page_calendar";
	}; 
	
	@RequestMapping(value = "/inbox")
	public String inbox(Model model, UserReq req) {
		return "/user/inbox";
	}; 
	
	@RequestMapping(value = "/lock")
	public String lock(Model model, UserReq req) {
		return "/user/extra_lock";
	}; 
	

	@RequestMapping(value = "/test")
	@ResponseBody
	public JsonResult<?> test(Model model, UserReq req) {
		JsonResult<?> res=new JsonResult<Object>();
		res.setCode(0);
		res.setMsg("ok");
		return res;
		
	}; 
	
}