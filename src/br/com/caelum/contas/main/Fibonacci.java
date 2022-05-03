package br.com.caelum.contas.main;

public class Fibonacci {
    public static void main(String[] args){

        int limit = 20;
        StringBuilder print = new StringBuilder();

        long[] series = new long[limit];

        // Initialize the first two elements
        series[0] = 0;
        series[1] = 1;

        // Append the first two elements to Stringbuilder
        print.append(series[0]).append(" ");
        print.append(series[1]).append(" ");

        // Create the Fibonacci sequence and store in an array
        for (int i = 2; i < series.length; i++) {
            series[i] = series[i-1] + series[i-2];
            // Append the sequence to StringBuilder
            print.append(series[i]).append(" ");
        }

        // Print the whole sequence
        System.out.println(print);

    }
}
