package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.OrdenEntity;
import com.grupo1.esenciasspring.Repositories.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenServiceImpl implements OrdenService{
    @Autowired
    OrdenRepository ordenRepository;

    @Override
    public List<OrdenEntity> obtenerOrden() {
        List<OrdenEntity> ListaOrden = ordenRepository.findAll();
        return ListaOrden;
    }

    @Override
    public OrdenEntity crearNuevaOrden(OrdenEntity nuevaOrden) {
        OrdenEntity ordenNueva = ordenRepository.save(nuevaOrden);
        return ordenNueva;
    }

    @Override
    public OrdenEntity editarOrdenPorId(Integer orden_id, OrdenEntity ordenEditar) {
        Boolean existe = ordenRepository.existsById(orden_id);
        if (existe) {
            OrdenEntity ordenSeleccionada = ordenRepository.findById(orden_id).get();
            ordenSeleccionada.setOrden_cantidaddeproducto(ordenEditar.getOrden_cantidaddeproducto());
            ordenSeleccionada.setOrden_fecha(ordenEditar.getOrden_fecha());
            return ordenRepository.save(ordenSeleccionada);
        }
        return null;
    }

    @Override
    public void borrarOrdenPorId(Integer orden_id) {ordenRepository.deleteById(orden_id);}
}
