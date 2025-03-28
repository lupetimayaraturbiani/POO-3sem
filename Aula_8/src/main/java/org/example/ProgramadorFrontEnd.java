package org.example;

public class ProgramadorFrontEnd extends Programador{

    @Override
    public int getSalario() {
        return super.getSalario() + 800;
    }

    @Override
    public void descricao() {
        System.out.println("Programador Front-End");
        System.out.println("Implementa sistemas para WEB");
    }

    @Override
    public void tipoContrato() {
        System.out.println("CLT");
    }
}
