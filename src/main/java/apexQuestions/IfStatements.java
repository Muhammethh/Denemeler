package apexQuestions;

public class IfStatements {

    public static void main(String[] args) {

        /*Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Subat !ç!n "Kıs"
        b) Mart, N!san, Mayıs !ç!n "Ilkbahar"
        c) Haz!ran, Temmuz, Agustos !ç!n "Yaz"
        d) Eylül, Ek!m, Kasım !ç!n "Sonbahar"*/

        String ay = "Haziran";

        if (ay.equals("Aralık") || ay.equals("Ocak") || ay.equals("Şubat")) {
            System.out.println("Kış");
        } else if (ay.equals("Mart") || ay.equals("Nisan") || ay.equals("Mayıs")) {
            System.out.println("İlkbahar");
        } else if (ay.equals("Haziran") || ay.equals("Temmuz") || ay.equals("Ağustos")) {
            System.out.println("Yaz");
        } else if (ay.equals("Eylül") || ay.equals("Ekim") || ay.equals("Kasım")) {
            System.out.println("Sonbahar");
        }


       /* Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
        a) S!fre bosluk karakter!nden farklı en az 8 karakter !çer!yorsa "Geçerl! S!fre"
        b) Herhang! b!r poz!syonda s!frede bosluk karakter! varsa "S!frede bosluk karakter! kullanmayınız"
        c) a ve b kosullarının saglanmaması durumunda "Geçers!z S!fre"
        Not: Çözümdeki kosulların sıralarına dikkat ediniz.*/

        String pwd = "1234 ddsd";

        if (pwd.contains(" ")) {
            System.out.println("Şifrede boşluk var");
        } else if ((pwd.length() >= 8)) {
            System.out.println("Geçerli şifre");
        } else {
            System.out.println("Geçersiz şifre");
        }

        /*Ayın numarasını g!rd!g!n!zde ayın adını yazdırmak !ç!n gereken kodu yazınız.
                Örnek; 1 !ç!n çıktı: "Ocak", 2 !ç!n çıktı: "Subat" vb.*/

       /* int ay2 = 3;

        if (){

        } else if () {

        }else if () {

        }else if () {

        }else if () {

        } */
        //uzun olduğu için yazmadım


        /*Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
        a) Son basamak 5 ‘e es!t ve 5 den büyükse, yuvarlama !slem!: “Son basamagı b!r üst ondalıga
        yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama !slem!: “Son basamagı b!r alt ondalıga yuvarla”*/

        int i = 122;
        System.out.println(i % 10);
        System.out.println((i / 10 + 1) * 10);
        if (i % 10 >= 5) {
            System.out.println("Son basamagı bir üst ondalıga yuvarla :" + (i / 10 + 1) * 10);
        } else {
            System.out.println("Son basamagı bir alt ondalıga yuvarla :" + (i / 10) * 10);
        }



       /* Asagıdak! seçenekler dogrultusunda gereken kodu yazınız.
        a) B!r üçgen!n !k! kenarının uzunlugu es!tse "Ik!zkenar Üçgen".
                b) B!r üçgen!n tüm kenarlarının uzunlugu es!tse "Eskenar Üçgen".
                c) a ve b kosulları saglanmıyorsa "Çes!t Kenar Üçgen"*/

        int a = 5;
        int b = 4;
        int c = 5;

        if (a == b && b == c && a == c) {
            System.out.println("Eşkenar üçgen");
        } else if (a == b || b == c || c == a) {
            System.out.println("İkizkenar üçgen");
        } else {
            System.out.println("Çeşitkenar");
        }


        /*M!l! km'ye, san!yey! saate, fahrenhaytı sant!grata çev!ren b!r dönüstürücü olusturmak !ç!n
        kod yazınız. Google'dan dönüsümler !ç!n formüller! bulunuz.
        a) Kullanıcı m!le deger!n! 10 ve operatorü m!ldenKmye olarak g!rd!g!nde, konsolda kodunuz
        "16 km" yazmalıdır (sayı d!nam!k olacak)
        b) Kullanıcı san!ye deger!n! 7200 ve operatorü san!yedenSaate olarak g!rd!g!nde, konsolda
        kodunuz "2" yazmalıdır (sayı d!nam!k olacak)
        c) Kullanıcı fahrenhe!t deger!n! 83 ve operatorü fahrenaytdanSant!garata olarak g!rd!g!nde,
                konsolda kodunuz "28.3333 sant!grat" yazmalıdır (sayı d!nam!k olacak)*/

       /* System.out.println("Yapılmak istenen işlemi yazınız \n Milden Kmye\n Saniyeden Saate\n Fahrenaytdan Santigrata");
        Scanner input = new Scanner(System.in);
        String veri = input.nextLine();

        if (veri.equalsIgnoreCase("milden kmye")){
            System.out.println("Mili giriniz");
            double mil = input.nextDouble();
            System.out.println((mil * 1.60934) + " KM");
        } else if (veri.equalsIgnoreCase("saniyeden saate")) {
            System.out.println("Saniye değerini giriniz");
            double saniye = input.nextDouble();
            System.out.println((saniye/3600) + " Saat");
        } else if (veri.equalsIgnoreCase("Fahrenaytdan Santigrata")) {
            System.out.println("Fahrenayt giriniz");
            double fahr = input.nextDouble();
            System.out.println(((fahr-32)*5/9) + "Santigrat" );
        }else {
            System.out.println("Geçersiz değer");
        }*/


       /* Tam !s!m !ç!n d!lb!lg!s! kurallarını kontrol etmek !ç!n kodu yazınız.
        a) Kodunuz "al! Can", "Al! can", "al! can" !ç!n "Bas harfler!nde hata" yazmalıdır.
                b) Kodunuz, asagıdak! g!b! tek kel!meler !ç!n "Ad veya soyadı eks!k" yazmalıdır.
                c) "Al!" veya "Can" veya "al!"Kodunuz "ALI CAN" g!b! tüm formatlar !ç!n "Format hatası" yazmalıdır.
                d) Kodunuz b!r veya daha fazla bosluk (" " veya " " g!b! karakterler) !ç!n " Is!m g!r!lmed!"
        yazmalıdır.
                e) Ad, harfler ve bosluktan baska herhang! b!r karakter! !çer!yorsa, kodunuz "Geçers!z Ad"
        yazmalıdır.
                Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
        görünmelidir. Örnegin; "ali3" için kodunuz "Bas harflerinde hata", "Ad veya soyadı eksik" ve
        "Geçersiz Ad"*/


       /* String isim = " ";

        boolean boşluk = isim.isBlank();
        boolean ilkİsimHarfKontrol = isim.split(" ")[0].substring(0, 1).replaceAll("[^A-Z]", "").length() > 0;
        boolean ikinciİsimHarfKontrol = isim.split(" ")[1].substring(0, 1).replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("boşluk = " + boşluk); //true olunca (isim girilmedi yazacak)

        String[] ikinciKelime = isim.split(" ");
        boolean kelime = ikinciKelime.length > 1; // true olunca ikinci kelime var demek

        if (!ilkİsimHarfKontrol || !ikinciİsimHarfKontrol){
            System.out.println("Baş harflerde hata");
        }
        if (boşluk){
            System.out.println("İsim girilmedi");
        }
*/
      /*  String isim = " ";
        String adinIlkHarfi = isim.substring(0,1);
        Integer boslukIndex = isim.trim().indexOf(' ');
        String soyadinIlkHarfi = isim.substring(boslukIndex+1,boslukIndex+2);
        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
        Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');

        if(boslukIndex ==-1){
            System.out.println("Ad veya soyadi eksik ");
        }
        if(!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
            System.out.println("Bas harflerinde hata");
        }
        if(isim.equals(isim.toUpperCase())){
            System.out.println("Format hatasi");
        }
        if(isim.replaceAll("\\s","").length()==0){
            System.out.println("Isim girilmedi ");
        }
        if(isim.replaceAll("\\s","").replaceAll("[A-Za-z]","").length()>0){
            System.out.println("Gecersiz Isim");
        }
*/

        System.out.println("---------------------------");
        /*String eyalet = "ABD";

        boolean ikiKarakter = eyalet.trim().replaceAll("[\\s]", "").length() >= 3;
        System.out.println("ikiKarakter = " + ikiKarakter); //false olunca iki karakter demek

        boolean küçükHarf = eyalet.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("küçükHarf = " + küçükHarf);

        boolean sembol = eyalet.replaceAll("[A-Za-z]", "").length() > 0;

        if (!ikiKarakter) {
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla\n" +
                    "olamaz");
        }
        if (küçükHarf) {
            System.out.println("Eyalet kısaltmaları küçük harf !çeremez\"");
        }
        if (sembol) {
            System.out.println("\"Eyalet kısaltmaları asagıdak\n" +
                    "!lerden farklı karakterler !çeremez");
        }*/

        System.out.println("---------------------------");

        /*Herhang! b!r 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan bas!t b!r hesap mak!nes!
                olusturmak !ç!n kod yazınız.
        a) Kullanıcı 10.2 ve 5 ve + !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
                b) Kullanıcı 10 ve 5 ve - !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
                c) Kullanıcı 10 ve 5.3 ve * !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
                d) Kullanıcı 10 ve -5 ve / !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç -2.0" yazmalıdır.*/

       /* Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı girin");
        double sayı1 = input.nextDouble();
        System.out.println("İkinci sayıyı girin");
        double sayı2 = input.nextDouble();
        System.out.println("İşlem sembolünü girin");
        String sembol = input.next();
        if (sembol.equals("+")){
            System.out.println("Toplam: " + (sayı1+sayı2));
        } else if (sembol.equals("-")) {
            System.out.println("Çıkarma: " + (sayı1-sayı2));
        } else if (sembol.equals("*")) {
            System.out.println("Çarpma: " + (sayı1*sayı2));
        } else if (sembol.equals("/")) {
            System.out.println("Bölme: " + (sayı1/sayı2));
        }*/


        double bmi = 30;

        if(bmi<0){
            System.out.println("Geçersiz BMI");
        } else if (bmi<=18.5) {
            System.out.println("Zayıf");
        } else if (bmi<=29.9) {
            System.out.println("Fazla kilolu");
        } else if (bmi>=30) {
            System.out.println("Obezite");
        }


    }
}
