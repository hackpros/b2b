
package com.rabbit.service;

import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;
import com.rabbit.model.SysMenu;
import com.rabbit.model.SysMenuExample;

public interface ISysMenuService extends IBaseService<SysMenu, SysMenuExample> {

	List<?> getTreeByLadder(int ladder);

	List<?> getAutherTree(String grade);

	List<?> selectOnTree(long parentId, long usrId);

	List<?> selectTreeByParentId(Long currAdminId, int ladder, Long parentId);

	List<?> getSelectTree(String grade, String roleAuthId);


}

