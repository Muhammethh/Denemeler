package Tekrarlar;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda04Methods {

    //ornek 1: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.

    public static void elementsNotStartingwithE(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.println(t));

    }

    //ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız)
    // elemanları konsola yazdıran bir metod yazınız.

    public static void elementLenghtLessThan5(List<String> mylist) {

        mylist.stream().filter(t -> t.length() < 5).distinct().forEach(t -> System.out.println(t));

    }

    //Örnek 3:Bir List<String> içinde karakter sayısı 5'ten fazla olan tüm elemanları büyük harfe çevirip,
    // bu elemanları yeni bir liste olarak döndüren bir metod yazınız.

    public static List<String> lenghtMoreThan5elementsToUpperCase(List<String> myList) {

        return myList.stream().filter(t -> t.length() > 5).map(String::toUpperCase).collect(Collectors.toList());

    }

    //Örnek 4:Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz elemanları
    // küçük harflere çevirip doğal sıralamaya göre konsola yazdıran bir metod yazınız.

    public static void naturalOrdertoLowerCase(List<String> myList) {

        myList.stream().distinct().filter(t -> t.length() < 5).map(t -> t.toLowerCase()).sorted().forEach(t -> System.out.println(t));

    }

    //Örnek 5:Bir List<String> içindeki tüm elemanları benzersiz hale getirip, büyük harflere dönüştürdükten
    // sonra alfabetik sıraya göre konsola yazdıran bir metod yazınız.


    public static void distinctElements(List<String> myList) {

        myList.stream().distinct().map(String::toUpperCase).sorted().forEach(t -> System.out.print(t + " "));

    }

    //Örnek 6:Bir List<String> içindeki tüm elemanları önce benzersiz hale getirin, ardından küçük harflere çevirin
    // ve elemanların uzunluklarına göre küçükten büyüğe sıralayarak konsola yazdıran bir metod yazınız.

    public static void elementsFromLongtoShort(List<String> myList) {

        myList.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.comparing(String::length)).forEach(t -> System.out.println(t));

    }

    //1) Karakter sayisi 5'ten fazla olan elemanları silen bir method oluşturun.
    //1) Create a method that deletes elements with more than 5 characters.

    public static void removeElementsMoreThan5(List<String> mylist) {

        mylist.removeIf(t -> t.length() > 5);
        System.out.println(mylist);

    }

    //2) ‘Z’ ile başlayan yada ‘f’ ile biten elemanları silen bir method oluşturun.
    //2) Create a method that deletes elements that start with ‘Z’ or end with ‘f’.

    public static void deleteElementsStartswithZ(List<String> myList) {

        myList.removeIf(t -> t.startsWith("Z") || t.endsWith("f"));
        System.out.println("myList = " + myList);

    }

    //3 ) “X” karakteri iceren elemanları silen bir method oluşturun.
    //3 ) Create a method that deletes elements containing the “X” character.

    public static void removeElementsContainsX(List<String> myList) {

        myList.removeIf(t -> t.contains("X"));
        System.out.println("myList = " + myList);

    }


    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.

    public static int numbersFrom7to70() {

        return IntStream.rangeClosed(7, 70).reduce(Integer::sum).getAsInt();

    }

    //2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.

    public static int multiplyFrom3to9() {

        //return IntStream.rangeClosed(3,9).reduce(1,(t,u)->t*u);
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();

    }

    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3)Write the code that calculates the factorial of the given number.

    public static int faktoriyel(int x) {

        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("geçersiz veri");
            return -1;
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    }

    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //4)Write the code that gives you the sum of all even numbers between two given integers.
    //beginning and ending are not included.

    public static int sumOfRange(int x, int y) {


        if (x > y) {

            /*x = x + y;
            y = x - y;
            x = x - y;*/

            int temp = 0;

            temp = x;

            x = y;
            y = temp;

        }
        return IntStream.rangeClosed(x, y).filter(t -> t % 2 == 0).sum();

    }
}
