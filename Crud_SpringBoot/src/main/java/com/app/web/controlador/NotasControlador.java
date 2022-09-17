package com.app.web.controlador;

import com.app.web.entidad.Nota;
import com.app.web.servicio.NotasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class NotasControlador {

    @Autowired
    private NotasServicio servicio;

    @GetMapping({"/notas", "/"})
    public String listarNotas(Model modelo) {
        modelo.addAttribute("notas", servicio.listarNotas());
        return "notas";
    }

    @GetMapping("/notas/nuevo")
    public String mostrarNotaFormulario(Model modelo) {
        Nota notas = new Nota();
        modelo.addAttribute("notas", notas);
        return "crear_notas";
    }

    @PostMapping("/notas")
    public String guardarNotas(Nota notas) {
        servicio.guardarNotas(notas);
        return "redirect:/notas";
    }

    @GetMapping("/notas/editar/{id}")
    public String mostrarFormulario(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("notas", servicio.obtenerNotas(id));
        return "editar_notas";
    }

    @PostMapping("/notas/{id}")
    public String actualizarNotas(@PathVariable Long id, @ModelAttribute("notas") Nota notas, Model modelo) {
        Nota notaExistente = servicio.obtenerNotas(id);
        notaExistente.setId(id);
        notaExistente.setTitulo(notas.getTitulo());
        notaExistente.setContenido(notas.getContenido());

        servicio.actualizarNotas(notaExistente);
        return "redirect:/notas";
    }

    @GetMapping("/notas/{id}")
    public String eliminarNota(@PathVariable Long id) {
        servicio.eliminarNotas(id);
        return "redirect:/notas";
    }
}
