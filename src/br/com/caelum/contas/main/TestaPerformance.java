package br.com.caelum.contas.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {

        System.out.println("Iniciando...");

        Collection<Integer> teste = new ArrayList<>();

        long inicio = System.currentTimeMillis();
        long fim;
        long tempo;
        long tempoIns;
        long tempoLeitura;
        int total = 300000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
            //System.out.println("Inserindo - " + i + "/" + total);
        }
        tempoIns = System.currentTimeMillis() - inicio;
        System.out.println("Tempo inserção: " + tempoIns + "ms");

        for (int i = 0; i < total; i++) {
            teste.contains(i);
            //System.out.println("Pesquisando - " + i + "/" + total);
        }
        tempoLeitura = System.currentTimeMillis() - inicio;
        System.out.println("Tempo leitura: " + (tempoLeitura - tempoIns) + "ms");

        fim = System.currentTimeMillis();
        tempo = fim - inicio;

        System.out.println("Tempo total gasto: " + tempo + "ms");

    }
}
