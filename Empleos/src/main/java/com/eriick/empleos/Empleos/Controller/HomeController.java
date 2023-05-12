package com.eriick.empleos.Empleos.Controller;

import com.eriick.empleos.Empleos.Model.Vacante;
import com.eriick.empleos.Empleos.Objetos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/")
    public String MostrarHome(Model model){
        /*
        model.addAttribute("mensaje", "Tania Navarro");
        model.addAttribute("edad", 32);
        model.addAttribute("date", new Date());
        */
        String nombre = "Auxiliar de Desarrollo";
        Date fechaPublica = new Date();
        double salario = 12000.0;
        boolean vigente = true;

        model.addAttribute("nombre", nombre);
        model.addAttribute("date_publica", fechaPublica);
        model.addAttribute("salario", salario);
        model.addAttribute("vigente", vigente);

        return "home";
    }

    @GetMapping("/listado")
    public String mostrarListado(Model model){
        List<String> lista = new LinkedList<String>();
        lista.add("Ingeniero en Sistemas");
        lista.add("Auxiliar de contabilidad");
        lista.add("Vendedor");
        lista.add("Arquitecto");

        model.addAttribute("empleos", lista);
        return "listado";
    }

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model){
        Vacante vacante_element = new Vacante();
        vacante_element.setNombre("Ingeniero de Comunicaciones");
        vacante_element.setDescripcion("Se solicita ingeniro para dar soporte a intranet");
        vacante_element.setFecha(new Date());
        vacante_element.setSalario(12800.0);
        model.addAttribute("vacante",vacante_element);

        return "detalle";
    }

    @GetMapping("/tabla")
    public String mostrarTabla(Model model){
        List<Vacante> lista = Objetos.GetListVacantes();
        model.addAttribute("vacantes",lista);
        return "tabla";
    }

}
