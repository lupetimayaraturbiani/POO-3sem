public class Professor extends Pessoa {
    private String curso;
    private int salario;


    //--CONSTRUCTOR
    public Professor(String nome, int idade, int id, String curso, int salario) {
        super(nome, idade, id);
        this.curso = curso;
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "PROFESSOR - " + "\n" + "Área: " + this.curso + "\n" + "Salário: " + this.salario + ",00" + "\n" + super.toString();
    }

    public void recebeSalario(){
        if (this.isMatriculaAtiva()) {
            System.out.println(getNome() + " recebe R$" + this.salario + ",00." );
        } else {
            System.out.println(getNome() + " está fora de atividade");
        }
    }

    //--GETTERS AND SETTERS
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    
}
