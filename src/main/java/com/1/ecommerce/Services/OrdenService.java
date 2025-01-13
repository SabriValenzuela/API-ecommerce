package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.OrdenEntity;

import java.util.List;

public interface OrdenService {
List<OrdenEntity> obtenerOrden();
OrdenEntity crearNuevaOrden(OrdenEntity nuevaOrden);
OrdenEntity editarOrdenPorId(Integer orden_id, OrdenEntity ordenEntity);
void borrarOrdenPorId(Integer orden_id);


}
