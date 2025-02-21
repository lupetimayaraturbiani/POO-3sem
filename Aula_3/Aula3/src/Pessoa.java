public class Pessoa {
    private String nome;
    private int idade;
    private int id;
    private boolean matriculaAtiva = false;

    //--CONSTUCTOR
    public Pessoa(String nome, int idade, int id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    @Override
    public String toString(){
        String atividade = matriculaAtiva? "Ativa" : "Desativada";

        return "Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n" + "Id: " + this.id + "\n" + "Matricula: " + atividade + "\n" ;
    }

    public void fazMatricula(){
        setMatriculaAtiva(true);
    }

    public void desativaMatricula(){
        this.matriculaAtiva = false;
    }

    public void fazAniversario(){
        setIdade(getIdade() + 1);
    }


    //--GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMatriculaAtiva() {
        return matriculaAtiva;
    }

    public void setMatriculaAtiva(boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }

    
}
