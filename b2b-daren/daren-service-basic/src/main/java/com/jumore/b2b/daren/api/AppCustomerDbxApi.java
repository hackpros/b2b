/**
 * 
 * AppCustomerDbxApi.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-11-30 Created
 */
package com.jumore.b2b.daren.api;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.comm.SoaResult;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.service.business.io.request.AppCustomerReq;
import com.jumore.b2b.activity.service.business.io.response.AppCustomerRes;
import com.jumore.b2b.daren.model.AppCustomer;
import com.jumore.b2b.daren.model.AppCustomerQueryHelper;
import com.jumore.b2b.daren.service.IAppCustomerService;
import java.util.List;
import javax.annotation.Resource;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@com.alibaba.dubbo.config.annotation.Service
public class AppCustomerDbxApi implements IAppCustomerApi {
    static final Logger log = LogManager.getLogger(AppCustomerDbxApi.class);;

    @Resource
    IAppCustomerService appCustomerService;

    /**
     *添加
     */
    public SoaResult<AppCustomerRes> dbxAppend(AppCustomerReq AppCustomerReq) {
        SoaResult<AppCustomerRes> res=new SoaResult<AppCustomerRes>();
        try {
            AppCustomer t = new AppCustomer();
            //################### check param 
            
            appCustomerService.insert(t);
            res.setCode(0);
            AppCustomerRes appCustomerRes = new AppCustomerRes();
            SpringBeanUtils.copyProperties(t, appCustomerRes);
            res.setData(appCustomerRes);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<Integer> dbxCountByExample(AppCustomerReq appCustomerReq) {
        SoaResult<Integer> res=new SoaResult<Integer>();
        try {
            AppCustomerQueryHelper e = new AppCustomerQueryHelper();
            //################### add your query business
            
            
            //################### end
            int rows=appCustomerService.countByExample(e);
            res.setCode(0);
            res.setData(rows);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<Integer> dbxDeleteByExample(AppCustomerReq appCustomerReq) {
        SoaResult<Integer> res=new SoaResult<Integer>();
        try {
            AppCustomerQueryHelper e = new AppCustomerQueryHelper();
            //################### add your delete business
            
            
            //################### end
            int rows=appCustomerService.deleteByExample(e);
            res.setCode(0);
            //################### return delete rows 
            res.setData(rows);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<Integer> dbxDeleteByPrimaryKey(AppCustomerReq appCustomerReq) {
        SoaResult<Integer> res=new SoaResult<Integer>();
        try {
            AppCustomer t = new AppCustomer();
            //################### check param 
            
             int rows= appCustomerService.deleteByPrimaryKey(t);
            res.setCode(0);
            res.setData(rows);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<AppCustomerRes> dbxModify(AppCustomerReq appCustomerReq) {
        SoaResult<AppCustomerRes> res=new SoaResult<AppCustomerRes>();
        try {
            AppCustomer t = new AppCustomer();
            //################### check param & modify business
            
            //################### end  
            appCustomerService.updateByPrimaryKeySelective(t);
            res.setCode(0);
            //res.setData(rows);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<Pages<AppCustomerRes>> dbxSelectByExample(AppCustomerReq appCustomerReq, Pages<AppCustomerRes> page) {
        SoaResult<Pages<AppCustomerRes>> res=new SoaResult<Pages<AppCustomerRes>>();
        try {
            AppCustomerQueryHelper e = new AppCustomerQueryHelper();
            List<AppCustomer> list=appCustomerService.selectByExample(e);
            res.setCode(0);
            //res.setData(list);
            res.setData(page);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<AppCustomerRes> dbxSelectByPrimaryKey(AppCustomerReq appCustomerReq) {
        SoaResult<com.jumore.b2b.activity.service.business.io.response.AppCustomerRes> res=new SoaResult<com.jumore.b2b.activity.service.business.io.response.AppCustomerRes>();
        try {
        	
        	int a=appCustomerService.test();
        	
            AppCustomer t = new AppCustomer();
            t.setId(appCustomerReq.getId());
            t=appCustomerService.selectByPrimaryKey(t);
            AppCustomerRes target=new AppCustomerRes();
            SpringBeanUtils.copyProperties(t, target);
            res.setCode(0);
            res.setData(target);
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }

    /**
     *添加
     */
    public SoaResult<AppCustomerRes> dbxSelectByExample(AppCustomerReq appCustomerReq) {
        SoaResult<AppCustomerRes> res=new SoaResult<AppCustomerRes>();
        try {
            AppCustomerQueryHelper e = new AppCustomerQueryHelper();
            List<AppCustomer> list=appCustomerService.selectByExample(e);
            if (list.size() == 1){
                res.setCode(0);
                AppCustomerRes appCustomerRes=new AppCustomerRes();
                SpringBeanUtils.copyProperties(list.get(0), appCustomerRes);
            }else{
                res.setCode(-2);
                res.setMsg("not found or target exies mutl");
            }
        } catch (Exception e) {
            String bizCode=RandomStringUtils.randomNumeric(16);
            log.error(e.getMessage()+"code:",bizCode);
            res.setCode(-1);
            res.setMsg("业务异常,code={"+bizCode+"}");
        }
        return res;
    }
}