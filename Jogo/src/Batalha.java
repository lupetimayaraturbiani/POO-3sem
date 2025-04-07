import java.util.Scanner;

public class Batalha {
    public void fazerbatalha(Criatura inimigo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        Jogador jogador = new Jogador(nome);

        System.out.println("Bem vindos à grande batalha");
        jogador.fraseDeApresentacao();
        inimigo.fraseDeApresentacao();
        while (true) {
            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }

            if (!jogador.estaVivo()) {
                jogador.fraseDeMorte();
                System.out.println("Inimigo " + inimigo.getNome() + " venceu! boa sorte na próxima vez....");
                break;
            }

            jogador.mostraVida();
            inimigo.mostraVida();

            if (!inimigo.estaVivo()) {
                inimigo.fraseDeMorte();
                System.out.println("Jogador(a) "+ jogador.getNome() +" venceu! parabéns!!!!");
                break;
            }
        }
    }
}
