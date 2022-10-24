package _10_20_InstaciarCarro;

import java.util.Scanner;

public class Pessoa {

    String nome;
    Integer idade;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public Integer getIdade() {return idade;}
    public void setIdade(Integer idade) {this.idade = idade;}

    public static void definirPessoa1(Pessoa pessoa){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        pessoa.setNome(entrada.nextLine());
        System.out.println("");

    }
    public static void definirPessoa2(Pessoa pessoa){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: ");
        pessoa.setNome(entrada.nextLine());
        System.out.println("Idade: ");
        pessoa.setIdade(entrada.nextInt());

    }
}
