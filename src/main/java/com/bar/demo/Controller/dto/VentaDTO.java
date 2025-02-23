package com.bar.demo.Controller.dto;

import com.bar.demo.entity.Client;
import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.entity.Venta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VentaDTO {

    private Long id;
    private Date fecha;
    private Double total;
    private int estado;
    private Client client;

    private List<DetalleVenta> detalleVentaList = new ArrayList<>();
}
