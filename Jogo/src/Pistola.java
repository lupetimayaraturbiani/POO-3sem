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
        for (int i = 0; i < this.municao; i++) {
            municao--;
            System.out.println("Munição restante: " + this.municao);
        }
        if(this.municao == 0){
            System.out.println("Ataque falhou, sem munição");
            return 0;
        } else {
            return super.getDano();
        }
    }
}
