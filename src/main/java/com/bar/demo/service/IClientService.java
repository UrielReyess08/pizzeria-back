package com.bar.demo.service;

import com.bar.demo.entity.Client;
import com.bar.demo.entity.Venta;
import com.bar.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IClientService {
    List<Client> findAll();
    Optional<Client> findById(Long id);

    void save(Client client);

    void deleteById(Long id);


}

