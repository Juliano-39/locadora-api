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
@Table(name = "carros")
public class Carros {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "placa")
    private String placa;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categorias categoriaId;

    @Column(name = "status")
    private String status;
}
