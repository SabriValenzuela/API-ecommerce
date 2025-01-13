package com.grupo1.esenciasspring.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Entity
@Table(name = "inventario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class InventarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventario_total;
    private Integer producto_id;
    private Integer producto_cantidad;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "ProductoDelInventario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<ProductoEntity> productosdelinventario;
//
//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name = "usuario_id")
//    private UsuarioEntity usuarioInventario;
}
