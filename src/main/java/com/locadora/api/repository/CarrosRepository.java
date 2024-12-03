package com.locadora.api.repository;

import com.locadora.api.model.Carros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrosRepository extends JpaRepository<Carros, Long> {

    @Query(value = """
            select * from carros where id = :id""", nativeQuery = true)
    Carros listCarroById(@Param("id") String id);
}
