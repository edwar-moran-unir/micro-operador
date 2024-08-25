package com.unir.microoperador.service.impl;

 import com.unir.microoperador.model.OrderItems;
 import com.unir.microoperador.repository.IOrderItemsRepository;
 import com.unir.microoperador.service.IOrderItemsService;
 import lombok.RequiredArgsConstructor;
 import org.springframework.stereotype.Service;


 import java.util.List;

  @Service
 @RequiredArgsConstructor

public class OrderItemsServiceImpl  implements IOrderItemsService{

    private final IOrderItemsRepository orderItemsRepository;

     @Override 
     public OrderItems createOrderItems(OrderItems orderItems){

          return orderItemsRepository.save(orderItems);
     } 

     @Override 
     public List<OrderItems>findByOrderId(long orderId){

          return orderItemsRepository.findByOrderId(orderId);
     }
    
}