package com.app.web.repositorio;

import com.app.web.entidad.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NotasRepositorio extends JpaRepository<Nota,Long>{
    
}
