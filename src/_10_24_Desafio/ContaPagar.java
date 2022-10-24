package _10_24_Desafio;

public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private  Fornecedor fornecedor;

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public void setValor(Double valor) {this.valor = valor;}

    public void setDataVencimento(String dataVencimento) {this.dataVencimento = dataVencimento;}

    public void setFornecedor(Fornecedor fornecedor) {this.fornecedor = fornecedor;}

    public ContaPagar(){
       //para pessoa escolher se vai colocar parametro ou nao
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void Pagar(){
        System.out.println("A conta do(a) " + this.descricao + " no valor de: R$ " + this.valor + " Vence em " + this.dataVencimento + "."
        +"\n O valor deve ser pago a: " + this.fornecedor.getNome());
    }

}
