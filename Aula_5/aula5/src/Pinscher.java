public class Pinscher extends Cachorro {

    public Pinscher(String nome) {
        super(nome, 5);
    }

    //polimorfismo de sobrecarga
    public Pinscher(String nome, int peso){
        super(nome, peso);
    }
    
    @Override
    public void fazBarulho() {
        System.out.println("auauauauau!!!!");
    }

}
