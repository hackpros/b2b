package org.base.dubbox;

import java.util.List;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.comm.SoaResult;

/**
 * dbx服务基类
 * @author rabbitRennt create by 2016-11-18 19:11:44
 *
 * @param <I>
 * @param <O>
 */
public interface IBaseDubbox<I, O> {

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<O> selectByPrimaryKey(I i);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<List<O>> selectByExample(I i);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<Long> countByExample(I i);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<O> selectUnique(I i);

	/**
	 * 
	 * @param i
	 * @param page
	 * @return
	 */
	SoaResult<Pages<O>> selectPage(I i, Pages<O> page);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<O> doModify(I i);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<O> doAppend(I i);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<Integer> deleteByExample(I i);

	/**
	 * 
	 * @param i
	 * @return
	 */
	SoaResult<Integer> deleteByPrimaryKey(I i);

}