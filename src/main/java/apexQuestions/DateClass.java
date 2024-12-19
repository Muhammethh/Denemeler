package apexQuestions;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {
        /*Al!'n!n kaç gün yasadıgını bulan kodu yazınız.
        Al!'n!n dogum tar!h! 12 Mayıs 2002'd!r.*/

        LocalDate ali = LocalDate.of(2002, 5, 12);
        LocalDate bugün = LocalDate.now();
        System.out.println("Gün Sayısı = " + ChronoUnit.DAYS.between(ali, bugün));
        System.out.println("Yıl Sayısı = " + ChronoUnit.YEARS.between(ali, bugün));


        /*Al!'n!n kaç ay yasadıgını bulan kodu yazınız.
        Al!'n!n dogum tar!h! 4 Haz!ran 1997'd!r.*/

        LocalDate ali2 = LocalDate.of(1997, 6, 4);

        Period fark = Period.between(ali2, bugün);

        int aylar = fark.getMonths();
        int yıllar = fark.getYears();
        System.out.println("Manuel hesap " + (aylar + (yıllar * 12)));

        long aylar2 = ChronoUnit.MONTHS.between(ali2, bugün);
        System.out.println("Chorono hesap " + aylar2);



       /* Al!'n!n dogum tar!h! 4 Haz!ran 1997'd!r. Al!'n!n dogum tar!h!nden 2 yıl, 3 ay ve 12 gün
        sonrak! tam tar!h! bulmak !ç!n kodu yazınız.*/

        LocalDate ali3 = LocalDate.of(1997, 6, 4);
        LocalDate ali3plus = ali3.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("ali3plus = " + ali3plus);


        /*Al!, 29 Ek!m 1923'ten 45 yıl 8 ay 5 gün sonra dogmustur.
        Vel!, 15 Eylül 1993'ten 24 yıl 2 ay 11 gün önce dogmustur.
        Al! ve Vel!'n!n kes!n dogum tar!h!n! hesaplamak !ç!n kodu yazınız.
        Al! ve Vel!'n!n dogum tar!h!n!n aynı olup olmadıgını kontrol etmek !ç!n kodu yazınız.*/

        LocalDate aliUnk = LocalDate.of(1923, 10, 29);
        LocalDate veliUnk = LocalDate.of(1993, 9, 15);

        LocalDate aliknwn = aliUnk.plusYears(45).plusMonths(8).plusDays(5);
        LocalDate veliknwn = veliUnk.minusYears(24).minusMonths(2).minusDays(11);

        System.out.println(aliknwn + "\n" + veliknwn);
        System.out.println("Tarih aynı mı = " + aliknwn.equals(veliknwn));

       /* Vel!, Al!'den 3 yıl 11 gün sonra dogmustur.
        Al! s!ze dogum tar!h! b!lg!s!n! 24 Kasım 2012 olarak verm!st!r.
                Vel!'n!n dogum tar!h!n! hesaplamak !ç!n gerekl! kodu yazınız.*/

        LocalDate Ali4 = LocalDate.of(2012, 11, 24);

        LocalDate velibd = Ali4.plusYears(3).plusDays(11);
        System.out.println("velibd = " + velibd);


        /*Kend!n!z!n ve çocugunuzun dogum tar!h! !ç!n Tar!h Degerler! olusturup, ardından farkı gün
        olarak hesaplayınız.*/

        LocalDate bd = LocalDate.of(1995, 3, 21);
        LocalDate chldBd = LocalDate.of(1998, 5, 30);

        Period dif = Period.between(bd, chldBd);

        System.out.println("Günler = " + (dif.getDays() + (dif.getYears() * 365) + (dif.getMonths() * 30)));

        System.out.println("Oto hesap = " + ChronoUnit.DAYS.between(bd, chldBd));

        // Bel!rl! b!r tar!hte yılın son 2 hanes!n! alınız.

        int yıl = bd.getYear();
        System.out.println(yıl % 100); //ilk iki hanesini istersek /100 yazarız


        /*Bel!rl! b!r yılın "Artık yıl" olup olmadıgını kontrol etmek !ç!n kodu yazınız.
        Artık Yıl:
        i) Bir yıl 100'e ve 400'e tam bölünüyorsa buna artık yıl denir. Örnegin; 2000 artık yıl, 1900
        degildir.
                ii) Bir yıl 100'e ve 4'e tam bölünemiyorsa artık yıl olarak adlandırılır. Örnegin; 2004 artık yıl, 2007
        degildir.*/

        LocalDate yıl2 = LocalDate.of(1900, 12, 5);
        int intYıl = yıl2.getYear();

        System.out.println("yıl2.isLeapYear() = " + yıl2.isLeapYear());

        String result = intYıl % 100 == 0 && intYıl % 400 == 0 ? "Artık Yıl" : "Artık Yıl değil";
        System.out.println("result = " + result);

        //Ik! farklı tar!h!n ay numaralarının toplamını bulunuz.

        System.out.println("yıl2 ve bd ayları toplamı = " + (yıl2.getMonthValue() + bd.getMonthValue()));


        //Ik! farklı tar!h !ç!n saat farkını bulunuz.

        LocalTime time = LocalTime.of(12,45);
        LocalTime time2 = LocalTime.of(15,59);

        System.out.println("ChronoUnit.HOURS.between(time2,time) = " + ChronoUnit.HOURS.between(time, time2));



    }
}
