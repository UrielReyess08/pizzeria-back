package com.bar.demo.persistence.impl;

import com.bar.demo.entity.DetalleVenta;;
import com.bar.demo.persistence.IDetalleVentaDAO;
import com.bar.demo.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class DetalleVentaDAOImpl implements IDetalleVentaDAO {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> findAll(){
        return (List<DetalleVenta>) detalleVentaRepository.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(Long id) {
        return detalleVentaRepository.findById(id);
    }

    @Override
    public List<DetalleVenta> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return detalleVentaRepository.findDetalleVentaBySubtotalInRange(minPrice, maxPrice);
    }

    @Override
    public void save(DetalleVenta detalleVenta) {
    detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public void delete(Long id) {
    detalleVentaRepository.deleteById(id);
    }
}
