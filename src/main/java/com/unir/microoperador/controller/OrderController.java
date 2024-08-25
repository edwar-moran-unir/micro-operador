package com.unir.microoperador.controller;

import com.unir.microoperador.model.Order;
import com.unir.microoperador.model.OrderItems;
import com.unir.microoperador.request.OrderRequest;
import com.unir.microoperador.service.IOrderItemsService;
import com.unir.microoperador.service.IOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Tag(name = "Order")

public class OrderController {
    
    private final IOrderService orderService;
    private final IOrderItemsService orderItemsService;
    

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para registrar una orden")
    @PostMapping("/order")
    public ResponseEntity<Order> createOrder(@RequestBody OrderRequest orderRequest){
        Order newOrder = orderService.createOrder(orderRequest.getOrder()); 
        orderRequest.getOrderItems().stream().forEach(item -> {
            item.setOrderId(newOrder.getId());
            orderItemsService.createOrderItems(item);
        });
        return ResponseEntity.status(HttpStatus.CREATED).body(newOrder);
    }


    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para las ordenes de un usuario")
    @GetMapping("/order/user/{id}")
    public ResponseEntity<List<OrderRequest>> getorderByuser(@PathVariable  int id) {
        List<Order> myOrdes = orderService.findByUserId(id);
        List<OrderRequest> result =  myOrdes.stream().map(o -> {
                long orderId = o.getId();
                 OrderRequest orderRequest = new OrderRequest();
                 List<OrderItems> myItems = orderItemsService.findByOrderId(orderId);
                 orderRequest.setOrder(o);
                 orderRequest.setOrderItems(myItems);
                 return orderRequest;

        }).collect(Collectors.toList());

        return ResponseEntity.ok(result);
    }

}
