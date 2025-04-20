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
        if (qtdFlechas > 0){
            qtdFlechas --;
            System.out.println("Flechas restantes: " + qtdFlechas);
            return super.getDano();
        } else {
            System.out.println("Ataque falhou, suas flechas acabaram!");
            return 0;
        }
    }
}
