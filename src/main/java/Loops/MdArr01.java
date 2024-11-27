package Loops;

import java.util.Arrays;

public class MdArr01 {
    public static void main(String[] args) {

        int[][] md = new int[3][2];

        md[0][0] = 5;
        md[0][1] = 10;
        md[1][0] = 13;
        md[1][1] = 14;
        md[2][0] = 11;
        md[2][1] = 7;

        System.out.println(Arrays.deepToString(md)); //[[5, 10], [13, 14], [11, 7]]

        System.out.println(md[1][0]); //13

        System.out.println(Arrays.toString(md[1]));

        String[][] names = {{"Ali","Ahmet"}, {"Mahmut", "Mehmet"}};
        System.out.println(Arrays.deepToString(names));

        //Ornek 1: Yukaridaki students array’inde toplam kac isim oldugunu bulunuz.
        //Example 1: Find the total number of names in the students array above.


        int total = 0;

        for (String[] w: names) {


                total += w.length;


        }
        System.out.println(total);


        //Ornek 2: Yukaridaki students Array’inde icinde “m” olan isimleri console’a yazdiriniz.
        //Example 2: Write the names with “m” in the students Array to the console


        for (String[] w : names){

            for (String k : w){

                if (k.contains("m")){

                    System.out.println(k);
                }

            }


        }



    }
}
