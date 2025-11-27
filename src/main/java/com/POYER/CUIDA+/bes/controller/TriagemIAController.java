package com.poyer.cuidamais.bes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/servicos/ia")
public class TriagemIAController {

    @PostMapping("/analisar")
    public String analisarSintomas(@RequestBody String sintomas) {
        
        return "Sugestão da IA: Clínico Geral (Aviso: Não substitui médico)";
    }
}
