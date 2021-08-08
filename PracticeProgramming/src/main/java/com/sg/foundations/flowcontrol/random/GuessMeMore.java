
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author babic
 */
public class GuessMeMore {
    public static void main(String[] args) {
        Scanner choseNumber = new Scanner (System.in);
        Random Number = new Random();
        
        String stringnumber;
        int randomNumber;
        int number;
        int count;
        
        
        randomNumber = Number.nextInt(101+100) - 100;
        count = 1;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        
        do{
       
        System.out.println("Choose a number: ");
        count++;
        stringnumber = choseNumber.nextLine();
        number = Integer.parseInt(stringnumber);   
        
        System.out.println("You guessed: " + stringnumber);
        
        if (number == randomNumber){
            System.out.println("Wow! You guessed it");
        } 
        if (number > randomNumber){
            System.out.println("HA!, too high.");
        }
        if (number < randomNumber){
            System.out.println("HA!, too low.");
        }
            System.out.println("");
        
        if (count <= 2){
            System.out.println("Try one more time");
        }

        if (count > 2){
            break;
        }
    //For testing System.out.println("The Random number was: " + randomNumber);
        }while (number < randomNumber || number > randomNumber); 
         
     System.out.println("The Random number was: " + randomNumber);
        
    }
        
     
        //System.out.println("The Random number was: " + randomNumber);
                  
    }

