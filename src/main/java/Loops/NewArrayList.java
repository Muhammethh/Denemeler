package Loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewArrayList {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //      [12, 23, 10, 19] ==> 12 ve 10

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(23);
        list.add(10);
        list.add(19);
        list.add(9);
        list.add(5);
        list.add(8);



        list.sort(null);

        System.out.println(list);

        int min = list.get(1) - list.get(0);

        for (int i = 1; i < list.size(); i++) {

            min = Math.min(min, list.get(i) - list.get(i-1));

            if (list.get(i) - list.get(i - 1) == min) {

                System.out.println(list.get(i) + " ve " + list.get(i - 1));

            }

        }





    }
}
