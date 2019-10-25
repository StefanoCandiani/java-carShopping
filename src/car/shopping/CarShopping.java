
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;

import java.util.Scanner;

public class CarShopping
{
    
    static Scanner kb = new Scanner(System.in); 

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      if(totalCost > 0){
          totalCost += automaticWindows();
          totalCost += noKey();
          totalCost += oSSystem();
          totalCost += aBS();
          totalCost += adjsPedals();
          totalCost += jmsBondSecGuns();
          totalCost += ledLights();
          totalCost += tankArmor();
          System.out.println("");
          System.out.println("YOUR TOTAL COST IS: ");
          System.out.println("* * * * "+totalCost+" * * * *");
      }
      else if(totalCost <= 0){
          System.out.println("You have not chosen a correct model, please try again...");
      }
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
       System.out.println("Which base model did the customer choose?"
               + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1")){
          return 15000;
      }
      
      else if(model.equalsIgnoreCase("Model 2")){
          return 24000;
      }
      
      else if(model.equalsIgnoreCase("Model 3")){
          return 40000;
      }
      
      else{
          return 0;  
      }
   }
   
   public static int automaticWindows()
   {
      System.out.print("Automatic Windows for $500? (y/n) > ");
      char yesNo = (kb.nextLine()).charAt(0);
      if(yesNo == 'y'){
          return 500;
      }
      else{
          return 0;
      }
   }
   
   public static int noKey(){
       System.out.print("Remote Keyless entry for $1000? (y/n) > ");
       char yesNo = (kb.nextLine()).charAt(0);
      if(yesNo == 'y'){
          return 1000;
      }
      else{
          return 0;
      }
   }
   
   public static int oSSystem(){
       System.out.print("OnStar System for $1000? (y/n) > ");
       char yesNo1 = (kb.nextLine()).charAt(0);
      if(yesNo1 == 'y'){
          return 1000;
      }
      else{
          return 0;
      }
   }
   
   public static int aBS(){
       System.out.print("Anti-lock brakes for $500? (y/n) > ");
       char yesNo1 = (kb.nextLine()).charAt(0);
      if(yesNo1 == 'y'){
          return 500;
      }
      else{
          return 0;
      }
   }
   
   public static int adjsPedals(){
       System.out.print("Telescoping steering/ adjustable pedals for $1000? (y/n) > ");
       char yesNo1 = (kb.nextLine()).charAt(0);
      if(yesNo1 == 'y'){
          return 1000;
      }
      else{
          return 0;
      }
   }
   
   public static int jmsBondSecGuns(){
       System.out.print("Secret James Bond weapons attached for $1000? (y/n) > ");
       char yesNo1 = (kb.nextLine()).charAt(0);
      if(yesNo1 == 'y'){
          return 1000;
      }
      else{
          return 0;
      }
   }
   
   public static int ledLights(){
       System.out.print("Led Lights for $800? (y/n) > ");
       char yesNo = (kb.nextLine()).charAt(0);
       System.out.print("What ");
      if(yesNo == 'y'){
            return 800;
        }
      else{
          return 0;
      }
   }
   
   public static int tankArmor(){
       System.out.print("Tank armor plates for $2000? (y/n) > ");
       char yesNo = (kb.nextLine()).charAt(0);
       if(yesNo == 'y'){
           return 2000;
       }
       else{
           return 0;
       }
   }
}
