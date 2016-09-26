package org.mybatis.generator.base.service.single;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 服务curd基类
 * 
 * @author fanwg
 * @date 　　2016年7月1日　上午10:26:54
 * @email renntrabbit@foxmail.com
 * @param <T>
 * @param <E>
 */
public interface IBaseService<T, E> {

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
