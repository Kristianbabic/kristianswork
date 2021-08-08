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
public class HealthyHearts {
    
    public static void main(String[] args) {
        Scanner healthy = new Scanner (System.in);
        
        int baseHR = 220;
        int age;
        float maxHR;
        float HRzone1;
        float HRzone2;
        
        String stringage;
        
        
        
       
        System.out.println("What is you age?");
        stringage = healthy.nextLine();
        
        age = Integer.parseInt(stringage);
        
        maxHR = baseHR - age;
        
        System.out.println("Your maximun heart rate shoud be " + maxHR + " per minute");
        
        HRzone1 = maxHR / 2;
        HRzone2 = (85 * maxHR) / 100;
        
        System.out.println("Your target HR Zone is " + HRzone1 + " - " + HRzone2 + " beats per minute");
        
        
    }
    
}
