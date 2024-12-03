package com.locadora.api.repository;

import com.locadora.api.model.Clientes;
import com.locadora.api.model.Locacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

    @Query(value = """
            select * from clientes where id = :id""", nativeQuery = true)
    Clientes listClienteById(@Param("id") String id);
}
