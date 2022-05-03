package br.com.caelum.contas;

import br.com.caelum.contas.modelo.SeguroDeVida;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeSeguroDeVida {

    private SeguroDeVida seguro;

    public void criaSeguro (Evento evento){
        seguro = new SeguroDeVida();

        seguro.setNumeroApolice(evento.getInt("numeroApolice"));
        seguro.setTitular(evento.getString("titular"));
        seguro.setValor(evento.getDouble("valor"));
    }
}
