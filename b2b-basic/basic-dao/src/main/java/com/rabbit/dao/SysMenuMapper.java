
package com.rabbit.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.bean.GlobalSelect;
import com.bean.MenuTree;
import org.mybatis.generator.base.mapper.single.BaseMapper;
import com.rabbit.model.SysMenu;
import com.rabbit.model.SysMenuExample;

public interface SysMenuMapper extends BaseMapper<SysMenu, SysMenuExample> {

	List<SysMenu> selectOnTree(@Param("parentId") long parentId,@Param("usrId") long  usrId);

	List<MenuTree> selectTreeByParentId(@Param("currAdminId") long  currAdminId, @Param("ladder")int ladder,@Param("parentId") Long parentId);
	
	@Select("select max(USR_AUTH_ID) from  SYS_MENU" )
	@Result(column="USR_AUTH_ID")
	int queryMaxAuthId();	
	

	@Select("SELECT ID,NAME,'close' as grade,#{usrRoleId} as USR_ROLE_ID, " +
			"(select count(*) from  BAE.USR_ROLE_AUTH where usr_role_id=#{usrRoleId} and  usr_auth_id =id) as checked " +
			"FROM BASE.SYS_MENU  WHERE GRADE=#{grade}" )
	@ResultMap(value = "SysMenuSelectTreeResultMap")  
	List<MenuTree> getSelectTree(@Param("grade") String grade,@Param("usrRoleId")  String usrRoleId);
	
	
	@Select("SELECT ID,NAME FROM BASE.SYS_MENU  WHERE ladder_=#{ladder}" )
	@ResultType(GlobalSelect.class)
	List<GlobalSelect> getAutherTree(@Param("ladder") String ladder);


	@Select("select * from BASE.SYS_MENU where Ladder_=0" )
	@ResultMap(value = "SyMenuQueryTreeResultMap")  
	List<?> getTreeByLadder(@Param("ladder") int ladder);





}

