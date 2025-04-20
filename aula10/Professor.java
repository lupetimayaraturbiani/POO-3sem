/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luiz.mazanha
 */
public class Professor {
    private String nome;
    private List<Turma> turmas = new ArrayList();
    private static final int VALOR_DA_HORA_AULA = 780;

    public Professor(String nome) {
        this.nome = nome;
    }
    
    public void atribuiDisciplina( Turma turma ){
        turmas.add(turma);
    }
    
    public int getCargaHoraria(){
        int ch = 0;
        for( Turma turma : turmas ){
            ch += turma.getCargaHoraria();
        }
        return ch;
    }
    
    public int getSalario(){
        //-- consideramos que o mês tem 4 semanas.
        return getCargaHoraria() * VALOR_DA_HORA_AULA * 4;
    }
    
    public void recebeSalario(){
        System.out.println(nome + " recebe o salário de R$" + getSalario() + ",00" );
    }

    @Override
    public String toString() {
        String str = "Professor " + nome + ": \n";
        str = str + "Carga Horária: " + getCargaHoraria() + "\n";
        str = str + "salario: R$" + getSalario() + ",00\n";
        for( Turma turma : turmas ){
            str = str + turma.toString() + "\n";
        }
        return str;
    }
    
    
}
