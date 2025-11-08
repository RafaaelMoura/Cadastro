package com.example.demo.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Anotação controladora Controladora
@RequestMapping("/ninjas") //Anotação onde se coloca as rotas
public class NinjaController {

    private NinjaService ninjaService; //Injeta a dependencia da classe NinjaService

    public NinjaController(NinjaService ninjaService) { //Como boa pratica, utilize o construtor sem usar anotações, no modelo service
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> mostrarTodosOsNinjas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar ninja por id
    @GetMapping("/listar/{id}") //{id} - significa um pathvariable (caminho da variavel), entende que o usuario tem que implementar uma informação como um numero
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id){ // @PathVariable -  trabalha junto com o {id}
        return ninjaService.listarNinjaPorId(id);
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
