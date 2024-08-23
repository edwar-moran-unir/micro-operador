package com.unir.microoperador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String category;

    @Column
    private String brand;

    @Column
    private BigDecimal price;

    @Column
    private String thumbnail;
}
