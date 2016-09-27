package com.rabbit.basic.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.basic.business.Pages;
import org.fan.baseBusiness.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cnnct.rabbit.framework.BaseController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rabbit.basic.biz.ISysMenuFront;
import com.rabbit.fanbase.io.requset.SysMenuReq;


@Controller
@RequestMapping(value = "/system/sysMenu")
public class SysMenuController extends BaseController {

	@Autowired
	ISysMenuFront sysMenuFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model, SysMenuReq sysMenu, HttpServletRequest request)
			throws JsonGenerationException, JsonMappingException, IOException {
		List<?> list = sysMenuFront.getTreeByLadder(sysMenu.getLadder());
		//model.addAttribute("rows", Constant.objectMapper.writeValueAsString(list));
		return "/system/sysmenu/browser";

	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysMenuReq sysMenu, @RequestParam(value = "page", required = false) int page,
			int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysMenuFront.browser(sysMenu, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/system/sysmenu/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "system/sysmenu/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysMenuReq sysMenu) {
		long code = sysMenuFront.doAppend(sysMenu);
		// model.addAttribute("id", id);
		// long code = sysMenuFront.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "system/sysmenu/browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysMenuReq sysMenu) {

		model.addAttribute("sysMenu", sysMenuFront.selectBy(sysMenu));
		return "system/sysmenu/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysMenuReq sysMenu) {
		sysMenuFront.update(sysMenu);
		return "system/sysmenu/browser";
	};

	//List<UserModel>
    //ok   http://localhost:9080/springmvc-chapter6/jsonparam/list2?list=[{"username":"123"},{"username":"234"}]
    //@RequestMapping("/list2")  
    //public String list2(@RequestJsonParam(value = "list") List<UserModel> list) {

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Model model, @RequestBody List<SysMenuReq> sysMenus) {
		model.addAttribute("code", sysMenuFront.delete(sysMenus));
		return "system/sysmenu/browser";
	};
	
}
