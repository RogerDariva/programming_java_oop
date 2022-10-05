package _09_26_POO;

import java.util.Scanner;

public class Exercicio_P_O_O {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque item = new Estoque();

        System.out.println("Qual item o cliente deseja? ");
        item.nome = scanner.next();

        System.out.println("Quantas unidades disponíveis em estoque? ");
        item.quantidadeEstoque = scanner.nextInt();

        estoqueMinimo(item);

    }

    private static void estoqueMinimo(Estoque item) {
        Boolean atingiuEstoqueMinimo = item.quantidadeEstoque < 10;
        if (atingiuEstoqueMinimo){
            System.out.println("O item desejado atingiu estoque mínimo. É necessário pedido de compra. qtd: " + item.quantidadeEstoque);
        } else {
            System.out.println("O item desejada está com estoque acima da quantidade mínima. qtd: " + item.quantidadeEstoque);
        }

    }
}
