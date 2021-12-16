package br.deveinhome.agendador.request;

import br.deveinhome.agendador.model.Cliente;
import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteRequest implements Serializable {

    private Cliente cliente;

}
