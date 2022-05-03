package br.com.caelum.contas.main;

public class TestaString {
    public static void main(String[] args) {
        String s = "fj11";
        String c1 = "Socorram-me, subi no ônibus em Marrocos";
        String c2 = "anotaram a data da maratona";
        String otherWayAroundC1 = "";
        String otherWayAroundC2 = "";
        StringBuilder builderC1 = new StringBuilder();

        for (int i = c1.length()-1; i >= 0; i--) {
            otherWayAroundC1 += c1.charAt(i);
            builderC1.append(c1.charAt(i));
        }

        System.out.println(otherWayAroundC1);
        System.out.println(builderC1);

        for (int i = c2.length()-1; i >= 0; i--)
            otherWayAroundC2 += c2.charAt(i);

        System.out.println(otherWayAroundC2);
    }
}
