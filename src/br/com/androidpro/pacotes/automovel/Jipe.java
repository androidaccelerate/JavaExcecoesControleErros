package br.com.androidpro.pacotes.automovel;

import br.com.androidpro.pacotes.tipocombustivel.Alcool;

/**
 * Created by fillipecordeiro on 05/07/16.
 */
public class Jipe extends Automovel implements Alcool {

    private boolean eh4x4;

    @Override
    public void acelera(double velocidade) {
        double novaVelocidade = this.velocidadeAtual + velocidade;

        if (eh4x4) {
            novaVelocidade = novaVelocidade + (novaVelocidade*0.1);
        }

        try {
            verificaVelocidadeMáxima(novaVelocidade);
            this.velocidadeAtual = novaVelocidade;
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public void setEh4x4(boolean eh4x4) {
        this.eh4x4 = eh4x4;
    }

    public boolean isEh4x4() {
        return this.eh4x4;
    }

    @Override
    public void abastecer(double quantidade) {
        this.tanque = quantidade;
    }
}
