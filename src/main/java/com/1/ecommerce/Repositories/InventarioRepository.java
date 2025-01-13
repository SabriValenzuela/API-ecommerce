package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.InventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventarioRepository extends JpaRepository<InventarioEntity, Integer> {
}
