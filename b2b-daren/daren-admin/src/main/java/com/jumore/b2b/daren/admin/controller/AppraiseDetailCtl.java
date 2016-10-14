package com.jumore.b2b.daren.admin.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AppraiseDetailReq;
import com.jumore.b2b.activity.service.business.io.response.AppraiseDetailRes;
import com.jumore.b2b.activity.service.business.io.response.AppraiseRes;
import com.jumore.b2b.daren.admin.comm.ExcelUtil;
import com.jumore.b2b.daren.business.IAppraiseDetailBiz;

/**
 * demo
 * 
 * @author fanwg by 2016-09-05　12:50:54
 *
 */
@Controller
@RequestMapping(value = "/appraiseDetail")
public class AppraiseDetailCtl extends BaseController{

	@Resource
	IAppraiseDetailBiz appraiseDetailBiz;

	@RequestMapping(value = "/browser")
	public String browser(HttpServletRequest request, Model model, AppraiseDetailReq req) {
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		//AppraiseDetailReq req=new AppraiseDetailReq();
		Pages<AppraiseDetailRes> pages = appraiseDetailBiz.browser(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		model.addAttribute("req", req);
		return "/appraisedetail/browser";
	};

	
	@RequestMapping(value = "/doBrowser",method=RequestMethod.POST)
	public String doBrowser(HttpServletRequest request, Model model, AppraiseDetailReq req) {
	   if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		Pages<AppraiseDetailRes> pages = appraiseDetailBiz.browser(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		return "/appraisedetail/browser";
	};
	
	@RequestMapping(value = "/doStat")
	public String doStat(HttpServletRequest request, Model model,String name,Date startTime ,Date endTime) {
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		AppraiseDetailReq req=new AppraiseDetailReq();
		req.setStartTime(startTime);
		req.setEndTime(endTime);
		req.setName(name);
		
		
		//Pages<AppraiseDetailRes> pages =appraiseDetailBiz.doStat(req, 0, 100);
		Pages<AppraiseRes> pages = appraiseDetailBiz.doStatExcel(req, 0, 100);
		model.addAttribute("total", pages.getTotal());
		model.addAttribute("rows", pages.getRows());
		model.addAttribute("req", req);
		return "/appraisedetail/browserstat";
	};
	
	@RequestMapping(value = "/export")
	public String export(HttpServletRequest request, HttpServletResponse response ,String name,Date startTime ,Date endTime) throws IOException {
		if (request.getSession().getAttribute("userSession") == null) {
			return "redirect:/login";
		}
		AppraiseDetailReq req=new AppraiseDetailReq();
		req.setStartTime(startTime);
		req.setEndTime(endTime);
		req.setName(name);
		Pages<AppraiseRes> pages = appraiseDetailBiz.doStatExcel(req, 0, 100);
		
		
		 	String fileName="员工满意度统计表";
	        //填充projects数据
	        List<AppraiseRes> projects=pages.getRows();
	        List<Map<String,Object>> list=createExcelRecord(projects);
	        String columnNames[]={"姓名","非常满意","满意","不满意"};//列名
	        String keys[]    =     {"name","best","better","good"};//map中的key
	        ByteArrayOutputStream os = new ByteArrayOutputStream();
	       try {
	            ExcelUtil.createWorkBook(list,keys,columnNames).write(os);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        byte[] content = os.toByteArray();
	        InputStream is = new ByteArrayInputStream(content);
	        // 设置response参数，可以打开下载页面
	        response.reset();
	        response.setContentType("application/vnd.ms-excel;charset=utf-8");
	        response.setHeader("Content-Disposition", "attachment;filename="+ new String((fileName + ".xls").getBytes(), "iso-8859-1"));
	        ServletOutputStream out = response.getOutputStream();
	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        try {
	            bis = new BufferedInputStream(is);
	            bos = new BufferedOutputStream(out);
	            byte[] buff = new byte[2048];
	            int bytesRead;
	            // Simple read/write loop.
	            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
	                bos.write(buff, 0, bytesRead);
	            }
	        } catch (final IOException e) {
	            throw e;
	        } finally {
	            if (bis != null)
	                bis.close();
	            if (bos != null)
	                bos.close();
	        }
	        return null;
		
	};
	
	 private List<Map<String, Object>> createExcelRecord(List<AppraiseRes> projects) {
	        List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
	        Map<String, Object> map = new HashMap<String, Object>();
	        map.put("sheetName", "sheet1");
	        listmap.add(map);
	        AppraiseRes res=null;
	        for (int j = 0; j < projects.size(); j++) {
	        	res=projects.get(j);
	            Map<String, Object> mapValue = new HashMap<String, Object>();
	            mapValue.put("name", res.getName());
	            mapValue.put("best", res.getBest());
	            mapValue.put("better",res.getBetter());
	            mapValue.put("good", res.getGood());
	            listmap.add(mapValue);
	        }
	        return listmap;
	    }
}
