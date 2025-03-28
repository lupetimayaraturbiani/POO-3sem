package org.example;

public class Engenheiro extends Profissional {
    //falta continuar o código e pegar do material do professor pra completar

    private Engenheiros especialidade;

    @Override
    public int getSalario() {
        return 0;
    }

    @Override
    public void fazServico() {

    }

    @Override
    public void descricao() {

    }

    @Override
    public void tipoContrato() {

    }

    Engenheiro(Engenheiros especialidade) {
        this.especialidade = especialidade;
    }
}
