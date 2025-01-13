package com.grupo1.esenciasspring.Services;

import com.grupo1.esenciasspring.Entities.BlogEntity;
import com.grupo1.esenciasspring.Repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public List<BlogEntity> obtenerPost () {
        List<BlogEntity> listaBlog = blogRepository.findAll();
        return listaBlog;
    }
    /*@Override
    public Optional <BlogEntity> obtenerPostPorId(Long id){
        Optional<BlogEntity> postElegido = blogRepository.findById(id);
        return postElegido;
    }*/

    @Override
    public BlogEntity crearPost (BlogEntity blogEntity) {
        BlogEntity nuevoPost = blogRepository.save(blogEntity);
        return nuevoPost;
    }

    @Override
    public void borrarPostPorId(Long id) {
    blogRepository.deleteById(id);
    }

    @Override
    public BlogEntity editarPostPorId(Long id, BlogEntity blogEntity) {
        return null;
    }



}
