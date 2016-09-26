package com.jumore.b2b.daren.admin.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AccountReq;
import com.jumore.b2b.activity.service.business.io.response.AccountRes;
import com.jumore.b2b.daren.business.IAccountBiz;
/**
 * demo 
 * @author fanwg by 2016-09-05　12:50:54
 *
 */
@Controller
@RequestMapping(value = "/account")
public class AccountCtl {

	@Resource
	IAccountBiz  accountBiz;
	
	@RequestMapping(value = "/browser")
	public String browser() {
		return "/auther/authfun/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, AccountReq req, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<AccountRes> pages = accountBiz.browser(req, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/auther/authfun/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/auther/authfun/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, AccountReq req) {
		long code = accountBiz.doAppend(req);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, AccountReq req) {

		model.addAttribute("res", accountBiz.selectByPrimaryKey(req));
		return "/auther/authfun/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, AccountReq req) {
		accountBiz.updateByPrimaryKeySelective(req);
		return "/auther/authfun/browser";
	};

}