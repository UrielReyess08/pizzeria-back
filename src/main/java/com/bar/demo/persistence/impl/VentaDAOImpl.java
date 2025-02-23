package com.bar.demo.persistence.impl;

import com.bar.demo.entity.Venta;
import com.bar.demo.persistence.IVentaDAO;
import com.bar.demo.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VentaDAOImpl implements IVentaDAO {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> findAll() {
        return (List<Venta>) ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> findById(Long id) {
        return ventaRepository.findById(id);
    }

    @Override
    public void save(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public void deleteById(Long id) {
        ventaRepository.deleteById(id);
    }

}
