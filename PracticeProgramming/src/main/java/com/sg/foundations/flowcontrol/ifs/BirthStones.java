/*
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author babic
 */
public class BirthStones {
    public static void main(String[] args) {
        Scanner InputReader = new Scanner(System.in);
        
       String month;
       int birthmonth;
        
        System.out.println("Please enther the NUMBER of the month you where born: ");
        month = InputReader.nextLine();
       
        birthmonth = Integer.parseInt(month);
        
        if (birthmonth == 1){
            System.out.println("Your birth month is January. Your birthstone is Garnet");
        }
        
        else if (birthmonth == 2) {
            System.out.println("Your birth month is February. Your birthstone is Amethyst");
        }
        
        else if (birthmonth == 3) {
            System.out.println("Your birth month is March. Your birthstone is Aquamarine");
        }
        
        else if (birthmonth == 4) {
            System.out.println("Your birth month is April. Your birthstone is Diamond");
        }     
        
        else if (birthmonth == 5) {
            System.out.println("Your birth month is May. Your birthstone is Emerald");
        }
         
        else if (birthmonth == 6) {
            System.out.println("Your birth month is June. Your birthstone is Pearl");
        }
         
        else if (birthmonth == 7) {
            System.out.println("Your birth month is July. Your birthstone is Ruby");
        }
          
        else if (birthmonth == 8) {
            System.out.println("Your birth month is August. Your birthstone is Peridot");
        } 
          
          
        else  if (birthmonth == 9) {
            System.out.println("Your birth month is September. Your birthstone is Sapphire");
        }
          
        else  if (birthmonth == 10) {
            System.out.println("Your birth month is October. Your birthstone is Opal");
        }
          
          
        else if (birthmonth == 11) {
            System.out.println("Your birth month is November. Your birthstone is Topaz");
        }
          
        else if (birthmonth == 12) {
            System.out.println("Your birth month is December. Your birthstone is Turquoise");
        }
          
        else {
            System.out.println("You must be an Alien! This month doesn't match an earth month");
        }
        
    }
    
}
