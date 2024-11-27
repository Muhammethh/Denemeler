package odev;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

         /*7.soru -Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
        true veya false sonucu donen bir method olusturun*/

        String isimler[]={"furkan","veli","huseyin","hakan","ali","ece","isa","cem","ibrahim"};

        System.out.println("containsElement(isimler) = " + containsElement(isimler));

    }

    public static boolean containsElement(String[] isimler) {


        Scanner input = new Scanner(System.in);
        System.out.println("Kelimeyi giriniz");
        String isim =input.nextLine();

        for (String w: isimler){
            if (w.equalsIgnoreCase(isim)){
                return true;
            }

        }

        return false;
    }


}
