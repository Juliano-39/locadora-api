package com.locadora.api.service;

import com.locadora.api.model.Locacoes;
import com.locadora.api.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class LocacoesService {

    @Autowired
    private CarrosRepository carrosRepository;

    @Autowired
    private CategoriasRepository categoriasRepository;

    @Autowired
    private ClientesRepository clientesRepository;

    @Autowired
    private PagamentosRepository pagamentosRepository;

    @Autowired
    private LocacoesRepository locacoesRepository;


    public Locacoes listById(Long id) {

        Optional<Locacoes> locacoes = locacoesRepository.findById((id));

        return locacoesRepository.listLocacaoById(String.valueOf(id));
    }
}
