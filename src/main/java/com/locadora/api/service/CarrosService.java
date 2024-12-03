package com.locadora.api.service;

import com.locadora.api.model.Carros;
import com.locadora.api.model.Locacoes;
import com.locadora.api.repository.CarrosRepository;
import com.locadora.api.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarrosService {

    @Autowired
    private CarrosRepository carrosRepository;

    @Autowired
    private CategoriasRepository categoriasRepository;


    public Carros listById(Long id) {

        Optional<Carros> carros = carrosRepository.findById((id));

        return carrosRepository.listCarroById(String.valueOf(id));
    }
}
