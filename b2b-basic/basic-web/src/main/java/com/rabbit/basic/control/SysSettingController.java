package com.rabbit.basic.control;

import java.util.List;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.rabbit.basic.biz.ISysSettingFront;
import com.rabbit.fanbase.io.requset.SysSettingReq;

@Controller
@RequestMapping(value="/system/sysSetting")
public class SysSettingController extends BaseController {

	@Autowired
	ISysSettingFront sysSettingFront;

	@RequestMapping(value = "/browser")
		public String browser(Model model) {
		return "/system/syssetting/browser";
	};
		
	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysSettingReq sysSetting, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysSettingFront.browser(sysSetting, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/system/syssetting/browser";
	};
	

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/system/syssetting/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysSettingReq sysSetting) {
		long code= sysSettingFront.doAppend(sysSetting);
		//model.addAttribute("id", id);
		//long code = sysSettingServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysSettingReq sysSetting) {

		model.addAttribute("sysSetting", sysSettingFront.selectBy(sysSetting));
		return "/system/syssetting/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysSettingReq sysSetting) {
		sysSettingFront.update(sysSetting);
		return "/system/syssetting/browser";
	};
	
	@RequestMapping(value = "/doDelete")
	public String doDelete(Model model, List<SysSettingReq> list) {
		sysSettingFront.delete(list);
		return "/system/syssetting/browser";
	};
	

}

