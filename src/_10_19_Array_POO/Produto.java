package _10_19_Array_POO;

public class Produto {
    String nome, descricao;
    Integer quantidade;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public Integer getQuantidade() {return quantidade;}
    public void setQuantidade(Integer quantidade) {this.quantidade = quantidade;}

    public void descrever(){
        System.out.println("\n Descrição " + getDescricao() + "|" + "Quantidade: " + getQuantidade());
    }
}
