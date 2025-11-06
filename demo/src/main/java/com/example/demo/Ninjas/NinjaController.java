package com.example.demo.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController //Anotação controladora Controladora
@RequestMapping //Anotação onde se coloca as rotas
public class NinjaController {

    @GetMapping("/boasVindas")//Ele busca a mensagem de que está no metodo "boasvindas" e apresenta no local "Mapeando"
    public String boasvindas(){
        return "Testando";
    }


    //Adicionar Ninja
    @PostMapping("/criar")
    public String adicionarNinja(){
        return "Adicionar um Ninja";
    }

    //Mostrar todos os ninjas
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar Ninja";
    }

    //Mostrar ninja por id
    @GetMapping("/id-ninja")
    public String mostrarNinjaPorId(){
        return "Mostrar Ninja Por Id";
    }

    //Alterar dados do ninja
    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
        return "Alterar Ninja Por Id";
    }

    //Deletar Ninja
    @DeleteMapping("/deletar")
    public String deletarNinja(){
        return "Deletar Ninja Por Id";
    }

}
