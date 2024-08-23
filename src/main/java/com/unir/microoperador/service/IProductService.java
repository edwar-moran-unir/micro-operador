package com.unir.microoperador.service;

import com.unir.microoperador.model.Product;

import java.util.List;

public interface IProductService {

    Product createProduct(Product product);

    List<Product> getProducts();
}
