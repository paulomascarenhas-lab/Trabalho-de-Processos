package com.poyer.cuidamais.ads.controller;

import org.springframework.web.bind.annotation.*;
import com.poyer.cuidamais.model.Pagamento;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {

    @PostMapping("/processar")
    public String processarPagamento(@RequestBody Pagamento pagamento) {
        
        return "Pagamento de R$ " + pagamento.getValor() + " processado.";
    }
}
