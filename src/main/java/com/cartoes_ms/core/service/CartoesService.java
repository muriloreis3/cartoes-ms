package com.cartoes_ms.core.service;

import com.cartoes_ms.rest.dto.CartaoDTO;
import com.cartoes_ms.rest.dto.CartaoResponseDTO;

import java.util.List;

public interface CartoesService {

    public List<CartaoDTO> findCartoes();
    public CartaoDTO findCartao(Integer idCartao);
    public CartaoResponseDTO cadastrarCartao(CartaoDTO cartao);
    public void editarDadosCartao(CartaoDTO cartao);
}
