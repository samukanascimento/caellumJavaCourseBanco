package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Banco;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco("Nubank", 1000);

        for (int i = 0; i < 8; i++) {
            try {
                ContaCorrente conta = new ContaCorrente();
                conta.setTitular("Titular" + (i+1));
                conta.setNumeroConta(i + 1);
                conta.setNumeroAgencia(1000);
                conta.depositaDinheiro(1000 * (i + 1));
                banco.adiciona(conta);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        banco.mostraContas();

    }
}
