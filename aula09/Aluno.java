/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author luiz.mazanha
 */
public class Aluno extends Pessoa {
    
    private enum Avaliacoes {
        naoAvaliado,
        aprovado,
        reprovado
    }
    
    Avaliacoes avaliacao;
    
    public Aluno(String nome, int idade) {
        super(nome, idade, Acessos.areasDeEnsino);
        this.avaliacao = Avaliacoes.naoAvaliado;
    }
    
    public void avaliar( int nota ){
        if( nota >= 6 ){
            avaliacao = Avaliacoes.aprovado;
        } else {
            avaliacao = Avaliacoes.reprovado;
        }
    }
    
    public void mostraAvaliacao(){
        System.out.println(avaliacao);
    }
    
}
