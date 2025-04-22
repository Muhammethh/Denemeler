package apexQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Loops {

    public static void main(String[] args) {

        /*120'den 11'e kadar 4 !le bölüneb!len ve 6 !le bölüneb!len tüm tam sayıları aynı satırda !k!
                ardısık tam sayı arasında bosluk bırakarak yazınız.*/

        for (int i = 120; i >= 11; i--) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(" " + i);
            }

        }

        System.out.println("************************************");

       /* B!r Str!ng’ de tekrarlanan karakterler! yazdırmak !ç!n kod yazınız.
        Örneg!n; accessor!es ´ ces*/

        String str = "accessories";

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            String sub = str.substring(i, i + 1);

            if (str.indexOf(sub) != str.lastIndexOf(sub)) {

                if (!newStr.contains(sub)) {

                    newStr += sub;
                }

            }

        }
        System.out.println(newStr);


        /*B!r Str!ng ‘ !n pal!ndrom olup olmadıgını kontrol etmek !ç!n kod yazınız. B!r Str!ng, ters! !le
        aynıysa, buna pal!ndrom den!r. Örneg!n; “anna”, “123321” pal!ndromlardır.*/

        String pal = "ann";
        String revPal = "";

        for (int i = pal.length() - 1; i >= 0; i--) {

            revPal = revPal + pal.charAt(i);

        }
        if (revPal.equals(pal)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }


        /*Benzers!z (Tekrarsız) rakamları b!r tamsayı olarak yazdırmak !ç!n kod yazınız.
        Örnek; 223878 ´ 37*/

        int sayı = 223878;
        String bş = "";

        String str1 = String.valueOf(sayı);

        for (int i = 0; i < str1.length(); i++) {

            String sub1 = str1.substring(i, i + 1);

            if (str1.indexOf(sub1) == str1.lastIndexOf(sub1)) {

                bş = bş + sub1;

            }

        }

        System.out.println(Integer.valueOf(bş));


        /*Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A*/


        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("A ");
            }
            System.out.println();

        }

        System.out.println("*************************************");
        /*Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
        A
        A A
        A A A
        A A A A*/

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("A ");

            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        /*Asagıdak! çarpım tablosunu olusturmak !ç!n kod yazınız.
        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30*/


        for (int j = 1; j <= 10; j++) {

            System.out.print(" 3X" + j + "= " + 3 * j);

        }
        System.out.println("****************************");

        /*20'den 3'e kadar olan tek tamsayıları aynı satırda ardısık olacak sek!lde aralarında bosluk
        bırakarak yazdırmak !ç!n gereken kodu yazınız.*/


        for (int i = 20; i >= 3; i--) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }

        /*Str!ng !ç!ndek! tüm küçük harfler! yıldız !saret!yle yazdırmak !ç!n gereken kodu yazınız.
                Örneg!n; 'Al! Can?' ==> l*!*a*n**/

        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]", "");
        String t = "";
        for (Integer i = 0; i < s.length(); i++) {
            String r = s.substring(i, i + 1);
            t = t + r + '*';
        }
        System.out.println(t);


       /* Ver!len ondalık sayının sadece ondalık kısmındak! rakamlarını, kend!s!nden önce b!r yıldız
        !saret!yle yazdırmak !ç!n gereken kodu yazınız.
                Örneg!n; 75.4238 ´ *4*2*3*8
*/


        double sayı2 = 75.4238;

        String sayıst = String.valueOf(sayı2);


        String after = sayıst.split("\\.")[1];

        for (int i = 0; i < after.length(); i++) {

            System.out.print(after.charAt(i) + "*");

        }


        System.out.println("************************************");
        //B!r Str!ng’ ! ters!ne çev!rmek !ç!n kod yazınız. Örnek; Mark ==> kraM

        String s1 = "Mark";
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {

            s2 = s2 + s1.charAt(i);

        }

        System.out.println(s2);

        StringBuilder tt = new StringBuilder(s1);

        tt.reverse();


        // 3 !le 14 arasındak! tam sayıların toplamını bulmak !ç!n kodu yazınız.

        int sum = 0;
        for (int i = 3; i <= 14; i++) {

            sum = sum + i;

        }
        System.out.println(sum);


        // 3 !le 9 arasındak! tam sayıların çarpımını bulmak !ç!n kodu yazınız

        int mult = 1;
        int start = 3;
        while (start <= 9) {

            mult = mult * start;
            start++;

        }
        System.out.println(mult);


        /*Do-wh!le döngüsünü kullanarak konsolda 'C' !le 'A' arasındak! karakterler! yazdırmak !ç!n
        kod yazınız.*/

        char ch = 'A';

        do {

            System.out.println(ch);
            ch++;

        } while (ch <= 'C');


        //B!r Str!ng de, !lk 'm' karakter!nden öncek! tüm karakterler! yazınız.

        String s3 = "Christmas";
        String s4 = "";

        for (int i = 0; i < s3.length(); i++) {

            if (s3.charAt(i) == 'm') {
                break;
            } else {
                s4 = s4 + s3.charAt(i);
            }

        }
        System.out.println(s4);


        //B!r tamsayıdak! rakamların toplamını bulmak !ç!n kodu yazınız.

        int num = 123;

        int sum2 = 0;

        System.out.println(num % 10);

        for (int i = num; i > 0; i = i / 10) {

            sum2 = (i % 10) + (sum2);

        }
        System.out.println("sum2 = " + sum2);


        /*B!r Str!ng’ de benzers!z(tekrarsız) karakterler yazdırmak !ç!n kod yazınız.
        Örneg!n; Hello ==> Heo*/

        String str5 = "Hello";
        String empty = "";

        for (int i = 0; i < str5.length(); i++) {

            String substr = str5.substring(i, i + 1);

            if (str5.indexOf(substr) == str5.lastIndexOf(substr)) {

                empty = empty + substr;

            }

        }
        System.out.println("empty = " + empty);


        /*B!r Str!ng’ dek! bosluk ve noktalama !saretler! dısındak! toplam karakter sayısını bulunuz.
                String s = "Java is a strongly typed, object-oriented programming language.";
*/

        String b2 = "Java is a strongly typed, object-oriented programming language.";

        b2 = b2.replaceAll(" ", "").replaceAll("[\\p{Punct}]", "");
        System.out.println("b2.length() = " + b2.length());
        int top = 0;

        for (int i = 0; i < b2.length(); i++) {

            String subs = b2.substring(i, i + 1);

            top = top + subs.length();

        }
        System.out.println("top = " + top);


        /* Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *
         */


        for (int i = 5; i >= 0; i--) {

            for (int j = i; j >= 0; j--) {

                System.out.print(" *");

            }
            System.out.println();
        }


        /*B!r tamsayının benzers!z(tekrarsız) basamaklarının toplamını bulmak !ç!n kodu yazınız.
        Örnek:12133455 ´ 2+4=6*/

        int p = 12133455;

        String pstr = String.valueOf(p);

        int bş1 = 0;

        for (int i = 0; i < pstr.length(); i++) {

            String subpstr = pstr.substring(i, i + 1);

            if (pstr.indexOf(subpstr) == pstr.lastIndexOf(subpstr)) {

                bş1 = bş1 + Integer.parseInt(subpstr);
            }

        }
        System.out.println("bş1 = " + bş1);

        //5 har!ç 3'ten 9'a kadar olan tam sayıları yazdırmak !ç!n kod yazınız.


        for (int i = 3; i < 10; i++) {


            if (i == 5) {
                continue;
            }
            //System.out.print(i + "");


        }


        /*Asal sayı olup olmadıgını kontrol etmek !ç!n kullanıcıdan b!r tam sayı g!rmes!n! !stey!n!z.
                Örnek: kullanıcı 43 g!rerse çıktı “43 b!r asal sayıdır”, kullanıcı 120 g!rerse “120 asal deg!ld!r”
        olur, kullanıcı negat!f tam sayılar g!rerse çıktı “Poz!t!f b!r tam sayı g!r!n!z” sekl!nde kullanıcıyı
        yönlend!r!n!z.*/

        Scanner input = new Scanner(System.in);

        //int number = input.nextInt();

        /*while (rakam < 0) {

            if (rakam < 0) {
                System.out.println("Pozitif tam sayı giriniz");
                rakam = input.nextInt();
            }
        }
        if (rakam % 1 == 0 && rakam % rakam == 0){

            System.out.println("Sayı asal sayıdır");

        }else {
            System.out.println("Sayı asal sayı değildir");
        }*/


       /* int count = 0;
        if(number>0) {
            if (number == 1) {
                System.out.println(number + " bir asal sayidir");
            }else {
                for(int i=2; i<number; i++) {
                    if(number%i==0) {
                        count++;
                    }
                }
                if(count==0) {
                    System.out.println(number + " bir asal sayidir ");
                }else {
                    System.out.println(number + " bir asal sayi degildir ");
                }
            }
        }else {
            System.out.println("Pozitif bir tam sayi giriniz ");
        }*/


        /*Kullanıcıya kaç tane f!bonacc! sayısı görmek !sted!g!n! sorunuz. Ardından bu f!bonacc!
                sayılarını yazdıran kodu yazınız.
                Örnek: kullanıcı 6 g!rerse çıktı 1 1 2 3 5 8 olacaktır.*/

        /*int rkm = input.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i < rkm; i++) {

            arr.add(i);
            arr.add(i + arr.get(i));

        }
        System.out.println(arr);*/

        //-------------------------------------------

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz ?");
        int number = scan.nextInt();
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");
        for (int i = 1; i < number-1; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci + " ");
        }


    }
}
