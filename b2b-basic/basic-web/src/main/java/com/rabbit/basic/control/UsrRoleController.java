package com.rabbit.basic.control;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.rabbit.basic.biz.IUsrRoleFront;
import com.rabbit.fanbase.io.requset.UsrRoleReq;

@Controller
@RequestMapping(value = "/user/usrRole")
public class UsrRoleController extends BaseController {

	@Autowired
	IUsrRoleFront usrRoleFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model) {
		return "/user/usrrole/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, UsrRoleReq usrRole, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = usrRoleFront.browser(usrRole, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/user/usrrole/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/user/usrrole/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, UsrRoleReq usrRole) {
		long code = usrRoleFront.doAppend(usrRole);
		// model.addAttribute("id", id);
		// long code = usrRoleServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, UsrRoleReq usrRole) {

		model.addAttribute("usrRole", usrRoleFront.selectBy(usrRole));
		return "/user/usrrole/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, UsrRoleReq usrRole) {
		usrRoleFront.update(usrRole);
		return "/user/usrrole/browser";
	};

}
