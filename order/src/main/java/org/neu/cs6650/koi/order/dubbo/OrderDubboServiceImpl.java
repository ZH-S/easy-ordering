package org.neu.cs6650.koi.order.dubbo;

import com.alibaba.dubbo.config.annotation.Service;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.neu.cs6650.koi.common.dto.OrderDTO;
import org.neu.cs6650.koi.common.dubbo.OrderDubboService;
import org.neu.cs6650.koi.common.response.ObjectResponse;
import org.neu.cs6650.koi.order.service.ITOrderService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0", protocol = "${dubbo.protocol.id}", application = "${dubbo.application.id}",
    registry = "${dubbo.registry.id}", timeout = 3000)
@Slf4j
public class OrderDubboServiceImpl implements OrderDubboService {

    @Autowired
    private ITOrderService orderService;

    @Override
    public ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO) {
        log.info("Global transaction id: {}", RootContext.getXID());
        log.info("createOrder: {}", orderDTO.toString());
        return orderService.createOrder(orderDTO);
    }
}
