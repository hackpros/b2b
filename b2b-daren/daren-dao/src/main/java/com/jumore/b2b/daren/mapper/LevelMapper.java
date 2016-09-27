package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.Level;
import com.jumore.b2b.daren.model.LevelQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LevelMapper {
    int countByExample(LevelQueryHelper example);

    int deleteByExample(LevelQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(Level record);

    int insertSelective(Level record);

    List<Level> selectByExample(LevelQueryHelper example);

    Level selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Level record, @Param("example") LevelQueryHelper example);

    int updateByExample(@Param("record") Level record, @Param("example") LevelQueryHelper example);

    int updateByPrimaryKeySelective(Level record);

    int updateByPrimaryKey(Level record);
}