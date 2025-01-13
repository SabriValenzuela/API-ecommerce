package com.grupo1.esenciasspring.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "imagenes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ImagenesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer imagen_id;
    private String imagen_ruta;
    private Integer producto_id;
    private Integer blog_id;
}
