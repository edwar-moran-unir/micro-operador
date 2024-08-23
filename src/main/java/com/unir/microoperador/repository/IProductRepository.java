package com.unir.microoperador.repository;

import com.unir.microoperador.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
