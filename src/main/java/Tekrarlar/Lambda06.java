package Tekrarlar;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;

public class Lambda06 {
    public static void main(String[] args) {
        //Ornek : Bir Lambda fonksiyonu tanimlayarak verilen sayinin karesini aliniz.
        //Example : Square the given number by defining a Lambda function.


        Function<Integer, Integer> squaring = x -> x * x;
        System.out.println("squaring.apply(5) = " + squaring.apply(5));


        //Ornek: Verilen listteki elemanlari ayri satirlarda konsola yazdiriniz.
        //Example: Print the elements in the given list to the console on separate lines.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> printCons = t -> System.out.println(t);
        numbers.forEach(printCons);

        Random rnd = new Random();

        Supplier<Double> supplier = () -> rnd.nextDouble(5);
        System.out.println("supplier.get() = " + String.format("%.2f", supplier.get()));

        //Ornek: Verilen listteki cift sayilari yazdiran bir method olusturunuz
        //Example: Create a method that prints even numbers in the given list

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> pred = x -> x % 2 == 0;
        System.out.println("pred.test(3) = " + pred.test(4));

        numbers2.stream().filter(pred).forEach(t-> System.out.println(t));


    }
}
