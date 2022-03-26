package br.deveinhome.agendador.request;

import br.deveinhome.agendador.model.Cliente;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class AgendaRequest {

    private Cliente cliente;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dateTime;

}
