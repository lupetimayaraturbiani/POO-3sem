/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author luiz.mazanha
 */
public class Funcionario extends Pessoa implements Financeiro {
    
    private int salario;

    public Funcionario(String nome, int idade,int salario) {
        super(nome, idade, Acessos.completo);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Salario = " + this.salario;
    }

    @Override
    public int getPreco() {
        return getSalario();
    }

    @Override
    public void fazPagamento() {
        System.out.println("Funcionario recebe R$" + getSalario());
    }

    @Override
    public int getImposto(int porcentagem) {
        return getPreco() * porcentagem / 100;
    }
    
    
    
}
