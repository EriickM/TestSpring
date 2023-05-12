package com.eriick.empleos.Empleos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.thymeleaf.model.IModel;

@Controller
public class VacanteController {
    @GetMapping("/view/{id}")
    public String verDetaller(@PathVariable("id") int idVacante, Model model){
        System.out.println("IdVacante"+idVacante);
        model.addAttribute("idVacante",idVacante);
        
        return "vacantes/detalle";
    }
}
