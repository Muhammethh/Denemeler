package Tekrarlar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDatetime {

    public static void main(String[] args) {

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Tarihi gg.aa.yyyy oalrak girin");
        String tarih = input.nextLine();

       /* String gün = tarih.split("\\.")[0];
        String ay = tarih.split("\\.")[1];
        String yıl = tarih.split("\\.")[2];

        Integer formattedgün = Integer.valueOf(gün);
        Integer formatteday = Integer.valueOf(ay);
        Integer formattedyıl = Integer.valueOf(yıl);

        LocalDate date = LocalDate.of(formattedyıl,formatteday,formattedgün);

        if(date.isBefore(LocalDate.now())){
            System.out.println("geçersiz tarih");
        }else {
            System.out.println("zamanı girebilirsiniz");
        }
*/



    }
}
