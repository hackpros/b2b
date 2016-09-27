package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.Company;
import com.jumore.b2b.daren.model.CompanyQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int countByExample(CompanyQueryHelper example);

    int deleteByExample(CompanyQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExampleWithBLOBs(CompanyQueryHelper example);

    List<Company> selectByExample(CompanyQueryHelper example);

    Company selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyQueryHelper example);

    int updateByExampleWithBLOBs(@Param("record") Company record, @Param("example") CompanyQueryHelper example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyQueryHelper example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKeyWithBLOBs(Company record);

    int updateByPrimaryKey(Company record);
}