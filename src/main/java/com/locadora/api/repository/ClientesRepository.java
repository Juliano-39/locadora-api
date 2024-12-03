package com.locadora.api.repository;

import com.locadora.api.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
}
