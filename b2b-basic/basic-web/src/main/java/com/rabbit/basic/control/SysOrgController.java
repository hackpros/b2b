package com.rabbit.basic.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.basic.business.Pages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.rabbit.basic.biz.ISysOrgFront;
import com.rabbit.fanbase.io.requset.SysOrgReq;
import com.rabbit.fanbase.io.response.SysAdminRes;
import com.rabbit.fanbase.io.response.SysOrgRes;

@Controller
@RequestMapping(value = "/system/sysOrg")
public class SysOrgController extends BaseController {

	@Autowired
	ISysOrgFront sysOrgFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model, HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException {
		// 会话已存在,就不用登录了
		SysAdminRes sysAdmin = (SysAdminRes) request.getSession().getAttribute("userSession");
		// 获取用户所在的组织权限
		List<SysOrgRes> list = sysAdmin.getUserOrgs();
		// 获取组织数
		List<?> treeOrgs = sysOrgFront.getTreeByLadder(list);
		//model.addAttribute("rows", Constant.objectMapper.writeValueAsString(treeOrgs));
		return "/system/sysorg/browser";

	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysOrgReq sysOrg, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysOrgFront.browser(sysOrg, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/system/sysorg/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/system/sysorg/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysOrgReq sysOrg) {
		long code = sysOrgFront.doAppend(sysOrg);
		// model.addAttribute("id", id);
		// long code = sysOrgServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysOrgReq sysOrg) {

		model.addAttribute("sysOrg", sysOrgFront.selectBy(sysOrg));
		return "/system/sysorg/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysOrgReq sysOrg) {
		sysOrgFront.update(sysOrg);
		return "/system/sysorg/browser";
	};

}
