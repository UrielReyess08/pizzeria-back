package com.bar.demo.persistence;

import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.entity.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IDetalleVentaDAO {

    List<DetalleVenta> findAll();
    Optional<DetalleVenta> findById(Long id);
    List<DetalleVenta> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
    void save(DetalleVenta detalleVenta);
    void delete(Long id);
}
