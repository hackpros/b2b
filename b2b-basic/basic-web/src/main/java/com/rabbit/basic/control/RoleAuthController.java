package com.rabbit.basic.control;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.rabbit.basic.biz.IRoleAuthFront;
import com.rabbit.fanbase.io.requset.RoleAuthReq;

@Controller
@RequestMapping(value="/role/roleAuth")
public class RoleAuthController extends BaseController {

	@Autowired
	IRoleAuthFront roleAuthFront;

	@RequestMapping(value = "/browser")
		public String browser(Model model) {
		return "/role/roleauth/browser";
	};
		
	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, RoleAuthReq roleAuth, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = roleAuthFront.browser(roleAuth, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/role/roleauth/browser";
	};
	

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/role/roleauth/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, RoleAuthReq roleAuth) {
		long code= roleAuthFront.doAppend(roleAuth);
		//model.addAttribute("id", id);
		//long code = roleAuthServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, RoleAuthReq roleAuth) {

		model.addAttribute("roleAuth", roleAuthFront.selectBy(roleAuth));
		return "/role/roleauth/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, RoleAuthReq roleAuth) {
		roleAuthFront.update(roleAuth);
		return "/role/roleauth/browser";
	};

}

