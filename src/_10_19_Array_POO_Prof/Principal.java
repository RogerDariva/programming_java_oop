package _10_19_Array_POO_Prof;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Obter Quantidade de produtos

        System.out.println("Quantos Produtos?");
        int quantidadeProdutos = entrada.nextInt();

        //Precisamos de uma linha extra para garantir que uma nova linha seja lida,
        //pois nextInt não le uma nova linha, mas apenas um número.
        //Fica feio, mas tenta não colocar para ver o que acontece.
        //Sempre apos nextInt usar um next Line para descartar o lixo
        entrada.nextLine();

        //instancia um objeto da classe Estoque
        Estoque estoque = new Estoque();

        //instancia um array de produtos com a quantidade de
        //posições que o usuário informou
        estoque.produtos = new Produto[quantidadeProdutos];

        //percorre todas as posições do vetor
        for(int i = 0; i < estoque.produtos.length; i++){
            estoque.produtos[i] = new Produto();
            System.out.println("\nProduto " + i);
            System.out.println("------------------------");

            System.out.println("Informe descrição: ");
            estoque.produtos[i].descricao = entrada.nextLine();

            System.out.println("Informe a quantidade de itens:");
            estoque.produtos[i].quantidade = entrada.nextInt();
            entrada.nextLine();
        }

        estoque.listarProdutos();

    }

}
