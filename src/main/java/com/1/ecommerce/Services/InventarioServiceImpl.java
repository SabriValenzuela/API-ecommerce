package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.InventarioEntity;
import com.grupo1.esenciasspring.Repositories.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioServiceImpl implements InventarioService{
    @Autowired
    InventarioRepository inventarioRepository;
    @Override
    public List<InventarioEntity> obtenerInventario() {
        List<InventarioEntity> ListaInventario = inventarioRepository.findAll();
        return ListaInventario;
    }

    @Override
    public InventarioEntity crearNuevoInventario(InventarioEntity nuevoInventario) {
        InventarioEntity inventarionuevo = inventarioRepository.save(nuevoInventario);
        return inventarionuevo;
    }


    @Override
    public void borrarInventario(Integer inventario_total) {inventarioRepository.deleteAll();}

    }

