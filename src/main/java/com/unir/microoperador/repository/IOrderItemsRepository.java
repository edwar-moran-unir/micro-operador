package com.unir.microoperador.repository;
import com.unir.microoperador.model.OrderItems;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  IOrderItemsRepository extends JpaRepository<OrderItems , Long> {
    List<OrderItems> findByOrderId(Long orderId );
}