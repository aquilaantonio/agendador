package br.deveinhome.agendador.service;

import br.deveinhome.agendador.entity.ClienteEntity;
import br.deveinhome.agendador.model.Cliente;
import br.deveinhome.agendador.repository.Clientes;
import br.deveinhome.agendador.request.ClienteRequest;
import br.deveinhome.agendador.response.ClienteResponse;
import lombok.val;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    Logger logger = LoggerFactory.getLogger(ClienteService.class);

    @Autowired
    private Clientes clientes;


    public ClienteResponse incluir(ClienteRequest request) {
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.setNome(request.getNome());

         clienteEntity = clientes.saveAndFlush(clienteEntity);

         Cliente cliente = new Cliente();
         cliente.setNome(clienteEntity.getNome());

        return new ClienteResponse(cliente);
    }
}
