package br.devinhome.agendador.service;

import br.devinhome.agendador.entity.ClienteEntity;
import br.devinhome.agendador.model.Cliente;
import br.devinhome.agendador.repository.Clientes;
import br.devinhome.agendador.request.ClienteRequest;
import br.devinhome.agendador.response.ClienteResponse;
import lombok.val;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClienteService {
    Logger logger = LoggerFactory.getLogger(ClienteService.class);

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private Clientes clientes;


    public ClienteResponse incluir(ClienteRequest request) {
        ClienteEntity clienteEntity = toEntity(request.getCliente());

         clienteEntity = clientes.saveAndFlush(clienteEntity);

         Cliente cliente = toModel(clienteEntity);

        return new ClienteResponse(Arrays.asList(cliente));
    }

    private Cliente toModel(ClienteEntity clienteEntity) {
        return modelMapper.map(clienteEntity,Cliente.class);
    }

    private ClienteEntity toEntity(Cliente cliente) {
        return modelMapper.map(cliente,ClienteEntity.class);
    }

    public ClienteResponse buscarTodos() {
        List<Cliente> clienteList =new ArrayList<>();
                     clientes.findAll().forEach(clienteEntity -> clienteList.add(toModel(clienteEntity)));

        return new ClienteResponse(clienteList);
    }
}
