package _18_10_ExercicioDeCasa;

public class Produto {
    String nome;
    Integer quantidade;
    Double preco, valorVenda, lucroPorUnidade, lucroPessoal;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade;}

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Double getValorVenda() { return valorVenda; }
    public void setValorVenda(Double valorVenda) { this.valorVenda = valorVenda; }

    public Double getLucroPorUnidade() { return lucroPorUnidade; }
    public void setLucroPorUnidade(Double lucroPorUnidade) { this.lucroPorUnidade = lucroPorUnidade; }

    public Double getLucroPessoal() {return lucroPessoal;}
    public void setLucroPessoal(Double lucroPessoal) {this.lucroPessoal = lucroPessoal;}
}
