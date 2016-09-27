package com.jumore.b2b.daren.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.generator.base.service.single.BaseServiceImp;
import org.springframework.stereotype.Service;

import com.jumore.b2b.daren.mapper.AccountMapper;
import com.jumore.b2b.daren.model.Account;
import com.jumore.b2b.daren.model.AccountQueryHelper;
import com.jumore.b2b.daren.service.IAccountService;
@Service
public class AccountServiceImpl extends BaseServiceImp<Account,AccountQueryHelper> implements IAccountService {

	static final Logger log = LogManager.getLogger(AccountServiceImpl.class);;

	AccountMapper accountMapper;


	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
		super.setBaseMapper(accountMapper);
	}

	

}