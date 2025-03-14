public class Malignus extends Inimigo { //classe abstrata pode ter método concreto, mas nunca o contrário
    public Malignus(){
        super("Malignus", 500, 50);
    }

    @Override
    public void fraseDeApresentacao(){
        System.out.println("eu vou te matar mwahahahah");
    }

    @Override
    public void fraseDeMorte(){
        System.out.println("nãoooooooooo você vai pagar por isso!");
    }
}
