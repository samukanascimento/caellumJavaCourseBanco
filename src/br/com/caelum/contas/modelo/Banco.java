package br.com.caelum.contas.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Banco {
    private String nome;
    private int numero;
    private Conta[] contas;

    public Banco(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        this.contas = new ContaCorrente[4];
    }

    private Collection<Conta> contass = new ArrayList<>();

    private Conta[] expandirArray(Conta[] arrayAtual, int tamExpansao){
        int oldLenth = arrayAtual.length;
        int newLenght = (oldLenth + tamExpansao);

        Conta[] newArray = new Conta[newLenght];

        for (int i = 0; i < oldLenth; i++) {
            newArray[i] = arrayAtual[i];
        }

        return newArray;
    }

    public void adiciona(Conta conta) throws Exception{
        int i;
        for (i = 0; i < this.contas.length; i++) {
            // Verifica se há espaço para adicionar a conta
            if((i == this.contas.length - 1) && !(this.contas[i] == null)) {
                //throw new ArrayStoreException("Não há mais espaço disponível para adicionar contas.");
                this.contas = expandirArray(this.contas, 2); // Expande o array de contas em 2 posições
            } else if(this.contas[i] == null){
                break; // Se encontrar uma posição vazia, sai do loop
            }
        }
        this.contas[i] = conta;
    }

    public void mostraContas(){
        for (int i = 0; i < this.contas.length; i++) {
            if(contas[i] == null)
                break;
            else{
                System.out.println("\nConta na posição " + i + ":");
                System.out.println(contas[i].toString());
            }
        }
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
