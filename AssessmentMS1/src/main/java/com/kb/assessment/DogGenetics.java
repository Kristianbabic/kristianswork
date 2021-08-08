  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kb.assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author babic
 */
public class DogGenetics {
    
    public static void main(String[] args) {
            
    Scanner DogDNA = new Scanner (System.in);
    Random DNA = new Random();
    
    String DogName;
    
    System.out.println("What's your dog's name? ");
    DogName = DogDNA.nextLine();
    
    System.out.println("Well then, I have this highly reliable report on " + DogName + "'s");
    System.out.println("prestigious background right here.");
    
    while (true){
    
    int dog1;
    int dog2;
    int dog3;
    int dog4;
    int dog5;
    
    
   dog1 = DNA.nextInt(100)+1;
       
   dog2 = DNA.nextInt(100)+1;   
        
   dog3 = DNA.nextInt(100)+1;
        
   dog4 = DNA.nextInt(100)+1;   
       
   dog5 = DNA.nextInt(100)+1;   
     
  if (dog1 + dog2 + dog3 + dog4 + dog5 == 100){
       System.out.println(DogName + " is: ");
       System.out.println(dog1 + "%" + " Doberman");
       System.out.println(dog2 + "%" + " German Shepherd");
       System.out.println(dog3 + "%" + " Chihuahua");
       System.out.println(dog4 + "%" + " Border Collie");
       System.out.println(dog5 + "%" + " St. Bernard");
       System.out.println("Wow that's QUITE the dog!");
  break;
  
  }
  
   
      
    
    }    
    }
    
}
