package com.example.demo.Missoes;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    private MissaoService missaoService;

    public MissoesController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    //GET -> Manda uma requisição para MOSTRAR as missões
    @GetMapping("/all-missoes")
    public List<MissoesModel> listarMissao(){
        return missaoService.listarMissoes();
    }

    //GET -> Manda uma requisição para MOSTRAR as missões por ID
    @GetMapping("/missoes-id/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id){
        return missaoService.missaoPorId(id);
    }


    //POST -> Manda uma requisição para CRIAR as missões
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missionNew){
        return missaoService.criarMissao(missionNew);
    }

    //PUT -> Manda uma requisição para ALTERAR as missões
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso";
    }

    //DELETE -> Manda uma requisição para DELETAR as missões
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id){
        missaoService.deletarMissao(id);
    }

}
