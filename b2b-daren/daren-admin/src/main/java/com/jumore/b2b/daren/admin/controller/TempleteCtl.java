package com.jumore.b2b.daren.admin.controller;

import javax.annotation.Resource;

import org.fan.baseBusiness.util.CustomObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AppraiseReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;
import com.jumore.b2b.daren.business.IAppraiseBiz;

/**
 * demo
 * 
 * @author fanwg by 2016-09-05　12:50:54
 *
 */
@Controller
@RequestMapping(value = "/templete")
public class TempleteCtl {

	@Resource
	IAppraiseBiz appraiseBiz;

	@RequestMapping(value = "/index")
	public String index() {
		return "/templete/xxxindex";
	};

	@RequestMapping(value = "/xxxindex")
	public ModelAndView main() {
		return new ModelAndView();
	};

	@RequestMapping(value = "/doBrower")
	@ResponseBody
	public Pages<AppraiseRes> gridData(Model model, AppraiseReq req) throws JsonProcessingException {

		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0, 100);
		
		//model.addAttribute("recordsTotal", pages.getTotal());
		//model.addAttribute("draw", 1);
		//model.addAttribute("data", pages.getRows());
		pages.setDraw(1);
		CustomObjectMapper mapper = new CustomObjectMapper();
		
		
		//String json = mapper.writeValueAsString(pages);
		return pages;

	};

	@RequestMapping(value = "/xxxmodify")
	public ModelAndView modify(AppraiseReq req) {
		ModelAndView mav = new ModelAndView();
		AppraiseRes res = new AppraiseRes();
		res = appraiseBiz.selectUnique(req);
		mav.addObject("appraise", res);
		return mav;
	};

	@RequestMapping(value = "/doModify")
	@ResponseBody
	public String doModify(Model model, AppraiseReq req) {
		model.addAttribute("code", appraiseBiz.doApppraise(req));
		return "";
	};

	@RequestMapping(value = "/xxxappend")
	public ModelAndView append(AppraiseReq req) {
		ModelAndView mav = new ModelAndView();
		AppraiseRes res = new AppraiseRes();
		res = appraiseBiz.selectUnique(req);
		mav.addObject("appraise", res);
		return mav;
	};

	@RequestMapping(value = "/doAppend")
	@ResponseBody
	public void doAppend(Model model, AppraiseReq req) {
		model.addAttribute("code", appraiseBiz.doApppraise(req));
	};

}