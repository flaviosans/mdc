package com.pubit;

/**
 * Aplicação simples construída com o Maven
 * 
 * @author Stefanie
 * @author Flavio
 * 
 */
public class App 
{
    /**
     * Classe principal da aplicação simples
     * @param args
     */
    public static void main( String[] args )
    {
        App.mdc("9 12");
        System.out.println( "Hello World!" );
    }

    /**
     * Calcula o máximo divisor comum de dois números
     * @param n a string contendo os números
     * @return o máximo divisor comum
     */

    public static int mdc(String n) {

        int[] numbers = new int[2];
        int result = 1;
        String[] nu = n.split(" ");
        numbers[0] = Integer.parseInt(nu[0]);
        numbers[1] = Integer.parseInt(nu[1]);

        for(int i = numbers[0] > numbers[1] ? numbers[0] : numbers[1];i > 2; i--){
            if((numbers[0] % i == 0) && (numbers[1] % i == 0)){
                result = i;
                continue;
            }
        }

        return result;
    }
}
