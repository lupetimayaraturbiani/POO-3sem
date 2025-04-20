/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula09;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiz.mazanha
 */
public class Aula09 {

    public static void main(String[] args) {
        
        Pessoa v1 = new Visitante("José", 30);
        System.out.println(v1);
        
        Aluno a1 = new Aluno("Juliano",18);
        System.out.println(a1);
        a1.mostraAvaliacao();
        a1.avaliar(7);
        a1.mostraAvaliacao();
        
        Funcionario f1 = new Funcionario("Maria",25,5000);
        System.out.println(f1);
        
        Produto p1 = new Produto("Material de Limpeza", 100, 1000);
        Produto p2 = new Produto("Canetão", 5000, 10);
        Produto p3 = new Produto("Papel Higiênico", 10000, 20);
        
        Financeiro produto1 = new Produto( "Cadeira", 1000, 200 );
        Financeiro produto2 = new Produto( "Mesa", 10, 400);
        Financeiro produto3 = new Produto( "Canetão", 10, 400);
        Financeiro produto4 = new Produto( "Papel Higienixo", 10, 400);
        Financeiro funcionario1 = new Funcionario("Luiz",32,400);
        Financeiro funcionario2 = new Funcionario("Maria",32,400);
        Financeiro funcionario3 = new Funcionario("Marcio",32,400);
        Financeiro funcionario4 = new Funcionario("Jaqueline",32,400);
        
        List<Financeiro> gastos = new ArrayList();
        System.out.println(gastos);
        gastos.add(produto1);
        gastos.add(produto2);
        gastos.add(produto3);
        gastos.add(produto4);
        gastos.add(funcionario1);
        gastos.add(funcionario2);
        gastos.add(funcionario3);
        gastos.add(funcionario4);
        System.out.println(gastos);
        
        for(Financeiro gasto : gastos){
            gasto.fazPagamento();
        }
        
        
        
        
        
        
        
    }
}
