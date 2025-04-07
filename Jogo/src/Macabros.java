public class Macabros extends Inimigo{
    public Macabros(){
        super("Macabros", 500, 60, new Esquiva(20));
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("eu sou seu pior pesadelo, muito prazer meu nome é Macabros e você vai morrer!!!!!");
    }

    @Override
    public void fraseDeMorte() {
        System.out.println("eu sou invencível e vou me vingar ahhhhhhhhhh");
    }
}
