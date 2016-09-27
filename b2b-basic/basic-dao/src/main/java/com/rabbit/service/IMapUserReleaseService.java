
package com.rabbit.service;

import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;
import com.rabbit.model.MapUserRelease;
import com.rabbit.model.MapUserReleaseExample;

public interface IMapUserReleaseService extends IBaseService<MapUserRelease, MapUserReleaseExample> {

	List<Integer> selectOrgIdsByOrgCode(String nameEn);

		

}

