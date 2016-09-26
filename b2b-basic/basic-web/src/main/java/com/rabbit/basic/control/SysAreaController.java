package com.rabbit.basic.control;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.rabbit.basic.biz.ISysAreaFront;
import com.rabbit.fanbase.io.requset.SysAreaReq;

@Controller
@RequestMapping(value="/system/sysArea")
public class SysAreaController extends BaseController {

	@Autowired
	ISysAreaFront sysAreaFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model) {
		return "/system/sysarea/browser";
	};
		
	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysAreaReq sysArea, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysAreaFront.browser(sysArea, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/system/sysarea/browser";
	};
	

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/system/sysarea/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysAreaReq sysArea) {
		long code= sysAreaFront.doAppend(sysArea);
		//model.addAttribute("id", id);
		//long code = sysAreaServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysAreaReq sysArea) {

		model.addAttribute("sysArea", sysAreaFront.selectBy(sysArea));
		return "/system/sysarea/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysAreaReq sysArea) {
		sysAreaFront.update(sysArea);
		return "/system/sysarea/browser";
	};

}

