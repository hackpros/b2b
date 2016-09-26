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
import com.rabbit.basic.biz.ISysAdminFront;
import com.rabbit.basic.biz.ISysOrgFront;
import com.rabbit.fanbase.io.requset.SysAdminReq;
import com.rabbit.fanbase.io.response.SysAdminRes;
import com.rabbit.fanbase.io.response.SysOrgRes;

@Controller
@RequestMapping(value = "/system/sysAdmin")
public class SysAdminController extends BaseController {

	@Autowired
	ISysAdminFront sysAdminFront;
	@Autowired
	ISysOrgFront sysOrgFront;

	@RequestMapping(value = "/browser")
	public String browser(Model model,HttpServletRequest request) throws JsonGenerationException, JsonMappingException, IOException {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") != null) {
			SysAdminRes sysAdmin = (SysAdminRes) request.getSession().getAttribute("userSession");
			// 获取用户所在的组织权限
			List<SysOrgRes> list = sysAdmin.getUserOrgs();
			// 获取组织数
			List<?> treeOrgs = sysOrgFront.getTreeByLadder(list);
			//model.addAttribute("rows", Constant.objectMapper.writeValueAsString(treeOrgs));
			return "/system/sysadmin/browser";
		} else {
			return "info";
		}

	};

	@RequestMapping(value = "/doBrowser")
	public String doBrowser(Model model, SysAdminReq sysAdmin, int page, int rows) {

		page = page <= 1 ? 0 : page - 1;
		rows = rows <= 0 ? 10 : rows;
		page *= rows;
		rows += page;
		Pages<?> pages = sysAdminFront.browser(sysAdmin, page, rows);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		model.addAttribute("orgId", sysAdmin.getOrgId());

		return "/system/sysadmin/browser";
	};

	@RequestMapping(value = "/append")
	public String append(Model model) {
		return "/system/sysadmin/append";
	};

	@RequestMapping(value = "/doAppend", method = RequestMethod.POST)
	public String doAppend(Model model, SysAdminReq sysAdmin) {
		long code = sysAdminFront.doAppend(sysAdmin);
		// model.addAttribute("id", id);
		// long code = sysAdminServie.doAppend(sysMenu);
		model.addAttribute("code", code);
		return "browser";
	};

	@RequestMapping(value = "/modify")
	public String modify(Model model, SysAdminReq sysAdmin) {

		model.addAttribute("sysAdmin", sysAdminFront.selectBy(sysAdmin));
		return "/system/sysadmin/modify";
	};

	@RequestMapping(value = "/doModify", method = RequestMethod.POST)
	public String doModify(Model model, SysAdminReq sysAdmin) {
		sysAdminFront.update(sysAdmin);
		return "/system/sysadmin/browser";
	};

}
