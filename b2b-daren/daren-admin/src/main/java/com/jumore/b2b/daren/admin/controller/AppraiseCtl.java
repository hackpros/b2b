package com.jumore.b2b.daren.admin.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.core.up.GlobalPropertiesUtil;
import com.jumore.b2b.activity.core.util.SerializationOptimizerImpl;
import com.jumore.b2b.activity.service.business.io.request.AppraiseReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;
import com.jumore.b2b.daren.admin.comm.JsonResult;
import com.jumore.b2b.daren.api.IAppCustomerApi;
import com.jumore.b2b.daren.business.IAppraiseBiz;

/**
 * demo
 * 
 * @author fanwg by 2016-09-05　12:50:54
 *
 */
@Controller
@RequestMapping(value = "/appraise")
public class AppraiseCtl {

	@Resource
	IAppraiseBiz appraiseBiz;
	

	@RequestMapping(value = "/index")
	public String index() {
		return "/appraise/index";
	};

	@RequestMapping(value = "/browser")
	public String browser(Model model, AppraiseReq req) {
		// page = page <= 1 ? 0 : page - 1;
		// rows = rows <= 0 ? 10 : rows;
		// page *= rows;
		// rows += page;
		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		
		return "/appraise/browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, AppraiseReq req) {
		req.setCode(null);
		AppraiseRes res = new AppraiseRes();
		res = appraiseBiz.selectUnique(req);

		if (res == null) {
			return "/appraise/index";
		}
		model.addAttribute("appraise", res);
		return "/appraise/modify";
	};

	@RequestMapping(value = "/doModify")
	public String doModify(Model model, AppraiseReq req) {
		model.addAttribute("count", appraiseBiz.doApppraise(req));
		return "redirect:/appraise/index";
	};

	@RequestMapping(value = "/shutdown", method = RequestMethod.POST)
	@ResponseBody
	public JsonResult<?> shudwon(HttpServletRequest request, HttpServletResponse response, AppraiseReq req, String shutdownKey) throws IOException {
		
		JsonResult<Object> res=new JsonResult<Object>();
		
		String key = GlobalPropertiesUtil.get("shutdown.key");
		String second = GlobalPropertiesUtil.get("shutdown.second");
		if (key==null){
			key="13309182673";
		}
		if (second=="null"){
			second="60";
		}
		//second="60000000";
		try {
			if (shutdownKey == null || !shutdownKey.equals(key)) {
				res.setCode(1);
				res.setMsg("密码错误");
			} else {
				Process proc = Runtime.getRuntime().exec("cmd /c Shutdown -s -t " + second);
				res.setCode(0);
				res.setData(proc.toString());
			}
		} catch (IOException ex) {
			res.setCode(-1);
			res.setMsg(ex.getMessage());
		}
		return res;

	}

	// ###############################
	// 需要登录才可以访问的，管理员操作
	@RequestMapping(value = "/main")
	public String main(Model model, AppraiseReq req, HttpServletRequest request) {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraise/main";
	};

	@RequestMapping(value = "/append")
	public String append(Model model, AppraiseReq req, HttpServletRequest request) {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraise/append";
	};

	@RequestMapping(value = "/doAppend")
	public String doAppend(HttpServletRequest request, Model model, AppraiseReq req, @RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}

		appraiseBiz.doAppend(req, file);
		return "redirect:/appraise/main";
	};

	@RequestMapping(value = "/update")
	public String update(Model model, AppraiseReq req, HttpServletRequest request) {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		AppraiseRes res = new AppraiseRes();
		res = appraiseBiz.selectUnique(req);
		if (res == null) {
			return "/appraise/main";
		}
		model.addAttribute("appraise", res);
		return "/appraise/update";

	};

	@RequestMapping(value = "/doUpdate")
	public String doUpdate(HttpServletRequest request, Model model, AppraiseReq req, @RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		appraiseBiz.doUpdate(req, file);
		return "redirect:/appraise/main";
	};

	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request, Model model, AppraiseReq req) {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		appraiseBiz.deleteByPrimaryKey(req);
		return "redirect:/appraise/main";
	};
}