package com.rabbit.basic.control;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.rabbit.basic.biz.ISysRoleFront;
import com.rabbit.fanbase.io.requset.SysRoleReq;

@Controller
@RequestMapping(value = "/system/sysRole")
public class SysRoleController extends BaseController {

	@Autowired
	ISysRoleFront sysRoleFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model) {
		return "/system/sysrole/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysRoleReq sysRole, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysRoleFront.browser(sysRole, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/system/sysrole/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/system/sysrole/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysRoleReq sysRole) {
		long code = sysRoleFront.doAppend(sysRole);
		// model.addAttribute("createTime", createTime);
		// long code = sysRoleServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysRoleReq sysRole) {

		model.addAttribute("sysRole", sysRoleFront.selectBy(sysRole));
		return "/system/sysrole/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysRoleReq sysRole) {
		sysRoleFront.update(sysRole);
		return "/system/sysrole/browser";
	};

}
