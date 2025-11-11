package com.example.demo.Missoes;
                            //EXPLICAÇÃO ESTÁ PASTA NINJA//
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

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

    //Listar missão pot id
    public MissoesModel missaoPorId(Long id){
        Optional<MissoesModel> missaoId = missoesRepository.findById(id);
        return missaoId.orElse(null);
    }

    //Criar um novo missao
    public MissoesModel criarMissao(MissoesModel newMission){
        return missoesRepository.save(newMission);
    }

    //Deletar um cadastro missao pelo ID
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    //Alterar um cadastro
    public MissoesModel alterarMissao (Long  id, MissoesModel missaoAlterada){
        if (missoesRepository.existsById(id)){
            missaoAlterada.setId(id);
            return missoesRepository.save(missaoAlterada);

        }
        return null;
    }

}
