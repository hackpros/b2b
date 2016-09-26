package com.jumore.b2b.daren.api;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.AccountReq;
import com.jumore.b2b.activity.service.business.io.response.AccountRes;
import com.jumore.b2b.daren.business.IAccountBiz;
import com.jumore.b2b.daren.exception.BusinessException;
import com.jumore.b2b.daren.result.Result;

@Service
public class AccountApi implements IAccountApi {

	static final Logger log = LogManager.getLogger(AccountApi.class);

	@Resource
	IAccountBiz AccountBiz;

	@Override
	public Result<AccountRes> selectUniqueByKey(AccountReq req) {

		Result<AccountRes> result = new Result<AccountRes>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			AccountRes AccountRes = AccountBiz.selectByPrimaryKey(req);
			result.setCode(0);
			result.setData(AccountRes);
		} catch (Exception e) {
			log.error(e.getMessage());
			if (e instanceof BusinessException) {
				result.setMsg(e.getMessage());
			} else {
				result.setMsg("接口业务异常");
			}
		}
		return result;
	}

	@Override
	public Result<AccountRes> selectUnique(AccountReq req) {
		Result<AccountRes> result = new Result<AccountRes>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			AccountRes AccountRes = AccountBiz.selectUnique(req);
			result.setCode(0);
			result.setData(AccountRes);
		} catch (Exception e) {
			log.error("request param:" + req);
			log.error(e.getMessage());
			if (e instanceof BusinessException) {
				result.setMsg(e.getMessage());
			} else {
				result.setMsg("接口业务异常");
			}
		}
		return result;
	}

	@Override
	public Result<Integer> doModify(AccountReq req) {
		Result<Integer> result = new Result<Integer>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			int rows = AccountBiz.updateByPrimaryKey(req);
			result.setCode(0);
			result.setData(rows);
		} catch (Exception e) {
			log.error("request param:" + req);
			log.error(e.getMessage());
			if (e instanceof BusinessException) {
				result.setMsg(e.getMessage());
			} else {
				result.setMsg("接口业务异常");
			}
		}
		return result;
	}

	@Override
	public Result<Long> doAppend(AccountReq req) {
		Result<Long> result = new Result<Long>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			long rows = AccountBiz.doAppend(req);
			result.setCode(0);
			result.setData(rows);
		} catch (Exception e) {
			log.error("request param:" + req);
			log.error(e.getMessage());
			if (e instanceof BusinessException) {
				result.setMsg(e.getMessage());
			} else {
				result.setMsg("接口业务异常");
			}
		}
		return result;
	}

	@Override
	public Result<Pages<AccountRes>> selectPage(AccountReq req) {
		Result<Pages<AccountRes>> result = new Result<Pages<AccountRes>>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			int page = 0;
			int rows = 100;
			Pages<AccountRes> pages = AccountBiz.browser(req, page, rows);
			result.setCode(0);
			result.setData(pages);
		} catch (Exception e) {
			log.error("request param:" + req);
			log.error(e.getMessage());
			if (e instanceof BusinessException) {
				result.setMsg(e.getMessage());
			} else {
				result.setMsg("接口业务异常");
			}
		}
		return result;
	};

}