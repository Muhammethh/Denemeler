package odev;

public class StringArray {
    public static void main(String[] args) {

           /*
        6.Soru -Verilen String bir array'de en uzun
        ve en kisa String'leri yazdıran bir method olusturun
        */

        String isimler[] = {"veli", "ali", "furkan", "hasan", "huseyin"};
        enUzunEnKısa(isimler);

    }


    public static void enUzunEnKısa(String[] isimler) {

        String min = isimler[0];
        String max = isimler[0];


        for (String w : isimler){
            if (min.length()>w.length()){
                min=w;

            }
            if (max.length()<w.length()){
                max=w;
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }


}
