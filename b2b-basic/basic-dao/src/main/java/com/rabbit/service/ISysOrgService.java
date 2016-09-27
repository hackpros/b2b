package com.rabbit.service;

import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;
import com.rabbit.model.SysOrg;
import com.rabbit.model.SysOrgExample;

public interface ISysOrgService extends IBaseService<SysOrg, SysOrgExample> {

	List<?> getTreeByOrgCode(String orgCode);

	List<?> getTreeByLadder(short ladder, String orgId);
}
