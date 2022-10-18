package _10_04_IMC;

public class Paciente {
    Double altura, peso;

    IMC calcularIndiceMassaCorporal() {
        IMC imc = new IMC();
        double indice = peso / (altura * altura);

        imc.indice = indice;

        if (indice < 18.5) {
            imc.abaixoDoPesoIdeal = true;

        } else if (indice < 25) {
            imc.pesoIdeal = true;
        } else {
            imc.obeso = true;
        }

        if (indice < 30){
            imc.grauObesidade = "I";

        }else if (indice<40){
            imc.grauObesidade = "II";
        }else {
            imc.grauObesidade = "III";
        }

        return imc;
    }
}
