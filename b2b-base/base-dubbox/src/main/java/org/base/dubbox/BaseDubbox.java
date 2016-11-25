package org.base.dubbox;

import java.util.List;

import org.mybatis.generator.base.service.single.IBaseService;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.comm.SoaResult;

/**
 * 
 * @author Administrator
 *
 * @param <I>
 * @param <O>
 */
public class BaseDubbox<I, O> implements IBaseDubbox<I, O> {

	protected IBaseService<I, O> baseMapper;

	@Override
	public SoaResult<O> selectByPrimaryKey(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<List<O>> selectByExample(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<Long> countByExample(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<O> selectUnique(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<Pages<O>> selectPage(I i, Pages<O> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<O> doModify(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<O> doAppend(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<Integer> deleteByExample(I i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SoaResult<Integer> deleteByPrimaryKey(I i) {
		// TODO Auto-generated method stub
		return null;
	}

}
