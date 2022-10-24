package _10_20_InstaciarPessoa;

public class TesteConstrutor {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João");
        System.out.println("Nome: \"" + p1.nome + "\" tem " + p1.idade + " anos.");
        Pessoa p2 = new Pessoa("Maria", 22);
    }
}
