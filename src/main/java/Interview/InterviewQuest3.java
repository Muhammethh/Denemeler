package Interview;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class InterviewQuest3 {
    public static void main(String[] args) {

        /*Kullanıcıdan bir pozitif tam sayı alın. Bu sayı, Fibonacci dizisinin kaç terimini üreteceğinizi belirleyecek.
                Fibonacci dizisini hesaplayın ve dizinin elemanlarını ekrana yazdırın.
                Fibonacci dizisinin toplamını hesaplayın ve ekrana yazdırın.
        Fibonacci dizisindeki en büyük terimi ve en küçük terimi bulun ve bunları ekrana yazdırın.*/


        Scanner input = new Scanner(System.in);
        System.out.println("kaç basamaklı fibonnacci istediğinizi giriniz");
        int count = input.nextInt();

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0); //0. index
        fibonacci.add(1); //1.index

        for (int i = 2; i < count; i++) {

            int terim = fibonacci.get(i - 2) + fibonacci.get(i - 1);
            fibonacci.add(terim);
        }

        System.out.println(fibonacci);

        int sum = 0;
        int max = fibonacci.get(0);
        int min = fibonacci.get(0);

        for (Integer w : fibonacci) {

            sum += w;
            max = Math.max(w, max);
            min = Math.min(w, min);

        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);


    }
}
