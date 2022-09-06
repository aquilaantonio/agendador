package br.devinhome.agendador.repository;

import br.devinhome.agendador.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<ClienteEntity, Long> {
}
