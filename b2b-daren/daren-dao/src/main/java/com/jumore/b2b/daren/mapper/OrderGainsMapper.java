package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.OrderGains;
import com.jumore.b2b.daren.model.OrderGainsQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGainsMapper {
    int countByExample(OrderGainsQueryHelper example);

    int deleteByExample(OrderGainsQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderGains record);

    int insertSelective(OrderGains record);

    List<OrderGains> selectByExample(OrderGainsQueryHelper example);

    OrderGains selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderGains record, @Param("example") OrderGainsQueryHelper example);

    int updateByExample(@Param("record") OrderGains record, @Param("example") OrderGainsQueryHelper example);

    int updateByPrimaryKeySelective(OrderGains record);

    int updateByPrimaryKey(OrderGains record);
}