package br.devinhome.agendador.response;

import br.devinhome.agendador.model.Cliente;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class ClienteResponse implements Serializable {

    @JacksonXmlElementWrapper(useWrapping = false)
    @JsonProperty("cliente")
    private List<Cliente> clientes;


}
