public class Terrivel extends Inimigo{
    public Terrivel(){
        super("Terrível", 1000, 25, new Esquiva(20));
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Eu sou terrivel e você vai M O R R E R!!!!!");
    }

    @Override
    public void fraseDeMorte(){
        System.out.println("Eu não quero morrer, socorro!!!");
    }
}
