package com.cartoes_ms.core.entity.enums;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.stream.Stream;

public enum TipoCliente {
    PESSOA_FISICA("PF"),
    PESSOA_JURIDICA("PJ");

    private final String tipo;

    private TipoCliente(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static TipoCliente convertToTipoCliente(String tipo) {
        if (tipo == null) {
            return null;
        }

        return Stream.of(TipoCliente.values())
                .filter(c -> c.getTipo().equals(tipo))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
