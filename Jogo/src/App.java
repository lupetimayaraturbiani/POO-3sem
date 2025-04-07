import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //criando os três inimigos
        Criatura m = new Macabros();
        Criatura n = new Nocturnos();
        Criatura a = new Abominavel();


        //criando a três batalhas
        Batalha b1 = new Batalha();
        Batalha b2 = new Batalha();
        Batalha b3 = new Batalha();

        b1.fazerbatalha(m);
        b2.fazerbatalha(n);
        b3.fazerbatalha(a);
    }
}
