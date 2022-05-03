package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {
    public static void main(String[] args) {
        Conta[] conta = new Conta[10];

        // Populando o array
        for (int i = 0; i < conta.length; i++) {
            // Cria uma nova conta corrente e atribui à posição i do vetor conta
            conta[i] = new ContaCorrente();
            conta[i].depositaDinheiro(i * 100);
        }

        // Imprime a média dos saldos das contas
        double somaSaldos = 0;
        for (int i = 0; i < conta.length; i++) {
            somaSaldos += conta[i].getSaldo();
        }

        System.out.println("Média dos saldos das contas: R$" + somaSaldos/(double)conta.length);
    }
}
