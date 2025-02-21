public class Aluno extends Pessoa{
    private String curso;
    private int mensalidade;

    //--CONSTRUCTOR
    public Aluno(String nome, int idade, int id, String curso, int mensalidade) {
        super(nome, idade, id);
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString(){
        return "ALUNO - \n" + "Curso: " + this.curso + "\n" + "Mensalidade: " + this.mensalidade + ",00\n" + super.toString();
    }

    public void pagaMensalidade(){
        if (isMatriculaAtiva()) {
            System.out.println(getNome() + " paga R$" + this.mensalidade + ",00 de mensalidade");
        } else {
            System.out.println(getNome() + " não é matriculado ainda.");
        }
    }

    //--GETTERS AND SETTERS
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }
}
    