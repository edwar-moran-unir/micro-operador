package com.unir.microoperador.service;

import com.unir.microoperador.model.Order;

import java.util.List;
public interface IOrderService {

    Order createOrder(Order order);

    List<Order> findByUserId (int userId);
}
