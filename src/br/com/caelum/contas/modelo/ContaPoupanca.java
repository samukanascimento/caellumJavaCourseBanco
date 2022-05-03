package br.com.caelum.contas.modelo;

import org.jetbrains.annotations.NotNull;

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
