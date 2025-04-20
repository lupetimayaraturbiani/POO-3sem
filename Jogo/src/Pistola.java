public class Pistola extends Arma{
    private int municao;
    public Pistola() {
        super("Pistola", 80, 30);
        this.municao = 5;
    }

    @Override
    public String mensagem() {
        return super.mensagem() + "\nMunição: " + this.municao;
    }

    @Override
    public int getDano() {
        if (this.municao > 0) {
            this.municao --;
            System.out.println("Munição restante: " + this.municao);
            return super.getDano();
        } else {
            System.out.println("Ataque falhou, as balas acabaram!");
            return 0;
        }
    }
}
