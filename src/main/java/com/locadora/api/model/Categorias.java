package com.locadora.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "categorias")
public class Categorias {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome_categoria")
    private String nomeCategoria;

    @Column(name = "descricao")
    private String descricao;
}
