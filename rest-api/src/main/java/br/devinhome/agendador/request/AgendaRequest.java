package br.devinhome.agendador.request;

import br.devinhome.agendador.model.Cliente;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class AgendaRequest {

    private Cliente cliente;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

}
