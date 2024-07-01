package com.cartoes_ms.core.service.impl;

import com.cartoes_ms.core.mapper.ClienteMapper;
import com.cartoes_ms.core.mapper.ContaMapper;
import com.cartoes_ms.core.repository.ContaRepository;
import com.cartoes_ms.core.service.ClienteService;
import com.cartoes_ms.core.service.ContaService;
import com.cartoes_ms.rest.dto.ContaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private ClienteMapper clienteMapper;

    @Autowired
    private ContaMapper contaMapper;

    @Override
    public List<ContaDTO> findContas() {
        return contaRepository.findAll().stream()
                .map(contaMapper::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ContaDTO findConta(Integer contaId) {
        return contaMapper.entityToDTO(contaRepository.findById(contaId).orElseThrow());
    }

    @Override
    public void editarDadosConta(ContaDTO requestDTO) {
        contaRepository.save(contaMapper.dtoToEntity(requestDTO));
    }

    @Override
    public void abrirConta(ContaDTO requestDTO) {
        requestDTO.getCliente().setId(clienteService.gravarCliente(requestDTO.getCliente()));
        contaRepository.save(contaMapper.dtoToEntity(requestDTO));
    }
}
