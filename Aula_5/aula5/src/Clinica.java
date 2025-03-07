public class Clinica {

    public void fazOrcamento(Animal animal){
        fazOrcamento(animal, false);
    }

    public void fazOrcamento(Animal animal, boolean temExame){
        int valorTotal = 0;
        int valorConsulta = animal.getValorConsulta();
        String nomeAnimal = animal.getNome();

        

        System.out.println("**********************");
        System.out.println("Orçamento " + nomeAnimal);
        System.out.println("-----------------------\n");

        System.out.println("Consulta: R$" + valorConsulta + ",00");
        valorTotal += valorConsulta;

        if (temExame) {
            int valorExame = animal.getValorExame();
            System.out.println("Exame: R$" + valorExame + ",00");
            valorTotal += valorExame;
        }

        System.out.println("-----------------------");
        System.out.println("valor Total: R$" + valorTotal + ",00");
        System.out.println("**********************");
    }

}
