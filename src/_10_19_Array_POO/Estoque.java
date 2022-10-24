package _10_19_Array_POO;

public class Estoque {
    Produto[] produtos;

    public void listarProdutos(){
        for (int i = 0; i<produtos.length; i++){
            Produto produto = produtos[i];
            System.out.println("[" + (i+1) + "]" + produto.getNome());
        }
    }
}
