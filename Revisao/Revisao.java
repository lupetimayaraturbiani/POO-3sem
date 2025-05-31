/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.revisao;

/**
 *
 * @author luiz.mazanha
 */
public class Revisao {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa( "João", 30 );        
        
        System.out.println(p1.getInfo());
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        System.out.println(p1.getInfo());
        
        Pessoa p2 = new Pessoa( "Maria", 35);
        Pessoa p3 = new Pessoa("Tiago",20);
        Pessoa p4 = new Pessoa("Rafael",45);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
        
        Moto honda = new Honda();
        honda.anda();
        honda.daGrau();
        int rodas = honda.getNumeroDeRodas();
        
        Moto m2 = new Honda();
        Moto m3 = new Susuki();
        Moto m4 = new Susuki();
        
        System.out.println(m2.numeroDeMotos);
    }
}
