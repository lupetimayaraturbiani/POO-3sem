public class Carro {

    String cor = "roxo";
    int ano = 1998;
    double potencia = 2.0;
    boolean funcionando = true;
    float combustivel = 40.1f;

    void mostrarInfo(){
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Potência: " + potencia);
        System.out.println("Combustível: " + combustivel);
        if(funcionando){
            System.out.println("O carro ta funcionando");
        } else {
            System.out.println("O carro ta quebrado");
        }

    }

    public void andar(){
        if(combustivel > 1.55f){
            if (funcionando) {
                System.out.println("O carro ta andando agora...");
                combustivel = combustivel - 1.55f;
                System.out.println("Seu tanque de combustível está em: " + combustivel + "\n\n");
            } else {
                System.out.println("O carro ta quebrado e não pode andar agora!\n");
            }
        } else{
            System.out.println("O carro ta sem combustível ou tem muito pouco para andar, abasteça logo!!\n");
        }
    }

    public void abastecer(float litros){
        if (combustivel >= 40) {
            System.out.println("Seu tanque já ta cheio volte depois de andar mais um pouco");
        } else{
            combustivel = combustivel + litros;
            System.out.println("Seu tanque de combustível está em: " + combustivel + "\n\n");
        }
    }
}
