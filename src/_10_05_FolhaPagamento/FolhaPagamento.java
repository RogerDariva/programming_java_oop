package _10_05_FolhaPagamento;
import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        RegistroFuncionario funcionario1 = new RegistroFuncionario();

        imprimirTraco();
        System.out.println("\"Quadro de Pagamento a Funcionário\"");
        imprimirTraco();
        dadosRegistroFuncionario(entrada, funcionario1);

        imprimirTraco();
        System.out.println("\"Quadro de Horas do Funcionário\"");
        imprimirTraco();

        System.out.println("Horas Trabalhaadas: ");
        funcionario1.composicaoSalario.setHorasTrabalhadas(entrada.nextInt());

        funcionario1.composicaoSalario.salario = funcionario1.composicaoSalario.calculoSalario();
        System.out.println("O salário total do funcionário é: " + funcionario1.composicaoSalario.salario);



    }

    private static void dadosRegistroFuncionario(Scanner entrada, RegistroFuncionario funcionario1) {


        System.out.println("Registro Do Funcionário\n");

        System.out.println("Qual o nome do Funcionário: ");
        funcionario1.setNomeFuncionario(entrada.nextLine());

        System.out.println("Qual o cpf do Funcionário: ");
        funcionario1.setCpf(entrada.next());

        System.out.println("Qual pix do Funcionário: ");
        funcionario1.setDadosPix(entrada.next());
        imprimirTraco();
    }

    private static void imprimirTraco() {
        System.out.println("-----------------------");
    }

}
