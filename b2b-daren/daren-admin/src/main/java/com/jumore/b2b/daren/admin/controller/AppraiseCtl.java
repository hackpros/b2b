package com.jumore.b2b.daren.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
import org.springframework.web.servlet.support.RequestDataValueProcessor;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AppraiseReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;
import com.jumore.b2b.daren.business.IAppraiseBiz;
/**
 * demo 
 * @author fanwg by 2016-09-05　12:50:54
 *
 */
@Controller
@RequestMapping(value = "/appraise")
public class AppraiseCtl {

	@Resource
	IAppraiseBiz  appraiseBiz;
	
	@RequestMapping(value = "/index")
	public String index() {
		return "/appraise/index";
	};

	@RequestMapping(value = "/browser")
	public String browser(Model model, AppraiseReq req) {
		//page = page <= 1 ? 0 : page - 1;
		//rows = rows <= 0 ? 10 : rows;
		//page *= rows;
		//rows += page;
		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0,100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraise/browser";
	};


	
	@RequestMapping(value = "/modify")
	public String modify(Model model,AppraiseReq req) {
		AppraiseRes res=new AppraiseRes();
		res = appraiseBiz.selectUnique(req);
		
		if (res == null){
			return "/appraise/index";
		}
		model.addAttribute("appraise",res );
		return "/appraise/modify";
	};
	
	@RequestMapping(value = "/doModify")
	public String doModify(Model model,AppraiseReq req) {
		model.addAttribute("count", appraiseBiz.doApppraise(req));
		return "redirect:/appraise/index";
	};

	
	@RequestMapping(value = "/shutdown",method=RequestMethod.POST)
	@ResponseBody
	public void shudwon(HttpServletRequest request ,HttpServletResponse response,AppraiseReq req,String shutdownKey) throws IOException {
		
		/*try{ 
			  Process proc=Runtime.getRuntime().exec("cmd /c Shutdown -s -t 60000"); 
			  response.getWriter().write("{code:0}");//返给ajax请求
		}catch(IOException e){
			 response.getWriter().write("{'code':0,'message':'"+e.getMessage()+"'}");//返给ajax请求
		} 
		*/
		
 
        PrintWriter out = response.getWriter();
 
        String result = null;
        try {
        	if (shutdownKey==null || !shutdownKey.equals("13503120521")){
           	 	result="{\"code\":\"-2\",\"message\":\"关机密码错误\"}";//返给ajax请求
        	}else{
        		Process proc=Runtime.getRuntime().exec("cmd /c Shutdown -s -t 60000"); 
           	 	result="{\"code\":\"0\"}";//返给ajax请求
        	}
        } catch (IOException ex) {
        	 result="{\"code\":\"-1\"}";//返给ajax请求
        } 
        out.print(result);
        out.close();
        out = null;
	
		
	}
	
	//###############################
    //	需要登录才可以访问的，管理员操作
	@RequestMapping(value = "/main")
	public String main(Model model,AppraiseReq req ,HttpServletRequest request) {
			// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0,100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraise/main";
	};

	@RequestMapping(value = "/append")
	public String append(Model model,AppraiseReq req,HttpServletRequest request) {
			// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		Pages<AppraiseRes> pages = appraiseBiz.browser(req, 0,100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraise/append";
	};
	@RequestMapping(value = "/doAppend")
	public String doAppend(HttpServletRequest request,Model model,AppraiseReq req,@RequestParam("file") CommonsMultipartFile file) throws IllegalStateException, IOException {
			// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
        
		appraiseBiz.doAppend(req,file);
		return "redirect:/appraise/main";
	};

	@RequestMapping(value = "/update")
	public String update(Model model,AppraiseReq req,HttpServletRequest request) {
			// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		AppraiseRes res=new AppraiseRes();
		res = appraiseBiz.selectUnique(req);
		if (res == null){
			return "/appraise/main";
		}
		model.addAttribute("appraise",res );
		return "/appraise/update";
		
		
	};
	
	@RequestMapping(value = "/doUpdate")
	public String doUpdate(HttpServletRequest request,Model model,AppraiseReq req,@RequestParam("file") CommonsMultipartFile file) throws IllegalStateException, IOException {
			// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		appraiseBiz.doUpdate(req,file);
		return "redirect:/appraise/main";
	};
	
	@RequestMapping(value = "/delete")
	public String delete(HttpServletRequest request,Model model,AppraiseReq req) {
			// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		appraiseBiz.deleteByPrimaryKey(req);
		return "redirect:/appraise/main";
	};
}