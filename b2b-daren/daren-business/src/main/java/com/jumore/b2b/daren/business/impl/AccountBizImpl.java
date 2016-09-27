package com.jumore.b2b.daren.business.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.service.business.io.request.AccountReq;
import com.jumore.b2b.activity.service.business.io.response.AccountRes;
import com.jumore.b2b.daren.business.IAccountBiz;
import com.jumore.b2b.daren.exception.BusinessException;
import com.jumore.b2b.daren.model.Account;
import com.jumore.b2b.daren.model.AccountQueryHelper;
import com.jumore.b2b.daren.service.IAccountService;

@Component
public class AccountBizImpl implements IAccountBiz {

	static final Logger log = LogManager.getLogger(AccountBizImpl.class);;
	@Resource
	IAccountService accountService;

	@Override
	public int countByExample(AccountReq t) {

		AccountQueryHelper e = new AccountQueryHelper();
		e.createCriteria().andAccountEqualTo("test");
		return accountService.countByExample(e);
	}

	@Override
	public int deleteByExample(AccountReq t) {

		AccountQueryHelper e = new AccountQueryHelper();
		e.createCriteria().andAccountEqualTo("test");
		return accountService.deleteByExample(e);
	}

	@Override
	public int deleteByPrimaryKey(AccountReq t) {
		Account e = new Account();
		e.setId(t.getId());
		return accountService.deleteByPrimaryKey(e);
	}

	@Override
	public long doAppend(AccountReq t) {
		Account e = new Account();
		// 转换规则。demo认为没有规则。直接转
		SpringBeanUtils.copyProperties(t, e);
		return accountService.insertSelective(e);
	}

	@Override
	public Pages<AccountRes> browser(AccountReq req, int page, int rows) {
		AccountQueryHelper e = new AccountQueryHelper();
		e.createCriteria().andAccountEqualTo("test");
		List<Account> Accounts = accountService.selectByExample(e);
		log.info(Accounts);
		// 此处李做分页查询。demo略
		return null;

	}

	@Override
	public AccountRes selectByPrimaryKey(AccountReq t) {
		Account e = new Account();
		e.setId(t.getId());
		e = accountService.selectByPrimaryKey(e);
		AccountRes res = new AccountRes();
		SpringBeanUtils.copyProperties(e, res);
		return res;
	}

	@Override
	public int updateByPrimaryKeySelective(AccountReq req) {
		Account t = new Account();
		SpringBeanUtils.copyProperties(req, t);
		return accountService.updateByPrimaryKey(t);
	}

	@Override
	public int updateByPrimaryKey(AccountReq req) {
		Account t = new Account();
		SpringBeanUtils.copyProperties(req, t);
		return accountService.updateByPrimaryKey(t);
	}

	@Override
	public AccountRes selectUnique(AccountReq t) {
		AccountQueryHelper e = new AccountQueryHelper();
		// 查询条件
		AccountQueryHelper.Criteria c = e.createCriteria();
		// 条件一
		if (t.getAccount() != null) {
			c.andAccountEqualTo(t.getAccount());
		}
		// 条件二
		// 条件三
		// 条件三N

		int rows = accountService.countByExample(e);
		if (rows != 1) {
			throw new BusinessException("数据存在多条");
		}

		List<Account> accounts = accountService.selectByExample(e);
		AccountRes res = new AccountRes();
		SpringBeanUtils.copyProperties(accounts.get(0), res);
		return res;
	}

}