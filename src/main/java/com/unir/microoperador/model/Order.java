package com.unir.microoperador.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tbl_orders")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Order {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

   @Column
   private Long userId;

   @Column
   private Long totalProducts;

   @Column
    private BigDecimal discountedTotal;


   @Column
    private BigDecimal total;


}
