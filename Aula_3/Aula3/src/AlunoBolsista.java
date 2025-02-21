public class AlunoBolsista extends Aluno{
    
    public AlunoBolsista(String curso, int mensalidade, String nome, int idade, int id, boolean matriculaAtiva){
        super(nome, idade, id, curso, mensalidade);
    }

    @Override
    public void pagaMensalidade(){
        System.out.println("Aluno bolsista não precisa pagar mensalidade!!");
    }

}
