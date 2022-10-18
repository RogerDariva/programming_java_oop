package _10_10_Desafio;

import java.util.Scanner;

class Televisor {

    Integer canal = 130; //Número do canal na televisão
    Integer volume = 20; //Volume da TV

    void mudarCanal(Integer novoCanal) {

        if (canal.equals(novoCanal)) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + novoCanal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            //volume = new Integer(novoVolume.byteValue());
            System.out.println("Volume alterado para " + novoVolume);
        }
    }

    // Estamos aproveitando a classe Televisor para fazer nosso teste
    public static void main(String[] args) {
        Televisor tv = new Televisor();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }

}
