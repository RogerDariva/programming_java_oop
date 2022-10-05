package _09_26_POO;

public class programacao_Orientada_a_Objetos {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;

        exibirQuantidadeEstoque(produto);

    }

    private static void exibirQuantidadeEstoque(Produto produto) {
        System.out.println("\nQuantidade em estoque do produto \"" + produto.nome + "\": " +  produto.quantidade + " unidade(s)." );
    }
}
