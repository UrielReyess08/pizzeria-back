package com.bar.demo.service.impl;

import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.persistence.IDetalleVentaDAO;
import com.bar.demo.service.IDetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaImpl implements IDetalleVentaService {
    @Autowired
    private IDetalleVentaDAO detalleVentaDAO;

    @Override
    public List<DetalleVenta> findAll() {
        return detalleVentaDAO.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(Long id) {
        return detalleVentaDAO.findById(id);
    }

    @Override
    public List<DetalleVenta> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return detalleVentaDAO.findByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(DetalleVenta detalleVenta) {
    detalleVentaDAO.save(detalleVenta);
    }

    @Override
    public void deleteById(Long id) {
    detalleVentaDAO.delete(id);
    }
}
