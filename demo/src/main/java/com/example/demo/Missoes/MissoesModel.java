package com.example.demo.Missoes;

import com.example.demo.Ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

@Data //Anotação utilizar os Getters e Setters (Utilize a dependencia Lombok)
@NoArgsConstructor // Anotação utilizar construtor sem argumento nenhum (Utilize a dependencia Lombok)
@AllArgsConstructor // Anotação utilizar construtor com todos os argumento (Utilize a dependencia Lombok)
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany identifica que uma missão tem uma varios ninjas
    @OneToMany(mappedBy = "missoes")
    //Utilize o (mappedBy) toda vez que voce for usar o relacionamento de duas tabelas
    @JsonIgnore //Ele ignora a serealização.
    private List<NinjaModel> ninja;
}
