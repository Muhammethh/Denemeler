package Loops;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {

    public static void main(String[] args) {

        //Ornek 1:  Bir String ArrayList oluşturun ve “a” içeren elemanlari silin.
        //Example 1: Create a String ArrayList and delete the elements containing “a”.


        List<String> s = new ArrayList<>();
        s.add("Manisa");
        s.add("Niğde");
        s.add("Tokat");
        s.add("van");
        s.add("Edirne");
        s.add("Samsun");
        s.add("düzce");

        for (int i = s.size()-1; i >= 0 ; i--) {

            if (s.get(i).contains("a")){

                s.remove(i);

            }


        }
        System.out.println(s);

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //      [12, 23, 10, 19] ==> 12 ve 10

        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        nums.add(18);
        nums.add(20);

        nums.sort(null); //[10, 12, 18, 19, 20, 23]

        System.out.println(nums);

        int minDiff = nums.get(1) - nums.get(0);
        System.out.println(minDiff);

        for (int i = 1; i < nums.size() ; i++) {

            minDiff= Math.min(minDiff, nums.get(i)- nums.get(i-1));

            if (nums.get(i)- nums.get(i-1)==minDiff){

                System.out.println(nums.get(i) + " ve " + nums.get(i-1));
            }

        }




    }
}
