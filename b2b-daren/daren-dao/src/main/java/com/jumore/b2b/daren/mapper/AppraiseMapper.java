package com.jumore.b2b.daren.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.mybatis.generator.base.mapper.single.BaseMapper;

import com.jumore.b2b.daren.model.Appraise;
import com.jumore.b2b.daren.model.AppraiseQueryHelper;

public interface AppraiseMapper extends BaseMapper<Appraise, AppraiseQueryHelper> {

	@Update("update appraise set good=good+#{good},better=better+#{better},best=best+#{best} where id=#{id} and code=#{code}")
	int doApppraise(@Param("good") Integer good, @Param("better") Integer better, @Param("best") Integer best,@Param("id")Long id, @Param("code") String code);
}