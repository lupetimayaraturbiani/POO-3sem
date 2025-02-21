public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("João", 30, 124432);
        Pessoa p2 = new Pessoa("Natasha", 26, 997256);

        
        System.out.println(p1);
        System.out.println(p2);
        
        p1.fazAniversario();
        p2.fazAniversario();
        p1.fazMatricula();
        p2.fazMatricula();

        System.out.println(p1);
        System.out.println(p2);
        

        Professor pr1 = new Professor("Luiz", 32, 54117, "Tecnologia", 430);

        pr1.recebeSalario();
        pr1.fazMatricula();
        pr1.recebeSalario();

        Professor pr2 = new Professor("Maria", 25, 48117, "Engenharia", 2000);

        pr2.fazAniversario();
        pr2.fazMatricula();
        pr2.recebeSalario();

        System.out.println("\n\n\n#########\n\n\n");

        System.out.println(pr1);
        System.out.println(pr2);

        System.out.println("\n\n\n#########\n\n\n");

        Aluno a1 = new Aluno("Mayara", 20, 150803, "Análise e Desenvolvimento de Sistemas", 371);

        a1.pagaMensalidade();
        a1.fazMatricula();
        a1.fazAniversario();
        a1.pagaMensalidade();

        Aluno a2 = new Aluno("Yasmin", 19, 147852, "Administração", 421);

        a2.pagaMensalidade();
        a2.fazMatricula();
        a2.fazAniversario();
        a2.pagaMensalidade();

        System.out.println(a1);
        System.out.println(a2);

        System.out.println("\n\n\n#########\n\n\n");

        AlunoBolsista aBolsista = new AlunoBolsista("Administração", 0, "Júnior", 18, 2251862, false);

        aBolsista.fazAniversario();
        aBolsista.fazMatricula();
        aBolsista.pagaMensalidade();

        System.out.println(aBolsista);
    }
}
                            