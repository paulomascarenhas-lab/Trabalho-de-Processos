package com.poyer.cuidamais.bes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/servicos/notificacao")
public class NotificacaoController {

    @PostMapping("/enviar")
    public String enviarNotificacao(@RequestParam String tipo) {
        
        return "Notificação do tipo " + tipo + " enviada.";
    }
}
