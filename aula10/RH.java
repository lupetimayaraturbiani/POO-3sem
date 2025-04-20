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
public class RH {
    private List<Professor> professores = new ArrayList();
    
    public void adicionaProfessor( Professor professor ){
        professores.add(professor);
    }
    
    public void retiraProfessor( Professor professor ){
        professores.remove(professor);
    }
    
    public void folhaDePagamento(){
        int gastoTotal = 0;
        for( Professor professor : professores ){
            gastoTotal += professor.getSalario();
            professor.recebeSalario();
        }
        System.out.println("-------------------");
        System.out.println("Gasto Total = R$" + gastoTotal + ",00");
    }
}
