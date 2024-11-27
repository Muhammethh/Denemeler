package Tekrarlar;

import java.util.*;

public class Iterators {

    public static void main(String[] args) {

       /* Kullanıcıdan bir pozitif tamsayı alın.
                Bu sayıya kadar olan sayılardan asal sayıları bulmak için bir döngü kullanın.
                Bulduğunuz asal sayıları bir diziye veya listeye kaydedin.
                Programın sonunda, asal sayıları ve toplam asal sayı miktarını yazdırın.
                Ek olarak, asal sayılar arasındaki en büyük asal sayıyı da belirleyin ve yazdırın.*/


        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayı = input.nextInt();
        List<Integer> nums = new ArrayList<>();

        for (int i = 2; i <= sayı; i++) {

            boolean isPrime = true;  // Her sayıyı başlangıçta asal varsayıyoruz

            // 2'den kendisinin bir eksiğine kadar bölenleri kontrol ediyoruz
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;  // Bölünüyorsa asal değildir
                    break;  // Bölünme bulunduğu anda döngüyü sonlandır
                }
            }

            // Asallık durumuna göre çıktı veriyoruz
            if (isPrime) {
                System.out.println(i);
                nums.add(i);
            }

        }
        System.out.println(nums);
        System.out.println(nums.size());

       Integer max= nums.stream().distinct().sorted().reduce((t,u)->u).get();
        System.out.println("max değer " +  max);


        
        int max2= 0;
        for (Integer w: nums){

           max2 =  Math.max(max2,w);

        }
        System.out.println("max222:: " + max2);
    }
}
