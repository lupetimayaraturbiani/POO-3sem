/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author luiz.mazanha
 */
public class ProdutoPerecivel extends Produto {
    
    private int dia;
    private int validade;

    public ProdutoPerecivel(int dia, int validade, String nome, double preco, int id, int quantidade) {
        super(nome, preco, id, quantidade);
        this.dia = dia;
        this.validade = validade;
    }
    
    private boolean isValido(){
        return validade > dia;
    }
    
    @Override
    public double getValorTotal(){
        if( isValido() ){
            return super.getValorTotal();
        } else {
            return 0;
        }
    }
    
    @Override
    public String toString(){
        if( isValido() ){
            return super.toString();
        } else {
            return "";
        }
    }
    
    
    public void mostraValidade(){
        if( isValido() ){
            System.out.println(getNome() + " - Produto dentro da validade.");
        } else {
            System.out.println(getNome() + " - Produto vencido.");
        }
    }
    
}
