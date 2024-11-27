package Tekrarlar;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10, 14));
        //printelements(nums);
        //printelements2(nums);
        //printelements3Even(nums);
        //printSquareOfOddelements(nums);
        //printCubeOfDistinctOddElements(nums);
        //printSumOfSquareOfEvenDistinctElements(nums);
        //printMultiplyOfSquareOfEvenDistinctElements(nums);
        //maksimum1(nums);
        //maksimum2(nums);
        //maksimum3(nums);
        //maksimum4(nums);
        //minimum1(nums);
        //minimum2(nums);
        //minimum3(nums);
        //numberSmallerThanSeven(nums);

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //startingwithoutE(myList);
        startingwithoutElesserthan5(myList);
    }

    public static void printelements(List<Integer> num) {

        for (Integer w : num) {

            System.out.print(w + " ");
        }
    }


    public static void printelements2(List<Integer> num) {

        num.stream().forEach(t -> System.out.print(t + " "));

    }


    //Örnek 3: Bir List<Integer> içindeki tüm çift sayıları bulun ve bu sayıları aynı satırda,
    // aralarında bir boşluk olacak şekilde konsola yazdıran bir metod yazınız.(Structured)


    public static void printelements3Even(List<Integer> num) {

        num.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

    }


    //ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini,
    // aynı satırda, aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)

    public static void printSquareOfOddelements(List<Integer> num) {

        num.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

    }

    //3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
    // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)


    public static void printCubeOfDistinctOddElements(List<Integer> num) {

        num.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.println(t + " "));

    }

    //4)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
    //4)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

    public static void printSumOfSquareOfEvenDistinctElements(List<Integer> num) {

        int toplam = num.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
    }

    //5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
    //5) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.


    public static void printMultiplyOfSquareOfEvenDistinctElements(List<Integer> num) {

        int multiply = num.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t, u) -> t * u);
        System.out.println(multiply);
    }

    //6)Verilen List'teki maksimum değeri bulmak için bir method oluşturun.
    //6)Create a method to find the maximum value in the given List

    public static void maksimum1(List<Integer> num) {

        int maks = num.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(maks);
    }

    public static void maksimum2(List<Integer> num) {

        int maks = num.stream().distinct().reduce(num.get(0), (t, u) -> t > u ? t : u);
        System.out.println(maks);
    }

    public static void maksimum3(List<Integer> num) {

        int maks = num.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(maks);
    }

    public static void maksimum4(List<Integer> num) {

        int maks = num.stream().distinct().reduce(Math::max).get();
        System.out.println(maks);

    }
    //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.

    public static void minimum1(List<Integer> num) {

        int min = num.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t > u ? u : t);
        System.out.println(min);
    }


    public static void minimum2(List<Integer> num) {

        int min = num.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u) -> u).get();
        System.out.println(min);

    }

    public static void minimum3(List<Integer> num) {

        int toplam = num.stream().distinct().reduce(Math::min).get();
        System.out.println(toplam);
    }

    //8) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
    //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi

    public static void numberSmallerThanSeven(List<Integer> num) {

        int smallerthan7 = num.stream().filter(t -> t > 7 && t % 2 == 0).reduce(Math::min).get();
        System.out.println(smallerthan7);

    }


    //ornek 1: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.

    public static void startingwithoutE(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.print(t + " "));
    }

    //ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız)
    // elemanları konsola yazdıran bir metod yazınız.

    public static void startingwithoutElesserthan5(List<String> myList) {

        myList.stream().distinct().filter(t -> t.length() < 5).forEach(t -> System.out.print(t + " "));

    }

}
