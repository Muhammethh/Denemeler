package Loops;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        int[] ages = new int[6];

        ages[0] = 15;
        ages[1] = 19;
        ages[2] = 22;
        ages[3] = 35;
        ages[4] = 44;
        ages[5] = 50;

       /*  Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0] + ages[ages.length-1]);

        */


        int minimum = ages[0];
        int maksimum = ages[0];

        for (int w : ages) {

            minimum = Math.min(minimum, w);
            maksimum = Math.max(maksimum, w);

        }
        System.out.println("------------------------");
        System.out.println(minimum + maksimum);


        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //      [12, 3, -3, 5, 23] ==> 3, -3

        System.out.println("--------------");

        int[] array = {12, 3, -3, 5, 23};


        for ( int w: array) {

            if (w<5){
                System.out.println(w);
            }

        }


    }

}
