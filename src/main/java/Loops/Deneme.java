package Loops;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {


        int satır = 5;

        for (int i = 1; i <= satır ; i++) {

            for (int j = 1; j <= i ; j++) {

                System.out.print("*");

            }
            System.out.println();
        }










        System.out.println("---------------------------------------");

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }


            for (int j = 0; j < (2 * i + 1); j++) {

                if (j == 0 || j == (2 * i) || (i == rows / 2 && j > 0 && j < (2 * i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        System.out.println("-----------------------");

     /*
            * * * * .
            * * * . .
            * * . . .
            * . . . .
            . . . . .
*/

        int satır1 = 5;

        for (int i = 1; i <=satır1 ; i++) {

            for (int j = i; j <= satır1-1 ; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print(".");
            }
            System.out.println();

        }





       /* String y = "yusuf";
        String bos1 = "";

        for (char i = 0; i < y.length(); i++) {
            char ch1 = y.charAt(i);

            if (bos1.contains(ch1) {

            }

        */

    }
}

