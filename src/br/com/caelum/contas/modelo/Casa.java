package br.com.caelum.contas.modelo;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Casa {

    private String cor;
    private int totalDePortas;
    private Porta portas[];

    public Casa(String cor) {
        this.cor = cor;
        this.totalDePortas = 0;
        this.portas = new Porta[2];
        System.out.println("Bem vindo a sua nova casa " + cor);
    }

    // Pinta a casa
    public void pinta(String cor){
        this.cor = cor;
    }

    // Retorna a quantidade de portas que estão com o status "Aberto"
    public int quantasPortasEstaoAbertas(){
        int counter=0;
        for (Porta p : this.portas) {
            if(p == null)
                break;
            else if(p.getStatus().equals("Aberta"))
                counter++;
        }
        return counter;
    }

    // Cria mais espaços para portas
    private Porta[] criaEspacos(Porta[] portasAtuais, int espacos){

        Porta[] novosEspacos = new Porta[(portasAtuais.length + espacos)]; // Cria um novo array de portas com o tamanho atual + o tamanho passado

        // Transfere as portas existentes para os novos espaços
        for (int i = 0; i < portasAtuais.length; i++) {
            novosEspacos[i] = portasAtuais[i];
        }
        System.out.println("Foram criados mais " + espacos + " espaços para portas.");
        return novosEspacos;
    }

    // Adiciona uma porta
    public void adicionaPorta(Porta p){
        int i;
        for (i = 0; i < portas.length; i++) {
            if((i == portas.length - 1) && (portas[i] != null))
                //throw new ArrayStoreException("Não há mais espaço para adicionar portas");
                portas = criaEspacos(portas, 2);
            else if(portas[i] == null)
                break;
        }
        portas[i] = p;
        totalDePortas++;
        System.out.println(p.getNome() + " adicionada à casa com sucesso!");
    }

    // Retorna a quantidade de portas na casa
    public int totalDePortas(){
        return totalDePortas;
    }

}

























