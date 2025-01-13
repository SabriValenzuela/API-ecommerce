package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.OrdenEntity;
import com.grupo1.esenciasspring.Services.OrdenServiceImpl;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/Orden")
public class OrdenController {
    @Autowired
    OrdenServiceImpl ordenService;
    @GetMapping("/lista")
    public List<OrdenEntity> ListaOrden(){return ordenService.obtenerOrden();}

    @PostMapping("/nuevo")
    public ResponseEntity<OrdenEntity> crearNuevaOrden(@RequestBody OrdenEntity nuevaOrden){
        return ResponseEntity.ok(ordenService.crearNuevaOrden((nuevaOrden)));
    }
    @PutMapping("editar/{id}")
    public ResponseEntity<OrdenEntity> editarOrdenPorId(@PathVariable Integer orden_id, @RequestBody OrdenEntity ordenEditar)
    {return ResponseEntity.ok(ordenService.editarOrdenPorId((orden_id), ordenEditar));}

    @DeleteMapping("borrar/{orden_id}")
    public void borrarOrdenPorId(@PathVariable("orden_id") Integer orden_id)
    {ordenService.borrarOrdenPorId(orden_id);}
}
