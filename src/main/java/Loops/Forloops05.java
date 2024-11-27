package Loops;

import java.util.Scanner;

public class Forloops05 {

    public static void main(String[] args) {

        //Ornek 1: 3'den 6'ya kadar tamsayilari console’a yazdiriniz (3 ve 6 dahil).
        //Example 1: Write integers from 3 to 6 to console (including 3 and 6)

        int num = 3;
        while (num < 7) {


            System.out.println(num);

            num++;
        }


        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console’a yazdiriniz(12 dahil).
        //Example 2: Write the even integers from 23 to 12 to the console (including 12)

        int i = 23;
        while (i > 12) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }

        /*Ornek 1:  Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.

         Example 1: Write the code that creates the multiplication table for the number given by the user and writes it to the console.

        3 ==> 3x1=3
              3x2=6
              3x3=9
              3x4=12 …
              3x10=30*/

        Scanner input = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int num2 = input.nextInt();

        int m = 1;
        while (m < 11) {
            System.out.println(num2 + "x" + m + "=" + (num2 * m));
            m++;
        }




    }
}
