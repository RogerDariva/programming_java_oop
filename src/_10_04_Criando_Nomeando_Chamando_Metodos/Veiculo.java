package _10_04_Criando_Nomeando_Chamando_Metodos;

public class Veiculo {
    String fabricante, modelo, cor;
    int anoDeFabricacao;
    Proprietario dono = new Proprietario();

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public int getAnoDeFabricacao() { return anoDeFabricacao; }
    public void setAnoDeFabricacao(int anoDeFabricacao) { this.anoDeFabricacao = anoDeFabricacao; }

    void ligar(){

        System.out.println("Ligando o carro: " + modelo);
    }

}
