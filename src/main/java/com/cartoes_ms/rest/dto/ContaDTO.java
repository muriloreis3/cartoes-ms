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
public class ContaDTO implements Serializable {
    private Integer id;
    private BigDecimal limite;
    private ClienteDTO cliente;
}
