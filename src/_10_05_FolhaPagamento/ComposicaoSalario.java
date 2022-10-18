package _10_05_FolhaPagamento;

public class ComposicaoSalario {
    Integer horasTrabalhadas, horarioPadrao = 160, horasExtra = 0;
    Double valorHoraTrabalhada = 7.5, salario;

    public Integer getHorasTrabalhadas() { return horasTrabalhadas;}
    public void setHorasTrabalhadas(Integer horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas;}

    public Double calculoSalario(){
        horasExtra = horasTrabalhadas - horarioPadrao;
        salario = (horarioPadrao * valorHoraTrabalhada) + (horasExtra * valorHoraTrabalhada);
        return salario;
    }
}


