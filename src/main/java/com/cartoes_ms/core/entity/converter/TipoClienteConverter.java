package com.cartoes_ms.core.entity.converter;

import com.cartoes_ms.core.entity.enums.TipoCliente;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class TipoClienteConverter implements AttributeConverter<TipoCliente, String> {

    @Override
    public String convertToDatabaseColumn(TipoCliente tipoCliente) {
        return tipoCliente.getTipo();
    }

    @Override
    public TipoCliente convertToEntityAttribute(String s) {
        return TipoCliente.convertToTipoCliente(s);
    }
}
