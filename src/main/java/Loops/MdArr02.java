package Loops;

import java.util.Arrays;

public class MdArr02 {

    public static void main(String[] args) {

        //Ornek 1: Iki boyutlu bir Array’i tek boyutlu bir Array’e ceviriniz.
        //Example 1: Convert a two-dimensional Array to a one-dimensional Array.
        // int[][] numbers = {{5, 4}, {2, 3, 2}}; ==> { 5,4,2,3,2 }

        int[][] numbers = {{5, 4}, {2, 3, 2}};

       int totalEl = 0;

       for (int[] w : numbers) {

           totalEl = totalEl + w.length;

       }

        System.out.println(totalEl);

       int[] newarr = new int[totalEl];

        System.out.println(Arrays.toString(newarr));

        int indeks = 0;

        for (int[] w: numbers){

            for (int k : w) {

                newarr[indeks] = k;
                indeks++;

            }

        }

        System.out.println(Arrays.toString(newarr));

        System.out.println("-------------------------------");


        String list[]={"J", "a", "v", "a", "v"};


        String listString="";

        for (String w:list){

            listString+=w;

        }
        System.out.println(listString);
        String tekKarakter = "";

        for (int i = 0; i <listString.length() ; i++) {
            char karakter= listString.charAt(i);
            if (listString.indexOf(String.valueOf(karakter))==i){
                tekKarakter+=karakter;
            }
        }
        System.out.println("tekKarakter = " + tekKarakter);

        String[] yeniArray= tekKarakter.split("");
        System.out.println(Arrays.toString(yeniArray));
        for (String w: yeniArray) {
            System.out.println("w = " + w);
        }
        System.out.println("yeniArray = " + Arrays.toString(yeniArray));



    }
}
