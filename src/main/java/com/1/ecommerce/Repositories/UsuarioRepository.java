package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
