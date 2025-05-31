/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author luiz.mazanha
 */
public class Honda extends Moto {
    
    Honda(){
        super();
    }
    
    @Override
    public void daGrau() {
        System.out.println("Honda dando grau");
    }

    @Override
    public void fazBarulho() {
        System.out.println("Honda fazendo barulho");
    }

    @Override
    public void anda() {
        System.out.println("Honda está andando");
    }

    @Override
    public void estaciona() {
        System.out.println("Honda é fácil de estacionar");
    }

    @Override
    public void limpaParabrisa() {
        System.out.println("Na verdade o nome é bolha, mas está limpo.");
    }
    
}
