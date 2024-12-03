package com.locadora.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "locacoes")
public class Locacoes {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes clienteId;

    @ManyToOne
    @JoinColumn(name = "carro_id")
    private Carros carroId;

    @Column(name = "data_locacao")
    private LocalDateTime dataLocacao;

    @Column(name = "data_devolucao")
    private LocalDateTime dataDevolucao;

    @Column(name = "valor_diaria")
    private Double diaria;

    @Column(name = "valor_total")
    private Double total;

    @Column(name = "status")
    private String status;
}
