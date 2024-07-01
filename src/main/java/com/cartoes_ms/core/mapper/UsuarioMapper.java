package com.cartoes_ms.core.mapper;

import com.cartoes_ms.core.entity.UsuarioEntity;
import com.cartoes_ms.rest.dto.UsuarioDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UsuarioMapper {
    UsuarioEntity dtoToEntity(UsuarioDTO input);
}
