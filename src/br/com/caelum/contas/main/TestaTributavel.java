package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.*;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositaDinheiro(100);
        System.out.println(cc.getValorImposto());
        // testando polimorfismo:
        Tributavel t = cc;
        System.out.println(t.getValorImposto());
    }
}
