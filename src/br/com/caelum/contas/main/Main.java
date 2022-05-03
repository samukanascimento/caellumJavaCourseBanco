package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Casa;
import br.com.caelum.contas.modelo.Porta;

/**
 * Classe principal
 *
 * @author Samuel Nascimento Filho
 */

public class Main {
    public static void main(String[] args){

        Casa casaAzul = new Casa("Azul");

        Porta portaDaSala = new Porta("Porta da sala");
        Porta portaDaCozinha = new Porta("Porta da cozinha");
        Porta portaDoQuarto = new Porta("Porta do quarto");

        casaAzul.adicionaPorta(portaDaSala);
        casaAzul.adicionaPorta(portaDaCozinha);
        casaAzul.adicionaPorta(portaDoQuarto);

        portaDaSala.abre();
        portaDaCozinha.fecha();
        portaDoQuarto.fecha();

        portaDoQuarto.pintar("Azul marinho");

        System.out.println("Número de portas abertas: " + casaAzul.quantasPortasEstaoAbertas());

        System.out.println("Total de portas na casa " + casaAzul.totalDePortas());

    }
}