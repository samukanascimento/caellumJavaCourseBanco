package br.com.caelum.contas.modelo;

import com.sun.istack.internal.NotNull;

public class ContaPoupanca extends Conta {

    @Override
    public String getTipo(){
        return "Conta Poupança";
    }

    @Override
    public int compareTo(@NotNull Conta o) {
        return 0;
    }
}
