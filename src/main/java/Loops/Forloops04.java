package Loops;

public class Forloops04 {

    public static void main(String[] args) {

        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

        *
        * *
        * * *
        * * * *

        */

        for (int i = 1; i <5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
        //Example 2: Find the sum of the digits in the decimal part of the given number.
        //            28.587 ==> 5+8+7=20


        double num = 28.587;

        String stNum = String.valueOf(num);

        String decimalPart = stNum.split("[\\.]")[1];

        int sayı = Integer.valueOf(decimalPart);

        int finalsum = 0;

        for (int i = 587; i >0 ; i=i/10) {
            finalsum = finalsum + i % 10;
        }
        System.out.println("Toplam: " + finalsum);
    }
}
