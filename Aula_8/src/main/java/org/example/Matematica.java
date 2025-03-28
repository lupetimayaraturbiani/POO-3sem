package org.example;

public class Matematica {
    //PI está em caps porque é uma constante
    //não podemos alterar um atributo/contante static final
    public static final double PI = 3.14159265;
    public static final double EULER = 2.718;

    //assim não vai ser possível estanciar a classe
    private Matematica() {}

    public static double pow(double base, int expoente){
        double valor = 1.0;
        for(int i = 0; i < expoente; i++){
            // assim tbm ta certo: valor *= base;
            valor = valor * base;
        }
        return valor;
    }

    public static double pow(double base, double expoente){
        return pow(base, (int) expoente);
    }
}
