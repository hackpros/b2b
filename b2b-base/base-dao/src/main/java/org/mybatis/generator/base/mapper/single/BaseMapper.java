package org.mybatis.generator.base.mapper.single;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 单主键 基类
 * 
 * @author fanwg
 * @date 2013-8-20 下午02:30:13
 * @email renntrabbit@foxmail.com
 * @param <T>
 * @param <E>
 */
public interface BaseMapper<T, E> {

	int countByExample(E e);

	int deleteByExample(E e);

	int deleteByPrimaryKey(T t);

	long insert(T t);

	long insertSelective(T t);

	List<T> selectByExample(E e);

	T selectByPrimaryKey(T t);

	int updateByExampleSelective(@Param("record") T t, @Param("example") E e);

	int updateByExample(@Param("record") T t, @Param("example") E e);

	int updateByPrimaryKeySelective(T t);

	int updateByPrimaryKey(T t);
}
