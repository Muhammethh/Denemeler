package odev;

import java.util.Arrays;
import java.util.Random;

public class MdArray {

    public static void main(String[] args) {

     /*
        Asagidaki multi dimensional array'in
        ic array'lerindeki tum elemanlarin toplamini birer birer bulan
        ve herbir sonucu yeni bir array'in elemani yapan
        ve yeni array'i ekrana yazdiran bir program yaziniz
        Ornek; {{1,2,3}, {4,5}, {6, 7} } ==> 1 + 2 + 3 = 6 4+5=9 6+7=13 ==> output: (6, 9, 13)
*/


        int[][] ornek = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] yeniOrnek = new int[ornek.length];
        int sum=0;

        for (int i = 0; i < ornek.length ; i++) {

            for (int w : ornek[i]){

                sum= sum + w;

            }
            yeniOrnek[i] = sum;
            sum=0;
        }
        System.out.println(Arrays.toString(yeniOrnek));

    }
}
