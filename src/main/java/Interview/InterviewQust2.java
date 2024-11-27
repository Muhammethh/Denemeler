package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQust2 {
    public static void main(String[] args) {

            //bir cümlenin kelimelerini sayacak, her kelimeyi ters çevirecek kodu yazınız

            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen bir cümle giriniz");
            String str = input.nextLine();


            String[] wordCount =  str.split(" ");
            int lenght = wordCount.length;
            System.out.println(lenght);

            for (String w : wordCount){

                System.out.println(new StringBuilder(w).reverse());

            }

        for (int i = wordCount.length-1; i >= 0; i--) {

            System.out.println(new StringBuilder(wordCount[i]).reverse());

        }

    }
}
