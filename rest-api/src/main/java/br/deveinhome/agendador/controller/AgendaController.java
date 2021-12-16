package br.deveinhome.agendador.controller;

import br.deveinhome.agendador.request.ClienteRequest;
import br.deveinhome.agendador.response.ClienteResponse;
import br.deveinhome.agendador.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/agendador/v1/agendas")
public class AgendaController {
    private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);

    @Autowired
    private ClienteService clienteService;


    @PostMapping(path = "/cliente")
    public ResponseEntity<Object> cliente(@RequestBody ClienteRequest request) {
        ClienteResponse response = clienteService.incluir(request);
        if (response != null && response.getCliente() != null)
            return ResponseEntity.ok().body(response);

        return ResponseEntity.badRequest().body(response);

    }
}
