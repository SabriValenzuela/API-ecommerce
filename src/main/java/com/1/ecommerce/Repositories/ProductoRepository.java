package com.grupo1.esenciasspring.Repositories;

import com.grupo1.esenciasspring.Entities.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {

//JPQL - Java Persistence Query Language
    @Query(value = "SELECT * FROM producto p WHERE p.producto_nombre LIKE ?1", nativeQuery = true)
    ProductoEntity buscarProductoPorNombre(String nombre);


}
