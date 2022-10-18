package _18_10_ExercicioDeCasa;

public class Principal {
    public static void main(String[] args) {
        System.out.println("\"Cálculo de valor a ser Recebido\"");

        Trabalhador trabalhador01 = new Trabalhador();
        trabalhador01.setNome("Rodrigo");
        trabalhador01.setTelefone("27992526175");

        Produto produto = new Produto();
        produto.setNome("RedBull");
        produto.setQuantidade(9);
        produto.setPreco(22.5);
        produto.setValorVenda(40.0);
        produto.setLucroPorUnidade(produto.getValorVenda()-produto.getPreco());
        produto.setLucroPessoal(produto.getLucroPorUnidade() * produto.getQuantidade());

        calculoValorAReceber(produto, trabalhador01);


    }

    private static void calculoValorAReceber(Produto produto, Trabalhador trabalhador) {
        Double valorASerRecebido = (produto.getPreco() * produto.getQuantidade()) + (produto.getLucroPorUnidade() * produto.getQuantidade()/2);
        System.out.println("O valor a ser Recebido é: " + valorASerRecebido
                + " Pelo trabalhador: " + trabalhador.getNome()
                + " Referente ao Produto: " + produto.getNome() );

        System.out.println("Meu lucro total foi de: " + produto.getLucroPessoal());

    }
}
