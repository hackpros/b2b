package com.jumore.b2b.daren.api;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.dubbo.config.annotation.Service;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.UserReq;
import com.jumore.b2b.activity.service.business.io.response.UserRes;
import com.jumore.b2b.daren.business.IUserBiz;
import com.jumore.b2b.daren.exception.BusinessException;
import com.jumore.b2b.daren.result.Result;

@Service
public class UserApi implements IUserApi {

	static final Logger log = LogManager.getLogger(UserApi.class);

	@Resource
	IUserBiz userBiz;

	@Override
	public Result<UserRes> selectUniqueByKey(UserReq req) {

		Result<UserRes> result = new Result<UserRes>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			UserRes userRes = userBiz.selectByPrimaryKey(req);
			result.setCode(0);
			result.setData(userRes);
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
	public Result<UserRes> selectUnique(UserReq req) {
		Result<UserRes> result = new Result<UserRes>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			UserRes userRes = userBiz.selectUnique(req);
			result.setCode(0);
			result.setData(userRes);
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
	public Result<Integer> doModify(UserReq req) {
		Result<Integer> result = new Result<Integer>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			int rows = userBiz.updateByPrimaryKey(req);
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
	public Result<Long> doAppend(UserReq req) {
		Result<Long> result = new Result<Long>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			long rows = userBiz.doAppend(req);
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
	public Result<Pages<UserRes>> selectPage(UserReq req) {
		Result<Pages<UserRes>> result = new Result<Pages<UserRes>>();
		try {
			// 参数验证
			// BindingResult bindingResult=new BindingResult();
			// TODO 研究中
			// ##################
			int page = 0;
			int rows = 100;
			Pages<UserRes> pages = userBiz.browser(req, page, rows);
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