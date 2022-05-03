package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ManipuladorDeContas {

    private Conta conta;

    public void criaConta(Evento evento){
        String tipo = evento.getSelecionadoNoRadio("tipo");
        if (tipo.equals("Conta Corrente")) {
            this.conta = new ContaCorrente();
        }
        else if(tipo.equals("Conta Poupança")){
            this.conta = new ContaPoupanca();
        }
        conta.setNumeroAgencia(evento.getInt("agencia"));
        conta.setNumeroConta(evento.getInt("numero"));
        conta.setTitular(evento.getString("titular"));


    }

    public void deposita( Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");
        this.conta.depositaDinheiro(valorDigitado);
    }

    public void saca(Evento evento){
        double valorDigitado = evento.getDouble("valorOperacao");

        this.conta.sacaDinheiro(valorDigitado);
    }

    public void transfere(Evento evento){
        double valorDigitado = evento.getDouble("valorTransferencia");
        Conta contaDestino = (Conta) evento.getSelecionadoNoCombo("destino");
        this.conta.transfereDinheiro(valorDigitado, contaDestino);
    }

    public void ordenaLista(Evento evento){
        List<Conta> contas = evento.getLista("destino");
        Collections.sort(contas);
    }
}





















