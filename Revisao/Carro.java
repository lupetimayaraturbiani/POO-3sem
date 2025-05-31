/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author luiz.mazanha
 */
public class Carro implements Veiculo {

    @Override
    public int getNumeroDeRodas() {
        return 4;
    }

    @Override
    public void fazBarulho() {
        System.out.println("Bibi! Motor roncando.");
    }

    @Override
    public void anda() {
        System.out.println("O carro está andando.");
    }

    @Override
    public void estaciona() {
        System.out.println("Carro estaciona com dificuldade.");
    }

    @Override
    public void limpaParabrisa() {
        System.out.println("Limpando o parabrisa do carro.");
    }
    
    
    
}
