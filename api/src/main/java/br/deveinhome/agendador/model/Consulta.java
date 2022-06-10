package br.devinhome.agendador.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Consulta {

    private Cliente cliente;
    private LocalDateTime dataHora;
    private BigDecimal valor;
    private boolean realizado;
}
