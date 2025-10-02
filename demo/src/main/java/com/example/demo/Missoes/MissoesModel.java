package com.example.demo.Missoes;

import com.example.demo.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //@OneToMany identifica que uma missão tem uma varios ninjas
    @OneToMany(mappedBy = "missoes")
    //Utilize o (mappedBy) toda vez que voce for usar o relacionamento de duas tabelas
    private List<NinjaModel> ninja;
}
