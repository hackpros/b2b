package com.jumore.b2b.daren.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;
import org.mybatis.generator.base.mapper.single.BaseMapper;

import com.jumore.b2b.daren.model.AppraiseDetail;
import com.jumore.b2b.daren.model.AppraiseDetailQueryHelper;

public interface AppraiseDetailMapper extends BaseMapper<AppraiseDetail, AppraiseDetailQueryHelper> {

	@SelectProvider(type = AppraiseDetailProvider.class, method = "selectStat")
	List<AppraiseDetail> selectStat(String name, String appraisetype, Date startTime, Date endTime);

	class AppraiseDetailProvider {
		public String selectStat(String name, String appraisetype, Date startTime, Date endTime) {
			return "select bean.*, otherbean.column from bean left join otherbean on bean.oid=otherbean.id";
		}
	}

}