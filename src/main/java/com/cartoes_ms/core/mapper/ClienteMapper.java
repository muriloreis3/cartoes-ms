package com.cartoes_ms.core.mapper;

import com.cartoes_ms.core.entity.ClienteEntity;
import com.cartoes_ms.rest.dto.ClienteDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteMapper {
    ClienteEntity dtoToEntity(ClienteDTO cliente);
}
