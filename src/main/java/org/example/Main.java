// @Quentin Proulx
// Asterisk Patterns

package org.example;


public class Main {
    public static void main(String[] args) {

        // Pattern 1

        for (int i = 0; i<10; i++){

            for (int v = 0; v<i+1; v++){

                System.out.print("*");

            }

            System.out.println("");

        }

        // Pattern 2

        System.out.println("");

        for (int i = 0; i<10; i++){

            for (int v = 10-i; v>0; v+=-1){

                System.out.print("*");

            }

            System.out.println("");

        }

        // Pattern 3

        System.out.println("");

        String stars = "";

        for (int i = 0; i<10; i++){

            stars = "";
            for (int v = 10-i; v>0; v+=-1){

                stars += "*";

            }

            for (int y = i; y>0; y+=-1){

                stars = " "+stars;

            }

            System.out.println(stars);

        }

        // Pattern 4

        System.out.println("");

        for (int i = 0; i<10; i++){

            stars = "";
            for (int v = 0; v<i+1; v++){

                stars += "*";

            }

            for (int y = 9-i; y>0; y+=-1){

                stars = " "+stars;

            }

            System.out.println(stars);

        }

    }
}