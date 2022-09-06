package br.devinhome.agendador.request;

import br.devinhome.agendador.model.Cliente;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteRequest implements Serializable {

    private Cliente cliente;

}
