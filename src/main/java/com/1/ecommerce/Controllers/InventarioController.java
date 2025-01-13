package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.InventarioEntity;
import com.grupo1.esenciasspring.Services.InventarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/Inventario")
public class InventarioController {
    @Autowired
    InventarioServiceImpl inventarioService;
    public List<InventarioEntity> ListaInventario() {return inventarioService.obtenerInventario();}

    @PostMapping("/nuevo")
    public ResponseEntity<InventarioEntity> crearNuevoInventario(@RequestBody InventarioEntity nuevoInventario) {
        return ResponseEntity.ok(inventarioService.crearNuevoInventario(nuevoInventario));
    }


    @DeleteMapping("borrar/{inventario_total}")
    public void borrarInventario(@PathVariable("inventario_total") Integer inventario_total) {inventarioService.borrarInventario(inventario_total);}

}
