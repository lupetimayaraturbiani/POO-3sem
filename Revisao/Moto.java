/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author luiz.mazanha
 */
public abstract class Moto implements Veiculo {
    public static int numeroDeMotos = 0;
    Moto(){
        numeroDeMotos++;
    }
    
    @Override
    public int getNumeroDeRodas() {
        return 2;
    }
    
    public abstract void daGrau();
}
