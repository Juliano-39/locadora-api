package com.locadora.api.repository;

import com.locadora.api.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
}
