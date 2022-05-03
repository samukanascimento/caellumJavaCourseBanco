package br.com.caelum.contas.modelo;

import java.util.*;

public class Banco {
    private String nome;
    private int numero;
    private List<Conta> contas = new ArrayList<>();
    private Map<String, Conta> indexadoPorNome = new HashMap<>();

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    private Conta[] expandirArray(Conta[] arrayAtual, int tamExpansao){
        int oldLenth = arrayAtual.length;
        int newLenght = (oldLenth + tamExpansao);

        Conta[] newArray = new Conta[newLenght];

        for (int i = 0; i < oldLenth; i++) {
            newArray[i] = arrayAtual[i];
        }

        return newArray;
    }

    public void adiciona(Conta conta) {
        contas.add(conta);
        indexadoPorNome.put(conta.getTitular(), conta);
    }

    public Conta pega(int posicao){
        return contas.get(posicao);
    }

    public int pegaQuantidadeDeContas(){
        return contas.size();
    }

    public Conta buscaPorTitular(String titular){
        return indexadoPorNome.get(titular);
    }

    public boolean contem(Conta conta){
        for (Conta value : this.contas) {
            if (conta.toString().equals(value.toString()))
                return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
