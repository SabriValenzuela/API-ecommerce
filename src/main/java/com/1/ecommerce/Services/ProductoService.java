package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ProductoEntity;

import java.util.List;
import java.util.Optional;

public interface ProductoService {


    ProductoEntity buscarProductoPorNombre(String nombre);

    List<ProductoEntity> obtenerProductos();

    ProductoEntity crearNuevoProducto(ProductoEntity nuevoProducto);

    ProductoEntity editarProductoPorId (Integer producto_id, ProductoEntity productoEntity);

    Optional<ProductoEntity> ObtenerProductoPorId(Integer producto_id);

    void borrarProductoPorId(Integer producto_id);

}
