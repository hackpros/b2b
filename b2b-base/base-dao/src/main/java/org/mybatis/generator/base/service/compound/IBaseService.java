package org.mybatis.generator.base.service.compound;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 服务curd基类接口
 * 
 * @author fanwg	
 * @date 　　2016年7月1日　上午10:25:09
 * @email renntrabbit@foxmail.com
 * @param <T>
 * @param <E>
 * @param <K>
 */
public interface IBaseService<T, E, K> {

	long countByExample(E e);

	int deleteByExample(E e);

	int deleteByPrimaryKey(K k);

	long insert(T t);

	long insertSelective(T t);

	List<T> selectByExample(E e);

	T selectByPrimaryKey(K K);

	int updateByExampleSelective(@Param("record") T t, @Param("example") E e);

	int updateByExample(@Param("record") T t, @Param("example") E e);

	int updateByPrimaryKeySelective(K k);

	int updateByPrimaryKey(K k);
}
