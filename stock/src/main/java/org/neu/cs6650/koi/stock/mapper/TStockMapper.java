package org.neu.cs6650.koi.stock.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.neu.cs6650.koi.stock.entity.TStock;
import org.apache.ibatis.annotations.Param;

public interface TStockMapper extends BaseMapper<TStock> {

    int decreaseStock(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}
