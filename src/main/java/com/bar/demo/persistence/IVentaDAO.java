package com.bar.demo.persistence;

import com.bar.demo.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface IVentaDAO {
    List<Venta> findAll();
    Optional<Venta> findById(Long id);

    void save(Venta venta);

    void deleteById(Long id);
}
