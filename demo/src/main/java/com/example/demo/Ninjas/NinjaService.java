package com.example.demo.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

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

}
