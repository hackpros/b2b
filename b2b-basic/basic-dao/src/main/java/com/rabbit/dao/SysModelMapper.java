
package com.rabbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import org.mybatis.generator.base.mapper.single.BaseMapper;
import com.rabbit.model.SysModel;
import com.rabbit.model.SysModelExample;

public interface SysModelMapper extends BaseMapper<SysModel, SysModelExample> {
	
	@Select("select * from  BASE.sys_model where ladder_='1' order by model_code")
	@ResultMap(value = "SysModelResultMap")  
	List<?> getTreeByLadder(@Param("ladder") short ladder);
	}





