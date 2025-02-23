package com.bar.demo.persistence.impl;

import com.bar.demo.entity.Client;
import com.bar.demo.persistence.IClientDAO;
import com.bar.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ClientDAOImpl implements IClientDAO {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public void save(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }

}
