package com.app.web.servicio;

import com.app.web.entidad.Nota;
import com.app.web.repositorio.NotasRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotasServicioImpl implements NotasServicio {
    
    @Autowired
    private NotasRepositorio repositorio;
    
    @Override
    public List<Nota> listarNotas() {
        return repositorio.findAll();
    }
    
    @Override
    public Nota guardarNotas(Nota notas) {
        return repositorio.save(notas);
    }
    
    @Override
    public Nota obtenerNotas(Long id) {
        return repositorio.findById(id).get();
    }
    
    @Override
    public Nota actualizarNotas(Nota notas) {
        return repositorio.save(notas);
    }
    
    @Override
    public void eliminarNotas(Long id) {
        repositorio.deleteById(id);
    }
    
}
