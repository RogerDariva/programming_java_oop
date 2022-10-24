package _10_20_InstaciarCarro;

public class Principal {
    public static void main(String[] args) {
        //Exercicio: Instanciar 2 pessoas, definindo nome, definir idade da segunda pessoa.
        Pessoa[] cadastro = new Pessoa[2];

        for (int i = 0; i < cadastro.length; i++) {
            cadastro[i] = new Pessoa();
            if (i == 0) {
                Pessoa.definirPessoa1(cadastro[i]);
            } else {
                Pessoa.definirPessoa2(cadastro[i]);
            }
        }
        for (int i = 0; i < cadastro.length; i++) {
            System.out.println("[" + (i + 1) + "]" + " " + cadastro[i]);
        }
    }
}