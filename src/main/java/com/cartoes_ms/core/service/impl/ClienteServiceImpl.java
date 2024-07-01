package com.cartoes_ms.core.service.impl;

import com.cartoes_ms.core.mapper.ClienteMapper;
import com.cartoes_ms.core.repository.ClienteRepository;
import com.cartoes_ms.core.service.ClienteService;
import com.cartoes_ms.rest.dto.ClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    @Override
    public Integer gravarCliente(ClienteDTO clienteDTO) {
        return clienteRepository.save(clienteMapper.dtoToEntity(clienteDTO)).getId();
    }
}
