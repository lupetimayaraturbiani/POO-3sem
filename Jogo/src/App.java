import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //criando os três inimigos
        Criatura macabros = new Macabros();
        Criatura nocturnos = new Nocturnos();
        Criatura abominavel = new Abominavel();

        List<Criatura> inimigos = new ArrayList<>();

        inimigos.add(macabros);
        inimigos.add(nocturnos);
        inimigos.add(abominavel);

        //criando jogador
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        Jogador jogador = new Jogador(nome);



        for (Criatura inimigo: inimigos) {
            Batalha b = new Batalha();
            Criatura campeao = b.fazerbatalha(inimigo, jogador);

            if (campeao == inimigo) {
                System.out.println(campeao.getNome() + " venceu, fim de jogo!");
                break;
            } else {
                System.out.println(jogador.getNome() + " venceu essa rodada!");
                jogador.restaurarVida();
            }

        }

    }
}
