package com.jumore.b2b.daren.mapper;

import com.jumore.b2b.daren.model.OrderScale;
import com.jumore.b2b.daren.model.OrderScaleQueryHelper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderScaleMapper {
    int countByExample(OrderScaleQueryHelper example);

    int deleteByExample(OrderScaleQueryHelper example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderScale record);

    int insertSelective(OrderScale record);

    List<OrderScale> selectByExample(OrderScaleQueryHelper example);

    OrderScale selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderScale record, @Param("example") OrderScaleQueryHelper example);

    int updateByExample(@Param("record") OrderScale record, @Param("example") OrderScaleQueryHelper example);

    int updateByPrimaryKeySelective(OrderScale record);

    int updateByPrimaryKey(OrderScale record);
}