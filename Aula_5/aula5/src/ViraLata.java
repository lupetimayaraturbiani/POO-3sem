public class ViraLata extends Cachorro{

    public ViraLata(String nome, int peso) {
        super(nome, peso);
    }

    //Polimorfismo de sobreposição
    @Override
    public int getValorConsulta(){
        return 0;
    }
}
