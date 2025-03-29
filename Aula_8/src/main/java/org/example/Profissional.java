package org.example;

public abstract class Profissional {
    public static int populacao = 0;

    public static Profissional CriaProfissioanal(ListaProfissionais especialidade) {
        populacao++;

        switch (especialidade){
            case programadorFrontEnd:
                return new ProgramadorFrontEnd();
            case programadorBackEnd:
                return new ProgramadorBackEnd();
            case engenheiroMecanico:
                return new Engenheiro(Engenheiros.mecanico);
            case engenheiroCivil:
                return new Engenheiro(Engenheiros.civil);
            case engenheiroDados:
                return new Engenheiro(Engenheiros.dados);
            case engenheiroEletricista:
                return new Engenheiro(Engenheiros.eletricista);
            case engenheiroQuimico:
                return new Engenheiro(Engenheiros.quimico);
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
