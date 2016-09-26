package com.rabbit.basic.control.comm;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cnnct.rabbit.framework.BaseController;
import com.cnnct.rabbit.framework.comm.ICache;
import com.rabbit.basic.biz.ISysAdminFront;
import com.rabbit.fanbase.io.requset.SysAdminReq;
import com.rabbit.fanbase.io.response.SysAdminRes;

/**
 * 接口用户登录入口
 * 
 * @author fanwg
 * @date 2013-7-30 下午03:12:59
 * @email renntrabbit@foxmail.com
 */
@Controller
//@RequestMapping(value = "/admin")
public class LoginContorller extends BaseController {
	private final Logger log = Logger.getLogger(LoginContorller.class);

	@Autowired
	ISysAdminFront sysAdminFront;
	@Resource
	ICache<?> menuCacheManager;

	// 系统缓存
	// private MemCachedUitl mcc = MemCachedUitl.getInstance();;

	@RequestMapping(value = "/login")
	public String login(Model model, String message, HttpServletRequest request) {
		return "login";
	}

	@RequestMapping(value = "/doLogin")
	public String dologin(Model model, SysAdminReq admin,
			HttpServletRequest request) {
		// 会话已存在,就不用登录了
		if (request.getSession().getAttribute("userSession") != null) {
			SysAdminRes sysAdmin = (SysAdminRes) request.getSession()
					.getAttribute("userSession");
			model.addAttribute("sysMenus", sysAdmin.getUserMenus());
			return "index";
		}
		admin.setName("admin");
		admin.setPwd("12345");
		admin.setId(0L);
		SysAdminRes sysAdmin = sysAdminFront.login(admin);
		if (sysAdmin == null) {
			model.addAttribute("message", "用户名或密码错误");
			return "login";
		}
		// 加载用户关系
		sysAdminFront.loadUserRelease(sysAdmin);
		request.getSession().setAttribute("userSession", sysAdmin);
		
		// 存入缓存
		menuCacheManager.load();
		
		return "index";
	}

	@RequestMapping("/logout")
	public String logout(Model model, SysAdminReq auther,
			HttpServletRequest request) {
		Object  object = request.getSession().getAttribute(
				"userSession");
		// 清空红缓存
		if (object != null) {
			request.getSession().removeAttribute("userSession");
		}
		return "login";
	}

	@RequestMapping("/tools")
	public String tools(Model model, SysAdminReq auther) {
		// sysMenuSeriveImp.delete(null);
		log.info(auther);
		return "toolbox";

	}

	@RequestMapping("/test")
	public String testPassWd(Model model, SysAdminReq auther, String passwd,
			String cardNo) {
		model.addAttribute("jftResponse", cardNo);
		return "info";

	}
}
