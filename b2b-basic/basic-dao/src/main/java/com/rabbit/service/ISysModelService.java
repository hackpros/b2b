package com.rabbit.service;

import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;
import com.rabbit.model.SysModel;
import com.rabbit.model.SysModelExample;

public interface ISysModelService extends
		IBaseService<SysModel, SysModelExample> {

	List<?> getTreeByLadder(short ladder);

}
