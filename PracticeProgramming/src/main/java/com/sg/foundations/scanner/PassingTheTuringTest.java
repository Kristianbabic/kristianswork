package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author babic
 */
public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        Scanner inputReader = new Scanner (System.in);
        
        String name, color, fruit;
        String stringnumber;
        
        float favoritenumber;
        int mynumber = 42;
      
        
        
        System.out.println("Hello there!");
        System.out.println("What is your name? ");
        name = inputReader.nextLine();
        
        System.out.println("Hi " + name + "! I'm Green");
        
        System.out.println("What's your favourite color? ");
        color = inputReader.nextLine();
       
        System.out.println("Huh, " + color + " ? Mine's Green.");
        
        System.out.println("I really like Mangos. They're my favorite fruit.");
        
        System.out.println("What's your favorite fruit " + name + " ?");
        fruit = inputReader.nextLine();
        
        System.out.println("Really? " + fruit + " ? That's Wild!");
        
        System.out.println("Speaking of favorites, what's  your favorite number? ");
        stringnumber = inputReader.nextLine();
        
        favoritenumber = Float.parseFloat(stringnumber);
        
       
        
        System.out.println(+ favoritenumber + " is a cool number. Mine's " + mynumber);
        System.out.println(" Did you know " + favoritenumber + " * " 
                + mynumber + " is " + (favoritenumber * mynumber)+ " ? That's a cool number too!");
        
        System.out.println("Well, thanks for talking to me, " + name);
        
        
        
    }
    
}
