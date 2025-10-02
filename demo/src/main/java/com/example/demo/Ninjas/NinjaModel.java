package com.example.demo.Ninjas;

import com.example.demo.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
// o Entity trasforma uma classe comum em um bd

@Table(name = "tb_cadastro") //Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
//("tb_cadastro") o *tb é utilizado como boa pratica

@Data //Anotação utilizar os Getters e Setters (Utilize a dependencia Lombok)
@NoArgsConstructor // Anotação utilizar construtor sem argumento nenhum (Utilize a dependencia Lombok)
@AllArgsConstructor // Anotação utilizar construtor com todos os argumento (Utilize a dependencia Lombok)

public class NinjaModel {

    @Id //Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
    //serve para a tabela ser preenchida conforme vai crescendo

    @GeneratedValue(strategy = GenerationType.IDENTITY)//Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
    // usa-se junto com anotaão @Id, e tem o proposito de buscar uma ordem de preenchimento dos id (Ex. id: 1, id: 2, id: 3 ou id: a, id: b, id: c)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @JoinColumn(name = "missoes_id") //Junta as duas caracteristicas (Missoes_id - Foreing key ou chave estrageira)
    @ManyToOne //@ManyToOne identifica que um ninja tem uma unica missão
    private MissoesModel missoes;


}
