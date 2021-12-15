package br.deveinhome.agendador.repository;

import br.deveinhome.agendador.entity.ConsultaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Consultas extends JpaRepository<ConsultaEntity,Long> {
}
