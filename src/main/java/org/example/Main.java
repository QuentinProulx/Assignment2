// @Quentin Proulx
// Retail Prices

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------");
        System.out.println("RETAIL PRICES");
        System.out.println("------------\n");

        Scanner sc = new Scanner(System.in);

        boolean looping = true; // is the while loop active
        
        double price = 0; // empty double to define variable prices
        double total = 0; // used to calculate total after every iteration

        // loops until the 0 case is selected

        while (looping) {

            System.out.print("Enter product number (1-5 or 0 to stop): ");
            byte num = sc.nextByte();

            switch (num) {

                case 1:
                    price = 2.98;
                    break;
                case 2:
                    price = 4.50;
                    break;
                case 3:
                    price = 9.98;
                    break;
                case 4:
                    price = 4.49;
                    break;
                case 5:
                    price = 6.87;
                    break;
                case 0:
                    looping = false;
                    continue;

            }

            // Prompts user for quantity sold

            System.out.print("Enter quantity sold: ");
            int quantity = sc.nextInt();

            total = total + quantity * price;
            price = 0;

        }

        System.out.println("\n------------");
        System.out.println("Total retail value of all products sold is: $"+total);
        System.out.println("------------");

    }
}