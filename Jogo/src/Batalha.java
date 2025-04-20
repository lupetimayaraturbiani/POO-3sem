import java.util.Scanner;

public class Batalha {
    private boolean resultadoBatalha = false;

    public boolean isResultadoBatalha() {
        return resultadoBatalha;
    }

    public void setResultadoBatalha(boolean resultadoBatalha) {
        this.resultadoBatalha = resultadoBatalha;
    }

    public Criatura fazerbatalha(Criatura inimigo, Jogador jogador) {
        System.out.println("Bem-vindos à grande batalha!");
        jogador.fraseDeApresentacao();
        inimigo.fraseDeApresentacao();

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            jogador.fazAtaque(inimigo);

            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }

            jogador.mostraVida();
            inimigo.mostraVida();
        }

        if (!jogador.estaVivo()) {
            jogador.fraseDeMorte();
            System.out.println("Inimigo " + inimigo.getNome() + " venceu! Boa sorte na próxima vez....");
            return inimigo;
        } else {
            inimigo.fraseDeMorte();
            System.out.println("Jogador(a) " + jogador.getNome() + " venceu! Parabéns!!!!");
            return jogador;
        }
    }

}
