package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.UserTalns;
import com.jumore.b2b.daren.model.UserTalnsQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTalnsMapper {
    int countByExample(UserTalnsQueryHelper example);

    int deleteByExample(UserTalnsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserTalns record);

    int insertSelective(UserTalns record);

    List<UserTalns> selectByExample(UserTalnsQueryHelper example);

    UserTalns selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserTalns record, @Param("example") UserTalnsQueryHelper example);

    int updateByExample(@Param("record") UserTalns record, @Param("example") UserTalnsQueryHelper example);

    int updateByPrimaryKeySelective(UserTalns record);

    int updateByPrimaryKey(UserTalns record);
}