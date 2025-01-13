package com.grupo1.esenciasspring.Controllers;

import com.grupo1.esenciasspring.Entities.BlogEntity;
import com.grupo1.esenciasspring.Services.BlogService;
import com.grupo1.esenciasspring.Services.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/blog")


public class BlogController {
    @Autowired
    BlogServiceImpl blogService;

    @PostMapping("/nuevo")
    public ResponseEntity<String> crearPost(@RequestBody BlogEntity textoBlog) {
        blogService.crearPost(textoBlog);
        return ResponseEntity.ok("Producto creado exitosamente!");
    }
    @GetMapping("/obtener")
    public List<BlogEntity> obtenerPost(){
        return blogService.obtenerPost();}


    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> borrarPostporId (@PathVariable Long id) {

        blogService.borrarPostPorId(id);
        return ResponseEntity.ok("Producto eliminado exitosamente!");
    }




}

