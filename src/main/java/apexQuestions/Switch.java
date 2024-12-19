package apexQuestions;

import java.util.Random;

public class Switch {


    public static void main(String[] args) {

        /*  Yazdırmak !ç!n sw!tch !fades!n! kullanınız.
            a) Aralık, Ocak, Subat !ç!n "Kıs"
    b) Mart, N!san, Mayıs !ç!n "Bahar"
    c) Haz!ran, Temmuz, Agustos !ç!n "Yaz"
    d) Eylül, Ek!m, Kasım !ç!n "Güz"
    e) D!gerler! !ç!n "Geçers!z ay adı"*/


        String ay = "Şubat";

        String mevsim = switch (ay) {

            case "Aralık", "ocak", "şubat" -> "Kış";
            case "mart", "nisan", "mayıs" -> "bahar";
            case "haziran", "temmuz", "ağustos" -> "Yaz";
            case "eylül", "ekim", "kasım" -> "sonbahar";


            default -> "Unexpected value: ";
        };

        System.out.println("mevsim = " + mevsim);

        switch (ay) {

            case "Aralık":


            case "Ocak":


            case "Şubat":
                System.out.println("KIŞ");
                break;
            case "mart":

            case "nisan":
            case "mayıs":
                System.out.println("Bahar");
            case "haziran":
            case "temmuz":
            case "ağustos":
            case "eylül":
            case "ekim":
            case "kasım":
            default:

        }


       /* Ayın numarasını g!rd!g!n!zde ayın adını yazdırmak !ç!n b!r sw!tch !fades! kullanınız.
                Örneg!n;
        kullanıcı 1 g!rerse kodunuz "Ocak" yazmalıdır,
                kullanıcı 2 g!rerse kodunuz "Subat" yazmalıdır vb.
        Kullanıcı geçers!z ay numarası g!rerse kodunuz "Geçers!z numara" yazmalıdır.*/


        int month = 10;

        switch (month) {

            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasım");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:

        }


        /*Ver!len ay numaralarından baslayarak tüm ay adlarını yazdıran b!r kod yazınız.
        Örnek: Ay numarası 9 !se konsolda kodunuz Eylül Ek!m Kasım Aralık olacaktır.
        */

        int month2 = 10;

        switch (month2) {

            case 1:
                System.out.println("Ocak");

            case 2:
                System.out.println("Şubat");

            case 3:
                System.out.println("Mart");

            case 4:
                System.out.println("Nisan");

            case 5:
                System.out.println("Mayıs");

            case 6:
                System.out.println("Haziran");

            case 7:
                System.out.println("Temmuz");

            case 8:
                System.out.println("Ağustos");

            case 9:
                System.out.println("Eylül");

            case 10:
                System.out.println("Ekim");

            case 11:
                System.out.println("Kasım");

            case 12:
                System.out.println("Aralık");
                break;
            default:

        }


        System.out.println("********************************************");

        /*C!ns!yet "Erkek" !se "Erkek" yazdırınız.
                C!ns!yet "Kadın" !se "Kız" yazdırınız.
                C!ns!yet "Erkek" ve "Kadın"dan farklıysa "D!gerler!" yazdırınız.
                Not : Bu seçenekler dısındak!ler!n! yoksayınız.*/

        String cinsiyet = "Kad";

        switch (cinsiyet) {
            case "Erkek":
                System.out.println("Erkek");
                break;
            case "Kadın":
                System.out.println("Kız");
                break;
            default:
                System.out.println("Diğerleri");

        }

        System.out.println("********************************************");

        /*Bel!rl! b!r yılın bel!rl! b!r ayındak! gün sayısını görüntülemek !ç!n b!r kod yazınız.
        Örnek: 2000 yılının Subat ayında gün sayısı 29.*/


        /*int date1 = 2000;

        Year date = Year.of(2000);

        // Ay ve yıl bilgileri
        int ay = 2;      // Şubat
        int yil = 2000;   // 2000 yılı

        // Ayın gün sayısını hesaplamak için LocalDate kullanıyoruz
        try {
            // LocalDate.of() metodu ile yıl, ay ve 1. gün tarihini oluşturuyoruz.
            LocalDate date = LocalDate.of(yil, ay, 1);

            // Bu tarihin ayın son günü olduğunu bulmak için getDayOfMonth() kullanıyoruz
            int gunSayisi = date.lengthOfMonth(); // Ayın gün sayısını alır

            System.out.println(yil + " yılının " + Month.of(ay) + " ayında gün sayısı: " + gunSayisi);
        } catch (Exception e) {
            // Geçersiz ay numarası girildiğinde hata verir
            System.out.println("Geçersiz Ay");
        }*/


        /*Sw!tch !fades!n! kullanarak, herhang! b!r 2 sayıyla toplama, çıkarma, çarpma ve bölme
        yapan bas!t b!r hesap mak!nes! olusturmak !ç!n kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
                b) Kullanıcı 10 ve 5 ve - !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
                c) Kullanıcı 10 ve 5.3 ve * !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
                d) Kullanıcı 10 ve -5 ve / !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
                e) Kullanıcı 10 ve -5 g!rd!g!nde +, -, *, / 'den farklı b!r !slem yaptıgında kodunuz "Geçers!z Islem"
        yazmalıdır.*/

        double a = 2;
        double b = 5;
        String işlem = "-";

        switch (işlem) {
            case "+":

                System.out.println("Toplama " + a + b);
                break;
            case "-":
                System.out.println("Çıkarma " + (a - b));
                break;
            case "*":
                System.out.println("Çarpma " + (a * b));
                break;
            case "/":

                System.out.println("Bölme " + (a / b));
                break;
            default:
                System.out.println("Geçersiz işlem");

        }


        System.out.println("********************************************");
       /* Sw!tch !fades!n! kullanarak, m!l! km'ye, san!yey! saate, fahrenhaytı sant!grata çev!ren b!r
        dönüstürücü olusturmak !ç!n kod yazınız. Google'dan dönüsümler !ç!n formüller! bulunuz.
        a) Kullanıcı m!le deger!n! 10 ve operatorü m!ldenKmye olarak g!rd!g!nde, konsolda kodunuz
        "16 km" yazmalıdır (sayı d!nam!k olacak)
        b) Kullanıcı san!ye deger!n! 7200 ve operatorü san!yedenSaate olarak g!rd!g!nde, konsolda
        kodunuz "2" yazmalıdır (sayı d!nam!k olacak)
        c) Kullanıcı fahrenhe!t deger!n! 83 ve operatorü fahrenaytdanSant!garata olarak g!rd!g!nde,
                konsolda kodunuz "28.3333 sant!grat" yazmalıdır (sayı d!nam!k olacak)
        d) Kullanıcı m!ldenKmye, san!yedenSaate, fahrenaytdanSant!garata ‘dan farklı b!r !slem g!rd
        !g!nde, kodunuz "Bu operatör, o dönüstürücü !ç!n tanımlanmadı" yazmalıdır.*/

        String seçim = "fahrenaytdanSant!garata";
        int sayı1 = 68;

        switch (seçim) {
            case "saniyedensaate":
                System.out.println("Saate çevrilen: " + sayı1 / 3600);
                break;
            case "mildenkmye":
                System.out.println("Km çevrilen :" + sayı1 * 1.60934);
                break;
            case "fahrenaytdanSant!garata":
                System.out.println("Santigrat: " + ((sayı1 - 32) * 5) / 9);
                break;
        }


       /* B!r Enum olusturun ve !ç!ne CHROME, SAFARI, IE, FIREFOX, YANDEX g!b! tarayıcı adlarını
        koyunuz. Sw!tch !fades!n! kullanın ve CHROME !ç!n 'CHROME kullanıyorum', SAFARI !ç!n
        'SAFARI kullanıyorum', 'IE !ç!n IE kullanıyorum', 'FIREFOX !ç!n FIREFOX kullanıyorum' ve
        YANDEX !ç!n 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
        tarayıcılar !ç!n 'Geçers!z tarayıcı' yazınız.
                Not: Gelistirici konsolunda enum olusturmalısınız.*/


        System.out.println("********************************************");

        String opt = "Yandex";

        switch (opt) {
            case "Chrome":
                System.out.println(Browsers.CHROME.desc);
                break;
            case "Safari":
                System.out.println(Browsers.SAFARI.desc);
                break;
            case "Ie":
                System.out.println(Browsers.IE.desc);
                break;
            case "Firefox":
                System.out.println(Browsers.FIREFOX.desc);
                break;
            case "Yandex":
                System.out.println(Browsers.YANDEX.desc);
                break;
            default:
                System.out.println("Geçersiz Tarayıcı");
                break;
        }


        enum Seasons {
            WINTER, SUMMER, FALL, SPRING
        }

        String browser = Seasons.WINTER.toString();
        switch (browser) {
            case "Kis":
                System.out.println("Snowboard yapmak");
                break;
            case "Yaz":
            case "Bahar":
                System.out.println("Balik tutmak'");
                break;
            case "Sonbahar":
                System.out.println("Doga yuruyusu yapmak'");
                break;
            default:
                System.out.println("Gecersiz data");


        }


        /*myClass !sm!nde b!r class olusturunuz, class'ta s!ze rastgele b!r alfabet!k karakter veren b!r
        yöntem olusturun ve ardından yöntem! kullanarak asagıdak!ler! yazdırınız.
        'A' ve 'a' !ç!n "Ilk Karakter" yazdırınız.
        'B' ve 'b' !ç!n "Ik!nc! Karakter" yazdırınız.
        'C' ve 'c' !ç!n "Üçüncü Karakter" yazdırınız.
        'D' ve 'd' !ç!n "Dördüncü Karakter" yazdırınız.
                D!gerler! !ç!n "D!ger Karakterler!" yazdırınız.*/

        Random rnd = new Random();

        char chr = (char) ('A' + rnd.nextInt(26));
        String newchar = String.valueOf(chr);

        System.out.println("newchar = " + newchar);


        switch (newchar.toLowerCase()) {

            case "a":
                System.out.println("İlk karakter");
                break;
            case "b":
                System.out.println("ikinci karakter");
                break;
            case "c":
                System.out.println("üçüncü karakter");
                break;
            case "d":
                System.out.println("dördüncü karakter");
                break;
            default:

        }

    }
}
