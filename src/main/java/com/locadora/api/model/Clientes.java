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
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private String tell;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;
}
