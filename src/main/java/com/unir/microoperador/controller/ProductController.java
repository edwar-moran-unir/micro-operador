package com.unir.microoperador.controller;

import com.unir.microoperador.model.Product;
import com.unir.microoperador.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Tag(name = "Producto")
public class ProductController {

    private final IProductService productService;

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para Listar todos los productos")
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(productService.getProducts());
    }

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para registrar un productos")
    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
    }

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para buscar un productos por title o brand")
    @GetMapping("/products/search")
    public List<Product> searchProducts(@RequestParam String query) {
        return productService.searchProductsByTitleOrBrand(query);
    }

    @CrossOrigin(origins = "*")
    @Operation(summary = "Metodo para eliminar un producto")
    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
