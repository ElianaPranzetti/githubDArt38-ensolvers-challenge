package com.app.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nota")
public class Nota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;
    
    @Column(name = "contenido", nullable = false, length = 500)
    private String contenido;
    
    public Nota(){
         
     }
     
    public Nota(Long id,String titulo,String contenido){
        super();
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
       
    }
    
    
     public Nota(String titulo,String contenido ){
        super();
        this.titulo = titulo;
        this.contenido = contenido;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

  

    @Override
    public String toString() {
        return "Notas{" + "id=" + id + ", titulo=" + titulo + ", contenido=" + contenido +  '}';
    }
    
    
}
