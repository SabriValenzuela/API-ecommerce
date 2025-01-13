package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.ImagenesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImagenesRepository extends JpaRepository<ImagenesEntity, Integer> {
}
