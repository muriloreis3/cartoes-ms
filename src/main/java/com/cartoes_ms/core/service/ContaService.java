package com.cartoes_ms.core.service;

import com.cartoes_ms.rest.dto.ContaDTO;

import java.util.List;

public interface ContaService {
    public List<ContaDTO> findContas();
    public ContaDTO findConta(Integer contaId);
    public void editarDadosConta(ContaDTO requestDTO);
    public void abrirConta(ContaDTO requestDTO);
}
