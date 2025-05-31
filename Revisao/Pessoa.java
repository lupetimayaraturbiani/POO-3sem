/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author luiz.mazanha
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    Pessoa( String nome, int idade ){
        this.nome = nome;
        this.idade = idade;
    }

    public void fazAniversario() {
        this.idade += 1;
    }
    
    public String getInfo(){
        return "nome = " + this.nome + " / " +
                "idade = " + this.idade;
    }

    public String getNome() {
        System.out.println("ALERTA: nome sendo modificado.");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if( idade < 0 ){
            idade = 0;
        }
        this.idade = idade;
    }
    
    
}
