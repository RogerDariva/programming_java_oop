package _1_21_09;

import java.util.Scanner;


public class CalculadoraMetodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numeroEsquerda = informeNumero(scanner);
        imprimirTraco();
        Integer operacao = escolhaAOperacao(scanner);
        Double numeroDireita = informeNumero(scanner);
        imprimirTraco();
        Double resultado = realizarCalculo(operacao, numeroEsquerda, numeroDireita);
        System.out.println("O resultado é: " + resultado);
        scanner.close();


    }

    private static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
        Double resultado = null;
        switch (operacao) {
            case 0:
                resultado = subtracao(numeroEsquerda, numeroDireita);
                break;
            case 1:
                resultado = adicao(numeroEsquerda, numeroDireita);
                break;
            default:
                System.err.println("Escolha uma operação válida!");
                System.exit(0);

        }
        return resultado;
    }



    private static Double adicao(Double numeroEsquerda, Double numeroDireita) {
        return numeroEsquerda + numeroEsquerda;
    }

    private static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
        return numeroEsquerda - numeroEsquerda;
    }

    private static Integer escolhaAOperacao(Scanner scanner) {
        System.out.println("Escolha a Operação: ");
        String[] operacoes = new String[]{"Subtração", "Adição"};
        for (int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + i + "]" + operacoes[i]);
        }
        System.out.println("Digite a operação: ");
        return scanner.nextInt();

    }

    private static Double informeNumero(Scanner scanner) {
        System.out.println("Informe o número: ");
        return scanner.nextDouble();
    }

    private static void imprimirTraco() {
        System.out.println("-------------------------------- -------------------------------");

    }
}
