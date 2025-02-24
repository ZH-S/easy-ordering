package org.neu.cs6650.koi.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderDTO implements Serializable {

    private String orderNo;

    private String userId;

    private String commodityCode;

    private Integer orderCount;

    private BigDecimal orderAmount;
}
