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
import com.rabbit.basic.biz.IRoleSysFront;
import com.rabbit.fanbase.io.requset.RoleSysReq;

@Controller
@RequestMapping(value="/role/roleSys")
public class RoleSysController extends BaseController {

	@Autowired
	IRoleSysFront roleSysFront;

	@RequestMapping(value = "/browser")
		public String browser(Model model) {
		return "/role/rolesys/browser";
	};
		
	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, RoleSysReq roleSys, int page, int rows) throws JsonGenerationException, JsonMappingException, IOException {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = roleSysFront.browser(roleSys, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/role/rolesys/browser";
	};
	

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/role/rolesys/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, RoleSysReq roleSys) {
		long code= roleSysFront.doAppend(roleSys);
		//model.addAttribute("id", id);
		//long code = roleSysServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, RoleSysReq roleSys) {

		model.addAttribute("roleSys", roleSysFront.selectBy(roleSys));
		return "/role/rolesys/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, RoleSysReq roleSys) {
		roleSysFront.update(roleSys);
		return "/role/rolesys/browser";
	};

}

