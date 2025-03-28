package org.example;

public class Engenheiro extends Profissional {

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

    private String especialidade;
    Engenheiro(Engenheiros especialidade) {
        this.especialidade = String.valueOf(especialidade);
    }
}
