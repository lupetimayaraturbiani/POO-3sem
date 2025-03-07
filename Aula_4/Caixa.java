/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04;

/**
 *
 * @author luiz.mazanha
 */
public class Caixa {
    
    //--OBS: aqui poderíamos utilizar uma lista, mas esse é um conteúdo do final do semestre. 
    //--Trabalhamos com apenas um produto para mostrar o funiconamento da relação entre classes.
    private Produto produto;

    public Caixa(Produto produto) {
        this.produto = produto;
    }
    
    public void mostraValor(){
        System.out.println(produto);
    }
    public void fazCompra(){
        System.out.println( "Compra feita no valor de R$" + 
                            String.format("%.2f",produto.getValorTotal())  );
    }
}
