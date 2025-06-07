/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisecampeonatobrasileiro;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.*;

/**
 *
 * @author luiz.mazanha
 */
public class AnaliseCampeonatoBrasileiro {

    public static String arrumarNomeClube(String nome) {
        nome = Normalizer.normalize(nome, Normalizer.Form.NFD);
        nome = nome.replaceAll("[^\\p{ASCII}]", "");
        nome = nome.replaceAll("\\s+", "");
        return nome;
    }

    public static void imprimirResultado(String titulo, Map<String, Integer> mapa) {
        System.out.println("\n---- " + titulo + " ----");
        Comparator<Map.Entry<String, Integer>> comparator = Map.Entry.comparingByValue(Comparator.reverseOrder());

        mapa.entrySet().stream().sorted(comparator).forEach(e ->
                System.out.println(e.getKey() + ": " + e.getValue()));
    }


    public static void main(String[] args) throws FileNotFoundException {
       String caminho = "C:\\Users\\mayar\\OneDrive\\Documentos\\POO-3sem\\dados";

       Map<String, String> estadoOriginal = new HashMap<>();
       Map<String, String> clubeEstado = new HashMap<>();
       Set<String> todosOsEstados = new HashSet<>();
       try (Scanner sc = new Scanner(new File(caminho + "/estados.txt"))){
           sc.nextLine();
           while (sc.hasNextLine()){
               String[] linha = sc.nextLine().split(",");
               if (linha.length < 2) continue;

               String clubeNormalizado = arrumarNomeClube(linha[0]);
               String estado = linha[1];

               clubeEstado.put(clubeNormalizado, estado);
               todosOsEstados.add(estado);

           }
       }

       Map<String, Integer> titulosPorEstado = new HashMap<>();
       Map<String, Integer> partIndividuais = new HashMap<>();
       Map<String, Set<Integer>> estadoPorAno = new HashMap<>();

       for (int ano = 2003; ano < 2024; ano++) {
           File file = new File(caminho + "/" +ano + ".txt");
           Scanner sc = new Scanner(file);
           sc.nextLine();

           Set<String> estadosPresenteAno = new HashSet<>();

           while(sc.hasNextLine()){
               String[] dados = sc.nextLine().split(",");
               String nomeClubeIncial = dados[1];
               String nomeClube = arrumarNomeClube(nomeClubeIncial);

               String estado = clubeEstado.get(nomeClube);
               if(estado == null) {
                   System.out.println("Clube não reconhecido: " + nomeClubeIncial + " -> " + nomeClube);
                   continue;
               };

               //exercício 1
               int colocacao = Integer.parseInt((dados[0]));
               if(colocacao == 1){
                   titulosPorEstado.put(estado, titulosPorEstado.getOrDefault(estado, 0) + 1);
               }

               //exercício 2
               partIndividuais.put(estado, partIndividuais.getOrDefault(estado, 0) + 1);

               //exercício 3
               estadosPresenteAno.add(estado);
           }

           for (String estado : estadosPresenteAno) {
               estadoPorAno.computeIfAbsent(estado, k -> new HashSet<>()).add(ano);
           }
       }

       //contagem final de participações únicas por estado
        Map<String, Integer> partUnicasPorEstado = new HashMap<>();
        for (Map.Entry<String, Set<Integer>> entry : estadoPorAno.entrySet()) {
            partUnicasPorEstado.put(entry.getKey(), entry.getValue().size());
        }

        for(String estado : todosOsEstados){
            titulosPorEstado.putIfAbsent(estado, 0);
        }


        imprimirResultado("Exercício 1: Títulos por estado", titulosPorEstado);
        imprimirResultado("Exercício 2: Participações individuais", partIndividuais);
        imprimirResultado("Exercício 3: Participações únicas por estado", partUnicasPorEstado);
    }
}

