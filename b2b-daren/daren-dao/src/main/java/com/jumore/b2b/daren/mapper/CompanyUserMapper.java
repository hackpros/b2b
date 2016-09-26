package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.CompanyUser;
import com.jumore.b2b.daren.model.CompanyUserQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyUserMapper {
    int countByExample(CompanyUserQueryHelper example);

    int deleteByExample(CompanyUserQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(CompanyUser record);

    int insertSelective(CompanyUser record);

    List<CompanyUser> selectByExample(CompanyUserQueryHelper example);

    CompanyUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CompanyUser record, @Param("example") CompanyUserQueryHelper example);

    int updateByExample(@Param("record") CompanyUser record, @Param("example") CompanyUserQueryHelper example);

    int updateByPrimaryKeySelective(CompanyUser record);

    int updateByPrimaryKey(CompanyUser record);
}