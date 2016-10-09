package com.jumore.b2b.daren.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AppraiseDetailReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseDetailRes;
import com.jumore.b2b.daren.business.IAppraiseDetailBiz;

/**
 * demo
 * 
 * @author fanwg by 2016-09-05　12:50:54
 *
 */
@Controller
@RequestMapping(value = "/appraiseDetail")
public class AppraiseDetailCtl {

	@Resource
	IAppraiseDetailBiz appraiseDetailBiz;

	@RequestMapping(value = "/browser")
	public String browser(HttpServletRequest request, Model model, AppraiseDetailReq req) {
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		Pages<AppraiseDetailRes> pages = appraiseDetailBiz.browser(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraiseDetail/browser";
	};

}