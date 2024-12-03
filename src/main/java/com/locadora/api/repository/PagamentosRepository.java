package com.locadora.api.repository;

import com.locadora.api.model.Pagamentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface PagamentosRepository extends JpaRepository<Pagamentos, Long> {
}
