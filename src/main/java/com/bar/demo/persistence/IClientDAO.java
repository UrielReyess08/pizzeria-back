package com.bar.demo.persistence;

import com.bar.demo.entity.Client;
import com.bar.demo.entity.Venta;

import java.util.List;
import java.util.Optional;

public interface IClientDAO {

    List<Client> findAll();
    Optional<Client> findById(Long id);

    void save(Client client);

    void deleteById(Long id);
}
