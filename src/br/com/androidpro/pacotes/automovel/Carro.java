package br.com.androidpro.pacotes.automovel;

import br.com.androidpro.pacotes.tipocombustivel.Gasolina;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Carro extends Automovel implements Gasolina {

    private static int quantidadeDeCarros;

    private boolean ehConversivel;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if(ehConversivel) {
            novaVelocidade = novaVelocidade / 2;
        }

        try {
            verificaVelocidadeMáxima(novaVelocidade);
            this.velocidadeAtual = novaVelocidade;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public void setEhConversivel(boolean ehConversivel) {
        this.ehConversivel = ehConversivel;
    }

    public boolean isEhConversivel() {
        return this.ehConversivel;
    }

    public static int getQuantidadeDeCarros() {
        return Carro.quantidadeDeCarros;
    }

    @Override
    public void abastecer(double quantidade) {
        this.tanque = quantidade;
    }
}
