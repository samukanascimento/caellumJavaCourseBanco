package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.HashMap;
import java.util.Map;

public class TestaMapa {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        c1.depositaDinheiro(10000);

        Conta c2 = new ContaCorrente();
        c2.depositaDinheiro(3000);

        Map<String, Conta> mapaDeContas = new HashMap<>();

        mapaDeContas.put("diretor", c1);
        mapaDeContas.put("gerente", c2);

        Conta contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());

    }
}
