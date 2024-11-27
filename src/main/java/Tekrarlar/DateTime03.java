package Tekrarlar;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {

        //ornek 1: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.

        /* Scanner input = new Scanner(System.in);
        System.out.println("Doğum tarihinizi gün ay ve yıl oalrak sırayla giriniz");
        String Bd = input.nextLine();

        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate newBd = LocalDate.parse(Bd,formattedDate);

        String günAdı = newBd.getDayOfWeek().getDisplayName(TextStyle.FULL_STANDALONE,new Locale("tr"));
        System.out.println(günAdı);

         */


        LocalDate date1 = LocalDate.of(2010,3,15);
        LocalDate date2 = LocalDate.of(2020,7,10);

        Period difference = Period.between(date1,date2);
        System.out.println(difference);

       int years = difference.getYears();
       int months = difference.getMonths();
       int day = difference.getDays();

        System.out.println(years);

        LocalDate dateinTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));




    }
}
