public class Cachorro extends Animal {
    private int pesoRef = 10;
    private int adicionalConsulta = 30;
    private int fatorPeso = 2;

    public Cachorro(String nome, int peso) {
            super(nome, peso, "Cachorro");
    }
    
    //Polimorfismo de sobreposição
    @Override
    public void fazBarulho() {
        System.out.println("au au!");
    }

    //Polimorfismo de sobreposição
    @Override
    public int getValorConsulta(){
        if(getPeso() > pesoRef){
            return super.getValorConsulta() + this.adicionalConsulta;
        } else {
            return super.getValorConsulta();
        }
    }

    //Polimorfismo de sobreposição
    @Override
    public int getValorExame(){
        return super.getValorExame() + getPeso() * fatorPeso;
    }

}
