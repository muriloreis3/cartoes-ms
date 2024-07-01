package com.cartoes_ms.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conta")
public class ContaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "saldo")
    private BigDecimal saldo;

    @Column(name = "limite")
    private BigDecimal limite;

    @ManyToOne
    @JoinColumn(name = "clienteId")
    private ClienteEntity cliente;

    @OneToOne
    @JoinColumn(name = "contaId")
    private PropostaEntity proposta;
}
