package _10_10_wrappers;

import static java.lang.Integer.valueOf;

public class Principal {
    public static void main(String[] args) {
        int x = 10;
        //Integer i = new Integer(10);
        Integer i = valueOf(10);
        byte b = i.byteValue();

        int idade = Integer.parseInt("27");
        System.out.println("Daqui a 5 anos vc terá: "+ (idade+5) + "Anos.");

        try{
            double custo = Double.parseDouble("Vinte e  três reais e cinquenta centavos");
            System.out.println("Custo Total: " + custo);
        } catch (NumberFormatException e){
            System.err.println("Número inválido para conversão!");
        }
    }
}
