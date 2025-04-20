/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula10;

/**
 *
 * @author luiz.mazanha
 */
public class Turma {
    
    private String disciplina;
    private int cargaHoraria;

    public Turma(String disciplina, int cargaHoraria) {
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Turma{" + "disciplina=" + disciplina + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    
    
}
