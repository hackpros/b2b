
package com.rabbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import org.mybatis.generator.base.mapper.single.BaseMapper;
import com.rabbit.model.SysOrg;
import com.rabbit.model.SysOrgExample;

public interface SysOrgMapper extends BaseMapper<SysOrg, SysOrgExample> {

	@Select("select * from BASE.SYS_ORG  where name_en in (#{code}) order by sort_")
	@ResultMap(value = "SysOrgResultMap")
	List<?> getTreeByOrgCode(@Param("code") String code);

	@Select("select * from BASE.SYS_ORG  where ladder_>=#{ladder}  and id_ in (#{orgId}) ")
	@ResultMap(value = "SysOrgResultMap")
	List<?> getTreeByLadder(@Param("ladder") short ladder, @Param("orgId") String orgId);


}

