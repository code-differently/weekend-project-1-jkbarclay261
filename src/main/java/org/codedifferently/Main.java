package org.codedifferently;

import java.util.Scanner;

import static org.codedifferently.randomGenerator.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your budget: ");
       double Budget = scanner.nextDouble();

        System.out.println("Enter a coupon code: ");
        String code = scanner.next();


        Object receipt;
        String[] strings = args;{
            int visitID = randomVisitID();
            double price1 = itemPrice(1);
            double price2 = itemPrice(2);
            double price3 = itemPrice(3);
            double tax = taxRate();
            double subTotal = subtotal(price1, price2, price3);

            System.out.println("-----Welcome to JKB's store-----");

            System.out.println("Visit ID: " + visitID);
            System.out.println("Item 1 Price: $" + String.format("%.2f", price1));
            System.out.println("Item 2 Price: $" + String.format("%.2f", price2));
            System.out.println("Item 3 Price: $" + String.format("%.2f", price3));
            System.out.println("Tax Rate: " + String.format("%.2f", tax * 100) + "%");

        }

    }




    }

