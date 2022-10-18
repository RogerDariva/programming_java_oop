package _10_04_IMC;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();

        paciente1.peso = 100.0;
        paciente1.altura = 1.65;

        IMC imc = paciente1.calcularIndiceMassaCorporal();

        System.out.println();
        System.out.println("Abaixo do peso Ideal: " + imc.abaixoDoPesoIdeal);
        System.out.println("Peso Ideal: " + imc.pesoIdeal);
        System.out.println("Obeso: " + imc.obeso);
        System.out.println("Grau Obesidade: " + imc.grauObesidade);



    }
}
