package _10_10_Passeio;

public class Caminhada {
    public  void andar(Pessoa pessoa){
        System.out.println("Eu \"" + pessoa.nome + "\"" +
                "estou andando com o \"" + pessoa.cachorro.nome + "\"");
    }
}
