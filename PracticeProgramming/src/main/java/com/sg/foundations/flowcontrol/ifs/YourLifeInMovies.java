
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author babic
 */
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner InputReader = new Scanner(System.in);
        
        String name, stringyear;
        int year;
        
        System.out.println("What is your name");
        name = InputReader.nextLine();
        
        System.out.println("OK, " + name + " when were you born?");
        stringyear = InputReader.nextLine();
        
        year = Integer.parseInt (stringyear);
        
        if (year > 2005) {
            System.out.println("You are too young I can't make you feel old!");
        }
        
        if (year == 2005) {
            System.out.println("Did you know that Finding Nemo came out over 18 years ago?");
        }
        
        if (year < 2005) {
            System.out.println("And did you know that Pixar's 'Up' came out over a decade ago?");
            }
   
        if (year < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago!");
        }
    
        if (year < 1985) {
            System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
        }
    
        if (year < 1975) {
            System.out.println("The original Jurassic Park release is closer to the first lunar landing than it is to today.");
        }
        
        if (year < 1965) {
            System.out.println("The MASH TV series has been around for almost half a century!");
        }
        if (year < 1955) { 
            System.out.println("You are so old! Where the movies even around?");
        }
    
    
    }
    
}
