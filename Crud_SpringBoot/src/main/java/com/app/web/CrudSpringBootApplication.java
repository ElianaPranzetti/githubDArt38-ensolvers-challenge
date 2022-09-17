package com.app.web;


import com.app.web.entidad.Nota;
import com.app.web.repositorio.NotasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
        
    @Autowired
    private NotasRepositorio repositorio;
        
    @Override
    public void run(String... args) throws Exception {
     /* Nota nota1 = new Nota("Java","Springboot");
       repositorio.save(nota1);
       
       Nota nota2 = new Nota("Python","Flask");
       repositorio.save(nota2);
       */
    }

}
