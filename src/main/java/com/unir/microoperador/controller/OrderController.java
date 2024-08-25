package com.unir.microoperador.controller;

import com.unir.microoperador.model.Order;
import com.unir.microoperador.service.IOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Order")

public class OrderController {
    
    private final IOrderService orderService;
    

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para registrar una orden")
    @PostMapping("/order")
    public ResponseEntity<Order> createProduct(@RequestBody Order order){
        return ResponseEntity.status(HttpStatus.CREATED).body(orderService.createOrder(order));
    }


    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para las ordenes de un usuario")
    @GetMapping("/order/user/{id}")
    public ResponseEntity<List<Order>> getProducts(@PathVariable  int id) {
        return ResponseEntity.ok(orderService.findByUserId(id));
    }

}
