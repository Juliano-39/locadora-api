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
@Table(name = "pagamentos")
public class Pagamentos {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    @JoinColumn(name = "locacao_id", referencedColumnName = "id")
    private Locacoes locacaoId;

    @Column(name = "data_pagamento")
    private LocalDateTime dataPagamento;

    @Column(name = "valor_pago")
    private Double valorPago;

    @Column(name = "metodo_pagamento")
    private String metodoPgt;

    @Column(name = "status_pagamento")
    private String statusPgt;
}
