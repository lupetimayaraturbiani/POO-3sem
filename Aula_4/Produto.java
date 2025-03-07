/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author luiz.mazanha
 */
public class Produto {
    
    private String nome;
    private double preco;
    private int id;
    private int quantidade;

    public Produto(String nome, double preco, int id, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " - " + 
                quantidade + " x R$" + 
                String.format("%.2f",preco) + " = R$" + 
                String.format("%.2f",getValorTotal());
    }
    
    public double getValorTotal(){
        return preco * quantidade;
    }

    

    
    
    
    
    //--SETTERS E GETTERS
    //-----------------------
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
