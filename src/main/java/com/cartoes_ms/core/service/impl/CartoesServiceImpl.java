package com.cartoes_ms.core.service.impl;

import com.cartoes_ms.core.mapper.CartaoMapper;
import com.cartoes_ms.core.repository.CartaoRepository;
import com.cartoes_ms.core.service.CartoesService;
import com.cartoes_ms.rest.dto.CartaoDTO;
import com.cartoes_ms.rest.dto.CartaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartoesServiceImpl implements CartoesService {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Autowired
    private CartaoMapper modelMapper;

    @Override
    public List<CartaoDTO> findCartoes() {
        return cartaoRepository.findAll()
                .stream()
                .map(modelMapper::entityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CartaoDTO findCartao(Integer idCartao) {
        return modelMapper.entityToDTO(cartaoRepository.findById(idCartao).orElseThrow());
    }

    @Override
    public CartaoResponseDTO cadastrarCartao(CartaoDTO cartao) {
        var cartaoEntity = cartaoRepository.save(modelMapper.dtoToEntity(cartao));
        return CartaoResponseDTO.builder()
                .cvv(cartaoEntity.getCvv())
                .emailCliente(cartaoEntity.getConta().getCliente().getEmail())
                .nomeCliente(cartaoEntity.getConta().getCliente().getNome())
                .emissao(cartaoEntity.getEmissao().toLocaleString())
                .vencimento(cartaoEntity.getVencimento().toLocaleString())
                .nomeProposta(cartaoEntity.getConta().getProposta().getNomeProposta())
                .numero(cartaoEntity.getNumeroCartao())
                .build();
    }

    @Override
    public void editarDadosCartao(CartaoDTO cartao) {
        cartaoRepository.save(modelMapper.dtoToEntity(cartao));
    }
}
