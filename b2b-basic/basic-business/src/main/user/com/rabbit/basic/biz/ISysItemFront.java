package com.rabbit.basic.biz;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.basic.business.Pages;
import org.fan.baseBusiness.util.DbCol;
import org.fan.baseBusiness.util.DbTab;
import org.fan.baseBusiness.util.GlobalEnum;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rabbit.fanbase.io.requset.SysItemReq;
import com.rabbit.fanbase.io.requset.SysModelReq;
import com.rabbit.fanbase.io.response.SysItemRes;

public interface ISysItemFront {

	Pages<?> browser(SysItemReq sysItem, int currentPage, int pageSize);

	long doAppend(SysItemReq sysItem);

	int update(SysItemReq sysItem);

	int delete(List<SysItemReq> list);

	SysItemRes selectBy(SysItemReq sysItem);

	int delete(SysItemReq sysItem);

	List<?> getTreeByLadder(short ladder);

	Map<String, Object> witteValueAsMap(SysItemReq s, GlobalEnum.ELadder ladder) throws JsonProcessingException;

	List<?> selectSimple(SysItemReq sysItem);

	List<HashMap<Object, Object>> selectByItemCode(String parm);

	void init(List<DbCol> cols, SysModelReq sysModel, DbTab dbTab);

}
