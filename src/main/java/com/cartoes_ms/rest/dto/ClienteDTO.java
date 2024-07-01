package com.cartoes_ms.rest.dto;

import com.cartoes_ms.core.entity.enums.TipoCliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO implements Serializable {
    private Integer id;
    private String nome;
    private TipoCliente tipo;
    private String cpfCnpj;
    private String endereco;
}
