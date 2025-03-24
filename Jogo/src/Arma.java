import java.util.Random;

public class Arma {
    private String nome;
    private int dano;
    private int risco;

    public Arma(String nome, int dano, int risco) {
        this.nome = nome;
        this.dano = dano;
        this.risco = risco;
    }

    public String mensagem() {
        return this.nome + "\nDano: " + this.dano + "\nRisco: " + this.risco + "%";
    }

    public int getDano() {
        if(this.risco == 0){
            System.out.println("Acerto!!!");
            return this.dano;
        }

        Random rd = new Random();
        int sorteio = rd.nextInt(0, 100);
        if(sorteio < this.risco){
            System.out.println("Ataque falhou, erro de mira!");
            return 0;
        } else {
            System.out.println("Acertou!!");
            return this.dano;
        }
    }
}
