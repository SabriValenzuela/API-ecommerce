package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CLienteRepository extends JpaRepository<ClienteEntity, Integer> {

}
