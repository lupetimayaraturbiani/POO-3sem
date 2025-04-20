/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aula09;

/**
 *
 * @author luiz.mazanha
 */
public interface Financeiro {
    public int getPreco();
    public void fazPagamento();
    public int getImposto(int porcentagem);
}
