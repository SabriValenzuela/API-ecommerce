package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<BlogEntity, Long> {

}
