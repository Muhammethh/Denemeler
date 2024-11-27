package Tekrarlar;

public class E01 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 14;
        int b = 2;
        String s = "My Java";
        //getCharFromString(s, a, b);
        getCharFromString2(s, a, b);

    }

    public static void getCharFromString2(String s, int a, int b) {

        try {
            int idx = a / b;
            char charS = s.charAt(idx);
            System.out.println(charS);
        }catch (ArithmeticException e){
            System.out.println("sayı 0a bölünemez");
        }catch (IndexOutOfBoundsException e){

            System.out.println("index büyük");
        }





    }

}
