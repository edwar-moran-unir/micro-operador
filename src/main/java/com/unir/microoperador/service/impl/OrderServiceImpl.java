package com.unir.microoperador.service.impl;

import com.unir.microoperador.model.Order;
import com.unir.microoperador.repository.IOrderRepository;
import com.unir.microoperador.service.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@RequiredArgsConstructor

public class OrderServiceImpl  implements IOrderService{
    private final IOrderRepository orderRepository;

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> findByUserId (int userId) {
        return orderRepository.findByUserId (userId);
    }
}
