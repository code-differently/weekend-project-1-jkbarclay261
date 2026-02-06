package org.codedifferently;

import java.util.Random;

//Your program must generate random values for:
//
//A visit ID (example range: 1000–9999)
//Three item prices (you decide realistic ranges)
//A tax rate, fee, or discount trigger
public class randomGenerator {
    public static Random randomMethods = new Random();

   public static int randomVisitID(){
       return randomMethods.nextInt(9999) + 1000;
   }


}

       // Visit ID (1000–9999)














