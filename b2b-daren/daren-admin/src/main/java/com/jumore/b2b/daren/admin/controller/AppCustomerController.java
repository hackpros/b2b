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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cnnct.rabbit.framework.BaseController;
import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;

@Controller
@RequestMapping(value="/appCustomer")
public class AppCustomerController extends BaseController {
    static final Logger log = LogManager.getLogger(AppCustomerController.class);;

    
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
    public Object get(@PathVariable("id")long id) {
    	AppCustomerReq req =new AppCustomerReq();
    	req.setId(id);
    	return null;//appCustomerApi.selectUnique(req);
    	
    	
    }
    
  
    
    
    
}