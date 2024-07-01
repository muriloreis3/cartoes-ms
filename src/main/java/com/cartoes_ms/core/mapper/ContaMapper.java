package com.cartoes_ms.core.mapper;

import com.cartoes_ms.core.entity.ContaEntity;
import com.cartoes_ms.rest.dto.ContaDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ContaMapper {
    public ContaDTO entityToDTO(ContaEntity contaEntity);
    public ContaEntity dtoToEntity(ContaDTO requestDTO);
}
