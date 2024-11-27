package Loops;

import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(9);
        ages.add(10);
        ages.add(15);

        System.out.println(ages);

        //Ornek 1: Verilen Integer List’i, ages List’inin icine koyunuz.
        //Example 1: Put the given Integer List into the ages List

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(20);
        newAges.add(30);
        newAges.add(40);

        ages.addAll(newAges);

        System.out.println(ages); //[9, 10, 15, 20, 30, 40]

        ages.addAll(2, newAges); //[9, 10, 20, 30, 40, 15, 20, 30, 40]
        System.out.println(ages);

        int total = ages.size();
        System.out.println(total);

        int element = ages.get(2);
        System.out.println(element);

        System.out.println(ages.set(2, 90));
        System.out.println(ages);  //[9, 10, 90, 30, 40, 15, 20, 30, 40]

        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin.
        //Example 1: Create an Integer ArrayList and change the odd ones to 11



        for (Integer w : ages) {

            if (w % 2 == 0) {

                 ages.set(ages.indexOf(w),11);

            }

        }
        System.out.println(ages);


    }
}
