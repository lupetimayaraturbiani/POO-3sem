/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author luiz.mazanha
 */
public class ControleDeEstoque {
    
    //--OBS: aqui poderíamos utilizar uma lista, mas esse é um conteúdo do final do semestre. 
    //--Trabalhamos com apenas um produto para mostrar o funiconamento da relação entre classes.
    private ProdutoPerecivel produtoPerecivel;
    
    ControleDeEstoque( ProdutoPerecivel produtoPerecivel ){
        this.produtoPerecivel = produtoPerecivel;
    }
    
    public void verificaEstoque(){
        produtoPerecivel.mostraValidade();
    }
    
}
