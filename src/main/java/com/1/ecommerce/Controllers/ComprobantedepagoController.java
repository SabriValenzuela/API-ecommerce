package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.ComprobantedepagoEntity;
import com.grupo1.esenciasspring.Services.ComprobantedepagoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/comprobantedepago")
public class ComprobantedepagoController {
    @Autowired
    ComprobantedepagoServiceImpl comprobantedepagoService;


    @GetMapping("comprobantedepago/{id}")
    private ResponseEntity<ComprobantedepagoEntity> obtenerComprobantedepagoPorId(@PathVariable("id") Integer id){
        Optional<ComprobantedepagoEntity> comprobantedepagoElegido = comprobantedepagoService.obtenerComprobantedepagoPorId(id);
        return ResponseEntity.ok(comprobantedepagoElegido.get());
    }

    @GetMapping("lista")
    public List<ComprobantedepagoEntity> obtenerComprobantedePago () {
        return comprobantedepagoService.obtenerComprobantedepago();
    }

    @PostMapping("nuevo")
    public ResponseEntity<ComprobantedepagoEntity> guardarNuevoComprobantedePago(@RequestBody ComprobantedepagoEntity comprobantedepagoEntity) {
        return ResponseEntity.ok(comprobantedepagoService.guardarComprobantedepago(comprobantedepagoEntity));
    }

    @DeleteMapping("borrar/{id}")
    public void borrarComprobantedepagoPorId(@PathVariable("id")Integer id) {comprobantedepagoService.borrarComprobantedepagoPorId(id);}

    @PutMapping("editar/{id}")
    public ResponseEntity<ComprobantedepagoEntity> editarComprobantedePagoPorId(@PathVariable Integer id, @RequestBody
    ComprobantedepagoEntity comprobantedepagoeditar) {
        return ResponseEntity.ok(comprobantedepagoService.editarComprobantedepagoPorId(id, comprobantedepagoeditar));
    }
}
