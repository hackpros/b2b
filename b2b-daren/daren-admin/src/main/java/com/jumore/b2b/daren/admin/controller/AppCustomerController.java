/**
 * 
 * AppCustomerController.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-22 Created
 */
package com.jumore.b2b.daren.admin.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cnnct.rabbit.framework.BaseController;
import com.jumore.b2b.activity.comm.SoaResult;
import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;
import com.jumore.b2b.daren.api.IAppCustomerApi;

@Controller
@RequestMapping(value="/appCustomer")
public class AppCustomerController extends BaseController {
    static final Logger log = LogManager.getLogger(AppCustomerController.class);;

    @Reference
    IAppCustomerApi appCustomerApi;

    
   /* GET： 请求指定的页面信息，并返回实体主体。
    HEAD： 只请求页面的首部。
    POST： 请求服务器接受所指定的文档作为对所标识的URI的新的从属实体。
    PUT： 从客户端向服务器传送的数据取代指定的文档的内容。
    DELETE： 请求服务器删除指定的页面。
    OPTIONS： 允许客户端查看服务器的性能。
    TRACE： 请求服务器在响应中的实体主体部分返回所得到的内容。
    PATCH： 实体中包含一个表，表中说明与该URI所表示的原内容的区别。
    MOVE： 请求服务器将指定的页面移至另一个网络地址。       // spring no supper
    COPY： 请求服务器将指定的页面拷贝至另一个网络地址。    // spring no supper
     */
    
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public SoaResult<AppCustomerRes> get(@PathVariable("id")long id) {
    	AppCustomerReq req =new AppCustomerReq();
    	req.setId(id);
    	return appCustomerApi.dbxSelectByPrimaryKey(req);
    }
    
    @RequestMapping(value="",method=RequestMethod.HEAD)
    public SoaResult<AppCustomerRes> head() {
    	SoaResult<AppCustomerRes> res=new SoaResult<AppCustomerRes>();
    	res.setCode(0);
    	return res;
    }
    
    @RequestMapping(value="",method=RequestMethod.POST)
    public SoaResult<AppCustomerRes> post(@Validated AppCustomerReq req) {
    	return appCustomerApi.dbxAppend(req);
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.PUT)
    public SoaResult<AppCustomerRes> put(@PathVariable("id")long id,@Validated AppCustomerReq req) {
    	req.setId(id);
    	return appCustomerApi.dbxModify(req);
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public SoaResult<Integer> delete(@PathVariable("id")long id) {
    	AppCustomerReq req =new AppCustomerReq();
    	req.setId(id);
    	return appCustomerApi.dbxDeleteByPrimaryKey(req);
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.OPTIONS)
    public SoaResult<Integer> options() {
    	SoaResult<Integer> res=new SoaResult<Integer>();
    	res.setCode(0);
    	return res;
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.TRACE)
    public SoaResult<AppCustomerRes> trace(@PathVariable("id")long id) {
    	AppCustomerReq req =new AppCustomerReq();
    	req.setId(id);
    	return appCustomerApi.dbxSelectByPrimaryKey(req);
    }
    
    @RequestMapping(value="/{id}",method=RequestMethod.PATCH)
    public SoaResult<AppCustomerRes> patch(@PathVariable("id")long id,@Validated AppCustomerReq req) {
    	req.setId(id);
    	return appCustomerApi.dbxModify(req);
    }
    
    
    
}