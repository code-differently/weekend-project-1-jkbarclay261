package org.codedifferently;

import java.util.Random;
import java.util.Scanner;

public class PracticeClass {
    public static Random randomMethods = new Random();

    public static int randomVisitID(){
        return randomMethods.nextInt(9000) + 1000;
    }

    public static double taxRate() {
        return 0.00 + 0.25 * randomMethods.nextDouble();
    }

    public static double subtotal(double price1, double price2, double price3){
        return price1 + price2 + price3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();

        int visitID = randomVisitID();

        // Random item prices based on budget
        double price1 = 0.2 * budget + randomMethods.nextDouble() * 0.2 * budget;
        double price2 = 0.2 * budget + randomMethods.nextDouble() * 0.2 * budget;
        double price3 = budget - price1 - price2; // remainder

        double subTotal = subtotal(price1, price2, price3);
        double tax = taxRate();
        double total = subTotal + (subTotal * tax);

        System.out.println("-----Welcome to JKB's store-----");
        System.out.println("Visit ID: " + visitID);
        System.out.println("Item 1 Price: $" + String.format("%.2f", price1));
        System.out.println("Item 2 Price: $" + String.format("%.2f", price2));
        System.out.println("Item 3 Price: $" + String.format("%.2f", price3));
        System.out.println("Subtotal: $" + String.format("%.2f", subTotal));
        System.out.println("Tax Rate: " + String.format("%.2f", tax * 100) + "%");
        System.out.println("Total: $" + String.format("%.2f", total));

        // Budget check
        double difference = budget - total;
        if (difference >= 0) {
            System.out.println("Budget remaining: $" + String.format("%.2f", difference));
        } else {
            System.out.println("You are short by: $" + String.format("%.2f", -difference));
        }
    }
}
