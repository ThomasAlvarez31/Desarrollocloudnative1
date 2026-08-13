package com.example.holamundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class HolaMundoV1Controller {
    @GetMapping
    public String holamundo(){
        return "Hola mundo v1.0.0";
    }
    @PostMapping
    public String despedida (){
        return "despedida ";
    }

}
