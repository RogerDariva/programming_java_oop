package _10_04_Detran;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Veiculo carro1 = new Veiculo();

        imprimirTraco();
        System.out.println("\"Cadastro de Veículo\"");

        descricaoVeiculo(entrada, carro1);
        imprimirTraco();

        descricaoProprietario(entrada, carro1);

        imprimirRegistroVeiculo(entrada, carro1);

    }

    private static void imprimirRegistroVeiculo(Scanner entrada, Veiculo carro1) {
        int opcao;
        do {

            System.out.println("1. Registro do veiculo\n2.Registro Proprietário\n3.Ligar Veiculo\n4.Sair");
            System.out.print("\n" +
                    "Opção: ");
             opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n\"Registro do Veículo\"" + "\nFabricante: " + carro1.getFabricante()
                            + "\n Modelo: " + carro1.getModelo()
                            + "\n Cor: " + carro1.getCor()
                            + "\n Ano de Fabricação: " + carro1.getAnoDeFabricacao() + "\n");
                    break;

                case 2:
                    System.out.println("\n\"Registro do Proprietário\"" + "\nNome: " + carro1.dono.getNome()
                            + "\n Cpf: " + carro1.dono.getCpf()
                            + "\n Cep: " + carro1.dono.getCep()
                            + "\n Idade: " + carro1.dono.getIdade() + "\n");
                    break;

                case 3:
                    System.out.println("\"Ligar Veículo\"");
                    carro1.ligar();
                    break;
                case 4:
                    opcao =4;
                    break;

                default:
                    System.err.println("Opção Inválida!");

            }
        } while (opcao!=4);
    }

    private static void descricaoProprietario(Scanner entrada, Veiculo carro1) {
        System.out.println("\n\"Cadastro de Proprietário\"");
        imprimirTraco();

        System.out.println("Qual o nome do Proprietário: ");
        carro1.dono.setNome(entrada.next());

        System.out.println("Qual o CPF do Proprietário: ");
        carro1.dono.setCpf(entrada.next());

        System.out.println("Qual o CEP do Proprietário: ");
        carro1.dono.setCep(entrada.next());

        System.out.println("Idade do Proprietário: ");
        carro1.dono.setIdade(entrada.nextInt());
    }

    private static void descricaoVeiculo(Scanner entrada, Veiculo carro1) {
        System.out.println("Qual o Fabricante do Veículo: ");
        carro1.setFabricante(entrada.next());

        System.out.println("Qual o modelo do Veículo: ");
        carro1.setModelo(entrada.next());

        System.out.println("Qual a cor do Veículo: ");
        carro1.setCor(entrada.next());

        System.out.println("Qual o ano de Fabricação: ");
        carro1.setAnoDeFabricacao(entrada.nextInt());
    }

    private static void imprimirTraco() {
        System.out.println("-----------------------------");
    }
}
