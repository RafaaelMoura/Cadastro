package com.example.demo;

import jakarta.persistence.*;

@Entity //Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
// o Entity trasforma uma classe comum em um bd

@Table(name = "tb_cadastro") //Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
//("tb_cadastro") o *tb é utilizado como boa pratica

public class NinjaModel {

    @Id //Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
    //serve para a tabela ser preenchida conforme vai crescendo

    @GeneratedValue(strategy = GenerationType.IDENTITY)//Utilize essa anotação com a dependencia chamada "Spring JPA" para trabalhar com persistencia
    // usa-se junto com anotaão @Id, e tem o proposito de buscar uma ordem de preenchimento dos id (Ex. id: 1, id: 2, id: 3 ou id: a, id: b, id: c)
    Long id;
    String nome;
    String email;
    int idade;


}
