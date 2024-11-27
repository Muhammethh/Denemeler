package Tekrarlar;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class DateTime02 {

    public static void main(String[] args) {

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        Scanner input = new Scanner(System.in);
         System.out.println("lütfen tarihi gg.aa.yyyy olarak giriniz");
        String date = input.nextLine();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate newDate = LocalDate.parse(date,formattedTime);

        if (newDate.isBefore(LocalDate.now())){
            System.out.println("Geçersiz tarih girildi");
        } else {
            System.out.println("zamanı girebilirsiniz");
        }



        LocalDate givenDate = null;
        int year;
        int month;
        int day;

        while (true) {
            System.out.println("Yılı giriniz");
            year = input.nextInt();

            System.out.println("ayı giriniz");
            month= input.nextInt();

            if (month > 12 || month < 0) {
                System.out.println("yıl 12den büyük veya 0dan küçük olamaz");
                continue;
            }
            System.out.println("Günü giriniz");
            day= input.nextInt();

            YearMonth dayOfMOnth = YearMonth.of(year,month);
            int monthlenght = dayOfMOnth.lengthOfMonth();
            if (day<0|| day>monthlenght){

                System.out.println(month + ". ay " + monthlenght + "dır. Tekrar deneyin" );
                continue;
            }
            givenDate = LocalDate.of(year,month,day);

            if (givenDate.isBefore(LocalDate.now())){
                System.out.println("Geçerli tarih girilmedi");
            }else {
                System.out.println("Tarih girebilirsinzi");
                break;
            }


        }


    }
}
