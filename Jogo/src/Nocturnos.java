import java.util.Random;

public class Nocturnos extends Inimigo{

    public Nocturnos() {
        super("Nocturnos", 700, 45, new Bloqueio(15));
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("a última coisa que você verá, é a escuridão eterna da noite");
    }

    @Override
    public void fraseDeMorte() {
        System.out.println("não, por favor não me mateeeeee");
    }

    @Override
    public void fazAtaque(Criatura criatura) {
        Random r = new Random();

        int sorteio = r.nextInt(100);

        if(sorteio <= 50){
            int ataqueInicial = this.getAtaque();
            this.setAtaque(ataqueInicial * 2);
            criatura.tomaDano(getAtaque());
        } else {
            criatura.tomaDano(getAtaque());
        }
    }
}
