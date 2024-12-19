package apexQuestions;

public class StringManipulations {
    public static void main(String[] args) {


        /*Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
        !sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.*/

        String sehirIsim = " MIAMI ";
        sehirIsim = sehirIsim.trim().toLowerCase();
        sehirIsim = sehirIsim.substring(0, 1).toUpperCase() + sehirIsim.substring(1);
        System.out.println("sehirIsim = " + sehirIsim);

        /*K!s! !s!mler! !ç!n 3 Str!ng deg!sken olusturunuz. Bosluk karakterler! har!ç 3 !s!mdek!
                karakter sayısının toplamını yazdırınız.
                Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.*/

        String isim1 = "Ali Can";
        String isim2 = "Merve Star";
        String isim3 = "Mark Tom";

        int isim1Lenght = isim1.replaceAll(" ", "").length();
        int isim2Lenght = isim2.replaceAll(" ", "").length();
        int isim3Lenght = isim3.replaceAll(" ", "").length();

        System.out.println(isim1Lenght + isim2Lenght + isim3Lenght);

        /*B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! toplam alfabet!k ve sayısal karakter sayısını
        konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.*/

        String var = "Miami 33018!!!";

        int varLenght = var.replaceAll("[^a-zA-Z0-9]", "").length();
        System.out.println("varLenght = " + varLenght);

        /*B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
        konsolda yazdırınız.
        Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.*/

        String str = "1a3Bcf4!...";

        int strLenghth = str.replaceAll("[0-9]", "").length();
        System.out.println("strLenghth = " + strLenghth);

        /*B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
        karakter! yazdırınız.
                Örnek: 'Ali Can' için n yazdırmalısınız.
‘Miami’ için i yazdırmalısınız.*/

        String str1 = "Miami";

        str1 = str1.substring(str1.length() - 1);
        System.out.println("str1 = " + str1);
/*
        B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
        toplamını bulunuz.*/

        String asc = "Ali Can";

        char firstchar = asc.charAt(0);
        char lastChar = asc.charAt(asc.length() - 1);
        System.out.println(firstchar + lastChar);

        /*B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsolda
        yazdırınız.
                Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.*/

        String str2 = "Java";

        str2 = str2.substring(1);
        System.out.println("str2 = " + str2);

        /*B!r Str!ng deg!sken! olusturunuz ve son karakter! dısındak! tüm karakterler!n! konsolda
        büyük harfle yazdırınız.
                Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.*/

        String str3 = "Java";

        str3 = str3.substring(0, str3.length() - 1).toUpperCase();
        System.out.println("str3 = " + str3);

        /*B!r Str!ng deg!sken! olusturunuz ve konsolda !lk karakter ve son karakter dısındak! tüm
        karakterler! büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.*/

        String str4 = "java";

        str4 = str4.substring(1, str4.length() - 1).toUpperCase();
        System.out.println("str4 = " + str4);

        /*B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
        olmadıgını kontrol etmek !ç!n kod yazınız.
        Örnek: ‘Ali Can’ için konsolda false yazmalıdır.
‘ Ali Can ’ için konsolda false yazmalıdır.
‘ Ali Can ’ için konsolda false yazmalıdır.
‘Ali Can’ için konsolda true yazmalıdır.*/

        String ali = "Ali Can";

        String trim = ali.trim();
        String boşluksuz = ali.replaceAll("\\s", "");
        boolean isTrue = trim.length() - boşluksuz.length() == 1;
        System.out.println("isTrue = " + isTrue);



        /*B!r Str!ng’ !n basında ve sonunda bosluk karakter! olup olmadıgını kontrol etmek !ç!n kod
        yazınız.
                Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır*/

        String trm = " Ali ";

        String trimli = trm.trim();
        boolean eşitMi = trimli.length() == trm.length();
        System.out.println("eşitMi = " + eşitMi);

        /*B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
        yazınız.
                Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
‘ali.’ için kodunuz konsolda false yazdırmalıdır
‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
‘Ali.’ için kodunuz konsolda true yazdırmalıdır
‘ALI.’ için kodunuz konsolda true yazdırmalıdır*/

        String örn = "ali Can.";

        String trimli1 = örn.trim();

        boolean ilkHarf = trimli1.substring(0, 1).replaceAll("[A-Z]", "").length() == 0;

        boolean nokta = trimli1.substring(trimli1.length() - 1).replaceAll("[.]", "").length() == 0;

        if (ilkHarf && nokta) {
            System.out.println("geçti " + ilkHarf);
        } else {
            System.out.println("kaldı " + ilkHarf);
        }


        //CEVAP ANAHTARI ÇÖZÜMÜ

        String s = "Tom Hanks.";
        char ilkKrk = s.charAt(0);
        char sonKrk = s.charAt(s.length() - 1);
        Boolean ilkKrkBuyukMu = ilkKrk >= 'A' && sonKrk <= 'Z';
        Boolean sonKrkNoktaMi = sonKrk == '.';
        Boolean ilkKrkBuyukSonKrkNoktaMi = ilkKrkBuyukMu && sonKrkNoktaMi;
        System.out.println("Ilk karakter buyuk harf, son karakter nokta mi? " + ilkKrkBuyukSonKrkNoktaMi);


        /*Asagıdak! kosullar !ç!n b!r parolanın geçerl! olup olmadıgını kontrol etmek !ç!n kod yazınız;
        S!fre bosluk karakter!nden farklı olacak sek!lde en az 8 karakter !çermel!d!r. S!frede en az 1
        sembol olmalıdır.
        Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
        'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        '! a b 3 k' kodunuz konsolda false yazdırmalıdır.*/

        String sifre = "A2b!";

        boolean karakterSayısı = sifre.trim().replaceAll("[ ]", "").length() >= 8;
        boolean sembol = sifre.trim().replaceAll("[^\\p{Punct}]", "").length() > 0;
        boolean isValid = karakterSayısı && sembol;
        System.out.println("isValid = " + isValid);

        /*B!r Str!ng’ !n bel!rl! b!r tek karaktere sah!p olup olmadıgını üç farklı sek!lde kontrol etmek
        !ç!n kod yazınız.*/

        //1.yol

        String str5 = "Java";
        boolean contains = str5.contains("a");

        //2.yol

        Boolean sonuc = str5.replaceAll("[^v]", "").length() > 0;
        System.out.println("karakteri iceriyor mu? " + sonuc);


        //3. Yol:

        Boolean sonuc2 = str5.indexOf("v") != -1;
        System.out.println("karakteri iceriyor mu? " + sonuc);

        /*Str!ng gomlekF!yat = ‘$12.99’;
        Str!ng k!tapF!yat = ‘$35.99’;
        Gömlek ve k!tap f!yatlarının toplamını bulmak !ç!n gereken kodu yazınız.*/


        String gomlekFıyat = "$12.99";
        String kitapFıyat = "$35.99";

        gomlekFıyat = gomlekFıyat.replaceAll("[$]", "");
        kitapFıyat = kitapFıyat.replaceAll("[$]", "");

        double gomlek = Double.valueOf(gomlekFıyat);
        double kitap = Double.valueOf(kitapFıyat);
        System.out.println("Toplam fiyat: " + String.format("%.2f", (gomlek + kitap)));

        /*Ver!len b!r !sm!n adının ve soyadının bas harfler!n! almak !ç!n kodu yazınız.
        Not: Ikinci isim kapsam dısındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS*/

        String isim4 = "Tom Hanks";
        String ilkHarf2 = isim4.substring(0, 1).toUpperCase();
        String sonHarf = isim4.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(ilkHarf2 + sonHarf);

        //B!r Str!ng’ de kullanılan noktalama !saretler!n!n sayısını bulmak !ç!n b!r kod yazınız.


        String ss = "Vay be! Ali 13 yasında ama üniversite ögrencisi.";
       int punct = ss.replaceAll("[^\\p{Punct}]","").length();
        System.out.println("punct = " + punct);
    }
}
