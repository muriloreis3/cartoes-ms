package com.cartoes_ms.rest.controller;


import com.cartoes_ms.core.service.ContaService;
import com.cartoes_ms.rest.dto.ContaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public List<ContaDTO> getContas() {
        return contaService.findContas();
    }

    @GetMapping("/{id}")
    public ContaDTO getConta(@PathVariable("id") Integer contaId) {
        return contaService.findConta(contaId);
    }

    @PutMapping
    public void alteraDadosConta(@RequestBody ContaDTO requestDTO) {
        contaService.editarDadosConta(requestDTO);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void abrirConta(@RequestBody ContaDTO requestDTO) {
        contaService.abrirConta(requestDTO);
    }
}
