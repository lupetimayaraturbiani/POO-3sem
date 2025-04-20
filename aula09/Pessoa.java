/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author luiz.mazanha
 */
public abstract class Pessoa {
    
    public enum Acessos {
        areasDeEnsino,
        areasAdministrativas,
        completo
    }
    
    private String nome;
    private int idade;
    private Acessos acesso;

    public Pessoa(String nome, int idade, Acessos acesso) {
        this.nome = nome;
        this.idade = idade;
        this.acesso = acesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Acessos getAcesso() {
        return acesso;
    }

    public void setAcesso(Acessos acesso) {
        this.acesso = acesso;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", acesso=" + acesso + '}';
    }
    
    
    
    
    
}
