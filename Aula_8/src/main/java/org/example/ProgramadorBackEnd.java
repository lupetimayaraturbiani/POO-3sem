package org.example;

public class ProgramadorBackEnd extends Programador{
    @Override
    public int getSalario(){
        return super.getSalario() + 1000;
    }

    @Override
    public void tipoContrato() {
        System.out.println("PJ");
    }

    @Override
    public void descricao(){
        System.out.println("Programador Back-End");
        System.out.println("Implementa sistemas para WEB");
    }
}
