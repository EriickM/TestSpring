package com.eriick.test.PruebaApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {
    @GetMapping("/")
    public String incio(){
        return "Hola Mundo";
    }
}
