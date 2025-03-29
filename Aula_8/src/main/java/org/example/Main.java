package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println(Math.PI);
        System.out.println(Matematica.PI);

        System.out.println(Math.pow(2,3));
        System.out.println(Matematica.pow(2,3));
         */

        //Factory Method
        //Método de Fábrica
        System.out.println(Profissional.populacao);
        Profissional p1 = Profissional.CriaProfissioanal(ListaProfissionais.programadorFrontEnd);
        System.out.println(p1.populacao);
        Profissional p2 = Profissional.CriaProfissioanal(ListaProfissionais.programadorBackEnd);
        Profissional p3 = Profissional.CriaProfissioanal(ListaProfissionais.engenheiroCivil);
        Profissional p4 = Profissional.CriaProfissioanal(ListaProfissionais.engenheiroDados);
        Profissional p5 = Profissional.CriaProfissioanal(ListaProfissionais.engenheiroQuimico);
        Profissional p6 = Profissional.CriaProfissioanal(ListaProfissionais.engenheiroEletricista);
        Profissional p7 = Profissional.CriaProfissioanal(ListaProfissionais.engenheiroMecanico);
        System.out.println(p1.populacao);


    }
}