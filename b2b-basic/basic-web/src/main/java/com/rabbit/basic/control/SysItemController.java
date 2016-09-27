package com.rabbit.basic.control;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.basic.business.Pages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rabbit.basic.biz.ISysItemFront;
import com.rabbit.fanbase.io.requset.SysItemReq;

@Controller
@RequestMapping(value = "/system/sysItem")
public class SysItemController extends BaseController {

	@Resource
	ISysItemFront sysItemFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model) throws JsonGenerationException, JsonMappingException, IOException {
		List<?> list = sysItemFront.getTreeByLadder(SysItemReq.LADDER.MODEL_LEVEL);
		//model.addAttribute("rows", Constant.objectMapper.writeValueAsString(list));
		return "/system/sysitem/browser";
	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysItemReq sysItem, int page, int rows) {	

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysItemFront.browser(sysItem, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		
		return "/system/sysitem/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model, SysItemReq sysItem) {
		model.addAttribute("sysItem", sysItem);
		return "/system/sysitem/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysItemReq sysItem) {
		long code = sysItemFront.doAppend(sysItem);
		// model.addAttribute("id", id);
		// long code = sysItemServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysItemReq sysItem) {

		model.addAttribute("sysItem", sysItemFront.selectBy(sysItem));
		return "/system/sysitem/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysItemReq sysItem) {
		
		sysItemFront.update(sysItem);
		return "/system/sysitem/browser";
	};

}
