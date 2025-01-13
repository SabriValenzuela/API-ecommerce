package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.BlogEntity;

import java.util.List;
import java.util.Optional;

public interface BlogService {

    List<BlogEntity> obtenerPost();

    //<BlogEntity> obtenerPostPorId(Long id);

    BlogEntity crearPost(BlogEntity blogEntity);

    void borrarPostPorId(Long id);

    BlogEntity editarPostPorId(Long id, BlogEntity blogEntity);
}