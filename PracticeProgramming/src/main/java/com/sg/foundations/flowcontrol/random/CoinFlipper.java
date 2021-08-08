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
public class CoinFlipper {
    
    public static void main(String[] args) {
        Random coinflip = new Random();
        
        boolean result = coinflip.nextBoolean();
        
        System.out.println("Ready, Set, Flip....!!!!");
        if (result == true){
            System.out.println("You got Head");
            
        }else{
            System.out.println("You got Tails");
        }
        
        
    }
    
    
}
