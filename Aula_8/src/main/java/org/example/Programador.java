package org.example;

public abstract class Programador extends Profissional {
    private static final int SALARIO_BASE = 2000;


    public int getSalario(){
        return SALARIO_BASE;
    }

    public void fazServico(){
        System.out.println("Programador faz código.");
    }

}
