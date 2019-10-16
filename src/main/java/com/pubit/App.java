package com.pubit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App.mdc("9 12");
        System.out.println( "Hello World!" );
    }

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
