package com.cartoes_ms.rest.controller;

import com.cartoes_ms.core.service.CartoesService;
import com.cartoes_ms.rest.dto.CartaoDTO;
import com.cartoes_ms.rest.dto.CartaoResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
public class CartoesController {

    @Autowired
    private CartoesService cartoesService;

    @GetMapping
    public List<CartaoDTO> getCartoes() {
        return cartoesService.findCartoes();
    }

    @GetMapping("/{id}")
    public CartaoDTO getCartoes(@PathVariable("id") Integer cartaoId) {
        return cartoesService.findCartao(cartaoId);
    }

    @PutMapping
    public void alteraDadosCartao(@RequestBody CartaoDTO requestDTO) {
        cartoesService.editarDadosCartao(requestDTO);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CartaoResponseDTO cadastraCartao(@RequestBody CartaoDTO requestDTO) {
        return cartoesService.cadastrarCartao(requestDTO);
    }
}
