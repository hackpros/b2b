package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.UserGalns;
import com.jumore.b2b.daren.model.UserGalnsQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGalnsMapper {
    int countByExample(UserGalnsQueryHelper example);

    int deleteByExample(UserGalnsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserGalns record);

    int insertSelective(UserGalns record);

    List<UserGalns> selectByExample(UserGalnsQueryHelper example);

    UserGalns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserGalns record, @Param("example") UserGalnsQueryHelper example);

    int updateByExample(@Param("record") UserGalns record, @Param("example") UserGalnsQueryHelper example);

    int updateByPrimaryKeySelective(UserGalns record);

    int updateByPrimaryKey(UserGalns record);
}