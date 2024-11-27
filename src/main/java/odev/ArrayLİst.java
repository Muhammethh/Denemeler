package odev;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayLİst {

    public static void main(String[] args) {


         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazin
        */

        ArrayList<Integer> sayılar = new ArrayList<>();

        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int sayı = input.nextInt();

        while (sayılar.size() < 200) {
            if (!sayılar.contains(rnd)) {

                sayılar.add(rnd.nextInt(1000));
            }
        }


        if (sayılar.contains(sayı)) {
            System.out.println("sayı bulundu");
            System.out.println("sayılar.indexOf(sayı) = " + sayılar.indexOf(sayı));
        } else {
            System.out.println("sayı bulunamadı");
        }


    }
}
