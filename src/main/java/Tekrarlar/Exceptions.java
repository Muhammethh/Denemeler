package Tekrarlar;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) throws IOException {


       /* try {

            System.out.println(6 / 0);

        } catch (ArithmeticException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            //throw new ArithmeticException();
        }

        System.out.println("kod çalışıyor mu");*/


        // NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur


       /* String str = "123a";

        try {
            System.out.println(Integer.valueOf(str));
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }*/

        String str1 = "Java";
        //getChar(str1, 3);

        /*String[] arr = new String[4];
        arr[0] = "j";
        arr[1] = "a";
        arr[2] = "v";
        arr[3] = "a";

        getIndex(arr, 5);*/

        //indexFromrst(str1,10,2);

        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur

        /*String str2 = null;

        str2.length();*/

        //6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.

        FileInputStream file = new FileInputStream("src/main/java/Tekrarlar/metin.txt");


        int k = 0;

        while ((k = file.read()) != -1) {


            char ch = (char) k;
            System.out.print(ch);

        }


    }


    //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
    // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.


    public static void getChar(String s, int a) {

        char ch = 0;
        try {
            ch = s.charAt(a);

        } catch (StringIndexOutOfBoundsException e) {

            e.printStackTrace();

        }
        System.out.println(ch);

    }


    //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
    // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

    public static void getIndex(String[] arr, int a) {

        try {
            System.out.println(arr[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void indexFromrst(String s, int a, int b) {

        try {

            int rst = a / b;

            char krktr = s.charAt(rst);
            System.out.println("krktr = " + krktr);

        } catch (ArithmeticException e) {
            System.out.println("İkinci rakam 0 olamaz");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index " + (s.length() - 1) + " den büyük olamaz");
        }


    }

    //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur


}


