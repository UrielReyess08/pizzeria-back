package com.bar.demo.Controller.dto;

import com.bar.demo.entity.Client;
import com.bar.demo.entity.Product;
import com.bar.demo.entity.Venta;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter

public class DetalleVentaDTO {

    private Long id;
    private Double subtotal;
    private Integer cantidad;
    private Venta venta;
    private Product product;


}
