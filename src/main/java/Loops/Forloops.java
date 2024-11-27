package Loops;

import java.util.Scanner;

public class Forloops {
    public static void main(String[] args) {


        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console

        //           578 ==> 5+7+8=20 ==> Output 20 olmali

        Scanner input = new Scanner(System.in);
        /* System.out.println("3 basamaklı rakam girin");
        int num = input.nextInt();
         int total = 0;


        for (int i = num; i > 0; i=i/10) {

            total = total + i % 10;
        }
        System.out.println(total);
        */

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf

        System.out.println("Bir kelime giriniz");
        String name = input.nextLine();
        String unique = "";


        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (name.indexOf(ch) == name.lastIndexOf(ch)) {
                unique = unique + ch;
            }

        }
        System.out.println(unique);

    }
}
