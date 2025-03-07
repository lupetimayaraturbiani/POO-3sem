public class App {
    public static void main(String[] args) throws Exception {
        Animal a1 = new Cachorro("Joan", 15);
        Animal a2 = new Gato("Barbie", 3);
        Animal a3 = new Pinscher("Hércules");

        a1.fazBarulho();
        a2.fazBarulho();
        a3.fazBarulho();

        Animal cachorro1 = new Cachorro("Pérola", 6);
        Animal gato1 = new Gato("Marvin", 4);
        Animal pastorAlemao1 = new PastorAlemao("Apollo");
        Animal pinscher1 = new Pinscher("Bella");
        Animal viraLata1 = new ViraLata("Leia", 9);
        Animal cachorro2 = new Cachorro("Amora", 5);

        Clinica clinica = new Clinica();
        clinica.fazOrcamento(cachorro2, true);
        clinica.fazOrcamento(cachorro1, true);
        clinica.fazOrcamento(gato1);
        clinica.fazOrcamento(pastorAlemao1, true);
        clinica.fazOrcamento(pinscher1, true);
        clinica.fazOrcamento(viraLata1, true);

    }
}
