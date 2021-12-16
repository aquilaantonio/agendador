package br.deveinhome.agendador.controller;

import br.deveinhome.agendador.model.Cliente;
import br.deveinhome.agendador.request.ClienteRequest;
import br.deveinhome.agendador.response.ClienteResponse;
import br.deveinhome.agendador.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@CrossOrigin("*")
@RestController
@RequestMapping("/agendador/v1/agendas")
public class AgendaController {
    private static final Logger logger = LoggerFactory.getLogger(AgendaController.class);

    @Autowired
    private ClienteService clienteService;


    @PostMapping(path = "/clientes")
    public ResponseEntity<Object> cliente(@RequestBody ClienteRequest request) {
        ClienteResponse response = clienteService.incluir(request);
        if (response != null && response.getClientes() != null)
            return ResponseEntity.ok().body(response);

        return ResponseEntity.badRequest().body(response);

    }

   @GetMapping(path = "/clientes")
    public ResponseEntity<Object> consultarClintes() {
        ClienteResponse response = clienteService.buscarTodos();

        if (response != null && response.getClientes() != null)
            return ResponseEntity.ok().body(response);

        return ResponseEntity.badRequest().body(response);


    }
    
}
