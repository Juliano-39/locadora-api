package com.locadora.api.controller;

import com.locadora.api.model.Locacoes;
import com.locadora.api.service.LocacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/api/locacoes")
public class LocacoesController {

    @Autowired
    private LocacoesService locacoesService;

    @GetMapping("/{id}")
    public Locacoes listById(@PathVariable Long id) {

        return ResponseEntity.ok(locacoesService.listById(id)).getBody();
    }
}
