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
public class TriviaNight {
    public static void main(String[] args) {
            Scanner InputReader = new Scanner(System.in);
            
            
            String one, two, three;
            
            int answerone;
            int answertwo;
            int answerthree;
            
            int score1 = 10;
            int score2 = 10;
            int score3 = 10;
            int wrong = 0;
            
            int oneright;
            int tworight;
            int allthree;
            
            int twowrong;
            int threewrong;
            
            int oneright2;
            int tworight2;
            
            //First Question code
            do{
            System.out.println("Question one");
            System.out.print("1) Blah, blah blah     ");
            System.out.println("2) Blah, blah blah     ");
            System.out.print("3) Blah, blah blah     ");
            System.out.println("4) Blah, Blah blah");
            
            System.out.println("Your Answer: ");
            
            one = InputReader.nextLine();
            answerone = Integer.parseInt(one);
            
            if (answerone == 1){
                System.out.println("Correct! Great Job");
                System.out.println("Your current score: " + score1);
            }
            
            else if ((answerone < 1 || answerone > 4)){
            System.out.println("Choose an answer between 1 and 4. That should be selfevident! Try again!");
            }
            
            } while (answerone < 1 || answerone > 4);
                
                   
                if(answerone != 1) {
                System.out.println("WRONG! Come on the answer was obvious");
                System.out.println("Your current score: " + wrong);
            }
                
            System.out.println("");
            System.out.println("One out of three Completed! Two more to go!");
            System.out.println("");
            
            
            
            //Second question code
            do{
            System.out.println("Question two");
            System.out.print("1) Blah, blah blah     ");
            System.out.println("2) Blah, blah blah     ");
            System.out.print("3) Blah, blah blah     ");
            System.out.println("4) Blah, Blah blah");
            System.out.println("Your Answer: ");
            
            two = InputReader.nextLine();
            answertwo = Integer.parseInt(two);
            
            if (answertwo ==4){
                System.out.println("Correct! Great Job");
            }
            
            if ((answertwo == 4) && (answerone ==1)){
                tworight = score1 + score2;
                System.out.println("Your current score is: " + tworight);
            }
            
            else if ((answertwo < 1) || (answertwo > 4)){
                System.out.println("Choose an answer between 1 and 4. That should be selfevident! Try again!");
            }
            
            } while (answertwo < 1 || answertwo > 4);
            
           
            if(answertwo != 4) {
                System.out.println("WRONG! Come on the answer was obvious");
            }
            
            if ((answerone != 1) && (answertwo != 4)){
                twowrong = wrong + wrong;
                System.out.println("Your Score is " + twowrong);
            }
            if  ((answerone == 1) && (answertwo != 4)){
                oneright = wrong + score1;
                System.out.println("Your Score is " + oneright); 
            }
            
            if ((answerone != 1) && (answertwo == 4)){
                oneright = wrong + score1;
                System.out.println("Your Score is " + oneright);
            }
            
                System.out.println("");
                System.out.println("Two out of three completed! One more to go!");
                System.out.println("");
            
                
            //Third question code
            do{
            System.out.println("Question three");
            System.out.print("1) Blah, blah blah     ");
            System.out.println("2) Blah, blah blah     ");
            System.out.print("3) Blah, blah blah     ");
            System.out.println("4) Blah, Blah blah     ");
            
            System.out.println("Your Answer: ");
            
            three = InputReader.nextLine();
            answerthree = Integer.parseInt(three);
            
            if ((answerthree == 3)&& (answertwo == 4) && (answerone ==1)){
                allthree= score1 + score2 + score3;
                System.out.println("Your Final score is " + allthree);
                System.out.println("Awsome! You're a genius.");
            } 
            
            else if ((answerthree < 1) || (answerthree > 4)){
               System.out.println("Choose an answer between 1 and 4. That should be selfevident!"); 
            }
            
            }while (answerthree < 1 || answerthree > 4);
            
            
            if(answerthree != 3) {
                System.out.println("WRONG! Come on the answer was obvious");
            }
            
            if((answerone != 1) && (answertwo != 4) && (answerthree !=3)) {
            threewrong = wrong + wrong + wrong;
                System.out.println("Your score is " + threewrong);
                System.out.println("Loser! Go back to school.");
            }
            
            if((answerone == 1) && (answertwo != 4) && (answerthree !=3)) {
            oneright2 = score1 + wrong + wrong;
                System.out.println("Your score is " + oneright2);
                System.out.println("Loser! Go back to school.");
            }
  
            
            if((answerone != 1) && (answertwo == 4) && (answerthree !=3)) {
            oneright2 = score2 + wrong + wrong;
                System.out.println("Your score is " + oneright2);
                System.out.println("Loser! Go back to school.");
            }

            
            if((answerone != 1) && (answertwo != 4) && (answerthree ==3)) {
            oneright2 = score3 + wrong + wrong;
                System.out.println("Your score is " + oneright2);
                System.out.println("Loser! Go back to school.");
            }


            if((answerone == 1) && (answertwo == 4) && (answerthree !=3)) {
            tworight2 = score1 + score2 + wrong;
                System.out.println("Your score is " + tworight2);
                System.out.println("Not bad. But you could have done better.");
            }
            
            if((answerone != 1) && (answertwo == 4) && (answerthree ==3)) {
            tworight2 = wrong + score2 + score3;
                System.out.println("Your score is " + tworight2);
                System.out.println("Not bad. But you could have done better.");
            }
            
            
            if((answerone == 1) && (answertwo != 4) && (answerthree ==3)) {
            tworight2 = score1 + wrong + score3;
                System.out.println("Your score is " + tworight2);
                System.out.println("Not bad. But you could have done better.");
            }
            

            
            
            
            
            
            
    }
    
}

