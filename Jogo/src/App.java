public class App {
    public static void main(String[] args) throws Exception {
        //criar novos inimigos
        //um apenas atributos, um modifica o ataque e outro modifica e outro modifica o tomaDano
        //criar um metodo que recebe duas criaturas e faz a batalha


        Jogador jogador = new Jogador("Mayara");
        Criatura inimigo = new Terrivel();
        //Criatura inimigo = new Malignus();
        //Criatura inimigo = new Jogador("joana");

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
