public class ArcoEFlecha extends Arma{
    private int qtdFlechas;

    public ArcoEFlecha() {
        super("Arco EFlecha", 120, 50);
        this.qtdFlechas = 5;
    }

    @Override
    public String mensagem() {
        return super.mensagem() + "\nQuantidade de flechas: " + this.qtdFlechas;
    }

    @Override
    public int getDano() {
        for (int i = 0; i < qtdFlechas; i++) {
            qtdFlechas --;
            System.out.println("Flechas restantes: " + this.qtdFlechas);
        }

        if(qtdFlechas == 0){
            System.out.println("Ataque falhou, suas flechas acabaram");
            return 0;
        } else {
            return super.getDano();
        }

    }
}
