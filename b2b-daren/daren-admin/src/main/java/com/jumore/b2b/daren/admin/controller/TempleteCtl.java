package com.jumore.b2b.daren.admin.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	public Map<String, Object> gridData(Model model, AppraiseReq req,HttpServletResponse response) throws IOException {

		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0, 2);
		
		//model.addAttribute("recordsTotal", pages.getTotal());
		//model.addAttribute("draw", 1);
		//model.addAttribute("data", pages.getRows());
		pages.setDraw(1);
		
		
		
		Map<String, Object> result = new HashMap<String, Object>();  
		result.put("iTotalRecords", 2);  
		result.put("iTotalDisplayRecords", 2);  
		
		List<Object> aaData=new ArrayList<Object>();
		 
		for (AppraiseRes res : pages.getRows()) {
			Object[] data=new Object[6];
			data[0]=res.getCode();
			data[1]=res.getContant();
			data[2]=res.getHead();
			data[3]=res.getImg1();
			data[4]=res.getName();
			data[5]=res.getBest();
			aaData.add(data);
		}
		result.put("aaData", aaData);  
		result.put("aaData", pages.getRows());  
		return result;

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