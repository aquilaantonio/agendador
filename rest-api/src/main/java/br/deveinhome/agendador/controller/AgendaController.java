package br.deveinhome.agendador.controller;

import br.deveinhome.agendador.request.AgendaRequest;
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

    @Autowired
    private  ClienteService consultaService;

    @PostMapping(path = "/clientes")
    public ResponseEntity<ClienteResponse> cliente(@RequestBody ClienteRequest request) {
        ClienteResponse response = clienteService.incluir(request);
        if (response != null && response.getClientes() != null)
            return ResponseEntity.ok().body(response);

        return ResponseEntity.badRequest().body(response);

    }

    @GetMapping(path = "/clientes")
    public ResponseEntity<ClienteResponse> consultarClintes() {
        ClienteResponse response = clienteService.buscarTodos();

        if (response != null && response.getClientes() != null)
            return ResponseEntity.ok().body(response);

        return ResponseEntity.badRequest().body(response);

    }

    @PostMapping()
    public ResponseEntity<Object> agendar(@RequestBody ClienteRequest request) {
        try {

            consultaService.incluir(request);
            return ResponseEntity.ok().body("Sucesso");

        } catch (Exception e) {

            return ResponseEntity.badRequest().body(e.getMessage());
        }


    }


}
