public class Abominavel extends Inimigo{
    public Abominavel(){
        super("Abominável", 200, 35, new Esquiva(50));
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("tudo o que você mais teme, vai acontecer AGORA!!");
    }

    @Override
    public void fraseDeMorte() {
        System.out.println("eu sou o Abominável, como ousa me matar??!");
    }
}
