/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author babic
 */
public class HighRoller {

    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        Scanner diceChoice = new Scanner (System.in);
        
        String stringdice;
        int dice;
        
       System.out.println("Choose betwenn a (20/12/10/8/6/4)dice enter the # ");
       stringdice = diceChoice.nextLine();
       
       System.out.println("");
       System.out.println("You chose a d" + stringdice);
       System.out.println("");
     
       dice = Integer.parseInt(stringdice);
       
       System.out.println("TIME TO ROOOOOLLLL THE DICE!");
    
        int rollResult = diceRoller.nextInt(dice) + 1;
       
        System.out.println("I rolled a " + rollResult);
        
        if (dice == 20 && rollResult == 1){
        System.out.println("You rolled a critical failure!");
        }
        if (dice == 4 && rollResult == 4){
        System.out.println("Great you rolled maximum damage"); 
        }
        if (dice == 6 && rollResult == 6){
         System.out.println("Great you rolled maximum damage");
        }
        if (dice == 8 && rollResult == 8){
        System.out.println("Great you rolled maximum damage"); 
        }
        if (dice == 10 && rollResult == 10){
        System.out.println("Great you rolled maximum damage");    
        }
        if (dice == 12 && rollResult == 12){
        System.out.println("Great you rolled maximum damage"); 
        }
        if (dice == 20 && rollResult == 20){
        System.out.println("Great you scored a critical hit"); 
        }
        
        } 
    }

    
