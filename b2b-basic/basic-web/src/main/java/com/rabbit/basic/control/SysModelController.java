package com.rabbit.basic.control;

import java.io.IOException;
import java.util.List;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rabbit.basic.biz.ISysModelFront;
import com.rabbit.fanbase.io.requset.SysModelReq;

@Controller
@RequestMapping(value = "/system/sysModel")
public class SysModelController extends BaseController {

	@Autowired
	ISysModelFront sysModelFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model) throws JsonGenerationException, JsonMappingException, IOException {
		List<?> list = sysModelFront.getTreeByLadder((short) 0);
		//model.addAttribute("rows", Constant.objectMapper.writeValueAsString(list));
		return "/system/sysmodel/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysModelReq sysModel, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysModelFront.browser(sysModel, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/system/sysmodel/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/system/sysmodel/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysModelReq sysModel) {
		long code = sysModelFront.doAppend(sysModel);
		// model.addAttribute("modelCode", modelCode);
		// long code = sysModelServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysModelReq sysModel) {

		model.addAttribute("sysModel", sysModelFront.selectBy(sysModel));
		return "/system/sysmodel/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysModelReq sysModel) {
		sysModelFront.update(sysModel);
		return "/system/sysmodel/browser";
	};

}
