
package com.rabbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.bean.GlobalSelect;
import org.mybatis.generator.base.mapper.single.BaseMapper;
import com.rabbit.model.SysItem;
import com.rabbit.model.SysItemExample;

public interface SysItemMapper extends BaseMapper<SysItem, SysItemExample> {
	
	@Select("select * from BASE.SYS_ITEM where ladder_='1' order by sort_")
	@ResultMap(value = "SysItemResultMap")  
	List<?> getTreeByLadder(@Param("ladder") short ladder);

	    
	@Select("select key_code,key_value,item_code from BASE.SYS_ITEM where parent_id=#{sysItem.parentId} and ladder_=#{sysItem.ladder} order by ITEM_CODE,SORT_")
	@ResultMap(value = "BaseSimpleResultMap") 
	//@SelectProvider(type = SysItemMapperProvider.class, method = "selectSimple") //用法和含义@SelectProvider一样，只不过是用来更新数据库而用的。 

	//@Results(value = {  
    //        @Result(id = true, property = "id", column = "key_code", javaType = String.class, jdbcType = JdbcType.VARCHAR),  
    //        @Result(property = "text", column = "key_value", javaType = String.class, jdbcType = JdbcType.VARCHAR) })  
	List<GlobalSelect> selectSimple(@Param("sysItem") SysItem sysItem);

}

