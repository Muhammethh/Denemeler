package apexQuestions;

public class Ternary {
    public static void main(String[] args) {

       /* Ternary kullanarak, asagıdak! kodları konsolda yazdırınız.
        Parola bosluk karakter!nden farklı olarak en az 8 karakter !çer!yorsa, "Geçerl! Parola",
                Parola bosluk karakter!nden farklı olarak 8 karakterden daha az !se, "Geçers!z Parola"*/

        String pwd = "1234568";

        String control = pwd.replace(" ", "").length() >= 8 ? "Geçerli parola" : "Geçersiz Parola";

        System.out.println("length = " + control);


        /*Ternary kullanarak, asagıdak! kodları konsolda yazdırınız.
        a) B!r üçgen!n !k! kenarının uzunlugu es!tse "Ik!zkenar Üçgen".
                b) B!r üçgen!n tüm kenarlarının uzunlugu es!tse "Eskenar Üçgen".
                c) a ve b kosulları saglanmıyorsa "Çes!t Kenar Üçgen "*/


        int a = 4;
        int b = 4;
        int c = 4;

        String control2 = a == b || a == c || b == c ? "İkizkenar Üçgen" : a == b && a == c && b == c ? "Eşkenar üçgen" : "Çeşitkenar Üçgen";
        System.out.println("control2 = " + control2);


        /*Ternary kullanarak, asagıdak! kodları konsolda yazdırınız.
        a) Son basamak 5 ‘e es!t ve 5 den büyükse, yuvarlama !slem!: “Son basamagı b!r üst ondalıga
        yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama !slem!: “Son basamagı b!r alt ondalıga yuvarla”
        Örnegin; 127 yukarı yuvarlanacak ve deger 130 olacaktır.
        125 yukarı yuvarlanacak ve deger 130 olacaktır.
        123 asagı yuvarlanacak ve deger 120 olacaktır.*/


        int sayı = 122;

        int sa2 = sayı % 10 >= 5 ? (sayı / 10 + 1) * 10 : (sayı / 10) * 10;
        System.out.println("sa2 = " + sa2);

        /*Nested Ternary kullanarak Apex kodunu yazınız.
        B!r yılın artık yıl olup olmadıgını kontrol eden b!r program yazınız.
        Yıl 100'e tam bölünüyorsa 400'e tam bölünmel!d!r.
                B!r yıl 100'e tam bölünem!yorsa 4'e tam bölünmel!d!r.*/

        int yıl = 1600;

        String res = yıl % 100 == 0 ? (yıl % 400 == 0 ? "artık yıl" : "artık yıl değil") : yıl % 4 == 0 ? "Artık yıl3" : "Artık yıl değil3";

        System.out.println("res = " + res);

       /* Nested Ternary kullanarak;
        S!frey! kontrol etmek !ç!n kodu yazınız.
        8'den fazla karakter !çer!yorsa, bas harf! 'i' olmalıdır.
        8 karakterden fazla !çerm!yorsa, bas harf! 'K' olmalıdır.*/


        String pswd = "igdsddskk";

        String kontrol = pswd.length() > 8 ? pswd.startsWith("i") ? "i harfi ile başlıyor" : "i harfi ile başlamıyor" :
                pswd.startsWith("K") ? "K harfi ile başlıyor" : "K harfi ile başlamıyor";

        System.out.println("kontrol = " + kontrol);

        /*B!r sayının mutlak deger!n! hesaplamak !ç!n kodu yazınız.
        Poz!t!f sayılar ve sıfır mutlak deger !ç!n sayı !le aynıdır.
                Negat!f sayıların mutlak deger!n! bulmak !ç!n sayıyı -1 !le çarpınız.*/


        int sayı2 = -5;

        String rs = (sayı2 < 0) ? sayı2 * (-1) == sayı2 ? "mutlak sayı" : "mutlak değil" : "Mutlak sayıdır";
        System.out.println("rs = " + rs);


        //Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran b!r program yazınız.

        int num = 2;

        int num2 = 1;

       int num3 = (num) < num2 ? num : num2 ;
        System.out.println("num3 = " + num3);


        /*Sayı 3 basamaklı !se konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aks! takd!rde,
                kodunuz " Bu sayı 3 basamaklı deg!ld!r" olacaktır.*/

        int sayı5 = 755;

        String uyarı = sayı5>99 && sayı5<1000 ? "üç basamaklı" : "üç basamaklı";

        System.out.println("uyarı = " + uyarı);


       // Ternary kullanarak; konsolda tek sayılar !ç!n “Tek” , ç!ft sayılar !ç!n “Ç!ft” yazdırınız.

        int sayı6 = 6;

        String result1 = sayı6%2==0 ? "çift" : "tek";
        System.out.println("result1 = " + result1);



        //Ternary kullanarak; konsolda sayı poz!t!f !se “Poz!t!f” , negat!f !se “Poz!t!f Deg!l” yazdırınız.

        int sayı7= -8;

        String result3 = sayı7<0 ? "negatif" : "pozitif";
        System.out.println("result3 = " + result3);

    }

}
