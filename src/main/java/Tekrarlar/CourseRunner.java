package Tekrarlar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CourseRunner {
    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> courses = new ArrayList<>();
        courses.add(courseTurkishDay);
        courses.add(courseTurkishNight);
        courses.add(courseEnglishDay);
        courses.add(courseEnglishNight);

        //1)Tum “averageScore” larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz.
        //1)Write the code that checks whether all “averageScore” is greater than 91

        boolean isTure = courses.stream().allMatch(t -> t.getAverageScore() > 91);
        System.out.println("isTure = " + isTure);


        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz.
        //2)Write the code that checks whether the number of students in all courses is greater than 100.

        boolean studentNumber = courses.stream().allMatch(t -> t.getNumberOfStudents() > 100);
        System.out.println("studentNumber = " + studentNumber);

        //3)Kurs isimlerinden en az birinin “Turkish” kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        //3)Write the code that checks whether at least one of the course names contains the word “Turkish”.

        boolean isContainsTurkish = courses.stream().anyMatch(t -> t.getCourseName().contains("Turkish"));
        System.out.println("isContainsTurkish = " + isContainsTurkish);

        //5) Kurs donemleri icinde “Fall” doneminin hic bulunmadigini kontrol eden kodu yaziniz.
        //5) Write the code that checks that there is no “Fall” period among the course periods.

        boolean seasonName = courses.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println("seasonName = " + seasonName);

        //7)Average score’u en yuksek olan kursun ismini console yazdiran kodu yaziniz.
        //7)Write the code that prints the name of the course with the highest average score in the console.

        String maxAverage = courses.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get().getCourseName();


        //8) Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ikisi haric liste halinde console'a yazdiriniz.

        List<Course> skippedFirst2 = courses.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
        System.out.println("skippedFirst2 = " + skippedFirst2);

        //9) Tum course object’lerini average score’a gore kucukten buyuge diziniz ve
        // ilk ucunu liste halinde console’a yazdiriniz.

        List<Course> first3 = courses.stream().sorted(Comparator.comparing(Course::getAverageScore)).limit(3).collect(Collectors.toList());
        System.out.println("first3 = " + first3);


        //10)Kursta bulunan ogrenci sayilarina gore, buyukten kucuge sirali bir sekilde
        //listin icinde veren kodu yaziniz.

        List<Course> sortedList = courses.stream().sorted(Comparator.comparing(Course::getNumberOfStudents).reversed()).toList();
        System.out.println("sortedList = " + sortedList);


        System.out.println("----------------");
        //ODEV: Sadece öğrenci sayılarını görmek istesek nasıl yaparız?

        List<Integer> studentNumber1 = courses.stream().map(t -> t.getNumberOfStudents()).toList();
        System.out.println("studentNumber1 = " + studentNumber1);



    }
}
