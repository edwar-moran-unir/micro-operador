package com.unir.microoperador.repository;

import com.unir.microoperador.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByTitleContainingOrBrandContaining(String title, String brand);
}
