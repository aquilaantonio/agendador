package br.deveinhome.agendador.response;

import br.deveinhome.agendador.model.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ClienteResponse implements Serializable {

    private Cliente cliente;


}
