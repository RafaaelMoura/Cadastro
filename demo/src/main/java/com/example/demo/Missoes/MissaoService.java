package com.example.demo.Missoes;
                            //EXPLICAÇÃO ESTÁ PASTA NINJA//
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissaoService {

    private MissoesRepository missoesRepository;

    public MissaoService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }


    //Lista todos os ninjas
    public List<MissoesModel> listarMissoes(){
        return missoesRepository.findAll();
    }

    //Listar ninjas pot id

    //Criar um novo ninja

    //Deletar um cadastro ninja pelo ID

    //Alterar um cadastro

}
