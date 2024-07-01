package com.cartoes_ms.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartaoDTO implements Serializable {
    private Integer id;
    private String numeroCartao;
    private BigDecimal limite;
    private Integer conta;
}
