package br.devinhome.agendador.repository;

import br.devinhome.agendador.entity.ConsultaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Consultas extends JpaRepository<ConsultaEntity,Long> {
}
