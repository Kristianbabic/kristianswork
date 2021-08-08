/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author babic
 */
public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        //System.out.println("Random can make integers: " + randomizer.nextInt());
        //System.out.println("Or a double: " + randomizer.nextDouble());
        //System.out.println("Or even a boolean " + randomizer.nextBoolean());
        
       // int num = randomizer.nextInt(6) + 1;
        
        
       // System.out.println("You can store a randomized result: " + num);
      //  System.out.println("And use it all over and over again: " + num + ", " + num);
        
        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");
        
        //System.out.print(randomizer.nextInt(51) + 50 + ", ");
        //System.out.print(randomizer.nextInt(51) + 50 +", ");
        //System.out.print(randomizer.nextInt(51) + 50 + ", ");
        //System.out.print(randomizer.nextInt(51) + 50 + ", ");
        //System.out.print(randomizer.nextInt(51) + 50 + ", ");
        //System.out.println(randomizer.nextInt(101));
    
        int result1 = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);
        int result2 = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);
        int result3 = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);
        int result4 = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);
        int result5 = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);       
        int result6 = (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1) + (randomizer.nextInt(6) + 1);
        
        
        
        System.out.println("Str. " + result1);
        System.out.println("Dex. " + result2);
        System.out.println("Con. " + result3);
        System.out.println("Int, " + result4);
        System.out.println("Wis. " + result5);
        System.out.println("Cha. " + result6);
        
        
        
    }
}
