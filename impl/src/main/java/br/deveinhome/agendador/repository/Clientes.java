package br.deveinhome.agendador.repository;

import br.deveinhome.agendador.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<ClienteEntity, Long> {
}
