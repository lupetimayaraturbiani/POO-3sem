package Aula_1.src;

public class Aula01 {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println(c1.cor);
        System.out.println(c1.ano);
        System.out.println(c1.potencia);

        Carro c2 = new Carro();
        c2.cor = "azul";
        c2.ano = 2003;
        c2.potencia = 1.0;
    }
}