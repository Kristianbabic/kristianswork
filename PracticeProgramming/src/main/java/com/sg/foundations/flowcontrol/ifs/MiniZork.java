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
public class MiniZork {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of of a white house,");
        System.out.println("with a borded up front door.");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go tho the house, or open the mailbox? ");
        
        String action = userInput.nextLine();
        
        if (action.equals("open the mailbox")){
            System.out.println("You open the mailbox.");        
            System.out.println("It's really dark in here");
            System.out.println("Look inside or stick your hand in? ");
        
            action = userInput.nextLine();
            
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                action = userInput.nextLine();
                
                if (action.equals("keep looking")) {
                System.out.println("Turns out, hanging out around dark places isn't a good idea");
                System.out.println("You've been eaten by a grue");
            
                }else if (action.equals("run away")){
                    
              System.out.println("You run away screaming across the fields - looking very foolish");  
              System.out.println("But you are alive. Possibly a wise choice");
            }
        }else if (action.equals("stick you hand in")) {
                System.out.println("You die a painful death.");
                System.out.println("You are eaten alive by some monster.");
        }
       
    } else if (action.equals("go to the house"))
    {
        System.out.println("You stand in front of the house now with a boarded up door.");
        System.out.println("You also see a window");
        System.out.println("Break down the door or go through the window?");
    }
        action = userInput.nextLine();
        
        if (action.equals("break down the door")){
            System.out.println("You try to break down the door by hitting against it with you shoulder");
            System.out.println("At the first try you fall through it into an endless abyss. ");
            System.out.println("Should have checked the handle first.");
        }
        
        else if (action.equals("go through the window")){
            System.out.println("You climb though the window and find a treassure chest right in front of you!");
            System.out.println("you take it home and live happily ever after!");
        }
        
        
    }
}
