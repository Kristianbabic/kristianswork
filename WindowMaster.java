
package com.kb.windowmaster;

import java.util.Scanner;

/**
 *
 * @author: Kristian Babic
 * e-mail: Kristianbabic75@gmail.com
 * date:: 24.06.2021
 */
public class WindowMaster {
    public static void main(String [] args) {
       
// try catch trial
        try {
        
        float height;
        float width;
        
     //Refactor amount of windows
        float numberOfWindows;
        
        
     //Refactor manual price entry   
        float priceWindow;
        float priceTrim;
        
        
        
        String stringHeight;
        String stringWidth;
        
         //Refactor amount of windows
        String stringNumber;
        
        //Refactor manual price entry
        String stringpriceWindow;
        String stringpriceTrim;
                
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
                
        Scanner myScanner = new Scanner(System.in);
        
   
        
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        
        System.out.println("Please enter your window width");
        stringWidth = myScanner.nextLine();
        
        //Refactor manual price entry
        System.out.println("Enter the price of the Window");
        stringpriceWindow = myScanner.nextLine();
        
        System.out.println("Enter the price of the Trim");
        stringpriceTrim = myScanner.nextLine();
        
         //Refactor amount of windows
        
        System.out.println("Number of Windows");
        stringNumber = myScanner.nextLine();
        
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        //Refactor amount of windows
         numberOfWindows = Float.parseFloat(stringNumber);
        
       //Refactor manual price entry
       priceWindow = Float.parseFloat(stringpriceWindow);
       priceTrim = Float.parseFloat(stringpriceTrim);
        
  
          
        areaOfWindow = height * width;
        perimeterOfWindow = 2* (height + width);
        
        //Refactot Manual Price entry and Amount of Windows
        cost = ((areaOfWindow * priceWindow) + (priceTrim * perimeterOfWindow)) * (numberOfWindows);
        
              
                
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Cost = " + cost);
        
        // Try Catch trial
    String input = myScanner.nextLine();
    int number = Integer.parseInt(input);  
  } catch(NumberFormatException ex) {
    System.out.println("Wrong entry. Please enter numbers only");
}
 }
}
/**
 * It works fine for the calculation and catching any words
 * but when I hit enter after the system gives me the cost 
 * then I get the message error Message. I understand that because enter is
 * not a number. However I don't know how to bypass it.
 */
   