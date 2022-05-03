package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeTributaveis {

    private double total;

    public void calculaImpostos(Evento evento){
        total = 0.0;
        int quantTributaveis = evento.getTamanhoDaLista("listaTributaveis");
        for (int i = 0; i < quantTributaveis; i++) {
            Tributavel t = evento.getTributavel("listaTributaveis", i);
            total += t.getValorImposto();
        }
    }
    public double getTotal(){
        return total;
    }
}
