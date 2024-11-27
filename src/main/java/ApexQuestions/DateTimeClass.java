package ApexQuestions;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeClass {
    public static void main(String[] args) {

        /*Eger saat
        !) 24:00 !le 05:00 arasında !se konsola 'Uyku zamanı' yazdırınız.
        !!) 08:00 !le 16:00 arasında !se konsola 'Çalısma zamanı' yazdırınız.
        !!!) 19:00 !le 22:00 arasında !se konsola 'A!le zamanı' yazdırınız.
        !v) D!gerler! !ç!n konsolda 'K!s!sel zaman' yazdırınız.*/

        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);

        if (now.getHour() > 00.00 && now.getHour() < 5.00) {
            System.out.println("Uyku zamanı");
        } else if (now.getHour() > 08.00 && now.getHour() < 16.00) {
            System.out.println("çalışma zamanı");
        } else if (now.getHour() > 19.00 && now.getHour() < 22.00) {
            System.out.println("Aile zamanı");
        } else {
            System.out.println("Kişisel zaman");
        }


        //Japonya saat d!l!m! !le Almanya saat d!l!m! arasındak! saat farkını bulmak !ç!n kodu yazınız.

        LocalTime japan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime germany = LocalTime.now(ZoneId.of("Europe/Berlin"));

        System.out.println("ChronoUnit.HOURS.between(japan,germany) = " + ChronoUnit.HOURS.between(germany, japan));


        /*Al! 5 Subat 2015 TRT 10:00'da Istanbul' da, Mark 5 Subat 2015 12:00 EST' de ABD' de
        dogmustur. Al!'n!n dogum saat! !le Mark'ın dogum saat! arasındak! saat c!ns!nden fark
        ned!r?*/

        ZonedDateTime ali = LocalDateTime.of(2015, 2, 5, 10, 0).atZone(ZoneId.of("Asia/Istanbul"));
        ZonedDateTime veli = LocalDateTime.of(2015, 2, 5, 10, 0).atZone(ZoneId.of("America/New_York"));

        System.out.println("ChronoUnit.HOURS.between(ali,veli) = " + ChronoUnit.HOURS.between(ali, veli));

        /*Al! 5 Subat 2015 saat 10:15 EST'de dogmustur, Vel! 6 Mart 2015 saat 12:25 EST'de
        dogmustur. Al! ve Vel!'n!n dogum süreler! arasındak! fark ned!r?*/

        ZonedDateTime ali2 = LocalDateTime.of(2015, 2, 5, 10, 15).atZone(ZoneId.of("America/New_York"));
        ZonedDateTime veli2 = LocalDateTime.of(2015, 3, 6, 12, 25).atZone(ZoneId.of("America/New_York"));

        System.out.println("ChronoUnit.HOURS.between(ali2,veli2) = " + ChronoUnit.MINUTES.between(ali2, veli2));



        /*Mark 23.02.2018 tar!h!nde saat 15:25'te GMT ' de dogmustur, Mark'ın Japonya'dak! tam
        dogum tar!h! ve saat! ned!r?*/

        LocalDateTime mark = LocalDateTime.of(2018, 2, 23, 15, 25);
        ZonedDateTime markJap = mark.atZone(ZoneId.of("Asia/Tokyo"));
        System.out.println("markJap = " + markJap.minusHours(9));


    }
}
