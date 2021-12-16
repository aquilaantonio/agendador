package br.deveinhome.agendador.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClienteRequest implements Serializable {

    private String nome;

}
