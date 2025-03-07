public class ControleDeEstoque {
    //--OBS: aqui poderíamos utilizar uma lista, mas esse é um conteúdo do final do semestre. 
    //--Trabalhamos com apenas um produto para mostrar o funiconamento da relação entre classes.
    private ProdutoPerecivel produtoPerecivel;
    
    ControleDeEstoque( ProdutoPerecivel produtoPerecivel ){
        this.produtoPerecivel = produtoPerecivel;
    }
    
    public void verificaEstoque(){
        produtoPerecivel.mostraValidade();
    }
}
