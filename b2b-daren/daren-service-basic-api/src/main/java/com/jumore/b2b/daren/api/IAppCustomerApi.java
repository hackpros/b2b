/**
 * 
 * IAppCustomerApi.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-30 Created
 */
package com.jumore.b2b.daren.api;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.comm.SoaResult;
import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;

public interface IAppCustomerApi {
    /**
     *添加对角
     */
    SoaResult<AppCustomerRes> dbxAppend(AppCustomerReq appCustomer);

    /**
     *删除
     */
    SoaResult<Integer> dbxCountByExample(AppCustomerReq appCustomer);

    /**
     *更新
     */
    SoaResult<Integer> dbxDeleteByExample(AppCustomerReq appCustomer);

    /**
     *更新
     */
    SoaResult<Integer> dbxDeleteByPrimaryKey(AppCustomerReq appCustomer);

    /**
     *更新
     */
    SoaResult<AppCustomerRes> dbxModify(AppCustomerReq appCustomer);

    /**
     *分页查询
     */
    SoaResult<Pages<AppCustomerRes>> dbxSelectByExample(AppCustomerReq appCustomer, Pages<AppCustomerRes> page);

    /**
     *添加
     */
    SoaResult<AppCustomerRes> dbxSelectByPrimaryKey(AppCustomerReq appCustomer);

    /**
     *查询唯一条记录
     */
    SoaResult<AppCustomerRes> dbxSelectByExample(AppCustomerReq appCustomer);
}