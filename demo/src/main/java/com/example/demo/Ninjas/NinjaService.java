package com.example.demo.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // Usa-se na classe service
public class NinjaService {

    //Conecta a classe com o service, para conectar com os mapp
    private NinjaRepository ninjaRepository;

    //Boa pratica uso do construtor sem usar anotacoes no modelo service
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }



    //Lista todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar ninjas pot id
    public NinjaModel listarNinjaPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);  //Optional: usado para caso o id buscado não exista - findById: vem da classe NinjaRepositorio-
                return ninjaPorId.orElse(null); //orElse:usado para trazer o id buscado ou caso não exista-                // que está extendendo o JPA
                                                        // retorna o null.
    }

    //Criar um novo ninja
    public NinjaModel adicionarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);

    }

}
