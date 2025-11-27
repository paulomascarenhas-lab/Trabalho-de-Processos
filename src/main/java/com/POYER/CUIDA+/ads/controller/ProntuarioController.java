package com.poyer.cuidamais.ads.controller;

import org.springframework.web.bind.annotation.*;
import com.poyer.cuidamais.model.RegistroMedico;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/prontuarios")
public class ProntuarioController {

    @PostMapping("/registrar")
    public String adicionarRegistro(@RequestBody RegistroMedico registro) {
        registro.setDataRegistro(LocalDateTime.now())
      
        return "Prontuário salvo. Diagnóstico: " + registro.getDiagnostico();
    }
}
