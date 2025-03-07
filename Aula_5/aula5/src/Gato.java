public class Gato extends Animal {
    private int descExame = 20;

    public Gato(String nome, int peso) {
        super(nome, peso, "Gato");
    }

    //Polimorfismo de sobreposição
    @Override
    public void fazBarulho() {
        System.out.println("miau miau!");
    }

    //Polimorfismo de sobreposição
    @Override
    public int getValorExame(){
        return super.getValorExame() - this.descExame;
    }

}
