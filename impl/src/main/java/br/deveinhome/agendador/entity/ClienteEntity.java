package br.deveinhome.agendador.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany
    private List<ConsultaEntity> consultas;
}
