package _09_27_MetodoInstancia;

class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    public static String obterNomeCompleto(Cliente cliente) {
        String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
        return nomeCompleto;
    }

    public String obterNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    public String obterDDD() {
        String ddd = telefone.substring(0, 2);
        return ddd;
    }
}
