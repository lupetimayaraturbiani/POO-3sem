public abstract class Animal {
    private String nome;
    private int peso;
    private String especie;

    private int valorConsulta = 70;
    private int valorExame = 100;
    
    public Animal(String nome, int peso, String especie) {
        this.nome = nome;
        this.peso = peso;
        this.especie = especie;
    }

    public abstract void fazBarulho();

    @Override
    public String toString() {
        return "Animal:\nNome=" + nome + "\nPeso=" + peso + "\nEspecie=" + especie;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(int valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getValorExame() {
        return valorExame;
    }

    public void setValorExame(int valorExame) {
        this.valorExame = valorExame;
    }

    
}
