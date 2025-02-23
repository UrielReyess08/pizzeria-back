package com.bar.demo.Controller.dto;

import com.bar.demo.entity.DetalleVenta;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter

public class ProductDTO {

    private Long id;
    private String code;
    private String name;
    private BigDecimal price;
    private Integer stock;

    private List<DetalleVenta> detalleVentaList = new ArrayList<>();
}
