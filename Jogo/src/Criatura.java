public abstract class Criatura {
    private String nome;
    private int vida;

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public abstract void fraseDeApresentacao();
    public abstract void fraseDeMorte();
    public abstract void fazAtaque(Criatura criatura);

    public boolean estaVivo(){
        return this.vida > 0; //if ternário
    }

    public void tomaDano(int dano){
        if (dano > this.vida) {
            this.vida = 0;
        } else {
            this.vida -= dano;
        }
        System.out.println(this.nome + " toma " + dano + " de dano.");
    }

    public void mostraVida(){
        System.out.println(this.nome + " tem " + this.vida + " de vida!");
    }
}
