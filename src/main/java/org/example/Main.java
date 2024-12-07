// @Quentin Proulx
// World Population Calculator

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------");
        System.out.println("WORLD POPULATION CALCULATOR");
        System.out.println("-----------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the world population: ");
        long people = sc.nextLong();

        System.out.print("Please enter the current growth rate (e.g, 1.14% would be .0114): ");
        double rate = sc.nextDouble();

        long growth;
        long change;

        System.out.printf("\n%s %s %-20s","Year","Estimated Population", "Change from Prior Year");

        for (int i = 1; i < 76; i++) {

            growth = (long) (people * Math.pow(1 + (rate), i));
            change = (long) ((people * Math.pow(1 + (rate), i)) - (people * Math.pow(1 + (rate), i-1)));

            System.out.printf("\n%-10d %-10d %d", i, growth, change);

        }

    }
}