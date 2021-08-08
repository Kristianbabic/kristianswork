
package com.kb.assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author babic
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner youChoose = new Scanner (System.in);
        Random RPScreator = new Random();
     
      
        
       String stringchoice;
       String stringnumberOfGames;
       String Rock;
       String Paper;
       String Scissors3;
       String Playagain;
     do{    
       
        int randomNumber;
        int pick;
        int howmanygames;
        int gamecounter = 0; 
        int Iwin = 0;
        int Uwin = 0;
        int tie = 0;
        
       
        System.out.println("LETS PLAY Rock, Paper, Scissors");
       
           
       
       do{ 
        System.out.println("How many rounds between 1 and 10 would you like to play");
        stringnumberOfGames = youChoose.nextLine();
        howmanygames = Integer.parseInt(stringnumberOfGames);
      
            
      if (howmanygames > 10 || howmanygames < 1) {
          System.out.println("Invalid entry");
      return;
      
      }
        
       
      } while (howmanygames > 10 || howmanygames < 1); 
     
        
        
       System.out.println("You picked " + stringnumberOfGames + " round(s)!");
          
        
        
      
        
        do{
            randomNumber = RPScreator.nextInt(3)+1;
        
            System.out.println("TESTNUMBER  " + randomNumber);
        
            System.out.println("");
            
        System.out.println("Choose (1) for Rock / (2) for Paper or / (3) for scissors: ");
        stringchoice = youChoose.nextLine();
        pick = Integer.parseInt(stringchoice);
        
        
        
                
        gamecounter ++;
       
        if (pick == 1){
        System.out.println("You picked Rock");        
        }
            
            
        if (pick == 2){
          System.out.println("You picked Paper");  
        }
           
            
        if (pick == 3){
        System.out.println("You picked Scissors");  
        }
         
            
        else if (pick < 1 || pick > 3){
            System.out.println("THIS IS NOT THE CORRECT CHOICE");
        }
        
            System.out.println("");
        
        if (randomNumber == pick){
            
          tie = tie + 1;
            
            System.out.println("Hey we chose the same!!");
            System.out.println("It's a tie");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
        } 
        
            
            
            
        if (randomNumber == 1 && pick == 2){
            Uwin = Uwin + 1;
            
            System.out.println("I picked Rock!");
            System.out.println("Congratulations you win this round!");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
            
        }
        
            
            
            
        if (randomNumber == 1 && pick == 3){
            Iwin = Iwin +1;
            
            System.out.println("I picked Rock!");
            System.out.println("Too bad so sad! I win!!");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
            
        }
        
            
            
            
        if (randomNumber == 2 && pick == 1){
            Iwin = Iwin +1;
            
            System.out.println("I picked Paper!");
            System.out.println("Too bad so sad! I win!!");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
        }
        
            
            
            
        if (randomNumber == 2 && pick == 3){
            Uwin = Uwin +1;
            
            System.out.println("I picked Paper!");
            System.out.println("Congratulations you win this round!!");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
        }
        
            
            
            
        if (randomNumber == 3 && pick == 1){
            Uwin = Uwin +1;
            
            System.out.println("I picked Scissors");
            System.out.println("Congratulations you win this round!!");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
    }
        
            
            
            
        if (randomNumber == 3 && pick == 2){
            Iwin = Iwin +1;
            
            System.out.println("I picked Scissors");
            System.out.println("Too bad so sad! I win");
            System.out.println("Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
        }
        
                      
              System.out.println("");  
                
        }while (howmanygames > gamecounter);
        
        System.out.println("");
        
        System.out.println("***************************************************");
        System.out.println("Final Score: Your Points: " + Uwin + " My Points: " + Iwin + " Ties: " + tie);
        System.out.println("***************************************************");
        
        System.out.println("");
        
        if (Uwin > Iwin && Uwin > tie){
            System.out.println("Congratulations you are the champion!");
        }
        
        if (Iwin > Uwin && Iwin > tie) {
            System.out.println("Yay me!! I am the best!");
        }
        
        if ( tie > Iwin && tie > Iwin) {
            System.out.println("Hmmm I gues -Ties- wins! I hate that guy!");
        }
        
        System.out.println("");
        System.out.println("Do you want to play again (Yes / No): ");
        
        Playagain = youChoose.nextLine();
        
        if (Playagain.equalsIgnoreCase ("No")){
            System.out.println("Thanks for playing! Come back for another try soon!");
        }
     }while (Playagain.equalsIgnoreCase("Yes")); 
          
          
      }

    
    
 
                
}

