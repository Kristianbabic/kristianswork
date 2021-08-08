/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kb.assessment;

/**
 *
 * @author babic
 */
public class SummativeSums {

    
    public static void main(String[] args) {
    
    
        System.out.println("#1 Array Sum: " + arrayOne() );
        System.out.println("#2 Array Sum: " + arrayTwo() );
        System.out.println("#3 Array Sum: " + arrayThree() );
          
    }

  
    public static int arrayOne(){
    
       int [] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
       int sumOne = 0; 
     
       for (int i : array1)
             sumOne += i;
             
return sumOne;
}

    
    public static int arrayTwo(){
    
        int [] array2 = { 999, -60, -77, 14, 160, 301 }; 
        int sumTwo = 0;
        
        for (int j : array2)
            sumTwo += j;
        
return sumTwo;
}

        
public static int arrayThree(){
    
        int [] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        int sumThree = 0;
    
        for(int k : array3)
            sumThree += k; 

return sumThree;        
}


}