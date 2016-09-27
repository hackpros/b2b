package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.Prizes;
import com.jumore.b2b.daren.model.PrizesQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrizesMapper {
    int countByExample(PrizesQueryHelper example);

    int deleteByExample(PrizesQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Prizes record);

    int insertSelective(Prizes record);

    List<Prizes> selectByExample(PrizesQueryHelper example);

    Prizes selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Prizes record, @Param("example") PrizesQueryHelper example);

    int updateByExample(@Param("record") Prizes record, @Param("example") PrizesQueryHelper example);

    int updateByPrimaryKeySelective(Prizes record);

    int updateByPrimaryKey(Prizes record);
}