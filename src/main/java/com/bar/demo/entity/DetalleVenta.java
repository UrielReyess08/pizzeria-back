package com.bar.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalle_venta")

public class DetalleVenta {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private Double subtotal;
     private Integer cantidad;


     @ManyToOne
     @JoinColumn(name="id_venta", nullable = false)
     @JsonIgnore
    private Venta venta;

    @ManyToOne
    @JoinColumn(name="id_product", nullable = false)
    @JsonIgnore
    private Product product;



}
