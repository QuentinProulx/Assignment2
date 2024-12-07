// @Quentin Proulx
// Pythagorean Triple

package org.example;

public class Main {

    public static void main(String[] args) {

        int side1;
        int side2;
        double hypotenuse;

        System.out.printf("%-10s %-10s %s\n", "Side 1", "Side 2", "Hypotenuse");

        for (int i=1; i<500; i++){

            side1 = i;

            for (int j=1; j<500; j++){

                side2 = j;
                hypotenuse = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));

                if (hypotenuse == (int) (hypotenuse) && hypotenuse <= 500){

                    System.out.printf("%-10d %-10d %d\n", side1, side2, (int) (hypotenuse));

                }

            }

        }

    }
}