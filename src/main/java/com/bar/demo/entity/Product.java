package com.bar.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producto")

public class Product {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String code;
     private String name;
     private BigDecimal price;
     private Integer stock;




    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<DetalleVenta> detalleVentaList = new ArrayList<>();
}
