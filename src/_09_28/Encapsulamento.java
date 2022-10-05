package _09_28;

public class Encapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Roger Dariva");
        cliente.setTelefone("27998927197");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: " + cliente.getUltimoNome());
        System.out.println("Telefone: " + cliente.getTelefone());

    }
}
