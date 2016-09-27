package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.SysSettingReq;
import com.rabbit.fanbase.io.response.SysSettingRes;

public interface ISysSettingFront {

	Pages<?> browser(SysSettingReq sysSetting, int currentPage,
			int pageSize);

	long doAppend(SysSettingReq sysSetting);

	int update(SysSettingReq sysSetting);

	int delete(List<SysSettingReq> list);

	SysSettingRes selectBy(SysSettingReq sysSetting);

}
