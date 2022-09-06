package br.devinhome.agendador.model;

import lombok.Data;

import java.util.List;

@Data
public class Cliente {

    private String nome;
    private List<Consulta> consultas;
}
