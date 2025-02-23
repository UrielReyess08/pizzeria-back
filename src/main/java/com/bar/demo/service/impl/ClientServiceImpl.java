package com.bar.demo.service.impl;

import com.bar.demo.entity.Client;
import com.bar.demo.persistence.IClientDAO;
import com.bar.demo.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDAO clientDAO;

    @Override
    public List<Client> findAll() {

        return clientDAO.findAll();
    }

    @Override
    public Optional<Client> findById(Long id) {

        return clientDAO.findById(id);
    }


    @Override
    public void save(Client client) {
        clientDAO.save(client);
    }

    @Override
    public void deleteById(Long id) {
        clientDAO.deleteById(id);
    }




}
