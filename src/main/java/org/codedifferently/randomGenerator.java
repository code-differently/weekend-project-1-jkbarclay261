package org.codedifferently;

import java.util.Random;

//Your program must generate random values for:
//
//A visit ID (example range: 1000–9999)
//Three item prices (you decide realistic ranges)
//A tax rate, fee
public class randomGenerator {
    public static Random randomMethods = new Random();
    //A visit ID (example range: 1000–9999)

   public static int randomVisitID(){
       return randomMethods.nextInt(9999) + 1000;
   }

   public static int length( int randomVisitID) {
       return Integer.toString(randomVisitID).length();
   }

    public static double itemPrice (double itemNumber){
// Creating method random item prices
       double minPrice = 0.99;
       double maxPrice = 99.99;
       return minPrice + (maxPrice - minPrice) * randomMethods.nextDouble();
       }
 // Creating a method to generate a rate ranging 0.0 to 0.25
     public static double taxRate() {
       return 0.0 + 0.25 * randomMethods.nextDouble();


    }
}
//Reassigning the methods to call later in main
     //  public static void main (String[] args) {
       //     int visitID =  randomGenerator.randomVisitID();
            //int idLength = randomGenerator.length(randomVisitID);
         //   double price1 = randomGenerator.itemPrice(1);
           // double price2 = randomGenerator.itemPrice(2);
            //double price3 = randomGenerator.itemPrice(3);
            //double tax = randomGenerator.taxRate();


        //}
       // Visit ID (1000–9999)














