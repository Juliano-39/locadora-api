package com.locadora.api.repository;

import com.locadora.api.model.Locacoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocacoesRepository extends JpaRepository<Locacoes, Long> {

    @Query(value = """
            select * from locacoes where id = :id""", nativeQuery = true)
    Locacoes listLocacaoById(@Param("id") String id);
}
