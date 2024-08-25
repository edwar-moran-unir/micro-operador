package com.unir.microoperador.service;
import java.util.List;

import com.unir.microoperador.model.OrderItems;
public interface IOrderItemsService {

    OrderItems createOrderItems (OrderItems item);
    List<OrderItems> findByOrderId(long orderId);
} 