
public class App {

    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro();
        /*
        System.out.println(c1.cor);
        System.out.println(c1.ano);
        System.out.println(c1.potencia);
        System.out.println(c1.funcionando);
         */

        Carro c2 = new Carro();
        c2.cor = "azul";
        c2.ano = 2003;
        c2.potencia = 1.0;
        c2.funcionando = false;
        c2.combustivel = 0.08f;

        Carro c3 = new Carro();
        c3.cor = "laranja";
        c3.ano = 2001;
        c3.potencia = 1.5;
        c3.funcionando = true;
        c3.combustivel = 15.67f;

        /* 
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
        */

        c3.andar();
        c2.andar();
        c1.andar();

        c3.abastecer(15.0f);
    }
}
