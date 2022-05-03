package br.com.caelum.contas.main;

public class TestaSplit {
    public static void main(String[] args) {
        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String[] palavras = frase.split(" ");
        //StringBuilder outraFrase = new StringBuilder();
        String outraFrase = "";

        for (int i = palavras.length-1; i >=0 ; i--) {
            if(i>0) {
                //outraFrase.append(palavras[i]).append(" ");
                outraFrase += (palavras[i] + " ");
            } else {
                //outraFrase.append(palavras[i]);
                outraFrase += (palavras[i]);
            }
        }

        System.out.println(outraFrase);
    }
}
