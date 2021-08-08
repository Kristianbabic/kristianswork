/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundation.basics;

/**
 *
 * @author babic
 */
public class AllTheMaths {
    
    public static void main(String[] args) {
        
        System.out.print("1 + 2 is: ");
       
        int sum = 0;
        int operand1 = 1;
        int operand2 = 2;
        sum = operand1 + operand2;
        System.out.println("" + sum);
        
        
        System.out.print("42001 modulus 5 is: ");
        
        float modulus;
        modulus = 42001 % 5;
        System.out.println("" + modulus);
        
        
        System.out.print("5565.0 divided by 22 is: ");
        
        float result;
        result = 5565.0f / 22f;
        System.out.println("" + result);
        
        
        System.out.print("223 times 31 -42: ");
        
        float resulttwo;
        resulttwo = 223f * 31f - 42f;
        System.out.println("" + resulttwo);
        
        System.out.print("Is 4 greater than -1? ");
        boolean isDone;
        isDone = true;
        
        System.out.println("" +isDone);
        
        System.out.println("\n****** Now make the computer do some harder math!");
       
        System.out.print("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: ");
        
        float number;
        number = 8043.52f - 4.2f + 23.0f / 56.0f * -76.13f;
        
        System.out.println("" + number);

        System.out.print("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
        float numbertwo;
                numbertwo = 11111 % 3 - 67 - 1 + 9;
        
        System.out.println("" +numbertwo);

        System.out.print("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is : ");
        float numberthree;
        numberthree = 44 - 22 + 11 - 66 - 88 + 76 - 11 - 33;
        
        System.out.println("" +numberthree);

        System.out.print("22 times 3 minus 1 plus 4 times 6 minus -9 is : ");
        float x;
                x = 22 * 3 - 1 + 4 * 6 - -9;
        
        System.out.println("" +x);

        System.out.print("Is 67 greater than 4 * 5? ");
         
        
        System.out.println("67 is greater than 4 * 5: " +isDone);

        System.out.print("Is 78 less than 4 * 5? ");
        boolean idk;
        idk = false;
        
        System.out.print("78 is less than + 4 * 5: " +idk);
   
        
    }

}
