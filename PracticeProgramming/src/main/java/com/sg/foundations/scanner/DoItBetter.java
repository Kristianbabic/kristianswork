/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author babic
 */
public class DoItBetter {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner (System.in);
        
        int miles;
        int hotdogs;
        int languages;
                
        String stringmiles;
        String stringhotdogs;
        String stringlanguages;
                
        
        
        System.out.println("How many miles can you run?");
        stringmiles = inputReader.nextLine();
        System.out.print("Only " + stringmiles + " miles?");
        
        miles = Integer.parseInt(stringmiles);
        
        System.out.println(" I can run " + ((miles * 2) + 1) + " miles");
        
        System.out.println("");
       
        System.out.println("How many hot dogs can you eat?");
        stringhotdogs = inputReader.nextLine();
        System.out.print("Only " + stringhotdogs + " hot dogs?");
        
        hotdogs = Integer.parseInt(stringhotdogs);
        
        System.out.println(" I can eat " + ((hotdogs * 2) + 1) + " hot dogs");
        
        System.out.println("");
        
        System.out.println("How many language do you speak?");
        stringlanguages = inputReader.nextLine();
        System.out.print("Only " + stringlanguages + " languages?");
        
        languages = Integer.parseInt(stringlanguages);
        
        System.out.println(" I can speak " + ((languages * 2) + 1) + " languages");
        
        
        
        
        
        
    }
}
