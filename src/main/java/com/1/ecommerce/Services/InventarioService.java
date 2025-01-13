package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.InventarioEntity;

import java.util.List;

public interface InventarioService {
    List<InventarioEntity> obtenerInventario();
    InventarioEntity crearNuevoInventario(InventarioEntity nuevoInventario);

    void borrarInventario(Integer inventario_total);

}
