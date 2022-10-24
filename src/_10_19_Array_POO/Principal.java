package _10_19_Array_POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\"Criar Produtos\"");

        Produto produto01 = new Produto();
        definirProduto(produto01);

        Produto produto02 = new Produto();
        definirProduto(produto02);

        Estoque estoque = new Estoque();
        estoque.produtos = new Produto[] {produto01, produto02};

        System.out.println("---------------------------");
        System.out.println("\n \" PRODUTOS DISPONÍVEIS\"");

        estoque.listarProdutos();




    }

    private static void definirProduto(Produto produto01) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Nome: ");
        produto01.setNome(entrada.next());
        System.out.println("Descrição: ");
        produto01.setDescricao(entrada.next());
        System.out.println("Quantidade: ");
        produto01.setQuantidade(entrada.nextInt());
    }
}
