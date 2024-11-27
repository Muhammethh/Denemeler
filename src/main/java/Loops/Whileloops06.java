package Loops;

import java.util.Scanner;

public class Whileloops06 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int sayı = 121;

        String sayı2 = String.valueOf(sayı);

        String reversed = "";

        int index = sayı2.length() - 1;


        while (index >= 0) {

            reversed = reversed + sayı2.charAt(index);
            index--;
        }
        if (reversed.equals(sayı2)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }


        //Ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console’a yazdiriniz.
        //Example 1: Write integers from 5(inclusive) to 3(inclusive) to console

        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 2);

        /*Ornek 1:
       Gecerli Username="admin" ve Password="pwd123" dur.
       Kullanicidan username ve password'u alin.
       Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
       Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin.
       Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz.
        */

        System.out.println("-------------------------");
        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {
            if (counter == 4) {
                System.out.println("hesabınız bloke bloke olmuştur");
                break;
            }
            System.out.println("Kullanıcı adı girin");
            String username = input.next();
            System.out.println("Parolanızı girin");
            String pwd = input.next();

            if (username.equals("admin") && pwd.equals("pwd123")) {
                System.out.println("Hesaba hoşgelidniz");
                break;
            } else {
                System.out.println(3 - counter + " hakkınız kalmıştır");
            }

            counter++;

        } while (true);


    }
}
