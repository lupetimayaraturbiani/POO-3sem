package org.example;

public class Engenheiro extends Profissional {
    //falta continuar o código e pegar do material do professor pra completar

    private int salario;

    private Engenheiros especialidade;
    Engenheiro(Engenheiros especialidade){
        this.especialidade = especialidade;

        switch (especialidade){
            case civil: salario = 2000; break;
            case mecanico: salario = 1800; break;
            case quimico: salario = 2200; break;
            case eletricista: salario = 1500; break;
            case dados: salario = 2500; break;
        }
    }

    @Override
    public int getSalario() {
        return salario;
    }

    @Override
    public void fazServico() {
        switch (especialidade) {
            case civil:
                System.out.println("Faz projeto na construção.");
                break;
            case mecanico:
                System.out.println("Faz projeto mecânicos.");
                break;
            case dados:
                System.out.println("Faz projeto em sistemas.");
                break;
            case eletricista:
                System.out.println("Faz projeto elétrico.");
                break;
            case quimico:
                System.out.println("Faz projeto químico.");
                break;
        }
    }

    @Override
    public void descricao() {
        System.out.println("Engenheiro do tipo " + especialidade);
    }

    @Override
    public void tipoContrato() {
        System.out.println("CLT");
    }
}
