package com.cartoes_ms.core.mapper;

import com.cartoes_ms.core.entity.CartaoEntity;
import com.cartoes_ms.rest.dto.CartaoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CartaoMapper {

    @Mapping(target = "conta", source = "conta.id")
    public CartaoDTO entityToDTO(CartaoEntity entity);

    @Mapping(target = "conta.id", source = "conta")
    public CartaoEntity dtoToEntity(CartaoDTO cartao);
}
