package br.com.androidpro.pacotes;

import br.com.androidpro.pacotes.automovel.Carro;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class TestaExcecao {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        numeros[5] = 6;
        numeros[6] = 7;
        numeros[7] = 8;
        numeros[8] = 9;
        numeros[9] = 10;

        try {
            System.out.println("Começando a listagem...");
            for (int i = 0; i < 15; i++) {
                System.out.println("Numero: " + numeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Deu algum erro na listagem.");
        }

        System.out.println("Listagem finalizada.");

        Carro carro = new Carro();
        carro.setVelocidadeMaxima(100);
        carro.setEhConversivel(false);

        carro.acelera(120);
    }
}
