package com.jumore.b2b.daren.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;
import org.mybatis.generator.base.mapper.single.BaseMapper;

import com.jumore.b2b.daren.model.Appraise;
import com.jumore.b2b.daren.model.AppraiseDetail;
import com.jumore.b2b.daren.model.AppraiseDetailQueryHelper;

public interface AppraiseDetailMapper extends BaseMapper<AppraiseDetail, AppraiseDetailQueryHelper> {

	@SelectProvider(type = AppraiseDetailProvider.class, method = "selectStat")
	@ResultType(AppraiseDetail.class)
	List<AppraiseDetail> selectStat(@Param("name") String name, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

	@SelectProvider(type = AppraiseDetailProvider.class, method = "selectStatExcel")
	@ResultType(Appraise.class)
	List<Appraise> selectStatExcel(@Param("name") String name, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

	class AppraiseDetailProvider {

		public String selectStat(Map<String, Object> para) {

			Object name = para.get("name");
			Object startTime = para.get("startTime");
			Object endTime = para.get("endTime");

			// select name,appraiseType,count(id) as id from appraise_detail s
			// -- where create_time BETWEEN '2016-10-01 00:00:00' and
			// '2016-10-11 00:00:00'
			// group by appraiseType,name
			// order by nam

			SQL sql = new SQL();
			sql.SELECT("name,appraiseType,count(id) as id ");
			sql.FROM("appraise_detail");
			if (name != null && !"".equals(name)) {
				sql.WHERE("name=#{name} ");
			}
			if (startTime != null && !"".equals(startTime) && endTime != null && !"".equals(endTime)) {
				sql.WHERE("create_time BETWEEN #{startTime} AND #{endTime}");
			}
			sql.GROUP_BY("name,appraiseType");
			sql.ORDER_BY("name desc");
			System.out.println(sql.toString());
			return sql.toString();
		}

		public String selectStatExcel(Map<String, Object> para) {
			Object name = para.get("name");
			Object startTime = para.get("startTime");
			Object endTime = para.get("endTime");

			// select name,appraiseType,count(id) as id from appraise_detail s
			// -- where create_time BETWEEN '2016-10-01 00:00:00' and
			// '2016-10-11 00:00:00'
			// group by appraiseType,name
			// order by nam

			/*
			 * select name , (select count(*) from appraise_detail where name=
			 * a.name and appraiseType='best') as best, (select count(*) from
			 * appraise_detail where name= a.name and appraiseType='better') as
			 * better, (select count(*) from appraise_detail where name= a.name
			 * and appraiseType='good') as good from appraise_detail a where
			 * a.create_time BETWEEN and
			 */

			SQL sql = new SQL();
			sql.SELECT(" distinct name");
			sql.SELECT("(select count(*) from appraise_detail  where name= a.name and appraiseType='best') as best");
			sql.SELECT("(select count(*) from appraise_detail  where name= a.name and appraiseType='better') as better");
			sql.SELECT("(select count(*) from appraise_detail  where name= a.name and appraiseType='good') as good");

			sql.FROM("appraise_detail a ");

			if (name != null && !"".equals(name)) {
				sql.WHERE("name=#{name} ");
			}
			if (startTime != null && !"".equals(startTime) && endTime != null && !"".equals(endTime)) {
				sql.WHERE("a.create_time BETWEEN #{startTime} AND #{endTime}");
			}
			sql.ORDER_BY("name desc");
			System.out.println(sql.toString());
			return sql.toString();
		}
	}

}