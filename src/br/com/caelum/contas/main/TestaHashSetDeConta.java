package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashSet;

public class TestaHashSetDeConta {
    public static void main(String[] args) {
        HashSet<Conta> contas = new HashSet<>();

        ContaCorrente c1 = new ContaCorrente();
        c1.setNumeroConta(1);
        c1.setNumeroAgencia(1000);
        c1.setTitular("Batman");

        ContaCorrente c2 = new ContaCorrente();
        c2.setNumeroConta(1);
        c2.setNumeroAgencia(1000);
        c2.setTitular("Robin");

        ContaCorrente c3 = new ContaCorrente();
        c3.setNumeroConta(2);
        c3.setNumeroAgencia(1000);
        c3.setTitular("Coringa");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        System.out.println("Total de contas no HashSet: " + contas.size());

    }
}
