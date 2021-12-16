package br.deveinhome.agendador.response;

import br.deveinhome.agendador.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class ClienteResponse implements Serializable {

    private List<Cliente> clientes;


}
