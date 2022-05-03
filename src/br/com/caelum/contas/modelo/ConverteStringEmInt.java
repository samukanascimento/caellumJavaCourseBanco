package br.com.caelum.contas.modelo;

import java.security.InvalidParameterException;

public class ConverteStringEmInt {
    public static int converte(String string) throws Exception {

        int y = 0;
        int position = 0;

        for (int i = string.length()-1; i >= 0; i--){
            char c = string.charAt(i);
            int j = c - '0';

            if(j>9)
                throw new IllegalArgumentException("Não é possivel converter letras em inteiros.");

            y += j * Math.pow(10, position);

            position++;
        }
        return y;
    }
}
