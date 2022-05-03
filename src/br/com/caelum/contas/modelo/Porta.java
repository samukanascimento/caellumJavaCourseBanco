package br.com.caelum.contas.modelo;

public class Porta {
    private String nome;
    private String status;
    private String cor;

    public Porta(String nome) {
        this.nome = nome;
        setToDefault();
        System.out.println("Você criou a " + this.nome + "! Por padrão, sua cor é " + this.cor + " e ela ficará "
                + this.status + " até você adicioná-la na casa.");
    }

    public void setToDefault(){
        status = "Aberta";
        cor = "Branca";
    }

    public void abre(){
        setStatus("Aberta");
        System.out.println(nome + " aberta!");
    }
    public void fecha(){
        setStatus("Fechada");
        System.out.println(nome + " fechada!");
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println(nome + " pintada de " + cor);
    }

    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    public String getCor() {
        return cor;
    }

    public String getNome(){
        return nome;
    }
}
