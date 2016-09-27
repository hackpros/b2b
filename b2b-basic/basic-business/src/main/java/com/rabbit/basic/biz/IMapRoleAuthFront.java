
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.MapRoleAuthReq;
import com.rabbit.fanbase.io.response.MapRoleAuthRes;

public interface IMapRoleAuthFront {

	Pages<?> browser(MapRoleAuthReq mapRoleAuth, int currentPage, int pageSize);
		
	long doAppend(MapRoleAuthReq mapRoleAuth);
	
	int update(MapRoleAuthReq mapRoleAuth);
	
	int delete(List<MapRoleAuthReq> list);

	MapRoleAuthRes selectBy(MapRoleAuthReq mapRoleAuth);
	
	}




