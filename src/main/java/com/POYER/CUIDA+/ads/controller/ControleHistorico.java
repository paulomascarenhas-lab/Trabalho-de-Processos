package com.poyer.cuidamais.ads.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/pacientes")
public class HistoricoController {

    @GetMapping("/{idPaciente}/historico")
    public List<String> visualizarHistorico(@PathVariable Integer idPaciente) {
       
        List<String> historico = new ArrayList<>();
        historico.add("Consulta Cardiologista - Realizada");
        return historico;
    }
}
