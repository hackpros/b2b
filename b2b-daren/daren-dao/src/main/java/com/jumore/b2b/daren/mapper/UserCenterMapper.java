package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.UserCenter;
import com.jumore.b2b.daren.model.UserCenterQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCenterMapper {
    int countByExample(UserCenterQueryHelper example);

    int deleteByExample(UserCenterQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(UserCenter record);

    int insertSelective(UserCenter record);

    List<UserCenter> selectByExample(UserCenterQueryHelper example);

    UserCenter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserCenter record, @Param("example") UserCenterQueryHelper example);

    int updateByExample(@Param("record") UserCenter record, @Param("example") UserCenterQueryHelper example);

    int updateByPrimaryKeySelective(UserCenter record);

    int updateByPrimaryKey(UserCenter record);
}