package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.Agreement;
import com.jumore.b2b.daren.model.AgreementQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AgreementMapper {
    int countByExample(AgreementQueryHelper example);

    int deleteByExample(AgreementQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Agreement record);

    int insertSelective(Agreement record);

    List<Agreement> selectByExampleWithBLOBs(AgreementQueryHelper example);

    List<Agreement> selectByExample(AgreementQueryHelper example);

    Agreement selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Agreement record, @Param("example") AgreementQueryHelper example);

    int updateByExampleWithBLOBs(@Param("record") Agreement record, @Param("example") AgreementQueryHelper example);

    int updateByExample(@Param("record") Agreement record, @Param("example") AgreementQueryHelper example);

    int updateByPrimaryKeySelective(Agreement record);

    int updateByPrimaryKeyWithBLOBs(Agreement record);

    int updateByPrimaryKey(Agreement record);
}