/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author babic
 */
public class MoreBucketsMoreFun {
    public static void main(String[] args) {
        
        int butterflies, beetles, bugs;
        
        butterflies = 5;
        beetles = 9;
        
        bugs = butterflies + beetles;
        
        System.out.println("There are only " + butterflies + " butterflies,");
        System.out.println("but there are " + bugs + " bugs in all.");
        System.out.println("Uh ph, my dog ate one.");
        butterflies--;
        System.out.println("Now there sre only " + butterflies + " butterflies left.");
        System.out.println("But still " + bugs + " bugs left...");
        System.out.print("Wait a minutes!");
        System.out.println("...maybe my computer can't do math, after all!");
        
    }
    
}
