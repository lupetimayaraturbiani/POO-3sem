public class App {
    public static void main(String[] args) throws Exception {
        Produto leite = new ProdutoPerecivel( 7, 10, "Leite", 9.90, 25445, 3 );
        Caixa c2 = new Caixa( leite );
        c2.mostraValor();
        c2.fazCompra();
        
        //--Casting
        ProdutoPerecivel leite2 = (ProdutoPerecivel) leite;
        ControleDeEstoque ce = new ControleDeEstoque( leite2 );
        ce.verificaEstoque();
        
        Produto macarrao = new Produto( "Macarrao", 5.00, 5555, 2 );
        Caixa c3 = new Caixa( macarrao );
        c3.mostraValor();
        c3.fazCompra();
    }
}
