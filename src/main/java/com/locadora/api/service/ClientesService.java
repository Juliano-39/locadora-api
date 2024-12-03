package com.locadora.api.service;

import com.locadora.api.model.Clientes;
import com.locadora.api.model.Locacoes;
import com.locadora.api.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public Clientes listById(Long id) {

        Optional<Clientes> clientes = clientesRepository.findById((id));

        return clientesRepository.listClienteById(String.valueOf(id));
    }
}
