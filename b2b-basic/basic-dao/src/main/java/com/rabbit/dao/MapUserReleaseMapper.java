package com.rabbit.dao;

import java.util.List;

import org.mybatis.generator.base.mapper.single.BaseMapper;
import com.rabbit.model.MapUserRelease;
import com.rabbit.model.MapUserReleaseExample;

public interface MapUserReleaseMapper extends BaseMapper<MapUserRelease, MapUserReleaseExample> {

	List<Integer> selectOrgIdsByOrgCode(String nameEn);

}
