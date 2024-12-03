package com.locadora.api.repository;

import com.locadora.api.model.Carros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarrosRepository extends JpaRepository<Carros, UUID> {
}
