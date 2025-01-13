package com.grupo1.esenciasspring.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "blog")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long blog_id;
    @JsonFormat(
            pattern = "dd-MM-yyyy"
    )
    private Date blog_fecha;
    private String blog_titulo;
    @Column(length =3000)
    private String blog_contenido;

    @CreationTimestamp//Indica que el atributo siguiente es una fecha de creación
    private LocalDateTime createdAt;

//    @JsonBackReference
//    @ManyToOne
//    @JoinColumn(name= "usuario_id")
//    private UsuarioEntity usuarioDelBlog;


}
