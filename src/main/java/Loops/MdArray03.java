package Loops;

public class MdArray03 {

    public static void main(String[] args) {

        //Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        //Example 1: Find the sum of the smallest and largest element in a Multidimensional Array of type int.

        int[][] ages = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47

        int min = ages[0][0];
        int max = ages[0][0];


        for (int[] w : ages){

            for (int k :w){

                min= Math.min(min,k);
                max=Math.max(max,k);

            }

        }
        System.out.println(min+max);



    }
}
