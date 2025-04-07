import java.util.Random;
import java.util.Scanner;

public class Jogador extends Criatura {
    private int ataqueForte = 120;
    private int ataqueFraco = 40;
    private int risco = 50;
    private Arma[] armaCurto = new Arma[] {
            new Faca(),
            new Espada()
    };
    private Arma[] armaLonga = new Arma[] {
            new ArcoEFlecha(),
            new Pistola()
    };

    public Jogador(String nome){
        super(nome, 500);
    }

    @Override
    public void fraseDeApresentacao(){
        System.out.println("vou acabar com vocês!!");
    }

    @Override
    public void fraseDeMorte(){
        System.out.println("meus amigos vão me vingar!");
    }

    @Override
    public void fazAtaque(Criatura criatura){
        System.out.println("Ataque do " + getNome());

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha sua arma de curto alcance: ");
        int i = 0;
        for (Arma armaC : this.armaCurto) {
            i++;
            System.out.println(i + ") " + armaC.mensagem());
        }

        int escolha1 = sc.nextInt();

        System.out.println("Escolha sua arma de longo alcance: ");
        int j = 0;
        for (Arma armaL : this.armaLonga) {
            j++;
            System.out.println(j + ") " + armaL.mensagem());
        }

        int escolha2 = sc.nextInt();

        int danoAtual = this.armaCurto[escolha1 - 1].getDano();
        int danoAtual2 = this.armaLonga[escolha2 - 1].getDano();
        criatura.tomaDano(danoAtual);
        criatura.tomaDano(danoAtual2);
    }
}
