/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author babic
 */
public class GuessMe {
    public static void main(String[] args) {
        
        Scanner InputReader = new Scanner (System.in);
        
                
        int correctNumb = 45;
        String stringGuess;
        int guess;
        
          
        System.out.println("I've chosen a number. Can you guess it: ");
        stringGuess = InputReader.nextLine();
        System.out.println("Your guess: " + stringGuess);
        
        guess = Integer.parseInt (stringGuess);
        
        if (correctNumb == guess) {
            System.out.println(+ guess + "?" + " Wow, nice guess! That was it!");
        }
                
        if (correctNumb > guess)   {
            System.out.println(+ guess + "?" + " Ha, nice try - too low! I chose " + correctNumb);
        }   
        if (correctNumb < guess)   {
            System.out.println(+ guess + "?" + " Ha, nice try - too high! I chose " + correctNumb);
        }   
    
    
    }  
    
        
     }
    

