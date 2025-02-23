package com.bar.demo.service.impl;

import com.bar.demo.entity.Venta;
import com.bar.demo.persistence.IVentaDAO;
import com.bar.demo.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaServiceImpl implements IVentaService {
    @Autowired
    private IVentaDAO ventaDAO;
    @Override
    public List<Venta> findAll() {

        return ventaDAO.findAll();
    }

    @Override
    public Optional<Venta> findById(Long id) {

        return ventaDAO.findById(id);
    }


    @Override
    public void save(Venta venta) {
    ventaDAO.save(venta);
    }

    @Override
    public void deleteById(Long id) {
    ventaDAO.deleteById(id);
    }
}
