
package com.rabbit.service;

import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;
import com.rabbit.model.SysItem;
import com.rabbit.model.SysItemExample;

public interface ISysItemService extends IBaseService<SysItem, SysItemExample> {

	List<?> selectSimple(SysItem sysItem);

	List<?> getTreeByLadder(short ladder);

	

}

