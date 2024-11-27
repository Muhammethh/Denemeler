package Tekrarlar;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        LocalDate time = LocalDate.now();
        System.out.println(time);

        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //getMonth(): Bu metod ayı dondurur. (Month enum türünde)

        int ayDeğeri = time.getMonthValue();
        System.out.println(ayDeğeri);

        Month ay = time.getMonth();
        System.out.println(ay);

        //ornek 3: getYear(): Tarihin yılını alır.

       int year =  time.getYear();
        System.out.println(year);

        System.out.println(time.getDayOfYear());

        //ornek 4:getDayOfMonth(): Ayin gününü alır.

        System.out.println(time.getDayOfMonth());

        //ornek 5:
        //ileriki tarihe nasil gidilir?
        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.

        LocalDate after5Days =  time.plusDays(5);
        System.out.println(after5Days);

        LocalDate after2Monts = time.plusMonths(2);
        System.out.println(after2Monts);

        LocalDate after2years = time.plusYears(2);
        System.out.println(after2years);

        /*ornek 6:Gecmis tarihe nasil gidilir?
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/

        LocalDate backToThePast = time.minusYears(2).minusMonths(2).minusDays(5);
        System.out.println(backToThePast);


        //ornek 7: Specific bir tarih objesi nasil olusturulur?
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate date1 = LocalDate.of(1995,3,21);
        LocalDate date2 = LocalDate.of(2024,3,21);

       boolean isBeforeDate2 = date1.isBefore(date2);
        System.out.println(isBeforeDate2);

        System.out.println(date1.isAfter(date2));

        //ODEV leap year sorusnu isLeapYear metotuyla çözmeye çalış

         /*Ornek 1:  Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz.
        Example 1: Write the code to check if the given year is a "Leap Year".

        1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil */

        // (c) ? (  (c) ? (t) : (f)  ) : (   (c) ? (t) : (f)   )


        //ODEV leap year sorusnu isLeapYear metotuyla çözmeye çalış

        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz");
        int userMonth = input.nextInt();



        Year year2 = Year.of(userMonth);

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("yyyy");

        String isLeapYear = (year2.isLeap()) ? ("Leap year") : ("Leap year değil");
        System.out.println(isLeapYear);



    }
}
