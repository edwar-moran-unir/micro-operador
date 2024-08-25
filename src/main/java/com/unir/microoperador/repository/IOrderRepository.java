package com.unir.microoperador.repository;

import com.unir.microoperador.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepository extends JpaRepository<Order, Long >{
    List<Order> findByUserId (int userId);
}
