package Loops;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        String names[] = {"A", "T", "K", "E", "B"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names)); //[A, B, E, K, T]

        int sonuc = Arrays.binarySearch(names, "O");
        System.out.println(sonuc);

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //Example 3: Write the code that shows you how many words are in a given sentence.
        //String s = “Java is easy. Learn Java earn money.“;

        String s = "Java is easy. Learn Java earn money.";

        String[] newarr = s.split("\\s+");

        System.out.println(newarr.length);


        //INTERVIEW SORUSU
        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.
        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] arr1 = {0, 2, 3, 0, 12, 0};
        int[] newarr1 = new int[arr1.length];
        int firstindex = 0;
        for (int w : arr1) {

            if (w != 0) {
                newarr1[firstindex] = w;
                firstindex++;
            }

        }
        System.out.println(Arrays.toString(newarr1));

    }
}
