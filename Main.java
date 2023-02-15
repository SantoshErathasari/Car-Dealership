/*Santosh 
  June, 2th
  Purpose: to create a car dealership 
*/
//start of class
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    //declaring Variables
    String userSelectionModel;
    String userSelectionLeather;
    String userSelectionColor;
    String userConfirmation;
    double modelPrice =0;
    double modelPrice2 =0;
    

    
    Scanner reader = new Scanner (System.in); 
    
//printing welocome message    
    System.out.println("Welcome to Santosh's Car Dealership!");
    
//looping the prgoram if user wants modifications
do{
  
//validating user selections to only be Suv or sedan
    do{
      System.out.println("");
      System.out.println("Select between a Sedan or SUV by typing which one you want");
        userSelectionModel = reader.nextLine();

//loop sentinal is sedan or suv to progress to next selection
    }while(!(userSelectionModel.equalsIgnoreCase("sedan")||userSelectionModel.equalsIgnoreCase("SUV")));
  
    if((userSelectionModel.equalsIgnoreCase("sedan"))){
      
       modelPrice = 18543.90;
       
      }
      
    else if((userSelectionModel.equalsIgnoreCase("suv"))){
      
      modelPrice = 56790.00;
      
    }
            
//valides leather choice to be yes or no
    do{
      System.out.println("");
      System.out.println("Do you want a leather finish. The price will increase by 10% if you want it");
      userSelectionLeather = reader.nextLine();
      
      
    }while(!(userSelectionLeather.equalsIgnoreCase("yes")||(userSelectionLeather.equalsIgnoreCase("no"))));

//leather is an extra 10% of the vehicle
  if((userSelectionLeather.equalsIgnoreCase("yes"))){
      
       modelPrice = (modelPrice*0.10+(modelPrice));
       
      }
 //no leather no price increase     
    else if((userSelectionLeather.equalsIgnoreCase("no"))){
      
    }

//validates color choice to only be white or red
   do{ 
    System.out.println("");
    System.out.println("Which color would you like. You can choose between white and red. White is free but red is an extra $2000");
     userSelectionColor = reader.nextLine();
  
    

//loop sentinal is red or white    
     }while(!(userSelectionColor.equalsIgnoreCase("red")||(userSelectionColor.equalsIgnoreCase("White"))));

//red is an additional 2000
      if((userSelectionColor.equalsIgnoreCase("red"))){
         modelPrice = modelPrice+2000;
     
      }

//no price increase for white
    else if((userSelectionColor.equalsIgnoreCase("white"))){
      

      
    }

  

//putting in user selections and subtotal
  
    System.out.println("");
    System.out.println("You choose: " + userSelectionModel);
    System.out.println("You choose: " + userSelectionLeather);
    System.out.println("You choose: " + userSelectionColor);
    System.out.println("");
    System.out.println("");
    System.out.println("SubTotal: $" + modelPrice);
  
    System.out.println("");
    System.out.println("Would you like to modify your changes. If so type yes. Otherwise type anything else to continue to your total");
      userConfirmation = reader.nextLine();

//loop if the user wants to redo all selections. sentinal is anything thats not yes
  
    }while(userConfirmation.equalsIgnoreCase("yes"));

//printing  tax and total and goodbye

    System.out.println("Tax: $" + (modelPrice*0.13));
    System.out.println("SubTotal: $" + ((modelPrice*0.13)+(modelPrice)));
    System.out.println("");
System.out.println("THANKS FOR SHOPPING BYE!");
  
  

  
    
    
    

     
      
        
      

    
  }//End of Main function
}//End of Class