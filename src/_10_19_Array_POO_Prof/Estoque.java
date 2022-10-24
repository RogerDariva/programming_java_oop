package _10_19_Array_POO_Prof;

public class Estoque {

    Produto[] produtos;

    void  listarProdutos(){
        System.out.println("\nProdutos em Estoque");
        System.out.println("-------------------------");

        for (int i=0; i < produtos.length; i++){
            produtos[i].descrever();
        }
    }
}
