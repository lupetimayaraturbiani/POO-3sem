import java.util.Random;
import java.util.Scanner;

public class Jogador extends Criatura {
    private int ataqueForte = 120;
    private int ataqueFraco = 40;
    private int risco = 50;

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
        System.out.println("ataque de " + getNome());
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha sua arma: ");
        System.out.println("1) Faca\nDano: " + ataqueFraco + "\nRisco: 0%" + "\n2)Arco e flecha\nDano: " + ataqueForte + "\nRisco: " + risco + "%");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            criatura.tomaDano(this.ataqueFraco);
        } else if(escolha == 2){
            Random rd = new Random();
            int sorteio = rd.nextInt(0, 100);
            if (sorteio < risco) {
                System.out.println("erro de mira! o ataque falhou!");
                criatura.tomaDano(0);
            } else{
                System.out.println("acertou!");
                criatura.tomaDano(ataqueForte);
            }
        } else {
            criatura.tomaDano(0);
        }
    }
}
