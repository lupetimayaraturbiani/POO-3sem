/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiz.mazanha
 */
public class Aula10 {

    public static void main(String[] args) {
        
        //--#############################
        //--RASCUNHO
        int numero = 5;
        
        List<Integer> lista = new ArrayList();
        lista.add(5);
        lista.add(2);
        lista.add(3);
        lista.add(82);
        lista.add(4);
        System.out.println(lista);
        
        System.out.println( lista.contains(5) );
        System.out.println( lista.contains(71) );
        
        lista.get(0);
        lista.get(1);
        lista.remove( new Integer(2) );
        System.out.println(lista);
        
        
        List<Double> listaDouble = new ArrayList();
        listaDouble.add(1.5);
        listaDouble.add(5.6);
        
        
        //--Lista de pessoas:
        List<Pessoa> pessoas = new ArrayList();
        pessoas.add(  new Pessoa("José",50)  );
        pessoas.add(  new Pessoa("Maria",60)  );
        pessoas.add(  new Pessoa("Pedro",40)  );
        pessoas.add(  new Pessoa("Ana",30)  );
        pessoas.add( new Pessoa("Enzo", 12) );
        
        //--Media de idade
        int media = 0;
        for( Pessoa pessoa : pessoas ){
            media += pessoa.getIdade();
            System.out.println(pessoa);
        }
        media = media / pessoas.size();
        System.out.println("A média de idade é " + media);
        
        //--Fim do rascunho
        //----###########################
        
        Turma t1 = new Turma( "POO", 4 );
        Turma t2 = new Turma( "Alg1", 4 );
        Turma t3 = new Turma( "SO", 2 );
        Turma t4 = new Turma ("Interface", 2);
        Turma t5 = new Turma( "Redes", 3);
        Turma t6 = new Turma( "PI1", 4 );
        Turma t7 = new Turma( "PI3", 4 );
        
        Professor p1 = new Professor("Rogerio");
        p1.atribuiDisciplina(t1);
        p1.atribuiDisciplina(t2);
        p1.atribuiDisciplina(t3);
        
        Professor p2 = new Professor("Luiz");
        p2.atribuiDisciplina(t4);
        p2.atribuiDisciplina(t5);
        
        Professor p3 = new Professor("Bruno");
        p3.atribuiDisciplina(t6);
        p3.atribuiDisciplina(t7);
        
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        
        RH rh = new RH();
        rh.adicionaProfessor(p1);
        rh.adicionaProfessor(p2);
        rh.adicionaProfessor(p3);
        rh.folhaDePagamento();
        
        rh.retiraProfessor(p1);
        rh.folhaDePagamento();
        
        
        
        
    }
}
