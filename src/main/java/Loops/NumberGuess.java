package Loops;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner input = new Scanner(System.in);

        Random sayı = new Random();

        int randomSayı = sayı.nextInt(20);

        int counter = 0;

        System.out.println("Bir rakam girin");

        do {


            int tahmin = input.nextInt();


            if (tahmin > randomSayı) {
                System.out.println("sayı daha küçük");
            } else if (tahmin < randomSayı) {
                System.out.println("sayı daha büyük");
            }else {
                System.out.println("tebrikler sayıyı buldunuz");
                System.out.println(counter = counter++);
                break;
            }
            counter++;
        } while (true);


    }
}
