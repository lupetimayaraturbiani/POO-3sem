/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analisecampeonatobrasileiro;

public class Clube {
    private int titulos = 0;
    private int golsPro = 0;
    private int golsContra = 0;
    private int vitorias = 0;
    private int empates = 0;
    private int derrotas = 0;
    private int participacoes = 0;
    private int jogos = 0;
    private String nome;
    
    Clube( String nome ){
        this.nome = nome;
    }
    
    //--ADD
    public void addTitulo(){
        this.titulos++;
    }
    
    public void addJogos(int jogos){
        this.jogos += jogos;
    }
    
    public void addGolsPro( int gols ){
        this.golsPro += gols;
    }
    
    public void addGolsContra( int gols ){
        this.golsContra += gols;
    }
    
    public void addVitorias( int vitorias ){
        this.vitorias += vitorias;
    }
    
    public void addEmpates( int empates ){
        this.empates += empates;
    }
    
    public void addDerrotas( int derrotas ){
        this.derrotas += derrotas;
    }
    
    public void addParticipacao(){
        this.participacoes++;
    }
    
    
    

    //--GET
    public int getJogos(){
        return this.jogos;
    }
    
    public int getGolsContra(){
        return golsContra;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
    
    public int getParticipacoes() {
        return participacoes;
    }

    public int getTitulos() {
        return this.titulos;
    }
    
    public int getGolsPro(){
        return this.golsPro;
    }
    
    public String getNome(){
        return this.nome;
    }
}