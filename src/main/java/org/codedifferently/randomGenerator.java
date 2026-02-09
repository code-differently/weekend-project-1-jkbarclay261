package org.codedifferently;

import java.util.Random;
//Your program must generate random values for:
//A visit ID (example range: 1000–9999)
//Three item prices (you decide realistic ranges)
//A tax rate, fee
public class randomGenerator {
    public static Random randomMethods = new Random();
    //A visit ID (example range: 1000–9999)
    public static int randomVisitID(){
       return randomMethods.nextInt(9000) + 1000;
   }
    public static double itemPrice (double itemNumber){
// Creating method random item prices
       double minPrice = 0.99;
       double maxPrice = 99.99;
       return minPrice + (maxPrice - minPrice) * randomMethods.nextDouble();
       }
 // Creating a method to generate a rate 0.0 to 0.25 (2%)
     public static double taxRate() {
       return 0.00 + 0.25 * randomMethods.nextDouble();
    }
    public static double subtotal(double price1, double price2, double price3){
        return price1 + price2 + price3;
    }

    public static void main(String[] args) {
        int visitID = randomVisitID();
        double price1 = itemPrice(1);
        double price2 = itemPrice(2);
        double price3 = itemPrice(3);
        double tax = taxRate();
        double subTotal = price1 + price2 + price3;
        double total = subTotal + (subTotal * tax);

        System.out.println("-----Welcome to JKB's store-----");
        System.out.println("Visit ID: "  + visitID);
        System.out.println("Item 1 Price: $" + String.format("%.2f", price1));
        System.out.println("Item 2 Price: $" + String.format("%.2f", price2));
        System.out.println("Item 3 Price: $" + String.format("%.2f", price3));
        System.out.println("Subtotal: $" + String.format("%.2f", subTotal));
        System.out.println("Tax Rate: " + String.format("%.2f", tax * 100) + "%");
        System.out.println("Total: $" + String.format("%.2f", total));

    }
}















