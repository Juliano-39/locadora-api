package com.locadora.api.controller;

import com.locadora.api.model.Clientes;
import com.locadora.api.model.Locacoes;
import com.locadora.api.service.ClientesService;
import com.locadora.api.service.LocacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;

    @GetMapping("/{id}")
    public Clientes listById(@PathVariable Long id) {

        return ResponseEntity.ok(clientesService.listById(id)).getBody();
    }
}
