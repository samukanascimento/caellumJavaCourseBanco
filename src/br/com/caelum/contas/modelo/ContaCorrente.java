package br.com.caelum.contas.modelo;

import org.jetbrains.annotations.NotNull;

public class ContaCorrente extends Conta implements Tributavel {

    @Override
    public String getTipo(){
        return "Conta Corrente";
    }

    @Override
    public void sacaDinheiro(double quantidade){
        if(quantidade > this.saldo)
            throw new SaldoInsuficienteException(quantidade);
        else if (quantidade < 0)
            throw new IllegalArgumentException("Não é possível sacar uma quantidade negativa.");
        else {
            this.saldo -= quantidade;
            System.out.println("Quantidade sacada: R$" + quantidade);
            System.out.println("Saldo atual: R$" + this.saldo);
        }
    }

    @Override
    public double getValorImposto() {
        return (this.saldo * 0.01);
    }

    @Override
    public int compareTo(@NotNull Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
}
























