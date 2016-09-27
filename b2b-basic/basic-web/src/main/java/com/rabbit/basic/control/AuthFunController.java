package com.rabbit.basic.control;

import java.io.IOException;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rabbit.basic.biz.IAuthFunFront;
import com.rabbit.basic.biz.ISysModelFront;
import com.rabbit.fanbase.io.requset.AuthFunReq;

@Controller
@RequestMapping(value = "/auther/authFun")
public class AuthFunController extends BaseController {

	@Autowired
	IAuthFunFront authFunServie;

	@Autowired
	ISysModelFront sysModelServie;

	@RequestMapping(value = "/browser")
	public String browser(Model model) throws JsonGenerationException, JsonMappingException, IOException {
		return "/auther/authfun/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, AuthFunReq authFun, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = authFunServie.browser(authFun, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/auther/authfun/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/auther/authfun/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, AuthFunReq authFun) {
		long code = authFunServie.doAppend(authFun);
		// model.addAttribute("id", id);
		// long code = authFunServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, AuthFunReq authFunReq) {

		model.addAttribute("authFun", authFunServie.selectBy(authFunReq));
		return "/auther/authfun/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, AuthFunReq authFun) {
		authFunServie.update(authFun);
		return "/auther/authfun/browser";
	};

}
