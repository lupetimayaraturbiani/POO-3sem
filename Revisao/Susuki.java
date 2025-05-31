/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author luiz.mazanha
 */
public class Susuki extends Moto {
    
    Susuki(){
        super();
    }
    
    @Override
    public void daGrau() {
        System.out.println("Susuki empinando.");
    }

    @Override
    public void fazBarulho() {
        System.out.println("Susuki fazendo barulho");
    }

    @Override
    public void anda() {
        System.out.println("Susiki está andando.");
    }

    @Override
    public void estaciona() {
        System.out.println("Susuki estaciona com facilidade.");
    }

    @Override
    public void limpaParabrisa() {
        System.out.println("Susuki limpa parabrisa.");
    }
    
}
