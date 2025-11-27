package com.poyer.cuidamais.ads.controller;

import org.springframework.web.bind.annotation.*;
import com.poyer.cuidamais.model.Consulta;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @PostMapping("/nova")
    public String agendarConsulta(@RequestBody Consulta novaConsulta) {
        return "Consulta agendada com sucesso para: " + novaConsulta.getDataHora();
    }
}
