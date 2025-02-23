package com.bar.demo.service;

import com.bar.demo.entity.DetalleVenta;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IDetalleVentaService {

    List<DetalleVenta> findAll();
    Optional<DetalleVenta> findById(Long id);
    List<DetalleVenta> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    void save(DetalleVenta detalleVenta);
    void deleteById(Long id);

}
