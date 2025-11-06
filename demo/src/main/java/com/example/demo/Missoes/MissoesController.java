package com.example.demo.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //GET -> Manda uma requisição para MOSTRAR as missões
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missões listadas com sucesso";
    }

    //POST -> Manda uma requisição para CRIAR as missões
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso";
    }

    //PUT -> Manda uma requisição para ALTERAR as missões
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    //DELETE -> Manda uma requisição para DELETAR as missões
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão deletada com sucesso";
    }

}
