package com.example.demo.Ninjas;

import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service // Usa-se na classe service
public class NinjaService {

    //Conecta a classe com o service, para conectar com os mapp
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper; // Metodo instaciado após ligações da classe DTO com Mapper

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
        this.ninjaRepository = ninjaRepository;//Boa pratica uso do construtor sem usar anotacoes no modelo service
    }


    //Lista todos os ninjas
    public List<NinjaDTO> listarNinjas(){
        List<NinjaModel> ninjas = ninjaRepository.findAll();

        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());

    }

    //Listar ninjas pot id
    public NinjaDTO listarNinjaPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);  //Optional: usado para caso o id buscado não exista - findById: vem da classe NinjaRepositorio-
                return ninjaPorId.map(ninjaMapper::map).orElse(null); //orElse:usado para trazer o id buscado ou caso não exista-                // que está extendendo o JPA
                                                        // retorna o null.
    }

    //Criar um novo ninja
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
       NinjaModel ninja = ninjaMapper.map(ninjaDTO);
       ninja =  ninjaRepository.save(ninja);
       return ninjaMapper.map(ninja);
    }


    //Deletar um cadastro ninja pelo ID
    public void deletarNinjaPorId(Long id){ //Delete é instaciado como "void" pois não tem retorno algum de dado, ele apenas deleta por isso é simples
       ninjaRepository.deleteById(id);
    }



    //Alterar um cadastro
    public NinjaDTO ninjaAtualizar (Long id, NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id); //Primeiro ele busca o id (Long id)
        if (ninjaExistente.isPresent()){ //esse metodo pergunta se o id inserido existe, se sim...
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO); //Faz o mapeamento no DTO e...
            ninjaAtualizado.setId(id); //fazer a edção do id e tbm...
            NinjaModel ninjaSavo = ninjaRepository.save(ninjaAtualizado); // atualizar a edção no model
            return  ninjaMapper.map(ninjaSavo); // vai retorna o ninja que foi salvo
        }
        return null; // se n~çao tiver nada, retorna "null"
    }

}
