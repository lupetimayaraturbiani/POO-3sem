package org.example;

public abstract class Profissional {

    public static Profissional CriaProfissioanal(ListaProfissionais especialidade) {
        switch (especialidade){
            case programadorFrontEnd:
                new ProgramadorFrontEnd();
                break;
            case programadorBackEnd:
                new ProgramadorBackEnd();
                break;
            case engenheiroMecanico:
                new Engenheiro(Engenheiros.mecanico);
                break;
            case engenheiroCivil:
                new Engenheiro(Engenheiros.civil);
                break;
            case engenheiroDados:
                new Engenheiro(Engenheiros.dados);
                break;
            case engenheiroEletricista:
                new Engenheiro(Engenheiros.eletricista);
                break;
            case engenheiroQuimico:
                new Engenheiro(Engenheiros.quimico);
                break;
            default:
                return new ProgramadorBackEnd();

        }
    }


    //métodos abstratos não tem implementação, eles só são implementados nas subclasses
    public abstract int getSalario();
    public abstract void fazServico();
    public abstract void descricao();
    public abstract void tipoContrato();
}
