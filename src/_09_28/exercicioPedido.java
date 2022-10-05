package _09_28;

import java.util.Scanner;

public class exercicioPedido {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pedido cliente1 = new Pedido();

        System.out.println("Digite o código do Pedido: ");

        cliente1.setCodigo(cliente1.codigo = entrada.next());

        System.out.println("Entre com o valor nominal do Produto: ");

        cliente1.setSubTotal(cliente1.subTotal = entrada.nextDouble());

        System.out.println("Qual a porcentagem de desconto sobre o Produto: ");

        cliente1.setDesconto(cliente1.desconto = entrada.nextDouble());

        System.out.println("O valor total será de: " + "R$ " + cliente1.getTotal());
    }
}
