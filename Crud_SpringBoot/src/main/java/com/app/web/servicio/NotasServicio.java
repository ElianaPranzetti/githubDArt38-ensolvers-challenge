package com.app.web.servicio;

import com.app.web.entidad.Nota;
import java.util.List;

public interface NotasServicio {
    
    public List<Nota> listarNotas ();
    
    public Nota guardarNotas(Nota notas);
    
    public Nota obtenerNotas(Long id);

    public Nota actualizarNotas(Nota notas);

    public void eliminarNotas(Long id);
    
}
