package com.bar.demo.service;

import com.bar.demo.entity.Venta;

import java.util.List;
import java.util.Optional;


public interface IVentaService {

    List<Venta> findAll();
    Optional<Venta> findById(Long id);

    void save(Venta venta);

    void deleteById(Long id);
}
