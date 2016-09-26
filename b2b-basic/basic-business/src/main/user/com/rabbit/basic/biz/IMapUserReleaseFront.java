
package com.rabbit.basic.biz;

import java.util.List;

import org.basic.business.Pages;

import com.rabbit.fanbase.io.requset.MapUserReleaseReq;
import com.rabbit.fanbase.io.response.MapUserReleaseRes;

public interface IMapUserReleaseFront  {

	Pages<?> browser(MapUserReleaseReq mapUserRelease, int currentPage, int pageSize);

	long doAppend(MapUserReleaseReq mapUserRelease);

	int update(MapUserReleaseReq mapUserRelease);

	int delete(List<MapUserReleaseReq> list);

	MapUserReleaseRes selectBy(MapUserReleaseReq mapUserRelease);

	List<Integer> selectOrgIdsByOrgCode(String nameEn);

}

