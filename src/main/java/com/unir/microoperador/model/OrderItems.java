package com.unir.microoperador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "orderItems")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class OrderItems {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long orderId;

    @Column(length = 200)
    private String title;

    @Column(length = 150)
    private String category;

    @Column(length = 100)
    private String brand;

    @Column
    private BigDecimal price;

    @Column
    private Long quantity;

    @Column
    private String thumbnail;

    @Column
    private BigDecimal total;

   @Column
   private BigDecimal discountPercentage; 

    @Column
    private BigDecimal discountedTotal;

 }
