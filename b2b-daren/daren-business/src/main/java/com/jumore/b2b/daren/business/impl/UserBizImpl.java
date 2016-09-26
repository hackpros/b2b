package com.jumore.b2b.daren.business.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.service.business.io.request.UserReq;
import com.jumore.b2b.activity.service.business.io.response.UserRes;
import com.jumore.b2b.daren.business.IUserBiz;
import com.jumore.b2b.daren.exception.BusinessException;
import com.jumore.b2b.daren.model.User;
import com.jumore.b2b.daren.model.UserQueryHelper;
import com.jumore.b2b.daren.service.IUserService;

@Component
public class UserBizImpl implements IUserBiz {
	static final Logger log = LogManager.getLogger(UserBizImpl.class);;

	@Resource
	IUserService userService;

	@Override
	public int countByExample(UserReq t) {

		UserQueryHelper e = new UserQueryHelper();
		e.createCriteria().andUserIdEqualTo(10L);
		return userService.countByExample(e);
	}

	@Override
	public int deleteByExample(UserReq t) {

		UserQueryHelper e = new UserQueryHelper();
		e.createCriteria().andUserIdEqualTo(10L);
		return userService.deleteByExample(e);
	}

	@Override
	public int deleteByPrimaryKey(UserReq t) {
		User e = new User();
		e.setId(t.getId());
		return userService.deleteByPrimaryKey(e);
	}

	@Override
	public long doAppend(UserReq t) {
		User e = new User();
		// 转换规则。demo认为没有规则。直接转
		SpringBeanUtils.copyProperties(t, e);
		return userService.insertSelective(e);
	}

	@Override
	public Pages<UserRes> browser(UserReq req, int page, int rows) {
		UserQueryHelper e = new UserQueryHelper();
		e.createCriteria().andUserIdEqualTo(10L);
		List<User> users = userService.selectByExample(e);
		log.info(users);
		// 此处李做分页查询。demo略
		return null;

	}

	@Override
	public UserRes selectByPrimaryKey(UserReq t) {
		User e = new User();
		e.setId(t.getId());
		e = userService.selectByPrimaryKey(e);
		UserRes res = new UserRes();
		SpringBeanUtils.copyProperties(e, res);
		return res;
	}

	@Override
	public int updateByPrimaryKeySelective(UserReq req) {
		User t = new User();
		SpringBeanUtils.copyProperties(req, t);
		return userService.updateByPrimaryKey(t);
	}

	@Override
	public int updateByPrimaryKey(UserReq req) {
		User t = new User();
		SpringBeanUtils.copyProperties(req, t);
		return userService.updateByPrimaryKey(t);
	}

	@Override
	public UserRes selectUnique(UserReq t) throws BusinessException {

		UserQueryHelper e = new UserQueryHelper();
		// 查询条件
		UserQueryHelper.Criteria c = e.createCriteria();
		// 条件一
		if (t.getBizCode() != null) {
			c.andBizCodeEqualTo(t.getBizCode());
		}
		// 条件二
		if (t.getId() != null) {
			c.andIdEqualTo(t.getId());
		}
		// 条件三
		if (t.getBizCode() != null) {
			c.andBizCodeEqualTo(t.getBizCode());
		}

		int rows = userService.countByExample(e);
		if (rows != 1) {
			throw new BusinessException("数据存在多条");
		}

		List<User> users = userService.selectByExample(e);
		UserRes res = new UserRes();
		SpringBeanUtils.copyProperties(users.get(0), res);
		return res;
	}

}