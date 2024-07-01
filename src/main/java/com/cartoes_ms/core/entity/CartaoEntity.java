package com.cartoes_ms.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cartao")
public class CartaoEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "numero", length = 16)
    private String numeroCartao;

    @Column(name = "limite")
    private BigDecimal limite;

    @ManyToOne
    @JoinColumn(name = "contaId")
    private ContaEntity conta;

    @Column(name = "emissao")
    private Date emissao;

    @Column(name = "vencimento")
    private Date vencimento;

    @Column(name = "cvv")
    private String cvv;
}
