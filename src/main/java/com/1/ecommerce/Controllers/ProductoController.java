package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.ProductoEntity;
import com.grupo1.esenciasspring.Services.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    ProductoServiceImpl productoService;

    @GetMapping("/{nombre}")
    public ResponseEntity<ProductoEntity> buscarProductoPorNombre(@PathVariable String nombre) {
        return ResponseEntity.ok(productoService.buscarProductoPorNombre(nombre));
    }


    @GetMapping("/lista")
    public List<ProductoEntity> ListaProductos(){
        return productoService.obtenerProductos();
    }


    @PostMapping("/nuevo")
    public ResponseEntity<String> crearNuevoProducto(@RequestBody ProductoEntity nuevoProducto) {
        productoService.crearNuevoProducto(nuevoProducto);
        return ResponseEntity.ok("Producto creado exitosamente!");
    }

    @PutMapping ("editar/{íd}")
    public ResponseEntity<ProductoEntity> editarProductoPorId(@PathVariable Integer producto_id, @RequestBody ProductoEntity productoEditar)
    {return ResponseEntity.ok(productoService.editarProductoPorId(producto_id, productoEditar));}

    @GetMapping("obtener/{producto_id}")
    private ResponseEntity<ProductoEntity> obtenerProductoPorId(@PathVariable("producto_id") Integer producto_id) {
        Optional<ProductoEntity> productoElegido = productoService.ObtenerProductoPorId(producto_id);
        return ResponseEntity.ok(productoElegido.get());
    }
    @DeleteMapping("borrar/{producto_id}")
    public ResponseEntity<String> borrarProductoPorId(@PathVariable("producto_id") Integer producto_id) {
        productoService.borrarProductoPorId(producto_id);
        return ResponseEntity.ok("Producto eliminado exitosamente!");
    }

}
