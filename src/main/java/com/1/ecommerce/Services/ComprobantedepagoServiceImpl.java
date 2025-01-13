package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.ComprobantedepagoEntity;
import com.grupo1.esenciasspring.Repositories.ComprobantedepagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComprobantedepagoServiceImpl implements ComprobantedepagoService {
    @Autowired
    private ComprobantedepagoRepository comprobantedepagoRepository;

    @Override
    public List<ComprobantedepagoEntity> obtenerComprobantedepago() {
        List<ComprobantedepagoEntity> listaComprobantedepago = comprobantedepagoRepository.findAll();
        return listaComprobantedepago;
    }

    @Override
    public Optional<ComprobantedepagoEntity> obtenerComprobantedepagoPorId(Integer id) {
        Optional<ComprobantedepagoEntity> comprobantedepagoElegido = comprobantedepagoRepository.findById(id);
        return comprobantedepagoElegido;
    }

    @Override
    public ComprobantedepagoEntity guardarComprobantedepago(ComprobantedepagoEntity comprobantedepagoEntity){
        ComprobantedepagoEntity nuevoComprobante = comprobantedepagoRepository.save(comprobantedepagoEntity);
        return  nuevoComprobante;
    }

    @Override
    public void borrarComprobantedepagoPorId(Integer id) {comprobantedepagoRepository.deleteById(id);}

    @Override
    public ComprobantedepagoEntity editarComprobantedepagoPorId(Integer comprobantedepagoId, ComprobantedepagoEntity comprobantedepagoEditar){

        Boolean existe = comprobantedepagoRepository.existsById(comprobantedepagoId);
        if (existe) {
            ComprobantedepagoEntity comprobantedepagoSeleccionado = comprobantedepagoRepository.findById(comprobantedepagoId).get();
            comprobantedepagoSeleccionado.setOrden_id(comprobantedepagoEditar.getOrden_id());
            comprobantedepagoSeleccionado.setComprobante_id(comprobantedepagoEditar.getComprobante_id());
            comprobantedepagoSeleccionado.setComprobante_sumatotal(comprobantedepagoEditar.getComprobante_sumatotal());
            return comprobantedepagoRepository.save(comprobantedepagoSeleccionado);
        }
        return null;
    }
}
