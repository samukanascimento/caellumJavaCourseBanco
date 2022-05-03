package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TestaLista {
    public static void main(String[] args) {
        List<Conta> contas = new LinkedList<>();
        Random random = new Random();

        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular("Joaozinho");
        c1.setNumeroConta(random.nextInt(2000));
        c1.depositaDinheiro(random.nextInt(10000) + random.nextDouble());
        contas.add(c1);

        ContaCorrente c2 = new ContaCorrente();
        c2.setTitular("Mariinha");
        c2.setNumeroConta(random.nextInt(2000));
        c2.depositaDinheiro(random.nextInt(10000) + random.nextDouble());
        contas.add(c2);

        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular("Lazinho");
        c3.setNumeroConta(random.nextInt(2000));
        c3.depositaDinheiro(random.nextInt(10000) + random.nextDouble());
        contas.add(c3);

        System.out.println(contas);
    }
}
