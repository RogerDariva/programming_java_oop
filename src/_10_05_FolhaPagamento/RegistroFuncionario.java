package _10_05_FolhaPagamento;

public class RegistroFuncionario {
    String nomeFuncionario, cpf, dadosPix;
    ComposicaoSalario composicaoSalario = new ComposicaoSalario();

    public String getNomeFuncionario() { return nomeFuncionario;}
    public void setNomeFuncionario(String nomeFuncionario) { this.nomeFuncionario = nomeFuncionario;}

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getDadosPix() { return dadosPix; }
    public void setDadosPix(String dadosPix) { this.dadosPix = dadosPix;}
}
