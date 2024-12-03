package com.locadora.api.controller;

import com.locadora.api.model.Carros;
import com.locadora.api.model.Locacoes;
import com.locadora.api.service.CarrosService;
import com.locadora.api.service.LocacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/carros")
public class CarrosController {

    @Autowired
    private CarrosService carrosService;

    @GetMapping("/{id}")
    public Carros listById(@PathVariable Long id) {

        return ResponseEntity.ok(carrosService.listById(id)).getBody();
    }
}
