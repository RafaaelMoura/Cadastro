package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotação controladora Controladora
@RequestMapping //Anotação onde se coloca as rotas
public class NinjaController {

    @GetMapping("/boasVindas")//Ele busca a mensagem de que está no metodo "boasvindas" e apresenta no local "Mapeando"
    public String boasvindas(){
        return "Testando";
    }

}
